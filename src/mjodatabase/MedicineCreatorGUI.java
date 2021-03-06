package mjodatabase;

import datechooser.model.multiple.MultyModelBehavior;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.GregorianCalendar;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class MedicineCreatorGUI extends javax.swing.JDialog
{
    public MedicineCreatorGUI(MJOBranch mjo)
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

        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        genericNameLabel = new javax.swing.JLabel();
        brandNameLabel = new javax.swing.JLabel();
        expDateLabel = new javax.swing.JLabel();
        delDateLabel = new javax.swing.JLabel();
        lotNumLabel = new javax.swing.JLabel();
        initQuanLabel = new javax.swing.JLabel();
        pppLabel = new javax.swing.JLabel();
        addMedAcceptButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        genericNameTextField = new javax.swing.JTextField();
        initQuanTextField = new javax.swing.JTextField();
        lotNumTextField = new javax.swing.JTextField();
        pppTextField = new javax.swing.JTextField();
        brandNameTextField = new javax.swing.JTextField();
        delDateClooser = new datechooser.beans.DateChooserCombo();
        expDateChooser = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        setTitle("Add Medicine");

        genericNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        genericNameLabel.setText("Generic Name:");

        brandNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        brandNameLabel.setText("Brand Name:");

        expDateLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        expDateLabel.setText("Expiry Date:");

        delDateLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        delDateLabel.setText("Delivery Date:");

        lotNumLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lotNumLabel.setText("Lot #:");

        initQuanLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        initQuanLabel.setText("Initial Quantity:");

        pppLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pppLabel.setText("Price per piece (Php):");

        addMedAcceptButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addMedAcceptButton.setText("ACCEPT");
        addMedAcceptButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addMedAcceptButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Please input medicine data:");

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

        initQuanTextField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        initQuanTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                initQuanTextFieldActionPerformed(evt);
            }
        });
        initQuanTextField.setInputVerifier(new InputVerifier()
        {

             @Override
             public boolean verify(JComponent input)
             {
                  JTextField texf = (JTextField) input;
                  try
                  {
                       int quantity = Integer.parseInt(initQuanTextField.getText());
                  }
                  catch(Exception e)
                  {
                       JOptionPane.showMessageDialog(null, "Initial quantity is not a number.", "ERROR!", JOptionPane.WARNING_MESSAGE);
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
                       double quantity = Double.parseDouble(pppTextField.getText());
                  }
                  catch(Exception e)
                  {
                       JOptionPane.showMessageDialog(null, "Price per piece is not a number.", "ERROR!", JOptionPane.WARNING_MESSAGE);
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
                  addMedAcceptButton.setEnabled(true);
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

        delDateClooser.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
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
    delDateClooser.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11));
    delDateClooser.setBehavior(MultyModelBehavior.SELECT_SINGLE);
    delDateClooser.setCalendarPreferredSize(new Dimension(350, 300));

    expDateChooser.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
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
expDateChooser.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11));
expDateChooser.setBehavior(MultyModelBehavior.SELECT_SINGLE);
expDateChooser.setCalendarPreferredSize(new Dimension(350, 300));
expDateChooser.setMinDate(new GregorianCalendar());

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
                        .addComponent(expDateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(expDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(brandNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brandNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lotNumLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lotNumTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pppLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pppTextField))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(delDateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delDateClooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(initQuanLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(initQuanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(addMedAcceptButton)
                .addGap(138, 138, 138))
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(expDateLabel)
                .addComponent(expDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(delDateClooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(delDateLabel))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lotNumLabel)
                .addComponent(lotNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(initQuanTextField)
                .addComponent(initQuanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(pppLabel)
                .addComponent(pppTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(addMedAcceptButton)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMedAcceptButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addMedAcceptButtonActionPerformed
    {//GEN-HEADEREND:event_addMedAcceptButtonActionPerformed
         Medicine med = null;
         try
         {
               med = new Medicine(genericNameTextField.getText(),
                         brandNameTextField.getText(),
                         lotNumTextField.getText(),
                         (GregorianCalendar) expDateChooser.getSelectedDate().clone(),
                         (GregorianCalendar) delDateClooser.getSelectedDate().clone(),
                         Integer.parseInt(initQuanTextField.getText()),
                         Double.parseDouble(pppTextField.getText()));

               MJOBranch.addMedicineToList(mjo.getInventory(), med);
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
         
          addMedAcceptButton.setEnabled(false);
         this.setVisible(true);
    }
    
    private void clearFields()
    {
         genericNameTextField.setText("");
         brandNameTextField.setText("");
         lotNumTextField.setText("");
         initQuanTextField.setText("");
         pppTextField.setText("");
         expDateChooser.setSelectedDate(new GregorianCalendar());
         delDateClooser.setSelectedDate(new GregorianCalendar());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedAcceptButton;
    private javax.swing.JLabel brandNameLabel;
    private javax.swing.JTextField brandNameTextField;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo delDateClooser;
    private javax.swing.JLabel delDateLabel;
    private datechooser.beans.DateChooserCombo expDateChooser;
    private javax.swing.JLabel expDateLabel;
    private javax.swing.JLabel genericNameLabel;
    private javax.swing.JTextField genericNameTextField;
    private javax.swing.JLabel initQuanLabel;
    private javax.swing.JTextField initQuanTextField;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lotNumTextField;
    private javax.swing.JLabel lotNumLabel;
    private javax.swing.JLabel pppLabel;
    private javax.swing.JTextField pppTextField;
    private MJOBranch mjo;
    // End of variables declaration//GEN-END:variables
}
