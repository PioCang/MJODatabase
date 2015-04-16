package mjodatabase;

import java.awt.Color;
import java.awt.Component;
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
import javax.swing.AbstractAction;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


public class MasterGUI extends javax.swing.JFrame {

     
     // HOME BUTTONS
    private javax.swing.JButton customerTransButton;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton medicineInventoryButton;
    private javax.swing.JButton transactionButton;
    private JButton addNewMedicineButton;
    
    //MEDICINE INVENTORY COMPONENTS
    public static Date currentDate;
     private JTable theTableForGUI;
     private Object[][] transData;
     private JScrollPane theScrollPaneForGUI;
     private MJOBranch mjo;
     private static final String[] infoOnMedsTable = { "Generic Name", "Brand Name",
          "Current Quantity", "Expiry Date", "Date Delivered", "Lot #",
          "Price Per Piece", "Initial Quantity"};
     private static final String[] infoOnTransactionTable = {"Date", "Last Name",
          "First Name", "Middle Name", "Company Name", "Member?", "Purchased Medicines",
          "Free Medicines", "Grand Total"};
    
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
     
    
    // TRANSACTION LIST COMPONENTS
    private JButton addNewTransactionButton;
    private JButtonColumnInJTable columnForPurchasedMeds;
    private JButtonColumnInJTable columnForFreeMeds;
    private AbstractAction actionsForFreeColumnButtons;
    private AbstractAction actionsForPurchasedColumnButtons;
   
     
     
    public MasterGUI(MJOBranch mjo) {
         this.mjo = mjo;
        initComponents();
    } 
    
    
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

         setPreferredSize(new Dimension(1000, 700));
         setResizable(false);
         
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
                switchToTransactionListView();
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
        
        
         /* ************************
         * TRANSACTION LIST INIT
         ************************/
        
        addNewTransactionButton = new JButton("Create a new transaction");
         addNewTransactionButton.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
          addNewTransactionButton.addActionListener(new ActionListener()
          {
              @Override
              public void actionPerformed(ActionEvent e)
              {
                   MJOBranch.transactionInitializer.showWindow();
              }
         });
          
         actionsForPurchasedColumnButtons = new AbstractAction()
         {
              @Override
              public void actionPerformed(ActionEvent e)
              {
                   System.out.println("purchased");
              }
         };
         
         actionsForFreeColumnButtons = new AbstractAction()
         {
              @Override
              public void actionPerformed(ActionEvent e)
              {
                   System.out.println("free");
              }
         };
        
        
        switchToHomeView();
    }// </editor-fold>     

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

         this.setVisible(true);
    }
    
    
     
     
     
     
    
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
         
         theTableForGUI = new JTable();      
          theScrollPaneForGUI =
                     new JScrollPane(theTableForGUI,
                         JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                         JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
          
         
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
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(theScrollPaneForGUI))
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
                .addComponent(theScrollPaneForGUI))
        );
         
         updateMedicineTable(mjo.getInventory());
    }
    
    public void updateMedicineTable(List<Medicine> inventory)
     {
          this.setTitle("Inventory as of " + currentDate.toString());
          transData = new Object[inventory.size()][infoOnMedsTable.length];
          GregorianCalendar cal;
          String temp;

          for(int i = 0; i < inventory.size(); i++)
          {
               transData[i][0] = inventory.get(i).getGenericName();
               transData[i][1] = inventory.get(i).getBrandName();
               transData[i][2] = inventory.get(i).getCurrentQuantity();

               cal = inventory.get(i).getExpiryDate();
               temp = cal.get(Calendar.DAY_OF_MONTH) + " " +
                      cal.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.ENGLISH)
                      + " " + cal.get(Calendar.YEAR);
               transData[i][3] = temp;
               cal = inventory.get(i).getDeliveryDate();
               temp = cal.get(Calendar.DAY_OF_MONTH) + " " +
                      cal.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.ENGLISH)
                      + " " + cal.get(Calendar.YEAR);
               transData[i][4] = temp;

               transData[i][5] = inventory.get(i).getLotNumber();
               transData[i][6] = "P  " + inventory.get(i).getPricePerPiece();
               transData[i][7] = inventory.get(i).getInitialQuantity();
          }

          theTableForGUI = new JTable()
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
                  
          theTableForGUI.setFont(new Font("Calibri", Font.PLAIN , 15));
          theTableForGUI.getTableHeader().setReorderingAllowed(false);
          theTableForGUI.setSelectionBackground(new Color(105,80,255));
          theTableForGUI.getTableHeader().setResizingAllowed(false);
          theTableForGUI.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

          theTableForGUI.setModel(new DefaultTableModel(transData, infoOnMedsTable)
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
              theTableForGUI.getColumnModel().getColumn(i).setCellRenderer(centerAlign);
          }
          theTableForGUI.setFont(new Font("Calibri", Font.PLAIN , 17));
          theTableForGUI.setRowHeight(23);
          
          theScrollPaneForGUI.setViewportView(theTableForGUI);
     }
    
    
    
    public void switchToTransactionListView()
    {
         getContentPane().removeAll();
         
         //needs a similar code here
         theTableForGUI = new JTable();
          theScrollPaneForGUI =
                     new JScrollPane(theTableForGUI,
                         JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                         JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
          
         
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
                .addComponent(addNewTransactionButton, GroupLayout.Alignment.CENTER)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(theScrollPaneForGUI))
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
                .addComponent(addNewTransactionButton)
                .addContainerGap(10, 12)
                .addComponent(theScrollPaneForGUI))
        );
        
        updateTransactionTable(mjo.getTransactionList());
    }
    
    public void updateTransactionTable(List<Transaction> transList)
     {
          this.setTitle("Inventory as of " + currentDate.toString());
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
               transData[i][6] = "Click to view...";
               transData[i][7] = "Click to view..."; // Dapat free memds JButton ito
               transData[i][8] = transList.get(i).getGrandTotal();
          }

          theTableForGUI = new JTable()
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
          theTableForGUI.setFont(new Font("Calibri", Font.PLAIN , 15));
          theTableForGUI.getTableHeader().setReorderingAllowed(false);
          theTableForGUI.setSelectionBackground(new Color(105,80,255));
          theTableForGUI.getTableHeader().setResizingAllowed(false);
          theTableForGUI.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

          theTableForGUI.setModel(new DefaultTableModel(transData, infoOnTransactionTable)
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
          
          
          
          columnForPurchasedMeds = new JButtonColumnInJTable(theTableForGUI, actionsForPurchasedColumnButtons, 6);
          columnForPurchasedMeds = new JButtonColumnInJTable(theTableForGUI, actionsForFreeColumnButtons, 7);
          
          DefaultTableCellRenderer centerAlign = new DefaultTableCellRenderer();
          centerAlign.setHorizontalAlignment(JLabel.CENTER);
          centerAlign.setVerticalAlignment(JLabel.CENTER);
          for (int i= 0; i < infoOnTransactionTable.length; i++ )
          {
              theTableForGUI.getColumnModel().getColumn(i).setCellRenderer(centerAlign);
          }
          theTableForGUI.setFont(new Font("Calibri", Font.PLAIN , 17));
          theTableForGUI.setRowHeight(23);
          
          theScrollPaneForGUI.setViewportView(theTableForGUI);
     }
}

