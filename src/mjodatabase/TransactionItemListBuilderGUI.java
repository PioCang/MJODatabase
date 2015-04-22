package mjodatabase;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class TransactionItemListBuilderGUI extends javax.swing.JDialog
{
    private List<TransactionItem> listOfItems; 
    private boolean areTheItemsFree;
    public TransactionItemListBuilderGUI(boolean areFree)
    {     
         listOfItems = new ArrayList<>(1);
         areTheItemsFree = areFree;
	 initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents()
    {
        addItemButton = new javax.swing.JButton();
        removeItemButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);
        
        tableForItems = new JTable();      
          scrollPaneForItems =
                     new JScrollPane(tableForItems,
                         JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                         JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       getContentPane().add(scrollPaneForItems);
       scrollPaneForItems.setBounds(0, 0, 800, 500);
          

        addItemButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        addItemButton.setText("Add Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addItemButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addItemButton);
        addItemButton.setBounds(114, 525, 153, 27);

        removeItemButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        removeItemButton.setText("Remove Item");
        getContentPane().add(removeItemButton);
        removeItemButton.setBounds(535, 525, 153, 27);
        removeItemButton.addActionListener(new ActionListener()
        {
             @Override
             public void actionPerformed(ActionEvent e)
             {
             }
        });
        
        subtotalLabel = new JLabel("P 0.00");
        subtotalLabel.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        getContentPane().add(subtotalLabel);
        subtotalLabel.setBounds(350, 525, 180, 30);

        pack();
    }// </editor-fold>            
    
    public void updateTable()
     {
          if (getListOfItems().size() > 0)
          {
               removeItemButton.setEnabled(true);
          }
          
          itemObjects = new Object[getListOfItems().size()][tableHeaders.length];
          double total = 0;

          for(int i = 0; i < getListOfItems().size(); i++)
          {
               itemObjects[i][0] = getListOfItems().get(i).getGenericName();
               itemObjects[i][1] = getListOfItems().get(i).getBrandName();
               itemObjects[i][2] = getListOfItems().get(i).getDoctorName();
               itemObjects[i][3] = getListOfItems().get(i).getQuantity();
               itemObjects[i][4] = getListOfItems().get(i).getPricePerPiece();
               itemObjects[i][5] = getListOfItems().get(i).getSubtotal();
               total += getListOfItems().get(i).getSubtotal();
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
     }
    
    

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt)                                              
    {                                                  
        MJOBranch.itemSelector.showWindow(areTheItemsFree);
    }                           
    
    public void addToList(TransactionItem anItem)
    {
         this.getListOfItems().add(anItem);
    }
    
    public void removeFromList(TransactionItem anItem)
    {
         this.getListOfItems().remove(anItem);
    }

    private void clearFields()
    {
         
    }
    
    public void showWindow()
    {
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

          // Determine the new location of the window
          int w = this.getPreferredSize().width;
          int h = this.getPreferredSize().height;
          int x = (dim.width-w)/2;
          int y = (dim.height-h)/2;

          // Move the window
          this.setLocation(x, y);
          removeItemButton.setEnabled(false);
         this.setVisible(true);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addItemButton;
    private javax.swing.JButton removeItemButton;
    private JScrollPane scrollPaneForItems;
     private JTable tableForItems;
     private Object[][] itemObjects;
     private JLabel subtotalLabel;
     private final String[] tableHeaders = {"Generic Name", "Brand Name",
          "Doctor's Name", "Quantity", "Price Per Piece", "Subtotal"};
    // End of variables declaration                   

     /**
      * @return the listOfItems
      */
     public List<TransactionItem> getListOfItems()
     {
          return listOfItems;
     }
}
