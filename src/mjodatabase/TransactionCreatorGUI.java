package mjodatabase;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Toolkit;

public class TransactionCreatorGUI extends javax.swing.JDialog
{
    public TransactionCreatorGUI(MJOBranch mjo)
    {
         this.mjo = mjo;
	 initComponents();
    }
    @SuppressWarnings("unchecked")
   private void initComponents()
    {

        isMemButtonGrp = new javax.swing.ButtonGroup();
        addTransLabel = new javax.swing.JLabel();
        grandTotalTextField = new javax.swing.JTextField();
        addTransAcceptButton = new javax.swing.JButton();
        firstNameTextField = new javax.swing.JTextField();
        midNameTextField = new javax.swing.JTextField();
        surNameTextField = new javax.swing.JTextField();
        surNameLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        midNameLabel = new javax.swing.JLabel();
        compNameLabel = new javax.swing.JLabel();
        memberYesRadioB = new javax.swing.JRadioButton();
        memberNoRadioB = new javax.swing.JRadioButton();
        grandTotalLabel = new javax.swing.JLabel();
        addMedPurButton = new javax.swing.JButton();
        addFreeMedButton = new javax.swing.JButton();
        isMemLabel1 = new javax.swing.JLabel();
        compNameTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(430, 390));
        setPreferredSize(new java.awt.Dimension(430, 390));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addTransLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        addTransLabel.setText("Add Transaction");
        getContentPane().add(addTransLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        grandTotalTextField.setEditable(false);
        grandTotalTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        grandTotalTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        grandTotalTextField.setMinimumSize(new java.awt.Dimension(6, 30));
        grandTotalTextField.setPreferredSize(new java.awt.Dimension(6, 30));
        grandTotalTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                grandTotalTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(grandTotalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 233, 246, 29));

        addTransAcceptButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        addTransAcceptButton.setText("ACCEPT AND FINALIZE TRANSACTION");
        addTransAcceptButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addTransAcceptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addTransAcceptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 318, -1, 30));

        firstNameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        firstNameTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                firstNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(firstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 90, 316, -1));

        midNameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        midNameTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                midNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(midNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 127, 303, -1));

        surNameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        surNameTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                surNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(surNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 53, 329, -1));

        surNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        surNameLabel.setText("Surname:");
        getContentPane().add(surNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, -1, -1));

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        firstNameLabel.setText("First Name:");
        getContentPane().add(firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, -1, -1));

        midNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        midNameLabel.setText("Middle Name:");
        getContentPane().add(midNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 127, -1, 26));

        compNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        compNameLabel.setText("Company Name:");
        getContentPane().add(compNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, -1, -1));

        isMemButtonGrp.add(memberYesRadioB);
        memberYesRadioB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        memberYesRadioB.setText("Yes");
        memberYesRadioB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                memberYesRadioBActionPerformed(evt);
            }
        });
        getContentPane().add(memberYesRadioB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        isMemButtonGrp.add(memberNoRadioB);
        memberNoRadioB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        memberNoRadioB.setText("No");
        memberNoRadioB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                memberNoRadioBActionPerformed(evt);
            }
        });
        getContentPane().add(memberNoRadioB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));
        memberNoRadioB.setSelected(true);

        grandTotalLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        grandTotalLabel.setText("GRAND TOTAL: PHP");
        getContentPane().add(grandTotalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 237, 154, -1));

        addMedPurButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        addMedPurButton.setText("ADD MEDICINE PURCHASES");
        addMedPurButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addMedPurButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addMedPurButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        addFreeMedButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        addFreeMedButton.setText("ADD FREE MEDICINE");
        addFreeMedButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addFreeMedButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addFreeMedButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 280, 175, -1));

        isMemLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        isMemLabel1.setText("Is a Member?");
        getContentPane().add(isMemLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        compNameTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        compNameTextField1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                compNameTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(compNameTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 164, 280, -1));

        pack();
    }// </editor-fold>                             

    private void addTransAcceptButtonActionPerformed(java.awt.event.ActionEvent evt)                                                     
    {                                                         

    }                                                    

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt)                                                   
    {                                                       
        // TODO add your handling code here:
    }                                                  

    private void midNameTextFieldActionPerformed(java.awt.event.ActionEvent evt)                                                 
    {                                                     
        // TODO add your handling code here:
    }                                                

    private void surNameTextFieldActionPerformed(java.awt.event.ActionEvent evt)                                                 
    {                                                     
        // TODO add your handling code here:
    }                                                

    private void memberYesRadioBActionPerformed(java.awt.event.ActionEvent evt)                                                
    {                                                    
        // TODO add your handling code here:
    }                                               

    private void memberNoRadioBActionPerformed(java.awt.event.ActionEvent evt)                                               
    {                                                   
        // TODO add your handling code here:
    }                                              

    private void addMedPurButtonActionPerformed(java.awt.event.ActionEvent evt)                                                
    {                                                    
        MJOBranch.listItemBuilder.showWindow();
    }                                               

    private void addFreeMedButtonActionPerformed(java.awt.event.ActionEvent evt)                                                 
    {                                                     
        MJOBranch.listItemBuilder.showWindow();
    }                                                

    private void compNameTextField1ActionPerformed(java.awt.event.ActionEvent evt)                                                   
    {                                                       
        // TODO add your handling code here:
    }                                                  

    private void grandTotalTextFieldActionPerformed(java.awt.event.ActionEvent evt)                                                    
    {                                                        
        // TODO add your handling code here:
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

    // Variables declaration - do not modify                     
    private javax.swing.JButton addFreeMedButton;
    private javax.swing.JButton addMedPurButton;
    private javax.swing.JButton addTransAcceptButton;
    private javax.swing.JLabel addTransLabel;
    private javax.swing.JLabel compNameLabel;
    private javax.swing.JTextField compNameTextField1;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel grandTotalLabel;
    private javax.swing.JTextField grandTotalTextField;
    private javax.swing.ButtonGroup isMemButtonGrp;
    private javax.swing.JLabel isMemLabel1;
    private javax.swing.JRadioButton memberNoRadioB;
    private javax.swing.JRadioButton memberYesRadioB;
    private javax.swing.JLabel midNameLabel;
    private javax.swing.JTextField midNameTextField;
    private javax.swing.JLabel surNameLabel;
    private javax.swing.JTextField surNameTextField;
    private MJOBranch mjo;
    // End of variables declaration                   
}
