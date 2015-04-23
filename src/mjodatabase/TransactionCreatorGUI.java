package mjodatabase;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.GregorianCalendar;
import javax.swing.ButtonGroup;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TransactionCreatorGUI extends javax.swing.JDialog
{
    public TransactionCreatorGUI(MJOBranch mjo)
    {
         this.mjo = mjo;
	 initComponents();
         compNameTextField1.setText(" ");
         addTransAcceptButton.setEnabled(false);
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
        membershipCheckBox = new javax.swing.JCheckBox("No");
        grandTotalLabel = new javax.swing.JLabel();
        addMedPurButton = new javax.swing.JButton();
        addFreeMedButton = new javax.swing.JButton();
        isMemLabel1 = new javax.swing.JLabel();
        compNameTextField1 = new javax.swing.JTextField();

         setTitle("Create a new transaction.");
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
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
        firstNameTextField.setInputVerifier(new InputVerifier()
        {
             @Override
             public boolean verify(JComponent input)
             {
                  JTextField textf = (JTextField) input;
                  if (textf.getText().isEmpty())
                  {
                       JOptionPane.showMessageDialog(null, "First Name should not be blank.", "ERROR!", JOptionPane.WARNING_MESSAGE);
                       return false;
                  }
                  return true;
             }
        });

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
        midNameTextField.setInputVerifier(new InputVerifier()
        {
             @Override
             public boolean verify(JComponent input)
             {
                  JTextField textf = (JTextField) input;
                  if (textf.getText().isEmpty())
                  {
                       JOptionPane.showMessageDialog(null, "Middle Name should not be blank.", "ERROR!", JOptionPane.WARNING_MESSAGE);
                       return false;
                  }
                  return true;
             }
        });

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
        surNameTextField.setInputVerifier(new InputVerifier()
        {
             @Override
             public boolean verify(JComponent input)
             {
                  JTextField textf = (JTextField) input;
                  if (textf.getText().isEmpty())
                  {
                       JOptionPane.showMessageDialog(null, "Surname should not be blank.", "ERROR!", JOptionPane.WARNING_MESSAGE);
                       return false;
                  }
                  return true;
             }
        });

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

        getContentPane().add(membershipCheckBox);
        membershipCheckBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        membershipCheckBox.setBounds(180, 220, 51, 29);
        membershipCheckBox.setSelected(false);
        membershipCheckBox.addActionListener(new ActionListener()
        {
             @Override
             public void actionPerformed(ActionEvent e)
             {
                  if (membershipCheckBox.isSelected())
                  {
                       membershipCheckBox.setText("YES");
                  }
                  else
                  {
                       membershipCheckBox.setText("NO");
                  }
             }
        });

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
        compNameTextField1.addFocusListener(new FocusListener()
        {

             @Override
             public void focusGained(FocusEvent e)
             {
                  if (compNameTextField1.getText().equals(" "))
                  {
                       compNameTextField1.setText("");
                  }
             }

             @Override
             public void focusLost(FocusEvent e)
             {
             }
        });
        compNameTextField1.setInputVerifier(new InputVerifier()
        {

             @Override
             public boolean verify(JComponent input)
             {
                  JTextField textf = (JTextField) input;
                  if (textf.getText().isEmpty())
                  {
                       compNameTextField1.setText(" ");
                  }
                  return true;
             }
        });
        

        pack();
    }// </editor-fold>                               

    private void addTransAcceptButtonActionPerformed(java.awt.event.ActionEvent evt)                                                     
    {                
         int orderQuantity;
         try
         {
              for(TransactionItem paidMed : MJOBranch.purchasedItemsBuilder.getListOfItems())
              {
                   orderQuantity = 0;
                   for (TransactionItem freeMed : MJOBranch.freeItemsBuilder.getListOfItems())
                   {
                        if (paidMed.getGenericName().equals(freeMed.getGenericName())
                                && paidMed.getBrandName().equals(freeMed.getBrandName()))
                        {
                             orderQuantity = paidMed.getQuantity() + freeMed.getQuantity();
                             Medicine dummyMed = new Medicine(paidMed.getGenericName(),
                                     paidMed.getBrandName(), "DEBUG", new GregorianCalendar(),
                                     new GregorianCalendar(), orderQuantity, 1.0);
                             
                             for (Medicine actualMed : mjo.getUniqueMedicines())
                             {
                                  if (actualMed.sharesNameWith(dummyMed) &&
                                      dummyMed.getInitialQuantity() > mjo.getAvailableQuantitiesOf(actualMed))
                                  {
                                       String warningMessage = "The purchased items list orders " + paidMed.getQuantity()
                                             + " pc(s). while\nthe free items list orders " + freeMed.getQuantity()
                                             + " pc(s).\nThis adds to a total of " + orderQuantity + " pc(s). for "
                                             + actualMed.getGenericName() + " - " + actualMed.getBrandName()
                                             + "\nbut the inventory shows only " + mjo.getAvailableQuantitiesOf(actualMed)
                                             + " pc(s). available.\n\nPlease go back and adjust the order quantities.";
                                       JOptionPane.showMessageDialog(this, warningMessage, "ERROR!", JOptionPane.WARNING_MESSAGE);
                                       return;
                                  }
                             }
                        }
                   }
              }
         }
         catch(Exception e)
         {
              JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR!", JOptionPane.WARNING_MESSAGE);
              return;
         }
         
         
         try
         {
               MJOBranch.sortItems(MJOBranch.purchasedItemsBuilder.getListOfItems());
               MJOBranch.sortItems(MJOBranch.freeItemsBuilder.getListOfItems());

               Transaction newTrans = new Transaction(surNameTextField.getText(), firstNameTextField.getText(),
                       midNameTextField.getText(), compNameTextField1.getText(),
                       MJOBranch.purchasedItemsBuilder.getListOfItems(),
                       MJOBranch.freeItemsBuilder.getListOfItems(),
                       MJOBranch.computeGrandTotal(MJOBranch.purchasedItemsBuilder.getListOfItems()),
                       MJOBranch.computeGrandTotal(MJOBranch.freeItemsBuilder.getListOfItems()));
               newTrans.setMembership(membershipCheckBox.isSelected());


               /************** TO DO **********/

              for(TransactionItem transMed : MJOBranch.purchasedItemsBuilder.getListOfItems())
              {
                   for(Medicine actualMed : mjo.getInventory())
                   {
                        if (transMed.getGenericName().equals(actualMed.getGenericName())
                            && transMed.getBrandName().equals(actualMed.getBrandName()))
                        {
                             mjo.makeDeductions(actualMed, transMed.getQuantity());
                             break;
                        }
                   }
              }
              for(TransactionItem transMed : MJOBranch.freeItemsBuilder.getListOfItems())
              {
                   for(Medicine actualMed : mjo.getInventory())
                   {
                        if (transMed.getGenericName().equals(actualMed.getGenericName())
                            && transMed.getBrandName().equals(actualMed.getBrandName()))
                        {
                             mjo.makeDeductions(actualMed, transMed.getQuantity());
                             break;
                        }
                   }
              }


               mjo.addTransactionToList(newTrans);
               StorageOperations.encodeTransactions(mjo.getTransactionList());
               mjo.setTransactionList(StorageOperations.retrieveTransactions());
               MJOBranch.mainGUI.updateTransactionTable(mjo.getTransactionList());
         }
         catch(IllegalArgumentException e)
         {
              JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR!", JOptionPane.WARNING_MESSAGE);
              return;
         }
         
         this.dispose();
         clearFields();
    }                                               
    
    private void clearFields()
    {
         surNameTextField.setText("");
         firstNameTextField.setText("");
         midNameTextField.setText("");
         membershipCheckBox.setSelected(false);
         membershipCheckBox.setText("NO");
         MJOBranch.purchasedItemsBuilder.getListOfItems().clear();
         MJOBranch.freeItemsBuilder.getListOfItems().clear();
         addTransAcceptButton.setEnabled(false);
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
        MJOBranch.purchasedItemsBuilder.showWindow();
    }                                               

    private void addFreeMedButtonActionPerformed(java.awt.event.ActionEvent evt)                                                 
    {                                                     
        MJOBranch.freeItemsBuilder.showWindow();
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
    public javax.swing.JButton addTransAcceptButton;
    private javax.swing.JLabel addTransLabel;
    private javax.swing.JLabel compNameLabel;
    private javax.swing.JTextField compNameTextField1;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel grandTotalLabel;
    public javax.swing.JTextField grandTotalTextField;
    private javax.swing.ButtonGroup isMemButtonGrp;
    private javax.swing.JLabel isMemLabel1;
    private javax.swing.JCheckBox membershipCheckBox;
    private javax.swing.JLabel midNameLabel;
    private javax.swing.JTextField midNameTextField;
    private javax.swing.JLabel surNameLabel;
    private javax.swing.JTextField surNameTextField;
    private MJOBranch mjo;
    // End of variables declaration                   
}
