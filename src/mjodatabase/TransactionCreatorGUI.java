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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(425, 410));
        setPreferredSize(new java.awt.Dimension(425, 410));
        setResizable(false);
        getContentPane().setLayout(null);

        addTransLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        addTransLabel.setText("Add Transaction");
        getContentPane().add(addTransLabel);
        addTransLabel.setBounds(134, 10, 144, 25);

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
        getContentPane().add(grandTotalTextField);
        grandTotalTextField.setBounds(170, 260, 240, 30);

        addTransAcceptButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        addTransAcceptButton.setText("ACCEPT AND FINALIZE TRANSACTION");
        addTransAcceptButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addTransAcceptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addTransAcceptButton);
        addTransAcceptButton.setBounds(47, 340, 330, 30);

        firstNameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        firstNameTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                firstNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(firstNameTextField);
        firstNameTextField.setBounds(97, 90, 313, 26);

        midNameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        midNameTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                midNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(midNameTextField);
        midNameTextField.setBounds(111, 130, 299, 26);

        surNameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        surNameTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                surNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(surNameTextField);
        surNameTextField.setBounds(83, 50, 327, 26);

        surNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        surNameLabel.setText("Surname:");
        getContentPane().add(surNameLabel);
        surNameLabel.setBounds(10, 50, 69, 20);

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        firstNameLabel.setText("First Name:");
        getContentPane().add(firstNameLabel);
        firstNameLabel.setBounds(10, 90, 82, 20);

        midNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        midNameLabel.setText("Middle Name:");
        getContentPane().add(midNameLabel);
        midNameLabel.setBounds(10, 130, 98, 26);

        compNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        compNameLabel.setText("Company Name:");
        getContentPane().add(compNameLabel);
        compNameLabel.setBounds(10, 170, 119, 20);

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
        getContentPane().add(memberYesRadioB);
        memberYesRadioB.setBounds(180, 220, 51, 29);

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
        getContentPane().add(memberNoRadioB);
        memberNoRadioB.setBounds(300, 220, 45, 29);

        grandTotalLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        grandTotalLabel.setText("GRAND TOTAL: PHP");
        getContentPane().add(grandTotalLabel);
        grandTotalLabel.setBounds(10, 264, 150, 20);

        addMedPurButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        addMedPurButton.setText("ADD MEDICINE PURCHASES");
        addMedPurButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addMedPurButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addMedPurButton);
        addMedPurButton.setBounds(10, 300, 219, 27);

        addFreeMedButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        addFreeMedButton.setText("ADD FREE MEDICINE");
        addFreeMedButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addFreeMedButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addFreeMedButton);
        addFreeMedButton.setBounds(238, 300, 173, 27);

        isMemLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        isMemLabel1.setText("Is a Member?");
        getContentPane().add(isMemLabel1);
        isMemLabel1.setBounds(10, 220, 96, 20);

        compNameTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        compNameTextField1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                compNameTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(compNameTextField1);
        compNameTextField1.setBounds(134, 170, 276, 26);

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
