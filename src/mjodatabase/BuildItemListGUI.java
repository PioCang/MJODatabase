package mjodatabase;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Toolkit;

public class BuildItemListGUI extends javax.swing.JDialog
{
    public BuildItemListGUI()
    {     
	 initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents()
    {

        addItemButton = new javax.swing.JButton();
        removeItemButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        setMinimumSize(new java.awt.Dimension(660, 520));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(660, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        addItemButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        addItemButton.setText("Add Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addItemButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addItemButton);
        addItemButton.setBounds(110, 450, 153, 27);

        removeItemButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        removeItemButton.setText("Remove Item");
        getContentPane().add(removeItemButton);
        removeItemButton.setBounds(405, 451, 153, 27);

        pack();
    }// </editor-fold>                        

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt)                                              
    {                                                  
        MJOBranch.itemSelector.showWindow();
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
    private javax.swing.JButton addItemButton;
    private javax.swing.JButton removeItemButton;
    // End of variables declaration                   
}
