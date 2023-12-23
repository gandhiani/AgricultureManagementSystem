
package UI.AdministrativeRole;

import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.Organization.Organization.Type;
import Model.Organization.OrganizationDir;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class AdministerOrgJPanel extends javax.swing.JPanel {

    private OrganizationDir directory;
    private JPanel userProcessContainer;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public AdministerOrgJPanel(JPanel userProcessContainer,OrganizationDir directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;        
        populateTable();
        populateCombo();
    }
    
    private void populateCombo(){
        orgJComboBox.removeAllItems();
        for (Enterprise.EnterpriseType entTyp : Enterprise.EnterpriseType.values())
        {
            
            /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
            if(entTyp.getValue().equals(Enterprise.EnterpriseType.FoodDept.getValue()))
            {
                
                /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
                System.out.println(entTyp.getValue()+"Enterprise value");
                for (Type typ : Organization.Type.values()){
                    System.out.println("type"+typ);
                    
                    /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
                    if ((!typ.getValue().equals(Type.OfficeAdmin.getValue())) && (typ.getValue().equals(Type.Farmer.getValue()) || typ.getValue().equals(Type.Warehouse.getValue()) || typ.getValue().equals(Type.Customer.getValue()) || typ.getValue().equals(Type.OfficeStaff.getValue())))
                    orgJComboBox.addItem(typ);
                }
            }
        }
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) orgJTable.getModel();
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        model.setRowCount(0);
        
        for (Organization org232 : directory.getOrganizationList()){
            Object[] row = new Object[2];
            
            /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
            row[0] = org232.getOrganizationID();
            row[1] = org232.getName();
            
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

        jLabel2121 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orgJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        orgJComboBox = new javax.swing.JComboBox();
        jLabel1232 = new javax.swing.JLabel();
        bkBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2121.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2121.setText("Manage Organizations");

        setBackground(new java.awt.Color(255, 204, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orgJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orgJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orgJTable);
        if (orgJTable.getColumnModel().getColumnCount() > 0) {
            orgJTable.getColumnModel().getColumn(0).setResizable(false);
            orgJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 503, 243));

        addJButton.setBackground(new java.awt.Color(255, 102, 0));
        addJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 190, 50));

        orgJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        orgJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgJComboBoxActionPerformed(evt);
            }
        });
        add(orgJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 242, -1));

        jLabel1232.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1232.setText("Organization Type ");
        add(jLabel1232, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        bkBtn.setBackground(new java.awt.Color(255, 102, 102));
        bkBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bkBtn.setText("Back");
        bkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkBtnActionPerformed(evt);
            }
        });
        add(bkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 660, 100, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UIAdministrativeRole.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        Type typ4 = (Type) orgJComboBox.getSelectedItem();
        directory.createOrganization(typ4);
        populateTable();
    }//GEN-LAST:event_addJButtonActionPerformed

    private void bkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkBtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_bkBtnActionPerformed

    private void orgJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton bkBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1232;
    private javax.swing.JLabel jLabel2121;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox orgJComboBox;
    private javax.swing.JTable orgJTable;
    // End of variables declaration//GEN-END:variables
}