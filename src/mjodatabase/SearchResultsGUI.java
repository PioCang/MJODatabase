package mjodatabase;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


public class SearchResultsGUI extends JDialog
{
     private JTable searchResultsTable;
     private Object[][] transData;
     private JScrollPane searchResultsScrollPane;
     private static final String[] infoOnTransactionTable = {"Date", "Last Name",
          "First Name", "Middle Name", "Company Name", "Member?", "Purchased Medicines",
          "Free Medicines", "Grand Total"};
    private JButtonColumnInJTable columnForPurchasedMeds;
    private JButtonColumnInJTable columnForFreeMeds;
    private AbstractAction actionsForFreeColumnButtons;
    private AbstractAction actionsForPurchasedColumnButtons;
    
    public SearchResultsGUI()
    {
         init();
    }
     
    public void init()
    {
         getContentPane().removeAll();
         
         //needs a similar code here
         searchResultsTable = new JTable();
          searchResultsScrollPane =
                     new JScrollPane(searchResultsTable,
                         JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                         JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
          searchResultsScrollPane.setViewportView(searchResultsTable);
          
          
          setSize(900, 650);
          setPreferredSize(new Dimension(900, 650));
         add(searchResultsScrollPane);
    }
     
     
     public void updateAndShowResultsTable(final List<Transaction> transList)
     {
          
          actionsForPurchasedColumnButtons = new AbstractAction()
          {
               @Override
               public void actionPerformed(ActionEvent e)
               {
                    int row = searchResultsTable.getSelectedRow();
                    GregorianCalendar cal = transList.get(row).getDate();
                    String temp = cal.get(Calendar.DAY_OF_MONTH) + " " +
                       cal.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.ENGLISH)
                       + " " + cal.get(Calendar.YEAR);
                    MJOBranch.itemViewer.setTitle("Purchased Medicines for " + transList.get(row).getLastName() +
                          ", " + transList.get(row).getFirstName() +
                          " on " + temp);
                    MJOBranch.itemViewer.updateAndShowTable(transList.get(row).getPurchasedMedicines());
               }
          };
         
         actionsForFreeColumnButtons = new AbstractAction()
         {
              @Override
              public void actionPerformed(ActionEvent e)
              {
                   int row = searchResultsTable.getSelectedRow();
                   GregorianCalendar cal = transList.get(row).getDate();
                   String temp = cal.get(Calendar.DAY_OF_MONTH) + " " +
                      cal.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.ENGLISH)
                      + " " + cal.get(Calendar.YEAR);
                   MJOBranch.itemViewer.setTitle("Free Medicines for " + transList.get(row).getLastName() +
                         ", " + transList.get(row).getFirstName() +
                         " on " + temp);
                   MJOBranch.itemViewer.updateAndShowTable(transList.get(row).getFreeMedicines());
              }
         };
          

          transData = new Object[transList.size()][infoOnTransactionTable.length];
          GregorianCalendar cal;
          String temp;

          for(int i = 0; i < transList.size(); i++)
          {
               cal = transList.get(i).getDate();
               temp = cal.get(Calendar.DAY_OF_MONTH) + " " +
                      cal.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.ENGLISH)
                      + " " + cal.get(Calendar.YEAR);
               transData[i][0] = temp;
               transData[i][1] = transList.get(i).getLastName();
               transData[i][2] = transList.get(i).getFirstName();
               transData[i][3] = transList.get(i).getMiddleName();
               transData[i][4] = transList.get(i).getCompanyName();
               transData[i][5] = transList.get(i).isMember();
               transData[i][6] = "CLICK ME!";
               transData[i][7] = "CLICK ME!"; // Dapat free memds JButton ito
               transData[i][8] = transList.get(i).getGrandTotal();
          }

          searchResultsTable = new JTable()
          {
               @Override
               public Component prepareRenderer(TableCellRenderer renderer, int row, int column)
               {
                   Component returnComp = super.prepareRenderer(renderer, row, column);

                   Color alternateColor = new Color(252,242,206);
                   Color whiteColor = Color.WHITE;
                   if (!returnComp.getBackground().equals(getSelectionBackground()))
                   {
                       Color bg = (row % 2 == 0)? alternateColor : whiteColor;
                       if (column == 6 || column == 7)
                       {
                            bg = Color.CYAN;
                       }
                       returnComp .setBackground(bg);
                       bg = null;
                   }
                   return returnComp;
               }
          }
          ;   
          searchResultsTable.setFont(new Font("Calibri", Font.PLAIN , 15));
          searchResultsTable.getTableHeader().setReorderingAllowed(false);
          searchResultsTable.setSelectionBackground(new Color(105,80,255));
          searchResultsTable.getTableHeader().setResizingAllowed(false);
          searchResultsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

          searchResultsTable.setModel(new DefaultTableModel(transData, infoOnTransactionTable)
              {
                  @Override
                  public boolean isCellEditable(int rowIndex, int mColIndex)
                  {
                      if (mColIndex == 6 || mColIndex == 7)
                      {
                           return true;
                      }
                      return false;
                  }
              }
          );
          
          
          
          columnForPurchasedMeds = new JButtonColumnInJTable(searchResultsTable, actionsForPurchasedColumnButtons, 6);
          columnForPurchasedMeds = new JButtonColumnInJTable(searchResultsTable, actionsForFreeColumnButtons, 7);
          
          DefaultTableCellRenderer centerAlign = new DefaultTableCellRenderer();
          centerAlign.setHorizontalAlignment(JLabel.CENTER);
          centerAlign.setVerticalAlignment(JLabel.CENTER);
          for (int i= 0; i < infoOnTransactionTable.length; i++ )
          {
              searchResultsTable.getColumnModel().getColumn(i).setCellRenderer(centerAlign);
          }
          searchResultsTable.setFont(new Font("Calibri", Font.PLAIN , 17));
          searchResultsTable.setRowHeight(23);
          
          searchResultsScrollPane.setViewportView(searchResultsTable);
          showWindow();
     }
     
     private void showWindow()
     {
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

          // Determine the new location of the window
          int w = this.getPreferredSize().width;
          int h = this.getPreferredSize().height;
          int x = (dim.width-w)/2;
          int y = (dim.height-h)/2;

          // Move the window
          this.setLocation(x, y);
         
         this.setVisible(true);
    }
}
