package mjodatabase;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class MJOGUI extends javax.swing.JFrame {

    public MJOGUI(MJOBranch mjo) {
         this.mjo = mjo;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

         setPreferredSize(new Dimension(1000, 700));
         
        jTabbedPane1 = new javax.swing.JTabbedPane();
        customerTransButton = new javax.swing.JButton();
        transactionButton = new javax.swing.JButton();
        medicineInventoryButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customerTransButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        customerTransButton.setText("Customer Transaction History");
        customerTransButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerTransButtonActionPerformed(evt);
            }
        });

        transactionButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        transactionButton.setText("Transaction");
        transactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionButtonActionPerformed(evt);
            }
        });

        medicineInventoryButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        medicineInventoryButton.setText("Medicine Inventory");
        medicineInventoryButton.setAutoscrolls(true);
        medicineInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineInventoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(medicineInventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerTransButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transactionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicineInventoryButton)
                    .addComponent(customerTransButton)
                    .addComponent(transactionButton))
                .addContainerGap(462, Short.MAX_VALUE))
        );

        pack();
        this.setTitle("MJO Database Main Window");
    }

    private void customerTransButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void transactionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void medicineInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineInventoryButtonActionPerformed
        /*
         MJOBranch.medicineInventoryGUI.showWindow();
        this.dispose();*/
         switchToMedicineInventoryView();
    }
    
    public void hideWindow()
    {
         this.dispose();
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
         
          
          customerTransButton.setEnabled(false);
          transactionButton.setEnabled(false);
         this.setVisible(true);
    }
    
    private javax.swing.JButton customerTransButton;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton medicineInventoryButton;
    private javax.swing.JButton transactionButton;
    private JButton addNewMedicineButton;
    
    public static Date currentDate;
     private JTable medsTable;
     private Object[][] medsData;
     private JScrollPane scrollPaneForMedsTable;
     private MJOBranch mjo;
     public static final String[] infoOnMedsTable = { "Generic Name", "Brand Name",
          "Current Quantity", "Expiry Date", "Date Delivered", "Lot #",
          "Price Per Piece", "Initial Quantity"};
    
    
    private void switchToMedicineInventoryView()
    {
         medsTable = new JTable();
          scrollPaneForMedsTable =
                     new JScrollPane(medsTable,
                         JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                         JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
          addNewMedicineButton = new JButton("Add medicine to Inventory");
          addNewMedicineButton.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
          addNewMedicineButton.addActionListener(new ActionListener()
          {
              @Override
              public void actionPerformed(ActionEvent e)
              {
                   MJOBranch.medicineInitializer.showWindow();
              }
         });
          
         
         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
         getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(medicineInventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerTransButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transactionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup())
                .addGap(225, 225, 225)
                .addComponent(addNewMedicineButton, GroupLayout.Alignment.CENTER)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(scrollPaneForMedsTable))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicineInventoryButton)
                    .addComponent(customerTransButton)
                    .addComponent(transactionButton))
                .addContainerGap(10, 12)
                .addComponent(addNewMedicineButton)
                .addContainerGap(10, 12)
                .addComponent(scrollPaneForMedsTable))
        );
         
         updateMedicineTable(mjo.getInventory());
    }
    
    public void updateMedicineTable(List<Medicine> inventory)
     {
          this.setTitle("Inventory as of " + currentDate.toString());
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
     }
}

