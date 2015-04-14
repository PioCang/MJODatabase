package mjodatabase;

public class AddTransactionMedicineGUI extends javax.swing.JFrame
{

    public AddTransactionMedicineGUI()
    {
	 initComponents();
    }


    @SuppressWarnings("unchecked")                        
    private void initComponents()
    {

        subtotalTextField = new javax.swing.JTextField();
        brandNameTextField = new javax.swing.JTextField();
        initQuanTextField = new javax.swing.JTextField();
        prescribingDoctorTextField = new javax.swing.JTextField();
        prescribingDoctorLabel = new javax.swing.JLabel();
        pppLabel = new javax.swing.JLabel();
        subtotalLabel = new javax.swing.JLabel();
        numOfPcsLabel = new javax.swing.JLabel();
        medicineComboBox = new javax.swing.JComboBox();
        medicineLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addMedAcceptButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        subtotalTextField.setEditable(false);
        subtotalTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        subtotalTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        subtotalTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                subtotalTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(subtotalTextField);
        subtotalTextField.setBounds(78, 215, 328, 26);

        brandNameTextField.setEditable(false);
        brandNameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        brandNameTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                brandNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(brandNameTextField);
        brandNameTextField.setBounds(167, 127, 239, 26);

        initQuanTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        initQuanTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                initQuanTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(initQuanTextField);
        initQuanTextField.setBounds(144, 171, 262, 26);

        prescribingDoctorTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        prescribingDoctorTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                prescribingDoctorTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(prescribingDoctorTextField);
        prescribingDoctorTextField.setBounds(150, 83, 256, 26);

        prescribingDoctorLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        prescribingDoctorLabel.setText("Prescribing Doctor:");
        getContentPane().add(prescribingDoctorLabel);
        prescribingDoctorLabel.setBounds(10, 86, 136, 20);

        pppLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pppLabel.setText("Price per piece (Php):");
        getContentPane().add(pppLabel);
        pppLabel.setBounds(10, 127, 153, 20);

        subtotalLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        subtotalLabel.setText("Subtotal:");
        getContentPane().add(subtotalLabel);
        subtotalLabel.setBounds(10, 220, 64, 20);

        numOfPcsLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        numOfPcsLabel.setText("Number of pieces:");
        getContentPane().add(numOfPcsLabel);
        numOfPcsLabel.setBounds(10, 171, 130, 26);

        medicineComboBox.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(medicineComboBox);
        medicineComboBox.setBounds(81, 46, 325, 26);

        medicineLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        medicineLabel.setText("Medicine:");
        getContentPane().add(medicineLabel);
        medicineLabel.setBounds(10, 49, 67, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Medicine Transaction");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(134, 10, 200, 25);

        addMedAcceptButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addMedAcceptButton.setText("ACCEPT");
        addMedAcceptButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addMedAcceptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addMedAcceptButton);
        addMedAcceptButton.setBounds(170, 260, 89, 25);

        pack();
    }// </editor-fold>                        

    private void subtotalTextFieldActionPerformed(java.awt.event.ActionEvent evt)                                                  
    {                                                      
        // TODO add your handling code here:
    }                                                 

    private void brandNameTextFieldActionPerformed(java.awt.event.ActionEvent evt)                                                   
    {                                                       
        // TODO add your handling code here:
    }                                                  

    private void initQuanTextFieldActionPerformed(java.awt.event.ActionEvent evt)                                                  
    {                                                      
        // TODO add your handling code here:
    }                                                 

    private void prescribingDoctorTextFieldActionPerformed(java.awt.event.ActionEvent evt)                                                           
    {                                                               
        // TODO add your handling code here:
    }                                                          

    private void addMedAcceptButtonActionPerformed(java.awt.event.ActionEvent evt)                                                   
    {                                                       

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
	     java.util.logging.Logger.getLogger(AddTransactionMedicineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	 }
	 catch (InstantiationException ex)
	 {
	     java.util.logging.Logger.getLogger(AddTransactionMedicineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	 }
	 catch (IllegalAccessException ex)
	 {
	     java.util.logging.Logger.getLogger(AddTransactionMedicineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	 }
	 catch (javax.swing.UnsupportedLookAndFeelException ex)
	 {
	     java.util.logging.Logger.getLogger(AddTransactionMedicineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	 }
        //</editor-fold>

	 /* Create and display the form */
	 java.awt.EventQueue.invokeLater(new Runnable()
	 {
	     public void run()
	     {
		  new AddTransactionMedicineGUI().setVisible(true);
	     }
	 });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addMedAcceptButton;
    private javax.swing.JTextField brandNameTextField;
    private javax.swing.JTextField initQuanTextField;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox medicineComboBox;
    private javax.swing.JLabel medicineLabel;
    private javax.swing.JLabel numOfPcsLabel;
    private javax.swing.JLabel pppLabel;
    private javax.swing.JLabel prescribingDoctorLabel;
    private javax.swing.JTextField prescribingDoctorTextField;
    private javax.swing.JLabel subtotalLabel;
    private javax.swing.JTextField subtotalTextField;
    // End of variables declaration                   
}