package mjotestpackage;

import java.util.GregorianCalendar;
import mjodatabase.Medicine;
import mjodatabase.TransactionItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class TransactionItemTest
{
     
     public TransactionItemTest()
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
     public void constructionOfTableItem()
     {
          GregorianCalendar exp = new GregorianCalendar(2016, 1, 14);
          GregorianCalendar del = new GregorianCalendar(1932, 0, 1);
          Medicine med = null;
          
          try
          {
               med = new Medicine("Zinc", "Enervon", "09077", exp, del, 100, 12.0);
          }
          catch(Exception e)
          {
               fail("Not supposed to throw Exceptions here.");
          }
          
          TransactionItem item = null;
          try
          {
               item = new TransactionItem(med, "", 1);
          }
          catch(Exception e)
          {
               fail("Not supposed to throw Exceptions here.");
          }
          
          assertEquals(item.getGenericName(), med.getGenericName());
          assertEquals(item.getBrandName(), med.getBrandName());
          assertEquals(item.getDoctorName(), "");
          assertEquals(item.getQuantity(), 1);
          assertEquals(item.getPricePerPiece(), med.getPricePerPiece(), Math.pow(10, -5));
          assertEquals(item.getSubtotal(), med.getPricePerPiece() * 1, Math.pow(10, -5));
     }

     @Test
     public void checkAllArgumentsValid()
     {
          GregorianCalendar exp = new GregorianCalendar(2016, 1, 14);
          GregorianCalendar del = new GregorianCalendar(1932, 0, 1);
          Medicine med = null;
          
          try
          {
               med = new Medicine("Zinc", "Enervon", "09077", exp, del, 100, 12.0);
          }
          catch(Exception e)
          {
               fail("Not supposed to throw Exceptions here.");
          }
          
          TransactionItem item = null;
          try
          {
               item = new TransactionItem(med, null, 1);
          }
          catch(Exception e)
          {
               assertEquals(e.getMessage(), "Doctor's name can be blank, but not null.");
          }
          try
          {
               item = new TransactionItem(med, "", -1);
          }
          catch(Exception e)
          {
               assertEquals(e.getMessage(), "Order quantity should be a positive whole number.");
          }
     }
}
