package mjodatabase;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class MedicinePriceChangerGUI extends JDialog
{
    public MedicinePriceChangerGUI(MJOBranch mjo)
    {
	 initComponents();
        //</editor-fold>*/
         
         this.mjo = mjo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        genericNameLabel = new javax.swing.JLabel();
        brandNameLabel = new javax.swing.JLabel();
        pppLabel = new javax.swing.JLabel();
        changePriceButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        genericNameTextField = new javax.swing.JTextField();
        pppTextField = new javax.swing.JTextField();
        brandNameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        setTitle("Change Medicine Price...");

        genericNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        genericNameLabel.setText("Generic Name:");

        brandNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        brandNameLabel.setText("Brand Name:");

        pppLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pppLabel.setText("Price per piece (Php):");

        changePriceButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        changePriceButton.setText("CHANGE PRICE");
        changePriceButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addMedAcceptButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Please modify medicine data:");

        genericNameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        genericNameTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                genericNameTextFieldActionPerformed(evt);
            }
        });
        genericNameTextField.setInputVerifier(new InputVerifier()
        {
             @Override
             public boolean verify(JComponent input)
             {
                  JTextField textf = (JTextField) input;
                  if (textf.getText().isEmpty())
                  {
                       JOptionPane.showMessageDialog(null, "Generic name should not be blank.", "ERROR!", JOptionPane.WARNING_MESSAGE);
                       return false;
                  }
                  return true;
             }
        });

        pppTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pppTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                pppTextFieldActionPerformed(evt);
            }
        });
        pppTextField.setInputVerifier(new InputVerifier()
        {

             @Override
             public boolean verify(JComponent input)
             {
                  JTextField texf = (JTextField) input;
                  try
                  {
                       double quantity = Double.parseDouble(texf.getText());
                       if (quantity <= 0 )
                       {
                            throw new IllegalArgumentException("Price Per Piece should be a positive number.");
                       }
                  }
                  catch(Exception e)
                  {
                       JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!", JOptionPane.WARNING_MESSAGE);
                       return false;
                  }
                  return true;
             }
        });
        pppTextField.addFocusListener(new FocusListener()
        {

             @Override
             public void focusGained(FocusEvent e)
             {
                  changePriceButton.setEnabled(true);
             }

             @Override
             public void focusLost(FocusEvent e)
             {
             }
        });

        brandNameTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        brandNameTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                brandNameTextFieldActionPerformed(evt);
            }
        });
        brandNameTextField.setInputVerifier(new InputVerifier()
        {
             @Override
             public boolean verify(JComponent input)
             {
                  JTextField textf = (JTextField) input;
                  if (textf.getText().isEmpty())
                  {
                       JOptionPane.showMessageDialog(null, "Brand name should not be blank.", "ERROR!", JOptionPane.WARNING_MESSAGE);
                       return false;
                  }
                  return true;
             }
        });

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(genericNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genericNameTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(brandNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brandNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pppLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pppTextField))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(changePriceButton)
                .addGap(118, 118, 118))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(60, 60, 60))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel8)
            .addGap(17, 17, 17)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(genericNameLabel)
                .addComponent(genericNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(brandNameLabel)
                .addComponent(brandNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(pppLabel)
                .addComponent(pppTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(changePriceButton))
    );
    
         addWindowListener(new WindowListener()
         {

             @Override
             public void windowOpened(WindowEvent e)
             {
             }

             @Override
             public void windowClosing(WindowEvent e)
             {
                  clearFields();
             }

             @Override
             public void windowClosed(WindowEvent e)
             {
             }

             @Override
             public void windowIconified(WindowEvent e)
             {
             }

             @Override
             public void windowDeiconified(WindowEvent e)
             {
             }

             @Override
             public void windowActivated(WindowEvent e)
             {
             }

             @Override
             public void windowDeactivated(WindowEvent e)
             {
             }
        });

         setPreferredSize(new Dimension(400, 300));
    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMedAcceptButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addMedAcceptButtonActionPerformed
    {//GEN-HEADEREND:event_addMedAcceptButtonActionPerformed
         ArrayList<Medicine> newMeds = new ArrayList<>(1), deadMeds = new ArrayList<>(1);
         double newPrice = Double.parseDouble(pppTextField.getText());
         
         Medicine newMed = null;
         try
         {
              for (Medicine oldMed : mjo.getInventory())
               {
                    if (oldMed.getGenericName().equals(genericNameTextField.getText())
                        && oldMed.getBrandName().equals(brandNameTextField.getText()))
                    {
                         newMed = new Medicine(oldMed.getGenericName(),
                                   oldMed.getBrandName(),
                                   oldMed.getLotNumber(),
                                   oldMed.getExpiryDate(),
                                   oldMed.getDeliveryDate(),
                                   oldMed.getCurrentQuantity(),
                                   newPrice);
                         deadMeds.add(oldMed);
                         newMeds.add(newMed);
                    }
               }
              
              if (deadMeds.isEmpty())
              {
                   throw new IllegalArgumentException("No such Medicine was found.");
              }
              
              for(Medicine med : deadMeds)
              {
                   mjo.removeMedicineFromInventory(med);
              }
              
              for(Medicine med : newMeds)
              {
                   MJOBranch.addMedicineToList(mjo.getInventory(), med);
              }

               StorageOperations.encodeMedicines(mjo.getInventory());
               mjo.setInventory(StorageOperations.retrieveMedicines());
               MJOBranch.mainGUI.updateMedicineTable(mjo.getInventory());
         }
	 catch(IllegalArgumentException e)
         {
              JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR!", JOptionPane.WARNING_MESSAGE);
              return;
         }

         this.dispose();
         this.clearFields();
    }//GEN-LAST:event_addMedAcceptButtonActionPerformed

    private void genericNameTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_genericNameTextFieldActionPerformed
    {//GEN-HEADEREND:event_genericNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genericNameTextFieldActionPerformed

    private void initQuanTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_initQuanTextFieldActionPerformed
    {//GEN-HEADEREND:event_initQuanTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_initQuanTextFieldActionPerformed

    private void lotNumTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_lotNumTextFieldActionPerformed
    {//GEN-HEADEREND:event_lotNumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotNumTextFieldActionPerformed

    private void pppTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_pppTextFieldActionPerformed
    {//GEN-HEADEREND:event_pppTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pppTextFieldActionPerformed

    private void brandNameTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_brandNameTextFieldActionPerformed
    {//GEN-HEADEREND:event_brandNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandNameTextFieldActionPerformed

    
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
         
          changePriceButton.setEnabled(false);
         this.setVisible(true);
    }
    
    private void clearFields()
    {
         genericNameTextField.setText("");
         brandNameTextField.setText("");
         pppTextField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePriceButton;
    private javax.swing.JLabel brandNameLabel;
    private javax.swing.JTextField brandNameTextField;
    private javax.swing.JLabel genericNameLabel;
    private javax.swing.JTextField genericNameTextField;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel pppLabel;
    private javax.swing.JTextField pppTextField;
    private MJOBranch mjo;
    // End of variables declaration//GEN-END:variables
}
