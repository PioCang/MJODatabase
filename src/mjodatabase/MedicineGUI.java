/*package mjodatabase;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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

     private JFrame medsFrame;
     public static Date currentDate;
     private JTable medsTable;
     private Object[][] medsData;
     private JScrollPane scrollPaneForMedsTable;
     private JMenuBar theMenuBar;
     private JMenu theMenu;
     private JMenuItem addMedicineItem;

     public MedicineGUI()
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
          theMenuBar = new JMenuBar();
          theMenu = new JMenu("Click here to add medicine to inventory.");
          addMedicineItem = new JMenuItem("Add medicine to inventory.");
          theMenu.add(addMedicineItem);
          theMenuBar.add(theMenu);
          medsFrame.setJMenuBar(theMenuBar);
          
          addMedicineItem.addActionListener(new ActionListener()
          {

               @Override
               public void actionPerformed(ActionEvent e)
               {
                    MJOBranch.medicineInitializer.showWindow();
               }
          });
          
          medsTable = new JTable();
          
          scrollPaneForMedsTable =
                     new JScrollPane(medsTable,
                         JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                         JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

          scrollPaneForMedsTable.setViewportView(medsTable);
          medsFrame.add(scrollPaneForMedsTable);

          medsFrame.setPreferredSize(new Dimension(1000, 700));
          medsFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
          
          medsFrame.addWindowListener(new WindowListener()
          {

               @Override
               public void windowOpened(WindowEvent e)
               {
               }

               @Override
               public void windowClosing(WindowEvent e)
               {
                    MJOBranch.mainGUI.showWindow();
                    hideWindow();
               }

               @Override
               public void windowClosed(WindowEvent e)
               {
               }

               @Override
               public void windowIconified(WindowEvent e)
               {
               }

               @Override
               public void windowDeiconified(WindowEvent e)
               {
               }

               @Override
               public void windowActivated(WindowEvent e)
               {
               }

               @Override
               public void windowDeactivated(WindowEvent e)
               {
               }
          });

          Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

          // Determine the new location of the window
          int w = medsFrame.getPreferredSize().width;
          int h = medsFrame.getPreferredSize().height;
          int x = (dim.width-w)/2;
          int y = (dim.height-h)/2;

          // Move the window
          medsFrame.setLocation(x, y);

          medsFrame.pack();
     }   
     
     
     public JScrollPane updateMedicineTable(List<Medicine> inventory)
     {
          medsFrame.setTitle("Inventory as of " + currentDate.toString());
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
          return scrollPaneForMedsTable;
     }
     
    public void hideWindow()
    {
         medsFrame.dispose();
    }
    
    public void showWindow()
    {
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

          // Determine the new location of the window
          int w = medsFrame.getPreferredSize().width;
          int h = medsFrame.getPreferredSize().height;
          int x = (dim.width-w)/2;
          int y = (dim.height-h)/2;

          // Move the window
          medsFrame.setLocation(x, y);
         
         medsFrame.setVisible(true);
    }
}
*/