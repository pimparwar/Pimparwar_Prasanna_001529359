/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JOptionPane;
import personalInformation.CheckingAccount;

/**
 *
 * @author admin
 */
public class CreateCheckingAccInfo extends javax.swing.JPanel {

    CheckingAccount checkingAccount;
    /**
     * Creates new form viewDemographicInformation
     */
    public CreateCheckingAccInfo(CheckingAccount checkingAccount) {
        initComponents();
        this.checkingAccount=checkingAccount;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblState = new javax.swing.JLabel();
        txtAccountBalance = new javax.swing.JTextField();
        lblZipcode = new javax.swing.JLabel();
        txtAccountType = new javax.swing.JTextField();
        lblZipcode1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblBankAccountNumber = new javax.swing.JLabel();
        txtBankAccountNumber = new javax.swing.JTextField();
        txtRoutingNumber = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblRoutingnumber = new javax.swing.JLabel();
        txtBankName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(536, 484));

        lblState.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblState.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblState.setText("Bank Name");

        txtAccountBalance.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));
        txtAccountBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountBalanceActionPerformed(evt);
            }
        });

        lblZipcode.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblZipcode.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblZipcode.setText("Account Balance");

        txtAccountType.setEditable(false);
        txtAccountType.setBackground(new java.awt.Color(255, 255, 255));
        txtAccountType.setText("Checking");
        txtAccountType.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));
        txtAccountType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountTypeActionPerformed(evt);
            }
        });

        lblZipcode1.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblZipcode1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblZipcode1.setText("Account Type");

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 181, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHECKING ACCOUNT ");

        lblBankAccountNumber.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblBankAccountNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBankAccountNumber.setText("Bank Account Number");

        txtBankAccountNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));
        txtBankAccountNumber.setMargin(new java.awt.Insets(0, 0, 2, 0));
        txtBankAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankAccountNumberActionPerformed(evt);
            }
        });

        txtRoutingNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));
        txtRoutingNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoutingNumberActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/button_save (3).png"))); // NOI18N
        btnSave.setContentAreaFilled(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblRoutingnumber.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblRoutingnumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRoutingnumber.setText("Routing Number");

        txtBankName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));
        txtBankName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipcode1)
                    .addComponent(txtAccountBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipcode)
                    .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblState, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRoutingnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBankAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBankAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblBankAccountNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBankAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblRoutingnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblState)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblZipcode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAccountBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblZipcode1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnSave)
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAccountBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountBalanceActionPerformed

    private void txtAccountTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountTypeActionPerformed

    private void txtBankAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankAccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBankAccountNumberActionPerformed

    private void txtRoutingNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoutingNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoutingNumberActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        checkingAccount.setAccountBalance(txtAccountBalance.getText());
        checkingAccount.setAccountNumber(txtBankAccountNumber.getText());
        checkingAccount.setBankName(txtBankName.getText());
        checkingAccount.setBankRoutinNumber(txtRoutingNumber.getText());

        JOptionPane.showMessageDialog(this,"Saving Account Added Sucessfully");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtBankNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBankNameActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBankAccountNumber;
    private javax.swing.JLabel lblRoutingnumber;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblZipcode;
    private javax.swing.JLabel lblZipcode1;
    private javax.swing.JTextField txtAccountBalance;
    private javax.swing.JTextField txtAccountType;
    private javax.swing.JTextField txtBankAccountNumber;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtRoutingNumber;
    // End of variables declaration//GEN-END:variables


}
