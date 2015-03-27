package mjodatabase;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;


public class Medicine implements Serializable
{
     private final String genericName, brandName, lotNumber;
     private final GregorianCalendar expiryDate, deliveryDate;
     private final int initialQuantity;
     private int currentQuantity;
     private double pricePerPiece;

     public Medicine(String gen, String brand, String lot, GregorianCalendar exp,
                     GregorianCalendar del, int init, double ppp)
          throws IllegalArgumentException
     {
          if (gen == null || gen.isEmpty())
          {
               throw new IllegalArgumentException("Generic name should not be blank.");
          }
          this.genericName = gen;
          
          if (brand == null || brand.isEmpty())
          {
               throw new IllegalArgumentException("Brand name should not be blank.");
          }
          this.brandName = brand;
          
          if (lot == null || lot.isEmpty())
          {
               throw new IllegalArgumentException("Lot Number should not be blank.");
          }
          this.lotNumber = lot;
          
          if (exp == null)
          {
               throw new IllegalArgumentException("Expiry date should not be blank.");
          }
          this.expiryDate = exp;
          
          if (del == null)
          {
               throw new IllegalArgumentException("Delivery date should not be blank.");
          }
          this.deliveryDate = del;
          
          if (init < 1)
          {
               throw new IllegalArgumentException("Initial quantity should be a positive number.");
          }
          this.initialQuantity = init;

          
          setCurrentQuantity(this.initialQuantity);
          setPricePerPiece(ppp);
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
      * @return the lotNumber
      */
     public String getLotNumber()
     {
          return lotNumber;
     }

     /**
      * @return the expiryDate
      */
     public GregorianCalendar getExpiryDate()
     {
          return expiryDate;
     }

     /**
      * @return the deliveryDate
      */
     public GregorianCalendar getDeliveryDate()
     {
          return deliveryDate;
     }

     /**
      * @return the initialQuantity
      */
     public int getInitialQuantity()
     {
          return initialQuantity;
     }

     /**
      * @return the currentQuantity
      */
     public int getCurrentQuantity()
     {
          return currentQuantity;
     }

     public double getPricePerPiece()
     {
          return this.pricePerPiece;
     }

     /**
      * @param currentQuantity the currentQuantity to set
      */
     public void setCurrentQuantity(int currentQuantity)
     {
          this.currentQuantity = currentQuantity;
     }

     public void setPricePerPiece(double price) throws IllegalArgumentException
     {
          if (price <= 0)
          {
               throw new IllegalArgumentException("Price Per Piece should be a positive number.");
          }

          this.pricePerPiece = price;
     }

     @Override
     public boolean equals(Object obj)
     {
          Medicine med = (Medicine) obj;
          return (this.sharesNameWith(obj)
                  && this.lotNumber.equals(med.getLotNumber())
                  && this.initialQuantity == med.getInitialQuantity()
                  && this.pricePerPiece == med.getPricePerPiece()
                  && this.expiryDate.equals(med.getExpiryDate())
                  && this.deliveryDate.equals(med.getDeliveryDate()));
     }


     public boolean sharesNameWith(Object obj)
     {
          Medicine med = (Medicine) obj;
          return (this.genericName.equals(med.getGenericName())
                  && this.brandName.equals(med.getBrandName()));
     }



     @Override
     public int hashCode()
     {
          int hash = 5;
          hash = 89 * hash + Objects.hashCode(this.genericName);
          hash = 89 * hash + Objects.hashCode(this.brandName);
          hash = 89 * hash + Objects.hashCode(this.lotNumber);
          hash = 89 * hash + Objects.hashCode(this.expiryDate);
          hash = 89 * hash + Objects.hashCode(this.deliveryDate);
          hash = 89 * hash + this.initialQuantity;
          hash = 89 * hash + (int) (Double.doubleToLongBits(this.pricePerPiece) ^ (Double.doubleToLongBits(this.pricePerPiece) >>> 32));
          return hash;
     }


     public void printContents()
     {
          String contents = "Generic Name:\t" +  genericName
                            + "\nBrand Name:\t" + brandName
                            + "\nLot #:\t" + lotNumber
                            + "\nInitial Quantity:\t" + initialQuantity
                            + "\nCurrent Quantity:\t" + currentQuantity
                            + "\nPrice Per Piece:\t" + pricePerPiece
                            + "\nExpiry Date:\t" + expiryDate.get(Calendar.YEAR) + " " +
                            expiryDate.get(Calendar.MONTH) + " " + expiryDate.get(Calendar.DAY_OF_MONTH)
                            + "\nDelivery:\t" + deliveryDate.get(Calendar.YEAR) + " " +
                            deliveryDate.get(Calendar.MONTH) + " " + deliveryDate.get(Calendar.DAY_OF_MONTH);
          System.out.println(contents);
     }

     public void deductQuantity(int quantity)
     {
          this.setCurrentQuantity(this.currentQuantity - quantity);
     }
}