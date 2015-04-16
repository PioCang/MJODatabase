package mjdatabase;

public class BuildItemListGUI extends javax.swing.JDialog
{
    public BuildItemListGUI(java.awt.Frame parent, boolean modal)
    {
	 super(parent, modal);
	 initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents()
    {

        addItemButton = new javax.swing.JButton();
        removeItemButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        // TODO add your handling code here:
    }                                             

    /**
     * @param args the command line arguments
     */
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
	     java.util.logging.Logger.getLogger(BuildItemListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	 }
	 catch (InstantiationException ex)
	 {
	     java.util.logging.Logger.getLogger(BuildItemListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	 }
	 catch (IllegalAccessException ex)
	 {
	     java.util.logging.Logger.getLogger(BuildItemListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	 }
	 catch (javax.swing.UnsupportedLookAndFeelException ex)
	 {
	     java.util.logging.Logger.getLogger(BuildItemListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	 }

	 java.awt.EventQueue.invokeLater(new Runnable()
	 {
	     public void run()
	     {
		  BuildItemListGUI dialog = new BuildItemListGUI(new javax.swing.JFrame(), true);
		  dialog.addWindowListener(new java.awt.event.WindowAdapter()
		  {
		      @Override
		      public void windowClosing(java.awt.event.WindowEvent e)
		      {
			   System.exit(0);
		      }
		  });
		  dialog.setVisible(true);
	     }
	 });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addItemButton;
    private javax.swing.JButton removeItemButton;
    // End of variables declaration                   
}
