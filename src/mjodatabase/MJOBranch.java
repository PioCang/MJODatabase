package mjodatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.UIManager;

/**
 * @since Feb 12 2015
 * @author Vince
 */
public class MJOBranch
{
     private List<Medicine> inventory;
     private List<Transaction> transactions;
     public static MasterGUI mainGUI;
     public static MedicineCreatorGUI medicineInitializer;
     public static TransactionCreatorGUI transactionInitializer;
     public static TransactionItemListBuilderGUI freeItemsBuilder;
     public static TransactionItemListBuilderGUI purchasedItemsBuilder;
     public static TransactionItemCreatorGUI itemSelector;
     public static TransactionItemListViewerGUI itemViewer;
     public static SearchResultsGUI searchResultsViewer;

     /**
      * Default Constructor instantiates an empty ArrayList upon instantiation.
      */
     public MJOBranch()
     {
          this.inventory = new ArrayList<>(1);
          this.transactions = new ArrayList<>(1);
     }

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args)
     {          
          try
          {
              UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
          }
          catch(Exception e)
          {
              //nothing
          }
          
          MJOBranch mjo = new MJOBranch();
          medicineInitializer = new MedicineCreatorGUI(mjo);
          transactionInitializer = new TransactionCreatorGUI(mjo);
          freeItemsBuilder = new TransactionItemListBuilderGUI(true);
          purchasedItemsBuilder = new TransactionItemListBuilderGUI(false);
          itemSelector = new TransactionItemCreatorGUI(mjo);
          itemViewer = new TransactionItemListViewerGUI();
          searchResultsViewer = new SearchResultsGUI();
          
          
          mjo.setInventory(StorageOperations.retrieveMedicines());
          /*GregorianCalendar exp = new GregorianCalendar(2016, 1, 14);
          GregorianCalendar del = new GregorianCalendar(1932, 0, 1);
          Medicine med1 = null, med2 = null, med3 = null;
          try
          {
               med1 = new Medicine("Paracetamol", "Biogesic", "1", exp, del, 50, 2.5);
               med2 = new Medicine("Paracetamol", "Biogesic", "2", exp, del, 25, 2.5);
               med3 = new Medicine("Paracetamol", "Biogesic", "3", exp, del, 25, 2.5);

               MJOBranch.addMedicineToList(mjo.getInventory(), med1);
               MJOBranch.addMedicineToList(mjo.getInventory(), med2);
               MJOBranch.addMedicineToList(mjo.getInventory(), med3);
          }
          catch(Exception e)
          {
               e.printStackTrace();
          }
          StorageOperations.encodeMedicines(mjo.getInventory());*/
          
          mjo.setTransactionList(StorageOperations.retrieveTransactions());
          mainGUI = new MasterGUI(mjo);
          mainGUI.showWindow();          
     }


     /**
      * Sets this <code>MJODatabase</code>'s inventory to <code>inv</code>.
      * @param inv The new inventory that will overwrite the previous one.
      */
     public void setInventory(List<Medicine> inv)
     {
          this.inventory = inv;
     }
     
     public void setTransactionList(List<Transaction> trans)
     {
          this.transactions = trans;
     }

     /**
      * Returns the inventory of this <code>MJODatabase</code>.
      * @return The current inventory of this object.
      */
     public List<Medicine> getInventory()
     {
          return this.inventory;
     }
     
     public List<Transaction> getTransactionList()
     {
          return this.transactions;
     }
     
     
     
     
     
     
     
     public void addTransactionToList(Transaction trans)
     {
          this.transactions.add(trans);
     }
     
     public static void sortItems(List<TransactionItem> listOfItems)
     {
          TransactionItem[] itemsAsArray = new TransactionItem[listOfItems.size()];
          for (int i = 0; i < listOfItems.size(); i++)
          {
               itemsAsArray[i] = listOfItems.get(i);
          }

          Arrays.sort(itemsAsArray, new ItemBrandNameComparator());
          Arrays.sort(itemsAsArray, new ItemGenericNameComparator());

          listOfItems.clear();
          for(int i = 0; i < itemsAsArray.length; i++)
          {
               listOfItems.add(itemsAsArray[i]);
          }
     }
     
     
     
     
     

     /**
      * Adds a <code>Medicine</code> entry to this object's inventory.
      * Note that to maintain a sorted list each time, every addition will
      * invoke <code>sort()</code>.
      * @param med The <code>Medicine</code>entry to be added.
      * @throws mjoexceptions.SameBrandDifferentPriceException
      * @see sort()
      */
     public static void addMedicineToList(List<Medicine> inventory, Medicine med) throws IllegalArgumentException
     {
          int i = inventory.size() - 1;
          while (i >= 0 && !inventory.get(i).sharesNameWith(med))
          {
               i--;
          }

          if (i >= 0)
          {
               while (i >= 0 && inventory.get(i).sharesNameWith(med))
               {
                    if (med.getPricePerPiece() != inventory.get(i).getPricePerPiece())
                    {
                         throw new IllegalArgumentException("Medicine of similar names should not have different prices.");
                    }
                    i--;
               }
          }

          inventory.add(med);
          MJOBranch.sort(inventory);
     }

     /**
      * Removes a <code>Medicine</code> entry from this object's inventory.
      * Note that to maintain a sorted list each time, every addition will
      * invoke <code>sort()</code>.
      * @param med The <code>Medicine</code>entry to be removed.
      * @see sort()
      */
     public void removeMedicineFromInventory(Medicine med)
     {
          this.inventory.remove(med);
          MJOBranch.sort(this.inventory);
     }

     public void makeDeductions(Medicine med, int quantity) throws IllegalArgumentException
     {
          int remaining = med.getCurrentQuantity() - quantity;
          if (remaining < 0)
          {
               int loc = this.inventory.indexOf(med) + 1;
               Medicine next = this.inventory.get(loc);

               if (med.sharesNameWith(next))
               {
                    makeDeductions(next, -1 * remaining);
                    quantity = med.getCurrentQuantity();
               }
               else
               {
                    throw new IllegalArgumentException("The inventory does not have enough stocks to serve the order.");
               }
          }

          med.deductQuantity(quantity);
     }

     /**
      * Sorts a <code>Medicine</code> list by <b><i>lotNumber</b></i>,
      * <b><i>deliveryDate</b></i>, <b><i>expiryDate</b></i>,
      * <b><i>brandName</b></i>, and <b><i>genericName</b></i>
      * (in that exact order) to obtain a sorted inventory in the reverse order.
      * @param inventory
      */
     private static void sort(List<Medicine> inventory)
     {
          Medicine[] medsAsArray = new Medicine[inventory.size()];
          for (int i = 0; i < inventory.size(); i++)
               medsAsArray[i] = inventory.get(i);

          Arrays.sort(medsAsArray, new LotNumberComparator());
          Arrays.sort(medsAsArray, new DeliveryDateComparator());
          Arrays.sort(medsAsArray, new ExpiryDateComparator());
          Arrays.sort(medsAsArray, new MedBrandNameComparator());
          Arrays.sort(medsAsArray, new MedGenericNameComparator());

          inventory.clear();
          for (int i = 0; i < medsAsArray.length; i++)
          {
               inventory.add(medsAsArray[i]);
          }
     }

     public static void revealInventory(List<Medicine> inventory)
     {
          for (int i = 0; i < inventory.size(); i++)
          {
               inventory.get(i).printContents();
          }
     }
     
     
     
     
     public static double computeGrandTotal(List<TransactionItem> transList)
     {
          if(transList == null)
          {
               return -1;
          }
          
          double total = 0;
          for (TransactionItem item : transList)
          {
               total += item.getSubtotal();
          }
          
          return total;
     }
     
     
     
     public List<Medicine> getUniqueMedicines()
     {
          ArrayList<Medicine> uniqueMeds = new ArrayList<>(1);
          for (int i = 0 ; i < this.inventory.size(); i++)
          {
               if (uniqueMeds.isEmpty() || !this.inventory.get(i).sharesNameWith(uniqueMeds.get(uniqueMeds.size() -1)))
               {
                    uniqueMeds.add(this.inventory.get(i));
               }
          }
          
          return uniqueMeds;
     }
     
     public int getAvailableQuantitiesOf(Medicine med)
     {
          int available = 0;
          for (Medicine aMed : this.inventory)
          {
               if (aMed.sharesNameWith(med))
               {
                    available += aMed.getCurrentQuantity();
               }
          }
          return available;
     }
     
     
     
     
     public List<Transaction> searchTransactions(String fName,
         String mName, String lName, int year, int month)
     {
          ArrayList<Transaction> left = new ArrayList<>(1)
                                 ,right = new ArrayList<>(1);
          
          left.clear();
          for (Transaction trans : this.getTransactionList())
          {
               if (trans.getFirstName().compareToIgnoreCase(fName) == 0)
               {
                    left.add(trans);
               }
          }
          
          right.clear();
          for (Transaction trans : left)
          {
               if (trans.getMiddleName().compareToIgnoreCase(mName) == 0)
               {
                    right.add(trans);
               }
          }
          
          left.clear();
          for (Transaction trans : right)
          {
               if (trans.getLastName().compareToIgnoreCase(lName) == 0)
               {
                    left.add(trans);
               }
          }
          
          right.clear();
          for (Transaction trans : left)
          {
               if (trans.getDate().get(Calendar.YEAR) == year)
               {
                    right.add(trans);
               }
          }
          
          if (month < 0)
          {
               return right;
          }
          else
          {
               left.clear();
               for (Transaction trans : right)
               {
                    if (trans.getDate().get(Calendar.MONTH) == month)
                    {
                         left.add(trans);
                    }
               }
               
               return left;
          }
     }
}



class ItemGenericNameComparator implements Comparator<TransactionItem>
{
     @Override
     public int compare(TransactionItem a, TransactionItem b)
     {
          return a.getGenericName().compareTo(b.getGenericName());
     }
}

class ItemBrandNameComparator implements Comparator<TransactionItem>
{
     @Override
     public int compare(TransactionItem a, TransactionItem b)
     {
          return a.getBrandName().compareTo(b.getBrandName());
     }
}


class MedGenericNameComparator implements Comparator<Medicine>
{
     @Override
     public int compare(Medicine a, Medicine b)
     {
          return a.getGenericName().compareToIgnoreCase(b.getGenericName());
     }
}

class MedBrandNameComparator implements Comparator<Medicine>
{
     @Override
     public int compare(Medicine a, Medicine b)
     {
          return a.getBrandName().compareToIgnoreCase(b.getBrandName());
     }
}

class LotNumberComparator implements Comparator<Medicine>
{
     @Override
     public int compare(Medicine a, Medicine b)
     {
          return a.getLotNumber().compareToIgnoreCase(b.getLotNumber());
     }
}

class DeliveryDateComparator implements Comparator<Medicine>
{
     @Override
     public int compare(Medicine a, Medicine b)
     {
          return a.getDeliveryDate().compareTo(b.getDeliveryDate());
     }
}

class ExpiryDateComparator implements Comparator<Medicine>
{
     @Override
     public int compare(Medicine a, Medicine b)
     {
          return a.getExpiryDate().compareTo(b.getExpiryDate());
     }
}