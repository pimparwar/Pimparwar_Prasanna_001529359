/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JOptionPane;
import personalInformation.MedicalInfo;

/**
 *
 * @author admin
 */
public class CreateMedicalInfo extends javax.swing.JPanel {

    MedicalInfo medicalInfo;
    /**
     * Creates new form viewDemographicInformation
     */
    public CreateMedicalInfo(MedicalInfo medicalInfo) {
        initComponents();
        this.medicalInfo=medicalInfo;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblMedicalRecordNumber = new javax.swing.JLabel();
        txtMedicalRecordNumber = new javax.swing.JTextField();
        txtAlergy1 = new javax.swing.JTextField();
        lblAlergy1 = new javax.swing.JLabel();
        txtAlergy2 = new javax.swing.JTextField();
        lblAlergy2 = new javax.swing.JLabel();
        txtAlergy3 = new javax.swing.JTextField();
        lblAlergy3 = new javax.swing.JLabel();
        txtAlergy4 = new javax.swing.JTextField();
        lblAlergy4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(536, 484));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 188, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Medical Information");

        lblMedicalRecordNumber.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblMedicalRecordNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedicalRecordNumber.setText("Medical Record Number");

        txtMedicalRecordNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 188, 204)));
        txtMedicalRecordNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicalRecordNumberActionPerformed(evt);
            }
        });

        txtAlergy1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 188, 204)));
        txtAlergy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlergy1ActionPerformed(evt);
            }
        });

        lblAlergy1.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblAlergy1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAlergy1.setText("Allergy");

        txtAlergy2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 188, 204)));
        txtAlergy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlergy2ActionPerformed(evt);
            }
        });

        lblAlergy2.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblAlergy2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAlergy2.setText("Allergy");

        txtAlergy3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 188, 204)));
        txtAlergy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlergy3ActionPerformed(evt);
            }
        });

        lblAlergy3.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblAlergy3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAlergy3.setText("Allergy");

        txtAlergy4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 188, 204)));
        txtAlergy4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlergy4ActionPerformed(evt);
            }
        });

        lblAlergy4.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblAlergy4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAlergy4.setText("Allergy");

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/button_save (3).png"))); // NOI18N
        btnSave.setContentAreaFilled(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlergy4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlergy4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlergy1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlergy2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlergy3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlergy2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedicalRecordNumber)
                    .addComponent(lblAlergy1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlergy3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnSave)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblMedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblAlergy1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAlergy1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblAlergy4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAlergy4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblAlergy2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAlergy2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblAlergy3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAlergy3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMedicalRecordNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicalRecordNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicalRecordNumberActionPerformed

    private void txtAlergy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlergy1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlergy1ActionPerformed

    private void txtAlergy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlergy2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlergy2ActionPerformed

    private void txtAlergy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlergy3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlergy3ActionPerformed

    private void txtAlergy4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlergy4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlergy4ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        medicalInfo.setMedicalRecordNumber(txtMedicalRecordNumber.getText());
        medicalInfo.setAllergy1(txtAlergy1.getText());
         medicalInfo.setAllergy2(txtAlergy2.getText());
          medicalInfo.setAllergy3(txtAlergy3.getText());
           medicalInfo.setAllergy4(txtAlergy4.getText());
           JOptionPane.showMessageDialog(this,"Medical Information Saved");
       
    }//GEN-LAST:event_btnSaveActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAlergy1;
    private javax.swing.JLabel lblAlergy2;
    private javax.swing.JLabel lblAlergy3;
    private javax.swing.JLabel lblAlergy4;
    private javax.swing.JLabel lblMedicalRecordNumber;
    private javax.swing.JTextField txtAlergy1;
    private javax.swing.JTextField txtAlergy2;
    private javax.swing.JTextField txtAlergy3;
    private javax.swing.JTextField txtAlergy4;
    private javax.swing.JTextField txtMedicalRecordNumber;
    // End of variables declaration//GEN-END:variables


}
