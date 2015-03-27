package mjotestpackage;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import mjodatabase.MJOBranch;
import mjodatabase.Medicine;
import mjodatabase.StorageOperations;
import mjodatabase.Transaction;
import mjodatabase.TransactionItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author user
 */
public class TransactionTableTest
{
     
     public TransactionTableTest()
     {
     }
     
     @BeforeClass
     public static void setUpClass()
     {
     }
     
     @AfterClass
     public static void tearDownClass()
     {
     }
     
     @Before
     public void setUp()
     {
     }
     
     @After
     public void tearDown()
     {
     }

     @Test
     public void constructionOfTransaction()
     {  
          GregorianCalendar exp = new GregorianCalendar(2016, 1, 14);
          GregorianCalendar del = new GregorianCalendar(1932, 0, 1);
          Medicine med1 = null, med2 = null;
          ArrayList<TransactionItem> manifest = new ArrayList<>(1),
               freebies = new ArrayList<>(1);

          try
          {
               med1 = new Medicine("Paracetamol", "Biogesic", "1", exp, del, 50, 2.5);
               med2 = new Medicine("Paracetamol", "Biogesic", "2", exp, del, 25, 2.5);
          }
          catch(Exception e)
          {
               fail("Not supposed to throw Exceptions here.");
          }
          
          TransactionItem item1, item2;
          item1 = new TransactionItem(med1, "", 1);
          item2 = new TransactionItem(med2, "", 2);
          
          manifest.add(item1);
          freebies.add(item2);

          Transaction trans = new Transaction("Cang", "Pio Vince", "B.", "UPD",
                      manifest, freebies, MJOBranch.computeGrandTotal(manifest),
                      MJOBranch.computeGrandTotal(freebies));
          
          assertEquals("Cang", trans.getLastName());
          assertEquals("Pio Vince", trans.getFirstName());
          assertEquals("B.", trans.getMiddleName());
          assertEquals("UPD", trans.getCompanyName());
          
          Assert.assertNotNull(trans.getPurchasedMedicines());
          Assert.assertNotNull(trans.getFreeMedicines());
          
          assertEquals(manifest, trans.getPurchasedMedicines());
          assertEquals(freebies, trans.getFreeMedicines());
          
          assertTrue(trans.getPurchasedMedicines().contains(item1));
          assertTrue(trans.getFreeMedicines().contains(item2));
     }
     
     @Test
     public void checkAllArgumentsValid()
     {  
          GregorianCalendar exp = new GregorianCalendar(2016, 1, 14);
          GregorianCalendar del = new GregorianCalendar(1932, 0, 1);
          Medicine med1 = null, med2 = null;
          ArrayList<TransactionItem> manifest = new ArrayList<>(1),
               freebies = new ArrayList<>(1);

          try
          {
               med1 = new Medicine("Paracetamol", "Biogesic", "1", exp, del, 50, 2.5);
               med2 = new Medicine("Paracetamol", "Biogesic", "2", exp, del, 25, 2.5);
          }
          catch(Exception e)
          {
               fail("Not supposed to throw Exceptions here.");
          }
          
          TransactionItem item1, item2;
          item1 = new TransactionItem(med1, "", 1);
          item2 = new TransactionItem(med2, "", 2);
          
          manifest.add(item1);
          freebies.add(item2);
          Transaction trans;
          
          try
          {
               trans = new Transaction("", "Pio Vince", "B.", "UPD", manifest,
                       freebies, MJOBranch.computeGrandTotal(manifest),
                       MJOBranch.computeGrandTotal(freebies));
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Last Name should not be blank.");
          }     
          try
          {
               trans = new Transaction(null, "Pio Vince", "B.", "UPD", manifest,
                       freebies, MJOBranch.computeGrandTotal(manifest),
                       MJOBranch.computeGrandTotal(freebies));
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Last Name should not be blank.");
          }
          
          try
          {
               trans = new Transaction("Cang", "", "B.", "UPD", manifest,
                       freebies, MJOBranch.computeGrandTotal(manifest),
                       MJOBranch.computeGrandTotal(freebies));
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "First Name should not be blank.");
          }
          try
          {
               trans = new Transaction("Cang", null, "B.", "UPD", manifest,
                       freebies, MJOBranch.computeGrandTotal(manifest),
                       MJOBranch.computeGrandTotal(freebies));
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "First Name should not be blank.");
          }
          
          try
          {
               trans = new Transaction("Cang", "Pio Vince", "", "UPD", manifest,
                       freebies, MJOBranch.computeGrandTotal(manifest),
                       MJOBranch.computeGrandTotal(freebies));
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Middle Name should not be blank.");
          }
          try
          {
               trans = new Transaction("Cang", "Pio Vince", null, "UPD", manifest,
                       freebies, MJOBranch.computeGrandTotal(manifest),
                      MJOBranch.computeGrandTotal(freebies));
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Middle Name should not be blank.");
          }
          
          try
          {
               trans = new Transaction("Cang", "Pio Vince", "B.", null, manifest,
                       freebies, MJOBranch.computeGrandTotal(manifest),
                       MJOBranch.computeGrandTotal(freebies));
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Company Name can be blank, but not null.");
          }
          
          try
          {
               ArrayList<TransactionItem> tempList = new ArrayList<TransactionItem>(1);
               trans = new Transaction("Cang", "Pio Vince", "B.", "UPD", tempList,
                       freebies, MJOBranch.computeGrandTotal(tempList),
                       MJOBranch.computeGrandTotal(freebies));
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "A transaction must have at least one item.");
          }
          try
          {
               trans = new Transaction("Cang", "Pio Vince", "B.", "UPD", null,
                       freebies, MJOBranch.computeGrandTotal(null),
                       MJOBranch.computeGrandTotal(freebies));
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "A transaction must have at least one item.");
          }
          
          try
          {
               trans = new Transaction("Cang", "Pio Vince", "B.", "UPD", manifest,
                       null, MJOBranch.computeGrandTotal(manifest),
                       MJOBranch.computeGrandTotal(null));
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Free medicines can be empty, but not null.");
          }
          
          try
          {
               trans = new Transaction("Cang", "Pio Vince", "B.", "UPD", manifest, freebies, -1.0, 0.0);
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Purchased grand total should be a positive number.");
          }
          
          try
          {
               trans = new Transaction("Cang", "Pio Vince", "B.", "UPD", manifest, freebies, 1.0, -1.0);
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Free total should not be negative.");
          }
     }
     
     @Test
     public void checkIfSerializationIsReflexive()
     {
          GregorianCalendar exp = new GregorianCalendar(2016, 1, 14);
          GregorianCalendar del = new GregorianCalendar(1932, 0, 1);
          Medicine med1 = null, med2 = null, med3 = null, med4 = null, med5 = null;

          MJOBranch mjo = new MJOBranch();

          try
          {
               med1 = new Medicine("Paracetamol", "Biogesic", "1", exp, del, 50, 2.5);
               med2 = new Medicine("Paracetamol", "Biogesic", "2", exp, del, 25, 2.5);
               med3 = new Medicine("Paracetamol", "Biogesic", "3", exp, del, 25, 2.5);
               med4 = new Medicine("Ibuprofen", "Advil", "09077", exp, del, 1000, 1.0);
               med5 = new Medicine("Zinc", "Enervon", "09077", exp, del, 100, 12.0);
          }
          catch(IllegalArgumentException e)
          {
               fail("Not expected to catch any exceptions here.");
          }

          
          ArrayList<TransactionItem> manifest = new ArrayList<>(1),
               freebies = new ArrayList<>(1);
          
          TransactionItem item1, item2, item3, item4, item5;
          item1 = new TransactionItem(med1, "", 1);
          item2 = new TransactionItem(med2, "", 2);
          item3 = new TransactionItem(med3, "", 3);
          item4 = new TransactionItem(med4, "", 4);
          item5 = new TransactionItem(med5, "", 5);
          
          manifest.add(item1);
          manifest.add(item2);
          manifest.add(item3);
          freebies.add(item4);
          freebies.add(item5);
          
          ArrayList<Transaction> transactionList = new ArrayList<>(1);
          Transaction trans = new Transaction("Cang", "Pio Vince", "B.", "UPD",
                  manifest, freebies, MJOBranch.computeGrandTotal(manifest),
                       MJOBranch.computeGrandTotal(freebies));
          transactionList.add(trans);
          
          mjo.setTransactionList(transactionList);
          
          assertTrue(!mjo.getTransactionList().isEmpty());
          assertTrue(!mjo.getTransactionList().get(0).getPurchasedMedicines().isEmpty());
          assertTrue(!mjo.getTransactionList().get(0).getFreeMedicines().isEmpty());
          
          StorageOperations.encodeTransaction(mjo.getTransactionList());
          MJOBranch ano = new MJOBranch();
          ano.setTransactionList(StorageOperations.retrieveTransactions());
          assertTrue(mjo.getTransactionList().equals(ano.getTransactionList()));
     }
}
