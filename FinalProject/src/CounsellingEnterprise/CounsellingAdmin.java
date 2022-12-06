/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CounsellingEnterprise;

/**
 *
 * @author Deepak
 */
public class CounsellingAdmin extends javax.swing.JFrame {

    /**
     * Creates new form CounsellingAdmin
     */
    public CounsellingAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        credentialsbtn = new javax.swing.JButton();
        enquirybtn = new javax.swing.JButton();
        firsttimebtn = new javax.swing.JButton();
        managebtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        credentialsbtn.setText("Manage Credentials");
        credentialsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credentialsbtnActionPerformed(evt);
            }
        });

        enquirybtn.setText("Enquiry");
        enquirybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enquirybtnActionPerformed(evt);
            }
        });

        firsttimebtn.setText("FirstTime");
        firsttimebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firsttimebtnActionPerformed(evt);
            }
        });

        managebtn.setText("Manage Student Profile");
        managebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(credentialsbtn)
                .addGap(48, 48, 48)
                .addComponent(enquirybtn)
                .addGap(42, 42, 42)
                .addComponent(firsttimebtn)
                .addGap(33, 33, 33)
                .addComponent(managebtn)
                .addContainerGap(602, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(credentialsbtn)
                    .addComponent(enquirybtn)
                    .addComponent(firsttimebtn)
                    .addComponent(managebtn)))
        );

        jSplitPane1.setTopComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1186, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        jScrollPane3.setViewportView(jSplitPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enquirybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enquirybtnActionPerformed
        // TODO add your handling code here:
        EnquiryJPanel e=new EnquiryJPanel();
        jSplitPane1.setBottomComponent(e);
    }//GEN-LAST:event_enquirybtnActionPerformed

    private void credentialsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credentialsbtnActionPerformed
        // TODO add your handling code here:
        EmployeeCCredentialsJPanel ec=new  EmployeeCCredentialsJPanel();
        jSplitPane1.setBottomComponent(ec);
    }//GEN-LAST:event_credentialsbtnActionPerformed

    private void firsttimebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firsttimebtnActionPerformed
        // TODO add your handling code here:
        FirstTimeJPanel ft=new FirstTimeJPanel();
            jSplitPane1.setBottomComponent(ft);
    }//GEN-LAST:event_firsttimebtnActionPerformed

    private void managebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managebtnActionPerformed
        // TODO add your handling code here:
        ManageStudentProfileAdminJPanel ms=new ManageStudentProfileAdminJPanel();
        jSplitPane1.setBottomComponent(ms);
    }//GEN-LAST:event_managebtnActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton credentialsbtn;
    private javax.swing.JButton enquirybtn;
    private javax.swing.JButton firsttimebtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton managebtn;
    // End of variables declaration//GEN-END:variables
}