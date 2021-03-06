package mjodatabase;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class MedicineDeleterGUI extends JDialog
{
    public MedicineDeleterGUI(MJOBranch mjo)
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
        lotNumLabel = new javax.swing.JLabel();
        deleteMedButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        genericNameTextField = new javax.swing.JTextField();
        lotNumTextField = new javax.swing.JTextField();
        brandNameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        setTitle("Delete Medicine...");

        genericNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        genericNameLabel.setText("Generic Name:");

        brandNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        brandNameLabel.setText("Brand Name:");

        lotNumLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lotNumLabel.setText("Lot #:");

        deleteMedButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteMedButton.setText("DELETE MEDICINE");
        deleteMedButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                deleteMedButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Please identify medicine to delete:");

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

        lotNumTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lotNumTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                lotNumTextFieldActionPerformed(evt);
            }
        });
        lotNumTextField.setInputVerifier(new InputVerifier()
        {
             @Override
             public boolean verify(JComponent input)
             {
                  JTextField textf = (JTextField) input;
                  if (textf.getText().isEmpty())
                  {
                       JOptionPane.showMessageDialog(null, "Lot # should not be blank.", "ERROR!", JOptionPane.WARNING_MESSAGE);
                       return false;
                  }
                  return true;
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
                                .addComponent(lotNumLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lotNumTextField))))
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
                .addComponent(deleteMedButton)
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lotNumLabel)
                .addComponent(lotNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(deleteMedButton))
    );
    
    lotNumTextField.addFocusListener(new FocusListener()
        {

             @Override
             public void focusGained(FocusEvent e)
             {
                  deleteMedButton.setEnabled(true);
             }

             @Override
             public void focusLost(FocusEvent e)
             {
             }
        });
    
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

    private void deleteMedButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addMedAcceptButtonActionPerformed
    {//GEN-HEADEREND:event_addMedAcceptButtonActionPerformed
         try
         {
               medDeleted = false;
               for (Medicine med : mjo.getInventory())
               {
                    if (med.getGenericName().equals(genericNameTextField.getText())
                        && med.getBrandName().equals(brandNameTextField.getText())
                        && med.getLotNumber().equals(lotNumTextField.getText()))
                    {
                         mjo.removeMedicineFromInventory(med);
                         medDeleted = true;
                         break;
                    }
               }

               if (medDeleted)
               {
                    StorageOperations.encodeMedicines(mjo.getInventory());
                    mjo.setInventory(StorageOperations.retrieveMedicines());
                    MJOBranch.mainGUI.updateMedicineTable(mjo.getInventory());
               }
               else
               {
                    throw new IllegalArgumentException("Target medicine does not exist.");
               }
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
         
          deleteMedButton.setEnabled(false);
         this.setVisible(true);
    }
    
    private void clearFields()
    {
         genericNameTextField.setText("");
         brandNameTextField.setText("");
         lotNumTextField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteMedButton;
    private javax.swing.JLabel brandNameLabel;
    private javax.swing.JTextField brandNameTextField;
    private javax.swing.JLabel genericNameLabel;
    private javax.swing.JTextField genericNameTextField;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lotNumTextField;
    private javax.swing.JLabel lotNumLabel;
    private boolean medDeleted;
    private MJOBranch mjo;
    // End of variables declaration//GEN-END:variables
}
