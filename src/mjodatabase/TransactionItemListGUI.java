package mjodatabase;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


public class TransactionItemListGUI extends JDialog
{
     private JScrollPane scrollPaneForItems;
     private JTable tableForItems;
     private Object[][] itemObjects;
     private JLabel subtotalLabel;
     private final String[] tableHeaders = {"Generic Name", "Brand Name",
          "Doctor's Name", "Quantity", "Price Per Piece", "Subtotal"};
     
     public TransactionItemListGUI()
     {
          init();
     }
     
     private void init()
     {
          setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
          this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
          setSize(new Dimension(800, 600));
          setPreferredSize(new Dimension(800, 600));
                    
          tableForItems = new JTable();      
          scrollPaneForItems =
                     new JScrollPane(tableForItems,
                         JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                         JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
          subtotalLabel = new JLabel("Total : P 0.0");
          subtotalLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
          
          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
          hGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(scrollPaneForItems).addComponent(subtotalLabel));
          layout.setHorizontalGroup(hGroup);
          GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
          vGroup.addGroup(layout.createParallelGroup().addComponent(scrollPaneForItems));
          vGroup.addGroup(layout.createParallelGroup().addComponent(subtotalLabel));
          layout.setVerticalGroup(vGroup);
     }
     
     public void updateAndShowTable(List<TransactionItem> items)
     {
          itemObjects = new Object[items.size()][tableHeaders.length];
          double total = 0;

          for(int i = 0; i < items.size(); i++)
          {
               itemObjects[i][0] = items.get(i).getGenericName();
               itemObjects[i][1] = items.get(i).getBrandName();
               itemObjects[i][2] = items.get(i).getDoctorName();
               itemObjects[i][3] = items.get(i).getQuantity();
               itemObjects[i][4] = items.get(i).getPricePerPiece();
               itemObjects[i][5] = items.get(i).getSubtotal();
               total += items.get(i).getSubtotal();
          }

          tableForItems = new JTable()
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
                    returnComp .setBackground(bg);
                    bg = null;
                }
            return returnComp;
            }
        }
        ;            
                  
          tableForItems.setFont(new Font("Calibri", Font.PLAIN , 15));
          tableForItems.getTableHeader().setReorderingAllowed(false);
          tableForItems.setSelectionBackground(new Color(105,80,255));
          tableForItems.getTableHeader().setResizingAllowed(false);
          tableForItems.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

          tableForItems.setModel(new DefaultTableModel(itemObjects, tableHeaders)
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
          for (int i= 0; i < tableHeaders.length; i++ )
          {
              tableForItems.getColumnModel().getColumn(i).setCellRenderer(centerAlign);
          }
          tableForItems.setFont(new Font("Calibri", Font.PLAIN , 17));
          tableForItems.setRowHeight(23);
          
          scrollPaneForItems.setViewportView(tableForItems);
          subtotalLabel.setText("Total : P " + Double.toString(total));
          
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
