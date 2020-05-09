/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GroceryRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.GroceryAdminOrganization;
import Business.Organization.NGOAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GroceryDistributionEventRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.NGORole.NGOWorkAreaJPanel;
import userinterface.NGORole.ProcessGroceryDistributionRequestJPanel;

/**
 *
 * @author Apoorva
 */
public class GroceryStoreWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private GroceryAdminOrganization groceryStoreOrganization;
    private Network network;
    private EcoSystem business;
    //private OrganizationDirectory organizationDir;

    public GroceryStoreWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, GroceryAdminOrganization groceryStoreOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        //this.organizationDir = new OrganizationDirectory();
        this.userProcessContainer = userProcessContainer;
        this.groceryStoreOrganization = groceryStoreOrganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        //valueLabel.setText(enterprise.getName());

        populateTable();
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
        workRequestTable = new javax.swing.JTable();
        createRequest = new javax.swing.JButton();
        Heading = new javax.swing.JLabel();
        processJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setLayout(null);

        workRequestTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        workRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Event", "Sender", "Status"
            }
        ));
        jScrollPane1.setViewportView(workRequestTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(360, 430, 570, 100);

        createRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/GroceryRole/submit.png"))); // NOI18N
        createRequest.setText("Create");
        createRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRequestActionPerformed(evt);
            }
        });
        add(createRequest);
        createRequest.setBounds(810, 600, 120, 50);

        Heading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Heading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/basket.png"))); // NOI18N
        Heading.setText("Grocery Work Panel");
        Heading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Heading.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(Heading);
        Heading.setBounds(510, 270, 240, 100);

        processJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/Process.png"))); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton);
        processJButton.setBounds(510, 600, 120, 50);

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/back.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(360, 600, 120, 50);

        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/refresh.png"))); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton);
        refreshJButton.setBounds(660, 600, 120, 50);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/background.jpg"))); // NOI18N
        add(Background);
        Background.setBounds(0, 0, 1260, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void createRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRequestActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestGroceryDistributionJPanel", new RequestGroceryDistributionJPanel(userProcessContainer, userAccount, groceryStoreOrganization, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createRequestActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        String status = (String)workRequestTable.getValueAt(selectedRow, 2);
        System.out.println("status "+ status);
        if(status.equals("Completed")){
            JOptionPane.showMessageDialog(null, "Process already complete !");
            return;
        }
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    System.out.println("organiaz" + organization.getName());
                    if (organization instanceof GroceryAdminOrganization) {
                        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                             System.out.println("here" + workRequestTable.getValueAt(selectedRow, 0).toString());
                            if (workRequestTable.getValueAt(selectedRow, 0) instanceof GroceryDistributionEventRequest) {
                                System.out.println("and "+ status);
                                if (status.equals("Pending with Grocery Admin")) {
                                    GroceryDistributionEventRequest request1 = (GroceryDistributionEventRequest) workRequestTable.getValueAt(selectedRow, 0);
                                    ProcessGroceryDistributionRequestJPanel processRequestPanel = new ProcessGroceryDistributionRequestJPanel(userProcessContainer, request1, userAccount, enterprise, business);
                                    userProcessContainer.add("processRequestPanel", processRequestPanel);
                                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                                    layout.next(userProcessContainer);
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Process pending with NGO Admin!");
                                    return;
                                }
                            }
                        }
//                    } else if (organization instanceof NGOAdminOrganization) {
//                        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
//                            if (workRequestTable.getValueAt(selectedRow, 0) instanceof GroceryDistributionEventRequest) {
//                                GroceryDistributionEventRequest request1 = (GroceryDistributionEventRequest) workRequestTable.getValueAt(selectedRow, 0);
//                                ProcessGroceryDistributionRequestJPanel processRequestPanel = new ProcessGroceryDistributionRequestJPanel(userProcessContainer, request1, userAccount, enterprise, business);
//                                userProcessContainer.add("processRequestPanel", processRequestPanel);
//                                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//                                layout.next(userProcessContainer);
//                                break;
//                            }
//                        }
                    }
                }
            }
        }
        Component[] comps = userProcessContainer.getComponents();
        for(Component c : comps){
            if (c instanceof GroceryStoreWorkAreaJPanel){
                GroceryStoreWorkAreaJPanel groceryPanel = (GroceryStoreWorkAreaJPanel) c;
                groceryPanel.populateTable();
            }   
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] comps = userProcessContainer.getComponents();
        for(Component c : comps){
            if (c instanceof GroceryStoreWorkAreaJPanel){
                GroceryStoreWorkAreaJPanel groceryPanel = (GroceryStoreWorkAreaJPanel) c;
                groceryPanel.populateTable();
            }   
        }
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Heading;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createRequest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestTable;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestTable.getModel();
        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof GroceryAdminOrganization) {
                        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                            if (request instanceof GroceryDistributionEventRequest) {
                                GroceryDistributionEventRequest req = (GroceryDistributionEventRequest) request;
                                Object[] row = new Object[3];
                                row[0] = req;
                                row[1] = req.getSender();
                                row[2] = req.getStatus();
                                model.addRow(row);
                            }
                        }
                    } else if (organization instanceof NGOAdminOrganization) {
                        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                            if (request instanceof GroceryDistributionEventRequest) {
                                GroceryDistributionEventRequest req = (GroceryDistributionEventRequest) request;
                                Object[] row = new Object[3];
                                row[0] = req;
                                row[1] = req.getSender();
                                row[2] = req.getStatus();
                                model.addRow(row);
                            }
                        }
                    }
                }
            }
        }
    }
}
