package mjodatabase;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;


public class Transaction implements Serializable
{
     private final GregorianCalendar date;
     private final String lastName, firstName, middleName, companyName;
     private final List<TransactionItem> purchasedMedicines, freeMedicines;
     private boolean isMember;
     private final double purchasedTotal, freeTotal;
     
     public Transaction(String lastName, String firstName, String middleName,
          String companyName, List<TransactionItem> purchasedMedicines,
          List <TransactionItem> freeMedicines, double bought, double free)
     {
          this.date = new GregorianCalendar();
          
          if (lastName == null || lastName.isEmpty())
          {
               throw new IllegalArgumentException("Last Name should not be blank.");
          }
          this.lastName = lastName;
          
          if (firstName == null || firstName.isEmpty())
          {
               throw new IllegalArgumentException("First Name should not be blank.");
          }
          this.firstName = firstName;
          
          if (middleName == null || middleName.isEmpty())
          {
               throw new IllegalArgumentException("Middle Name should not be blank.");
          }
          this.middleName = middleName;
          
          if (companyName == null)
          {
               throw new IllegalArgumentException("Company Name can be blank, but not null.");
          }
          this.companyName = companyName;
          
          if (purchasedMedicines == null || purchasedMedicines.isEmpty())
          {
               throw new IllegalArgumentException("A transaction must have at least one item.");
          }
          this.purchasedMedicines = purchasedMedicines;
          
          if (freeMedicines == null)
          {
               throw new IllegalArgumentException("Free medicines can be empty, but not null.");
          }
          this.freeMedicines = freeMedicines;
          this.isMember = false;
          
          if (bought <= 0)
          {
               throw new IllegalArgumentException("Purchased grand total should be a positive number.");
          }
          this.purchasedTotal = bought;
          
          if (free < 0)
          {
               throw new IllegalArgumentException("Free total should not be negative.");
          }
          this.freeTotal = free;
     }

     /**
      * @return the date
      */
     public GregorianCalendar getDate()
     {
          return date;
     }

     /**
      * @return the lastName
      */
     public String getLastName()
     {
          return lastName;
     }

     /**
      * @return the firstName
      */
     public String getFirstName()
     {
          return firstName;
     }

     /**
      * @return the middleName
      */
     public String getMiddleName()
     {
          return middleName;
     }

     /**
      * @return the companyName
      */
     public String getCompanyName()
     {
          return companyName;
     }

     /**
      * @return the purchasedMedicine
      */
     public List<TransactionItem> getPurchasedMedicines()
     {
          return purchasedMedicines;
     }


     /**
      * @return the isMember
      */
     public boolean isMember()
     {
          return isMember;
     }

     /**
      * @param isMember the isMember to set
      */
     public void setMembership(boolean isMember)
     {
          this.isMember = isMember;
     }

     /**
      * @return the grandTotal
      */
     public double getGrandTotal()
     {
          return purchasedTotal;
     }

     /**
      * @return the freeMedicines
      */
     public List<TransactionItem> getFreeMedicines()
     {
          return freeMedicines;
     }
     
     @Override
     public boolean equals(Object obj)
     {
          Transaction trans = (Transaction) obj;
          return (this.date.equals(trans.getDate())
                  && this.lastName.equals(trans.getLastName())
                  && this.firstName.equals(trans.getFirstName())
                  && this.middleName.equals(trans.getMiddleName())
                  && this.companyName.equals(trans.getCompanyName())
                  && this.isMember == trans.isMember()
                  && this.purchasedMedicines.equals(trans.getPurchasedMedicines())
                  && this.freeMedicines.equals(trans.getFreeMedicines())
                  );
     }

     @Override
     public int hashCode()
     {
          int hash = 5;
          hash = 17 * hash + Objects.hashCode(this.date);
          hash = 17 * hash + Objects.hashCode(this.lastName);
          hash = 17 * hash + Objects.hashCode(this.firstName);
          hash = 17 * hash + Objects.hashCode(this.middleName);
          hash = 17 * hash + Objects.hashCode(this.companyName);
          hash = 17 * hash + Objects.hashCode(this.purchasedMedicines);
          hash = 17 * hash + Objects.hashCode(this.freeMedicines);
          hash = 17 * hash + (this.isMember ? 1 : 0);
          hash = 17 * hash + (int) (Double.doubleToLongBits(this.purchasedTotal) ^ (Double.doubleToLongBits(this.purchasedTotal) >>> 32));
          return hash;
     }
}
