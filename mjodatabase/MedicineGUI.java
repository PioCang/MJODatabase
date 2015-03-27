package mjodatabase;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class MedicineGUI
{
     public static final String[] infoOnMedsTable = { "Generic Name", "Brand Name",
          "Current Quantity", "Expiry Date", "Date Delivered", "Lot #",
          "Price Per Piece", "Initial Quantity"};

     private static JFrame medsFrame;
     private static Date currentDate;
     private static JTable medsTable;
     private static Object[][] medsData;

     private static final JScrollPane scrollPaneForMedsTable =
                     new JScrollPane(medsTable,
                         JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                         JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

     public static void showInventory(List<Medicine> inventory)
     {
          try
          {
              UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
          }
          catch(Exception e)
          {
              //nothing
          }

          currentDate = new Date();
          medsFrame = new JFrame("Inventory as of " + currentDate.toString());

          medsData = new Object[inventory.size()][infoOnMedsTable.length];
          GregorianCalendar cal;
          String temp;

          for(int i = 0; i < inventory.size(); i++)
          {
               medsData[i][0] = inventory.get(i).getGenericName();
               medsData[i][1] = inventory.get(i).getBrandName();
               medsData[i][2] = inventory.get(i).getCurrentQuantity();

               cal = inventory.get(i).getExpiryDate();
               temp = cal.get(Calendar.DAY_OF_MONTH) + " " +
                      cal.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.ENGLISH)
                      + " " + cal.get(Calendar.YEAR);
               medsData[i][3] = temp;
               cal = inventory.get(i).getDeliveryDate();
               temp = cal.get(Calendar.DAY_OF_MONTH) + " " +
                      cal.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.ENGLISH)
                      + " " + cal.get(Calendar.YEAR);
               medsData[i][4] = temp;

               medsData[i][5] = inventory.get(i).getLotNumber();
               medsData[i][6] = "P  " + inventory.get(i).getPricePerPiece();
               medsData[i][7] = inventory.get(i).getInitialQuantity();
          }



          medsTable = new JTable();
          medsTable.setFont(new Font("Calibri", Font.PLAIN , 15));

          medsTable.setModel(new DefaultTableModel(medsData, infoOnMedsTable)
              {
                  @Override
                  public boolean isCellEditable(int rowIndex, int mColIndex)
                  {
                      return false;
                  }
              }
          );

          DefaultTableCellRenderer centerAlign = new DefaultTableCellRenderer();
          centerAlign.setHorizontalAlignment(JLabel.CENTER);
          centerAlign.setVerticalAlignment(JLabel.CENTER);
          for (int i= 0; i < infoOnMedsTable.length; i++ )
          {
              medsTable.getColumnModel().getColumn(i).setCellRenderer(centerAlign);
          }
          medsTable.setFont(new Font("Calibri", Font.PLAIN , 17));
          medsTable.setRowHeight(23);




          scrollPaneForMedsTable.setViewportView(medsTable);
          medsFrame.add(scrollPaneForMedsTable);

          medsFrame.setPreferredSize(new Dimension(1000, 700));
          medsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

          // Determine the new location of the window
          int w = medsFrame.getPreferredSize().width;
          int h = medsFrame.getPreferredSize().height;
          int x = (dim.width-w)/2;
          int y = (dim.height-h)/2;

          // Move the window
          medsFrame.setLocation(x, y);

          medsFrame.pack();
          //medsFrame.setVisible(true);
     }
}
