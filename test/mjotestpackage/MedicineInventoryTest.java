package mjotestpackage;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import mjodatabase.MJOBranch;
import mjodatabase.Medicine;
import mjodatabase.StorageOperations;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author user
 */
public class MedicineInventoryTest
{

     public MedicineInventoryTest(){}

     @BeforeClass
     public static void setUpClass(){}

     @AfterClass
     public static void tearDownClass(){}

     @Before
     public void setUp(){}

     @After
     public void tearDown(){}

     @Test
     public void constructionOfMedicine()
     {
          GregorianCalendar exp = new GregorianCalendar(2016, 1, 14);
          GregorianCalendar del = new GregorianCalendar(1932, 0, 1);
          Medicine med = null;

          try
          {
               med = new Medicine("Paracetamol", "Biogesic", "101560", exp, del, 500, 2.5);
          }
          catch(IllegalArgumentException e)
          {
               System.err.println(e.getMessage());
          }

          assertEquals("Paracetamol", med.getGenericName());
          assertEquals("Biogesic", med.getBrandName());
          assertEquals("101560", med.getLotNumber());
          assertEquals(exp, med.getExpiryDate());
          assertEquals(del, med.getDeliveryDate());
          assertEquals(500, med.getInitialQuantity());
          assertEquals(2.5, med.getPricePerPiece(), Math.pow(10, -5));
          assertEquals(med.getInitialQuantity(), med.getCurrentQuantity());
     }

     @Test
     public void checkAllArgumentsValid()
     {
          GregorianCalendar exp = new GregorianCalendar(2016, 1, 14);
          GregorianCalendar del = new GregorianCalendar(1932, 0, 1);
          Medicine med = null;
          
          try
          {
               med = new Medicine("", "Biogesic", "101560", exp, del, 10, 2.5);
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Generic name should not be blank.");
          }
          
          try
          {
               med = new Medicine(null, "Biogesic", "101560", exp, del, 10, 2.5);
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Generic name should not be blank.");
          }
          
          try
          {
               med = new Medicine("Paracetamol", "", "101560", exp, del, 10, 2.5);
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Brand name should not be blank.");
          }
          
          try
          {
               med = new Medicine("Paracetamol", null, "101560", exp, del, 10, 2.5);
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Brand name should not be blank.");
          }
          
          try
          {
               med = new Medicine("Paracetamol", "Biogesic", "", exp, del, 10, 2.5);
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Lot Number should not be blank.");
          }
          
          try
          {
               med = new Medicine("Paracetamol", "Biogesic", null, exp, del, 10, 2.5);
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Lot Number should not be blank.");
          }
          
          try
          {
               med = new Medicine("Paracetamol", "Biogesic", "101560", null, del, 10, 2.5);
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Expiry date should not be blank.");
          }
          
          try
          {
               med = new Medicine("Paracetamol", "Biogesic", "101560", exp, null, 10, 2.5);
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Delivery date should not be blank.");
          }
          
          try
          {
               med = new Medicine("Paracetamol", "Biogesic", "101560", exp, del, -10, 2.5);
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Initial quantity should be a positive number.");
          }
          
          try
          {
               med = new Medicine("Paracetamol", "Biogesic", "101560", exp, del, 100, -10);
               fail();
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Price Per Piece should be a positive number.");
          }
     }

     @Test
     public void checkMedicineInventoryCreated()
     {
          MJOBranch mjo = new MJOBranch();
          List<Medicine> anInventory = mjo.getInventory();
          assertNotNull(anInventory);
     }

     @Test
     public void checkMedicineAddedToInventory()
     {
          GregorianCalendar exp = new GregorianCalendar(2016, 1, 14);
          GregorianCalendar del = new GregorianCalendar(1932, 0, 1);
          Medicine med1 = null, med2 = null;

          MJOBranch mjo = new MJOBranch();

          try
          {
               med1 = new Medicine("Paracetamol", "Biogesic", "101560", exp, del, 500, 2.5);
               med2 = new Medicine("Ibuprofen", "Advil", "09077", exp, del, 1000, 1.5);

               MJOBranch.addMedicineToList(mjo.getInventory(), med1);
               assertEquals(1, mjo.getInventory().size());
               assertTrue(mjo.getInventory().contains(med1));

               MJOBranch.addMedicineToList(mjo.getInventory(), med2);
               assertEquals(2, mjo.getInventory().size());
               assertTrue(mjo.getInventory().contains(med2));
          }
          catch(Exception e)
          {
               fail("Not expected to catch any exceptions here.");
          }
     }

     @Test
     public void checkMedicineRemovedFromInventory()
     {
          GregorianCalendar exp = new GregorianCalendar(2016, 1, 14);
          GregorianCalendar del = new GregorianCalendar(1932, 0, 1);
          Medicine med1 = null, med2 = null;

          MJOBranch mjo = new MJOBranch();

          try
          {
               med1 = new Medicine("Paracetamol", "Biogesic", "101560", exp, del, 500, 2.5);
               med2 = new Medicine("Ibuprofen", "Advil", "09077", exp, del, 1000, 1.0);

               MJOBranch.addMedicineToList(mjo.getInventory(), med1);
               MJOBranch.addMedicineToList(mjo.getInventory(), med2);
          }
          catch(IllegalArgumentException e)
          {
               fail("Not expected to catch any exceptions here.");
          }


          mjo.removeMedicineFromInventory(med2);
          assertEquals(1, mjo.getInventory().size());
          assertFalse(mjo.getInventory().contains(med2));
          assertNotSame(med2, mjo.getInventory().get(0));

          mjo.removeMedicineFromInventory(med1);
          assertEquals(0, mjo.getInventory().size());
          assertFalse(mjo.getInventory().contains(med1));

          assertTrue(mjo.getInventory().isEmpty());
     }

     @Test
     public void checkIfSerializationIsReflexive()
     {
          GregorianCalendar exp = new GregorianCalendar(2016, 1, 14);
          GregorianCalendar del = new GregorianCalendar(1932, 0, 1);
          Medicine med1 = null, med2 = null;

          MJOBranch mjo = new MJOBranch();

          try
          {
               med1 = new Medicine("Paracetamol", "Biogesic", "101560", exp, del, 500, 2.5);
               med2 = new Medicine("Ibuprofen", "Advil", "09077", exp, del, 1000, 1.0);

               MJOBranch.addMedicineToList(mjo.getInventory(), med1);
               MJOBranch.addMedicineToList(mjo.getInventory(), med2);
          }
          catch(IllegalArgumentException e)
          {
               fail("Not expected to catch any exceptions here.");
          }

          StorageOperations.encodeMedicines(mjo.getInventory());

          MJOBranch ano = new MJOBranch();
          ano.setInventory(StorageOperations.retrieveMedicines());

          assertTrue(mjo.getInventory().equals(ano.getInventory()));
     }

     @Test
     public void checkRejectSameBrandDifferentPriceException()
     {
          GregorianCalendar exp = new GregorianCalendar(2016, 1, 14);
          GregorianCalendar del = new GregorianCalendar(1932, 0, 1);
          Medicine med1 = null, med2 = null;

          MJOBranch mjo = new MJOBranch();

          try
          {
               med1 = new Medicine("Paracetamol", "Biogesic", "101560", exp, del, 500, 2.5);
               med2 = new Medicine("Paracetamol", "Biogesic", "09077", exp, del, 1000, 1.5);

               MJOBranch.addMedicineToList(mjo.getInventory(), med1);
               MJOBranch.addMedicineToList(mjo.getInventory(), med2);
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "Medicine of similar names should not have different prices.");
          }
     }

     @Test
     public void checkInsufficientStock()
     {
          GregorianCalendar exp = new GregorianCalendar(2016, 1, 14);
          GregorianCalendar del = new GregorianCalendar(1932, 0, 1);
          Medicine med1 = null, med2 = null, med3 = null, med4 = null, med5 = null;

          MJOBranch mjo = new MJOBranch();

          try
          {
               med5 = new Medicine("Zinc", "Enervon", "09077", exp, del, 100, 12.0);
               med1 = new Medicine("Paracetamol", "Biogesic", "1", exp, del, 50, 2.5);
               med2 = new Medicine("Paracetamol", "Biogesic", "2", exp, del, 25, 2.5);
               med3 = new Medicine("Paracetamol", "Biogesic", "3", exp, del, 25, 2.5);
               med4 = new Medicine("Ibuprofen", "Advil", "09077", exp, del, 1000, 1.0);

               MJOBranch.addMedicineToList(mjo.getInventory(), med1);
               MJOBranch.addMedicineToList(mjo.getInventory(), med2);
               MJOBranch.addMedicineToList(mjo.getInventory(), med3);
               MJOBranch.addMedicineToList(mjo.getInventory(), med4);
               MJOBranch.addMedicineToList(mjo.getInventory(), med5);

               mjo.makeDeductions(med1, 101);
          }
          catch(IllegalArgumentException e)
          {
               assertEquals(e.getMessage(), "The inventory does not have enough stocks to serve the order.");
          }
     }

     @Test
     public void checkSameBrandCatchesExcessDeduction()
     {
          GregorianCalendar exp = new GregorianCalendar(2016, 1, 14);
          GregorianCalendar del = new GregorianCalendar(1932, 0, 1);
          Medicine med1 = null, med2 = null, med3 = null;

          MJOBranch mjo = new MJOBranch();

          try
          {
               med1 = new Medicine("Paracetamol", "Biogesic", "1", exp, del, 50, 2.5);
               med2 = new Medicine("Paracetamol", "Biogesic", "2", exp, del, 25, 2.5);
               med3 = new Medicine("Paracetamol", "Biogesic", "3", exp, del, 25, 2.5);

               MJOBranch.addMedicineToList(mjo.getInventory(), med1);
               MJOBranch.addMedicineToList(mjo.getInventory(), med2);
               MJOBranch.addMedicineToList(mjo.getInventory(), med3);

               mjo.makeDeductions(med1, 20);
               assertEquals(med1.getCurrentQuantity(), 30);

               //side note: in reality, we would ALWAYS deduct from med1
               //(the first to expire). this is only a test
               mjo.makeDeductions(med2, 15);
               assertEquals(med2.getCurrentQuantity(), 10);

               mjo.makeDeductions(med3, 5);
               assertEquals(med3.getCurrentQuantity(), 20);

               mjo.makeDeductions(med1, 50);
               assertEquals(med1.getCurrentQuantity(), 0);
               assertEquals(med2.getCurrentQuantity(), 0);
               assertEquals(med3.getCurrentQuantity(), 10);
          }
          catch(IllegalArgumentException e)
          {
               fail("Not expected to catch any exceptions here.");
          }
     }
     
     @Test
     public void checkIfMedsAreReallyUnique()
     {
          GregorianCalendar exp = new GregorianCalendar(2016, 1, 14);
          GregorianCalendar del = new GregorianCalendar(1932, 0, 1);
          Medicine med1 = null, med2 = null, med3 = null, med4 = null, med5 = null;

          MJOBranch mjo = new MJOBranch();

          try
          {
               med5 = new Medicine("Zinc", "Enervon", "09077", exp, del, 100, 12.0);
               med1 = new Medicine("Paracetamol", "Biogesic", "1", exp, del, 50, 2.5);
               med2 = new Medicine("Paracetamol", "Biogesic", "2", exp, del, 25, 2.5);
               med3 = new Medicine("Paracetamol", "Biogesic", "3", exp, del, 25, 2.5);
               med4 = new Medicine("Ibuprofen", "Advil", "09077", exp, del, 1000, 1.0);

               MJOBranch.addMedicineToList(mjo.getInventory(), med1);
               MJOBranch.addMedicineToList(mjo.getInventory(), med2);
               MJOBranch.addMedicineToList(mjo.getInventory(), med3);
               MJOBranch.addMedicineToList(mjo.getInventory(), med4);
               MJOBranch.addMedicineToList(mjo.getInventory(), med5);
               
               ArrayList<Medicine> benchmark = new ArrayList<>(1);
               benchmark.add(med4);
               benchmark.add(med1);
               benchmark.add(med5);
               
               assertTrue(benchmark.equals(mjo.getUniqueMedicines()));
          }
          catch(IllegalArgumentException e)
          {
               fail("Not expected to catch any exceptions here.");
          }
     }
}
