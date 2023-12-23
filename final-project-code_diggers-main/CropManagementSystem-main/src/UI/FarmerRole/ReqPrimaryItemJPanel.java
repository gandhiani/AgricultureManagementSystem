
package UI.FarmerRole;

import Model.EcoSys;
import Model.Enterprise.Enterprise;
import Model.Organization.OrgFarmer;
import Model.Organization.Organization;
import Model.Organization.OrgManagement;
import Model.Yield.Yield;
import Model.Yield.YieldDir;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.YieldRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @Author Deshna, Dhir, Prasad, Anisha
 */
public class ReqPrimaryItemJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
     private YieldDir produceDirectory;
    
    /**
     * Creates new form RequestRawMaterialJPanel
     */
    public ReqPrimaryItemJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,YieldDir produceDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.produceDirectory = produceDirectory;
        valueLabel.setText(enterprise.getName());
        populateRMCombo();
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        rmCoboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setBackground(new java.awt.Color(255, 102, 102));
        requestTestJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        requestTestJButton.setText("Submit Request");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 250, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Raw Material");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 166, -1));

        messageJTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        messageJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageJTextFieldActionPerformed(evt);
            }
        });
        messageJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                messageJTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                messageJTextFieldKeyTyped(evt);
            }
        });
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 210, -1));

        backJButton.setBackground(new java.awt.Color(255, 0, 0));
        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 650, 160, 50));

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 250, 30));

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise ");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 120, 30));

        rmCoboBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rmCoboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmCoboBoxActionPerformed(evt);
            }
        });
        add(rmCoboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 210, -1));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Request Raw Material");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 330, 63));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Quantity");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 166, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UIFarmerRole.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 1000, 810));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        String message = (String) rmCoboBox.getSelectedItem();
 
        if (messageJTextField.getText().equals(""))
        {
         
            /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
            JOptionPane.showMessageDialog(null,"Please mention the quantity before proceeding");
        }
        else
        {
        YieldRequest request = new YieldRequest();
        request.setMessage(message);
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setPrimItemQty(Integer.parseInt(messageJTextField.getText()));

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof OrgManagement){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        JOptionPane.showMessageDialog(null, "Request done successfully");
        }
        
        messageJTextField.setText("");
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FarmerWorkAreaJPanel cwjp = (FarmerWorkAreaJPanel) component;
        cwjp.fillReqPITable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void rmCoboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmCoboBoxActionPerformed
        
    }//GEN-LAST:event_rmCoboBoxActionPerformed

    private void messageJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_messageJTextFieldKeyPressed
         
    }//GEN-LAST:event_messageJTextFieldKeyPressed

    private void messageJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageJTextFieldActionPerformed

    private void messageJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_messageJTextFieldKeyTyped
        char vchar = evt.getKeyChar();
        if(!(Character.isDigit(vchar)) || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
    } 
    }//GEN-LAST:event_messageJTextFieldKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JComboBox rmCoboBox;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

    private void populateCropCombo() {
       
        /*for(Produce produce: produceDirectory.getProduceList())
        {   
            if (produce.getCropName().isEmpty())
            {
                break;
            }
            else
            {
            Object row[] = new Object[2];
            row[0]= produce.getCropName();

            cropCombo.addItem(row[0]);  
            }
        }
          */  
    }

    private void populateRMCombo() {       
            rmCoboBox.addItem("biosolids");
            rmCoboBox.addItem("manures");
            rmCoboBox.addItem("organic fertilizers");
            rmCoboBox.addItem("worm tea");
            rmCoboBox.addItem("vermicompost");
    }

   
}
