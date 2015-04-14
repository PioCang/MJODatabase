package mjodatabase;

public class AddTransactionGUI extends javax.swing.JFrame
{
    public AddTransactionGUI()
    {
	 initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents()
    {
        isMemButtonGrp = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        addTransLabel = new javax.swing.JLabel();
        grandTotalTextField = new javax.swing.JTextField();
        addTransAcceptButton = new javax.swing.JButton();
        firstNameTextField = new javax.swing.JTextField();
        midNameTextField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        surNameTextField = new javax.swing.JTextField();
        surNameLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        midNameLabel = new javax.swing.JLabel();
        compNameLabel = new javax.swing.JLabel();
        dateChooser = new datechooser.beans.DateChooserCombo();
        memberYesRadioB = new javax.swing.JRadioButton();
        memberNoRadioB = new javax.swing.JRadioButton();
        grandTotalLabel = new javax.swing.JLabel();
        addMedPurButton = new javax.swing.JButton();
        addFreeMedButton = new javax.swing.JButton();
        isMemLabel1 = new javax.swing.JLabel();
        compNameTextField1 = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(440, 460));
        setPreferredSize(new java.awt.Dimension(440, 460));
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
        grandTotalTextField.setBounds(130, 295, 280, 30);

        addTransAcceptButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addTransAcceptButton.setText("ACCEPT AND FINALIZE TRANSACTION");
        addTransAcceptButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addTransAcceptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addTransAcceptButton);
        addTransAcceptButton.setBounds(50, 380, 330, 30);

        firstNameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        firstNameTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                firstNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(firstNameTextField);
        firstNameTextField.setBounds(96, 128, 319, 26);

        midNameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        midNameTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                midNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(midNameTextField);
        midNameTextField.setBounds(112, 172, 303, 26);

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dateLabel.setText("Date:");
        getContentPane().add(dateLabel);
        dateLabel.setBounds(10, 46, 38, 20);

        surNameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        surNameTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                surNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(surNameTextField);
        surNameTextField.setBounds(83, 84, 332, 26);

        surNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        surNameLabel.setText("Surname:");
        getContentPane().add(surNameLabel);
        surNameLabel.setBounds(10, 87, 69, 20);

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        firstNameLabel.setText("First Name:");
        getContentPane().add(firstNameLabel);
        firstNameLabel.setBounds(10, 128, 82, 20);

        midNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        midNameLabel.setText("Middle Name:");
        getContentPane().add(midNameLabel);
        midNameLabel.setBounds(10, 172, 98, 26);

        compNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        compNameLabel.setText("Company Name:");
        getContentPane().add(compNameLabel);
        compNameLabel.setBounds(10, 220, 119, 20);

        dateChooser.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooser.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 16));
    getContentPane().add(dateChooser);
    dateChooser.setBounds(52, 46, 363, 20);

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
    memberYesRadioB.setBounds(140, 260, 51, 29);

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
    memberNoRadioB.setBounds(300, 260, 45, 29);

    grandTotalLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    grandTotalLabel.setText("GRAND TOTAL:");
    getContentPane().add(grandTotalLabel);
    grandTotalLabel.setBounds(10, 300, 120, 20);

    addMedPurButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    addMedPurButton.setText("ADD MEDICINE PURCHASES");
    addMedPurButton.addActionListener(new java.awt.event.ActionListener()
    {
        public void actionPerformed(java.awt.event.ActionEvent evt)
        {
            addMedPurButtonActionPerformed(evt);
        }
    });
    getContentPane().add(addMedPurButton);
    addMedPurButton.setBounds(10, 340, 207, 25);

    addFreeMedButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    addFreeMedButton.setText("ADD FREE MEDICINE");
    addFreeMedButton.addActionListener(new java.awt.event.ActionListener()
    {
        public void actionPerformed(java.awt.event.ActionEvent evt)
        {
            addFreeMedButtonActionPerformed(evt);
        }
    });
    getContentPane().add(addFreeMedButton);
    addFreeMedButton.setBounds(250, 340, 163, 25);

    isMemLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    isMemLabel1.setText("Is a Member?");
    getContentPane().add(isMemLabel1);
    isMemLabel1.setBounds(10, 260, 96, 20);

    compNameTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    compNameTextField1.addActionListener(new java.awt.event.ActionListener()
    {
        public void actionPerformed(java.awt.event.ActionEvent evt)
        {
            compNameTextField1ActionPerformed(evt);
        }
    });
    getContentPane().add(compNameTextField1);
    compNameTextField1.setBounds(133, 216, 282, 26);

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
        // TODO add your handling code here:
    }                                               

    private void addFreeMedButtonActionPerformed(java.awt.event.ActionEvent evt)                                                 
    {                                                     
        // TODO add your handling code here:
    }                                                

    private void compNameTextField1ActionPerformed(java.awt.event.ActionEvent evt)                                                   
    {                                                       
        // TODO add your handling code here:
    }                                                  

    private void grandTotalTextFieldActionPerformed(java.awt.event.ActionEvent evt)                                                    
    {                                                        
        // TODO add your handling code here:
    }                                                   

    public static void main(String args[])
    {

	 try
	 {
	     for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
	     {
		  if ("Windows".equals(info.getName()))
		  {
		      javax.swing.UIManager.setLookAndFeel(info.getClassName());
		      break;
		  }
	     }
	 }
	 catch (ClassNotFoundException ex)
	 {
	     java.util.logging.Logger.getLogger(AddTransactionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	 }
	 catch (InstantiationException ex)
	 {
	     java.util.logging.Logger.getLogger(AddTransactionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	 }
	 catch (IllegalAccessException ex)
	 {
	     java.util.logging.Logger.getLogger(AddTransactionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	 }
	 catch (javax.swing.UnsupportedLookAndFeelException ex)
	 {
	     java.util.logging.Logger.getLogger(AddTransactionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	 }
        //</editor-fold>

	 /* Create and display the form */
	 java.awt.EventQueue.invokeLater(new Runnable()
	 {
	     public void run()
	     {
		  new AddTransactionGUI().setVisible(true);
	     }
	 });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addFreeMedButton;
    private javax.swing.JButton addMedPurButton;
    private javax.swing.JButton addTransAcceptButton;
    private javax.swing.JLabel addTransLabel;
    private javax.swing.JLabel compNameLabel;
    private javax.swing.JTextField compNameTextField1;
    private datechooser.beans.DateChooserCombo dateChooser;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel grandTotalLabel;
    private javax.swing.JTextField grandTotalTextField;
    private javax.swing.ButtonGroup isMemButtonGrp;
    private javax.swing.JLabel isMemLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton memberNoRadioB;
    private javax.swing.JRadioButton memberYesRadioB;
    private javax.swing.JLabel midNameLabel;
    private javax.swing.JTextField midNameTextField;
    private javax.swing.JLabel surNameLabel;
    private javax.swing.JTextField surNameTextField;
    // End of variables declaration                   
}
