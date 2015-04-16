/*
package mjodatabase;

public class CustomerTransactionHistoryGUI extends javax.swing.JFrame {
    public CustomerTransactionHistoryGUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        transactionButton = new javax.swing.JButton();
        medicineInventoryButton = new javax.swing.JButton();
        customerTransButton = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        cusTransLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cusTransLabel.setText("Customer Transaction History");

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstNameLabel.setText("First Name:");

        lastNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });

        lastNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastNameLabel.setText("Last Name:");

        middleNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        middleNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleNameTextFieldActionPerformed(evt);
            }
        });

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
                yearTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
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
                        .addGap(331, 331, 331))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cusTransLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256))))
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

    private void transactionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void medicineInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //MedicineGUI.showInventory(mjo.getInventory());
    }

    private void customerTransButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void middleNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void yearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         *
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerTransactionHistoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerTransactionHistoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerTransactionHistoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerTransactionHistoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerTransactionHistoryGUI().setVisible(true);
            }
        });
    }

    private javax.swing.JButton customerTransButton;
    private javax.swing.JButton medicineInventoryButton;
    private javax.swing.JButton transactionButton;
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
    
}
*/