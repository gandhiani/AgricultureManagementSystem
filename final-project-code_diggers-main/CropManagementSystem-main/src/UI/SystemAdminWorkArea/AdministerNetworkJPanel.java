
package UI.SystemAdminWorkArea;

import Model.EcoSys;
import Model.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class AdministerNetworkJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSys system;

       /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    public AdministerNetworkJPanel(JPanel userProcessContainer, EcoSys system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateNetworkTable();
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) ntwrkJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network.getName();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ntwrkJTable = new javax.swing.JTable();
        jLabel133 = new javax.swing.JLabel();
        SBTJButton = new javax.swing.JButton();
        nametext = new javax.swing.JTextField();
        bkJButton = new javax.swing.JButton();
        jLabel244 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ntwrkJTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ntwrkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ntwrkJTable);
        if (ntwrkJTable.getColumnModel().getColumnCount() > 0) {
            ntwrkJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 510, 240));

        jLabel133.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel133.setText("Network Name");
        add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 190, -1));

        SBTJButton.setBackground(new java.awt.Color(255, 102, 102));
        SBTJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SBTJButton.setText("Submit");
        SBTJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBTJButtonActionPerformed(evt);
            }
        });
        add(SBTJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 170, -1));

        nametext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(nametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 260, -1));

        bkJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bkJButton.setText(" Back");
        bkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkJButtonActionPerformed(evt);
            }
        });
        add(bkJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 630, 110, 50));

        jLabel244.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel244.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel244.setText("Manage Networks");
        add(jLabel244, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 9, 370, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ModelSystemAdminWorkArea.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1000, 800));
    }// </editor-fold>//GEN-END:initComponents
   /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    private void SBTJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBTJButtonActionPerformed
        if (nametext.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Kindly enter the City Name");
        }
        else
        {
        String name = nametext.getText();
//Restoring the data
        Network network = system.createAndAddNetwork();
        network.setName(name);
//Populate old values if not.
        populateNetworkTable();
        }
        nametext.setText("");
    }//GEN-LAST:event_SBTJButtonActionPerformed

    private void bkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_bkJButtonActionPerformed

       /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SBTJButton;
    private javax.swing.JButton bkJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nametext;
    private javax.swing.JTable ntwrkJTable;
    // End of variables declaration//GEN-END:variables
}
