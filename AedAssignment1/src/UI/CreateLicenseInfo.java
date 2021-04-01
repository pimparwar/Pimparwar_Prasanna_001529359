/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import personalInformation.License;

/**
 *
 * @author admin
 */
public class CreateLicenseInfo extends javax.swing.JPanel {

    License license;
    File image;
    
    ImageIcon imageIcon;
    /**
     * Creates new form viewDemographicInformation
     */
    public CreateLicenseInfo(License license) {
        initComponents();
        this.license=license;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStreet = new javax.swing.JLabel();
        txtLicenseNumber = new javax.swing.JTextField();
        txtIssuedDate = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtdateOfExpiration = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtBloodType = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblZipcode = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUpload = new javax.swing.JButton();
        lblZipcode1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(536, 484));

        lblStreet.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblStreet.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStreet.setText("LIicense Number");

        txtLicenseNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));
        txtLicenseNumber.setMargin(new java.awt.Insets(0, 0, 2, 0));
        txtLicenseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicenseNumberActionPerformed(evt);
            }
        });

        txtIssuedDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));
        txtIssuedDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIssuedDateActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCity.setText("Date Issued");

        txtdateOfExpiration.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));
        txtdateOfExpiration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateOfExpirationActionPerformed(evt);
            }
        });

        lblState.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblState.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblState.setText("Date of Expiration ");

        txtBloodType.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));
        txtBloodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodTypeActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/button_save (3).png"))); // NOI18N
        btnSave.setBorderPainted(false);
        btnSave.setContentAreaFilled(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblZipcode.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblZipcode.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblZipcode.setText("Blood Type");

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 181, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LICENSE INFORMATION");

        txtUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/button_upload.png"))); // NOI18N
        txtUpload.setBorderPainted(false);
        txtUpload.setContentAreaFilled(false);
        txtUpload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtUpload.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUploadActionPerformed(evt);
            }
        });

        lblZipcode1.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblZipcode1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblZipcode1.setText("Please upload your photograph");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtLicenseNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                            .addComponent(txtIssuedDate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdateOfExpiration, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblState, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblZipcode1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(txtUpload))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblStreet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIssuedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblState, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdateOfExpiration, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblZipcode)
                .addGap(18, 18, 18)
                .addComponent(txtBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblZipcode1))
                    .addComponent(txtUpload))
                .addGap(60, 60, 60)
                .addComponent(btnSave)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLicenseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicenseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenseNumberActionPerformed

    private void txtIssuedDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIssuedDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIssuedDateActionPerformed

    private void txtdateOfExpirationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateOfExpirationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateOfExpirationActionPerformed

    private void txtBloodTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodTypeActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        // TODO add your handling code here:
        
        license.setIssuedDate(txtIssuedDate.getText());
        license.setLicenseNumber(txtLicenseNumber.getText());
        license.setBloodType(txtBloodType.getText());
        license.setDateOfExpiration(txtdateOfExpiration.getText());
       
            JOptionPane.showMessageDialog(this,"License Information Saved");
        Image getAbsolutePath=null;
        
        license.imageIcon = new ImageIcon(image.getAbsolutePath());
    //   Image uploadedImage= image.getScaledInstance(150,200,Image.SCALE_SMOOTH);
      //  license.imageIcon.setImage(uploadedImage);
     //   String image= this.image.getAbsolutePath();
       

        
        
        

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUploadActionPerformed
        // TODO add your handling code here:
       
        
        JFileChooser upload = new JFileChooser();
        upload.showOpenDialog(null);
        image= upload.getSelectedFile();
        
        
        
        
        
    }//GEN-LAST:event_txtUploadActionPerformed
 

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblZipcode;
    private javax.swing.JLabel lblZipcode1;
    private javax.swing.JTextField txtBloodType;
    private javax.swing.JTextField txtIssuedDate;
    private javax.swing.JTextField txtLicenseNumber;
    private javax.swing.JButton txtUpload;
    private javax.swing.JTextField txtdateOfExpiration;
    // End of variables declaration//GEN-END:variables

   
}