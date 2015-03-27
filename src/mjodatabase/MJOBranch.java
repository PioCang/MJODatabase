package mjodatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @since Feb 12 2015
 * @author Vince
 */
public class MJOBranch
{
     private List<Medicine> inventory;
     private List<Transaction> transactions;

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
          /*GregorianCalendar exp = new GregorianCalendar(2016, 1, 14);
          GregorianCalendar del = new GregorianCalendar(1932, 0, 1);
          Medicine med1 = null, med2 = null, med3 = null;

          MJOBranch mjo = new MJOBranch();

          try
          {
               med1 = new Medicine("Paracetamol", "Biogesic", "1", exp, del, 50, 2.5);
               med2 = new Medicine("Paracetamol", "Biogesic", "2", exp, del, 25, 2.5);
               med3 = new Medicine("Paracetamol", "Biogesic", "3", exp, del, 25, 2.5);

               mjo.addMedicineToInventory(med1);
               mjo.addMedicineToInventory(med2);
               mjo.addMedicineToInventory(med3);

               mjo.makeDeductions(med1, 20);


               //side note: in reality, we would ALWAYS deduct from med1
               //(the first to expire). this is only a test
               mjo.makeDeductions(med2, 15);


               mjo.makeDeductions(med3, 5);

               mjo.makeDeductions(med1, 50);

               MedicineGUI.showInventory(mjo.getInventory());
          }
          catch(Exception e)
          {
               e.printStackTrace();
          }*/
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
     public static void sort(List<Medicine> inventory)
     {
          Medicine[] medsAsArray = new Medicine[inventory.size()];
          for (int i = 0; i < inventory.size(); i++)
               medsAsArray[i] = inventory.get(i);

          Arrays.sort(medsAsArray, new lotNumberComparator());
          Arrays.sort(medsAsArray, new deliveryDateComparator());
          Arrays.sort(medsAsArray, new expiryDateComparator());
          Arrays.sort(medsAsArray, new MedBrandNameComparator());
          Arrays.sort(medsAsArray, new MedGenericNameComparator());

          inventory.clear();
          for (int i = 0; i < medsAsArray.length; i++)
          {
               inventory.add(medsAsArray[i]);
          }
     }

     public void revealInventory()
     {
          for (int i = 0; i < this.inventory.size(); i++)
          {
               this.inventory.get(i).printContents();
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


class DateComparator implements Comparator<Transaction>
{
     @Override
     public int compare(Transaction a, Transaction b)
     {
          return a.getDate().compareTo(b.getDate());
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

class lotNumberComparator implements Comparator<Medicine>
{
     @Override
     public int compare(Medicine a, Medicine b)
     {
          return a.getLotNumber().compareToIgnoreCase(b.getLotNumber());
     }
}

class deliveryDateComparator implements Comparator<Medicine>
{
     @Override
     public int compare(Medicine a, Medicine b)
     {
          return a.getDeliveryDate().compareTo(b.getDeliveryDate());
     }
}

class expiryDateComparator implements Comparator<Medicine>
{
     @Override
     public int compare(Medicine a, Medicine b)
     {
          return a.getExpiryDate().compareTo(b.getExpiryDate());
     }
}