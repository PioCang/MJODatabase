package mjodatabase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class StorageOperations
{
     private static final String medsFile = System.getProperty("user.dir") + "\\medicines.mjo",
                                 transFile = System.getProperty("user.dir") + "\\transactions.mjo";;

     public static void encodeMedicines(List<Medicine> inventory)
     {
          try
          (
               FileOutputStream fos = new FileOutputStream(medsFile);
               ObjectOutputStream oos = new ObjectOutputStream(fos);
          )
          {
               oos.writeObject(new Date());
               oos.writeInt(inventory.size());
               for (int i = 0; i < inventory.size(); i++)
               {
                    oos.writeObject(inventory.get(i));
               }
               oos.close();
               fos.close();
          }
          catch(IOException ex)
          {
               System.err.println("Cannot encode medicine files.");
               ex.printStackTrace();
          }
     }

     public static List<Medicine> retrieveMedicines()
     {
          ArrayList<Medicine> inventory = new ArrayList<>();
          MJOGUI.currentDate = new Date();
          
          if (new File(medsFile).exists())
          {
               try
               (
                    FileInputStream fis = new FileInputStream(medsFile);
                    ObjectInputStream ois = new ObjectInputStream(fis);
               )
               {
                    MJOGUI.currentDate = (Date) ois.readObject();
                    int n = ois.readInt();
                    for (int i = 0; i < n; i++)
                    {
                         inventory.add((Medicine) ois.readObject());
                    }
                    ois.close();
                    fis.close();
               }
               catch(IOException ex)
               {
                    System.err.println("Cannot import medicine files.");
                    ex.printStackTrace();
               }
               catch(ClassNotFoundException e)
               {
                    System.err.println("Cannot typecast to Medicine class.");
                    e.printStackTrace();
               }
          }

          return inventory;
     }
     
     
     public static void encodeTransactions(List<Transaction> transactionList)
     {
          try
          (
               FileOutputStream fos = new FileOutputStream(transFile);
               ObjectOutputStream oos = new ObjectOutputStream(fos);
          )
          {
               oos.writeObject(new Date());
               oos.writeInt(transactionList.size());
               for (int i = 0; i < transactionList.size(); i++)
               {
                    oos.writeObject(transactionList.get(i));
               }
               oos.close();
               fos.close();
          }
          catch(IOException ex)
          {
               System.err.println("Cannot encode transaction files.");
               ex.printStackTrace();
          }
     }
     
     public static List<Transaction> retrieveTransactions()
     {
          ArrayList<Transaction> transactionList = new ArrayList<>();
          MJOGUI.currentDate = new Date();
          
          if (new File(transFile).exists())
          {
               try
               (
                    FileInputStream fis = new FileInputStream(transFile);
                    ObjectInputStream ois = new ObjectInputStream(fis);
               )
               { 
                    MJOGUI.currentDate = (Date) ois.readObject();
                    int n = ois.readInt();
                    for (int i = 0; i < n; i++)
                    {
                         transactionList.add((Transaction) ois.readObject());
                    }
                    ois.close();
                    fis.close();
               }
               catch(IOException ex)
               {
                    System.err.println("Cannot import transaction files.");
                    ex.printStackTrace();
               }
               catch(ClassNotFoundException e)
               {
                    System.err.println("Cannot typecast to Transaction class.");
                    e.printStackTrace();
               }
          }

          return transactionList;
     }
}
