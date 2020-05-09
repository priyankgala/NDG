/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.hospital;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthEventWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hardik
 */
public class PlanningHealthCheckupCampJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlanningHealthCheckupCampJPanel
     */
    private JPanel userProcessContainer;
    private HealthEventWorkRequest request;
    private UserAccount account;
    private Enterprise enterprise;
    
    public PlanningHealthCheckupCampJPanel(JPanel userProcessContainer, HealthEventWorkRequest request, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.account = account;
        this.enterprise = enterprise;
//        ngoTextBox.setText(request.getNgoName());
//        DoctorsRequiredTextBox.setText(request.getDoctorRequired());
//        dateTextBox.setText(request.getDate());
//        venueTextBox.setText(request.getVenue());
//        eventTextBox.setText(request.getHealthWorkshopName());
    }
    
//    public void populateApprovedTable(){
//        DefaultTableModel model = (DefaultTableModel)approvedEmployeeJTable.getModel();
//        
//        model.setRowCount(0);
//        
//        for(Employee emp : request.getDoctorList()){
//            Object[] row = new Object[1];
//            row[0] = emp;
//             model.addRow(row);
//        }
//        
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        venueTextBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        notifyJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ngoTextBox = new javax.swing.JTextField();
        DoctorsRequiredTextBox = new javax.swing.JTextField();
        eventTextBox = new javax.swing.JTextField();
        dateTextBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        commentsTextBox = new javax.swing.JTextField();
        backJButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        backJButton4 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        venueTextBox.setEditable(false);
        venueTextBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(venueTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 550, 240, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PharmacyRole/ngo.png"))); // NOI18N
        jLabel2.setText("NGO Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/hospital/venue.png"))); // NOI18N
        jLabel5.setText("Venue:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, -1, -1));

        notifyJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        notifyJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/hospital/noti.png"))); // NOI18N
        notifyJButton.setText("Notify");
        notifyJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        notifyJButton.setBorderPainted(false);
        notifyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifyJButtonActionPerformed(evt);
            }
        });
        add(notifyJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 720, 100, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/hospital/stethoscope.png"))); // NOI18N
        jLabel3.setText("Dr's Required:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/hospital/comments.png"))); // NOI18N
        jLabel8.setText("Comments :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 660, -1, -1));

        ngoTextBox.setEditable(false);
        ngoTextBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(ngoTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 390, 240, 30));

        DoctorsRequiredTextBox.setEditable(false);
        DoctorsRequiredTextBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DoctorsRequiredTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorsRequiredTextBoxActionPerformed(evt);
            }
        });
        add(DoctorsRequiredTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 443, 240, 30));

        eventTextBox.setEditable(false);
        eventTextBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(eventTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 603, 240, 30));

        dateTextBox.setEditable(false);
        dateTextBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(dateTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 490, 240, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/hospital/camp.png"))); // NOI18N
        jLabel1.setText("Health Camp Event Details");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/hospital/time.png"))); // NOI18N
        jLabel7.setText("Event duration:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, -1, -1));

        commentsTextBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        commentsTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentsTextBoxActionPerformed(evt);
            }
        });
        add(commentsTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 663, 240, 30));

        backJButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Resources/back.png"))); // NOI18N
        backJButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });
        add(backJButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PharmacyRole/cal.png"))); // NOI18N
        jLabel15.setText("Date:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, -1));

        backJButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backJButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PharmacyRole/back.png"))); // NOI18N
        backJButton4.setText("Back");
        backJButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton4.setBorderPainted(false);
        backJButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton4ActionPerformed(evt);
            }
        });
        add(backJButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 720, 100, -1));

        Background.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/background.jpg"))); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void notifyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifyJButtonActionPerformed
        
        ngoTextBox.setText("");
        DoctorsRequiredTextBox.setText("");
        dateTextBox.setText("");
        venueTextBox.setText("");
        eventTextBox.setText("");
        commentsTextBox.setText("");
        request.setStatus("Processing");
//        request.getEnterpriseList().add(enterprise.getName());
//        
//        request.setComments(commentsTextBox.getText());
        request.setReceiver(account);
        request.setStatus("Processing");
        JOptionPane.showMessageDialog(null, "Doctors Notified");

        // TODO add your handling code here:
    }//GEN-LAST:event_notifyJButtonActionPerformed

    private void DoctorsRequiredTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorsRequiredTextBoxActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorsRequiredTextBoxActionPerformed

    private void commentsTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentsTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commentsTextBoxActionPerformed

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        Component[] comps = userProcessContainer.getComponents();
        for(Component c: comps) {
            if(c instanceof HospitalAdminWorkAreaJPanel) {
                HospitalAdminWorkAreaJPanel panel = (HospitalAdminWorkAreaJPanel) c;
                //panel.populateTable();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton3ActionPerformed

    private void backJButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton4ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField DoctorsRequiredTextBox;
    private javax.swing.JButton backJButton3;
    private javax.swing.JButton backJButton4;
    private javax.swing.JTextField commentsTextBox;
    private javax.swing.JTextField dateTextBox;
    private javax.swing.JTextField eventTextBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField ngoTextBox;
    private javax.swing.JButton notifyJButton;
    private javax.swing.JTextField venueTextBox;
    // End of variables declaration//GEN-END:variables
}
