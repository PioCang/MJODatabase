package mjodatabase;

import java.awt.Dimension;
import java.awt.Toolkit;


public class MJOGUI extends javax.swing.JFrame {

    public MJOGUI() {
        initComponents();
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MJOGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MJOGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MJOGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MJOGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

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
                .addGap(74, 74, 74)
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
        MJOBranch.medicineInventoryGUI.showWindow();
        this.dispose();
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
    
    private javax.swing.JButton customerTransButton;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton medicineInventoryButton;
    private javax.swing.JButton transactionButton;
}

