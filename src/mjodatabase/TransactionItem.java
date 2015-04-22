package mjodatabase;

import java.io.Serializable;
import java.util.Objects;


public class TransactionItem implements Serializable
{
     private final String genericName, brandName, doctorName;
     private final int quantity;
     private final double pricePerPiece, subtotal;
     
     public TransactionItem(Medicine med, String doctorName, int quantity)
             throws IllegalArgumentException
     {
          this.genericName = med.getGenericName();
          this.brandName =  med.getBrandName();
          
          if (doctorName == null)
          {
               throw new IllegalArgumentException("Doctor's name can be blank, but not null.");
          }
          this.doctorName = doctorName;
          
          if (quantity < 1)
          {
               throw new IllegalArgumentException("Order quantity should be a positive whole number.");
          }
          this.quantity = quantity;   
          this.pricePerPiece = med.getPricePerPiece();
          this.subtotal = pricePerPiece * quantity;
     }

     /**
      * @return the genericName
      */
     public String getGenericName()
     {
          return genericName;
     }

     /**
      * @return the brandName
      */
     public String getBrandName()
     {
          return brandName;
     }

     /**
      * @return the doctorName
      */
     public String getDoctorName()
     {
          return doctorName;
     }

     /**
      * @return the quantity
      */
     public int getQuantity()
     {
          return quantity;
     }

     /**
      * @return the pricePerPiece
      */
     public double getPricePerPiece()
     {
          return pricePerPiece;
     }

     /**
      * @return the subtotal
      */
     public double getSubtotal()
     {
          return subtotal;
     }
     
     @Override
     public boolean equals(Object obj)
     {
          TransactionItem item = (TransactionItem) obj;
          return (this.genericName.equals(item.getGenericName())
                  && this.brandName.equals(item.getBrandName())
                  && this.doctorName.equals(item.getDoctorName())
                  && this.quantity == item.getQuantity()
                  && this.pricePerPiece == item.getPricePerPiece()
                  && this.subtotal == item.getSubtotal()
                 );
     }

     @Override
     public int hashCode()
     {
          int hash = 7;
          hash = 31 * hash + Objects.hashCode(this.genericName);
          hash = 31 * hash + Objects.hashCode(this.brandName);
          hash = 31 * hash + Objects.hashCode(this.doctorName);
          hash = 31 * hash + this.quantity;
          hash = 31 * hash + (int) (Double.doubleToLongBits(this.pricePerPiece) ^ (Double.doubleToLongBits(this.pricePerPiece) >>> 32));
          hash = 31 * hash + (int) (Double.doubleToLongBits(this.subtotal) ^ (Double.doubleToLongBits(this.subtotal) >>> 32));
          return hash;
     }
}
