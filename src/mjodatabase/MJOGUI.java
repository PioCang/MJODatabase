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
         
         
        /* ************************
         * HOME VIEW COMPONENT INIT
         ************************/ 
         
        jTabbedPane1 = new javax.swing.JTabbedPane();
        customerTransButton = new javax.swing.JButton();
        transactionButton = new javax.swing.JButton();
        medicineInventoryButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customerTransButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        customerTransButton.setText("Customer Transaction History");
        customerTransButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchToTransactionSearchView();
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

        
        
        
         /* ************************
         * TRANSACTION SEARCH VIEW INIT
         ************************/
        
        
        firstNameTextField = new javax.swing.JTextField();
        cusTransLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        firstNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        middleNameTextField = new javax.swing.JTextField();
        middleNameLabel = new javax.swing.JLabel();
        searchCustomerLabel = new javax.swing.JLabel();
        searchByLabel = new javax.swing.JLabel();
        monthLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        monthsComboBox = new javax.swing.JComboBox();
        searchButton = new javax.swing.JButton();
        yearTextField = new javax.swing.JTextField();

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

        customerTransButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        customerTransButton.setText("Customer Transaction History");
        customerTransButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerTransButtonActionPerformed(evt);
            }
        });
        
        firstNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cusTransLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cusTransLabel.setText("Customer Transaction History");

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstNameLabel.setText("First Name:");

        lastNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lastNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastNameLabel.setText("Last Name:");

        middleNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        middleNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        middleNameLabel.setText("Middle Name:");

        searchCustomerLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        searchCustomerLabel.setText("SEARCH CUSTOMER");

        searchByLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        searchByLabel.setText("SEARCH BY");

        monthLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        monthLabel.setText("Month:");

        yearLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yearLabel.setText("Year:");

        monthsComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        monthsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        searchButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        yearTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });
        
        switchToHomeView();
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
         
          
          transactionButton.setEnabled(false);
         this.setVisible(true);
    }
    
    // HOME BUTTONS
    private javax.swing.JButton customerTransButton;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton medicineInventoryButton;
    private javax.swing.JButton transactionButton;
    private JButton addNewMedicineButton;
    
    //MEDICINE INVENTORY COMPONENTS
    public static Date currentDate;
     private JTable medsTable;
     private Object[][] medsData;
     private JScrollPane scrollPaneForMedsTable;
     private MJOBranch mjo;
     public static final String[] infoOnMedsTable = { "Generic Name", "Brand Name",
          "Current Quantity", "Expiry Date", "Date Delivered", "Lot #",
          "Price Per Piece", "Initial Quantity"};
    
     //TRANSACTION SEARCH COMPONENTS
     private javax.swing.JButton searchButton;
    
    private javax.swing.JComboBox monthsComboBox;
    
    private javax.swing.JLabel cusTransLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel middleNameLabel;
    private javax.swing.JLabel searchCustomerLabel;
    private javax.swing.JLabel searchByLabel;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JLabel yearLabel;
    
    private javax.swing.JSeparator jSeparator1;
    
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JTextField middleNameTextField;
    private javax.swing.JTextField yearTextField;
     
     
     
     
    
     private void switchToHomeView()
     {
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
     
     
     
     
     
     
     
     
     
     private void switchToTransactionSearchView()
     {
          getContentPane().removeAll();
          
          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(medicineInventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(customerTransButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(transactionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchCustomerLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchByLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(monthLabel)
                                            .addComponent(yearLabel))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(monthsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(79, 79, 79)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(firstNameLabel)
                                            .addGap(24, 24, 24))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lastNameLabel)
                                            .addGap(24, 24, 24))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(middleNameLabel)
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(middleNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchButton)
                        .addGap(451, 451, 451))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cusTransLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(331, 331, 331))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicineInventoryButton)
                    .addComponent(customerTransButton)
                    .addComponent(transactionButton))
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGap(100, 100, 100)
                .addComponent(cusTransLabel)
                .addGap(46, 46, 46)
                .addComponent(searchCustomerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(middleNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleNameLabel))
                .addGap(38, 38, 38)
                .addComponent(searchByLabel)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthLabel)
                    .addComponent(monthsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(searchButton)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
     }
     
     private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
     
     
     
     
     
     
     
     
    private void switchToMedicineInventoryView()
    {
         getContentPane().removeAll();
         
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
            .addComponent(jSeparator1)
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
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(5, 8)
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

