
package UI.ManurerWHRole;

import Model.PrimaryItem.PrimaryItem;
import Model.PrimaryItem.PrimaryItemsDir;
import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Enterprise.ProducerEnt;
import Model.Organization.*;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class ManurerWHJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private OrgProducerWH organization;
    private ProducerEnt enterprise;
    private UserAccount userAccount;
    private PrimaryItemsDir piDir;
    public static boolean flg = false;
    
    
    
       /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    private EcoSys business;
 
    public ManurerWHJPanel(JPanel userProcessContainer, UserAccount account, OrgProducerWH organization, Enterprise enterprise,EcoSys business, PrimaryItemsDir piDir) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = (ProducerEnt)enterprise;
        this.userAccount = account;
        this.business = business;
        this.piDir = piDir;
        valLbl.setText(enterprise.getName());
        populateSuppRequestTable();
        populateRM();
        
    }
    
       /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/


    public void populateSuppRequestTable(){
    DefaultTableModel model = (DefaultTableModel)wrkReqPIJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest req : organization.getWorkQueue().getWorkRequestList()){
            Object[] record = new Object[5];
            record[0] = req;
            
               /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
            record[1] = req.getSender().getEmp().getName();
            record[2] = req.getReceiver() == null ? null : req.getReceiver().getEmp().getName();
            record[3] = req.getStatus();
            
               /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
            record[4] = req.getPrimItemQty();
            
            model.addRow(record);
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

        entLabel = new javax.swing.JLabel();
        valLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        wrkReqPIJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        processJButton = new javax.swing.JButton();
        associateJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        piJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        entLabel.setText("Enterprise :");
        add(entLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 127, 30));

        valLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(valLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 158, 26));

        wrkReqPIJTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        wrkReqPIJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Raw Material Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(wrkReqPIJTable);
        if (wrkReqPIJTable.getColumnModel().getColumnCount() > 0) {
            wrkReqPIJTable.getColumnModel().getColumn(0).setResizable(false);
            wrkReqPIJTable.getColumnModel().getColumn(1).setResizable(false);
            wrkReqPIJTable.getColumnModel().getColumn(2).setResizable(false);
            wrkReqPIJTable.getColumnModel().getColumn(3).setResizable(false);
            wrkReqPIJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 683, 96));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Raw Material Requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        processJButton.setBackground(new java.awt.Color(255, 102, 102));
        processJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 180, -1));

        associateJButton.setBackground(new java.awt.Color(255, 102, 102));
        associateJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        associateJButton.setText("Assign to me");
        associateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                associateJButtonActionPerformed(evt);
            }
        });
        add(associateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 180, -1));

        piJTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        piJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Raw Material", "Quantity", "Producer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(piJTable);
        if (piJTable.getColumnModel().getColumnCount() > 0) {
            piJTable.getColumnModel().getColumn(0).setResizable(false);
            piJTable.getColumnModel().getColumn(1).setResizable(false);
            piJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 683, 200));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Raw Material Inventory");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manufacturer Warehouse");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 420, 61));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ModelManurerWHRole.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-810, -80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void sendToSupplierJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToSupplierJButtonActionPerformed
        int slctRecord = wrkReqPIJTable.getSelectedRow();
        
        if (slctRecord < 0){
            return;
        }
        
           /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        YieldRequest request = (YieldRequest)wrkReqPIJTable.getValueAt(slctRecord, 0);
        request.setStatus("Forwarded to Manufacturer.Supplier");
        populateSuppRequestTable();
           /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        
        Organization org = null;
        for (Organization org1 : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (org1 instanceof OrgProducerDistributor){
                org = org1;
                break;
            }
        }
        
           /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
        }
        
    }//GEN-LAST:event_sendToSupplierJButtonActionPerformed

       /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = wrkReqPIJTable.getSelectedRow();

        if (selectedRow < 0){
            
               /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
            return;
        }

        YieldRequest req23 = (YieldRequest)wrkReqPIJTable.getValueAt(selectedRow, 0);

        req23.setStatus("Under Process");

        ProcessReqPrimaryItemJPanel processWorkRequestJPanel = new ProcessReqPrimaryItemJPanel(userProcessContainer, req23);
        userProcessContainer.add("ProcessRequestRMJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_processJButtonActionPerformed

    private void associateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_associateJButtonActionPerformed
 
        int slctRecord = wrkReqPIJTable.getSelectedRow();

        if (slctRecord < 0){
            JOptionPane.showMessageDialog(null,"Kindly select a record");
        }
        else
               /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        {
            WorkRequest req = (WorkRequest)wrkReqPIJTable.getValueAt(slctRecord, 0);
               /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        String primItemName = wrkReqPIJTable.getModel().getValueAt(slctRecord, 0).toString();
        String uName = wrkReqPIJTable.getModel().getValueAt(slctRecord, 1).toString();
           /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        int primItemQty = Integer.parseInt((String.valueOf(wrkReqPIJTable.getModel().getValueAt(slctRecord, 4))));
        
        int i =0;
         int primItemQntyYield = 0;
         String temp1_Name = null;
         
         for(int j = 0; j <piJTable.getRowCount(); j++){
                /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
             temp1_Name = piJTable.getModel().getValueAt(j, i).toString();
             System.out.println(temp1_Name);
            if(temp1_Name.equals(primItemName)){
                i++;
               
                primItemQntyYield = Integer.parseInt((String.valueOf(piJTable.getModel().getValueAt(j, i))));
                break;
            }
        }
         if (temp1_Name == null)
         {
             JOptionPane.showMessageDialog(null,"Cannot assign this job, please go producer");
             processJButton.setEnabled(false);
             req.setStatus("Assign to Producer");
             flg = true;
         }
         else{
         if (temp1_Name.equals(primItemName))
            {
                if (primItemQty <= primItemQntyYield)
                    {
                        
                        req.setReceiver(userAccount);
                        req.setStatus("Pending");
                           /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
                        String sender = String.valueOf(req.getSender());
                        for(PrimaryItem rawMaterial : piDir.getPrimItem()){
                            if (temp1_Name.equals((String)rawMaterial.getItemName()) && sender.equals(uName))
                            {
                                rawMaterial.setItemQty(primItemQntyYield - primItemQty);
                                req.setPrimItemQty(0);
                            }
                               /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
                            populateSuppRequestTable();
                            populateRM();       
                        }  
 
                    }
                else if (primItemQty > primItemQntyYield)
                {
                    
                    req.setReceiver(userAccount);
                    req.setStatus("Pending");
                       /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
                    req.setHarvestQty(primItemQty - primItemQntyYield);
                    String sender = String.valueOf(req.getSender());
                       /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
                    for(PrimaryItem rawMaterial : piDir.getPrimItem()){
                    if (temp1_Name.equals((String)rawMaterial.getItemName()) &&  sender.equals(uName))
                    {
                        rawMaterial.setItemQty(0);
                        req.setPrimItemQty(primItemQty - primItemQntyYield);
                           /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
                        req.setStatus("Request partially fulfilled by warehouse");
                        flg = true;
                    }
                    populateSuppRequestTable();
                    populateRM();
                    }  
                }
            
            }
        else 
        {
               /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
            JOptionPane.showMessageDialog(null,"Cannot assign this job, please go farmer");
            flg = true;
        }
          
         }
        }

    }//GEN-LAST:event_associateJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton associateJButton;
    private javax.swing.JLabel entLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable piJTable;
    private javax.swing.JButton processJButton;
    private javax.swing.JLabel valLbl;
    private javax.swing.JTable wrkReqPIJTable;
    // End of variables declaration//GEN-END:variables

    private void populateRM() {
        DefaultTableModel model = (DefaultTableModel)piJTable.getModel();
        
        model.setRowCount(0);
           /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        
        for(PrimaryItem rm : piDir.getPrimItem()){
            Object[] row = new Object[5];
            row[0] = rm;
               /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
            row[1] = rm.getItemQty();
            row[2] = rm.getMakerName();
            model.addRow(row);
        }
    }
}