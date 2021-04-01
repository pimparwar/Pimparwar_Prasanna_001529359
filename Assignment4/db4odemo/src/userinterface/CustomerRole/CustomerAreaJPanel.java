/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;

import Business.Menu.Menu;
import Business.Menu.MenuDirectory;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private EcoSystem ecoSystem;
    private JPanel userProcessContainer;

    private UserAccount userAccount;

    private RestaurantDirectory restaurantDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private CustomerDirectory customerDirectory;
    private MenuDirectory menuDirectory;
    private OrderDirectory orderDirectory;
    private static int cnt = 1;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    
    
    public CustomerAreaJPanel(EcoSystem ecoSystem, JPanel userProcessContainer, UserAccount userAccount, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, CustomerDirectory customerDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory) {
           initComponents();
       
        this.ecoSystem=ecoSystem;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
        this.deliveryManDirectory = ecoSystem.getDeliveryManDirectory();
        this.customerDirectory = ecoSystem.getCustomerDirectory();
        this.menuDirectory = ecoSystem.getMenuDirectory();
        this.orderDirectory = ecoSystem.getOrderDirectory();
          populateRequestTable();
           populateRestaurantCombo();
    }

    

    public void populateRequestTable() {
DefaultTableModel d = (DefaultTableModel) workRequestJTable.getModel();
        d.setRowCount(0);
        for (Order order : ecoSystem.getOrderDirectory().getOrderList()){
            //System.out.println("Order" + order.getOrderId());
            if(userAccount.getEmployee().getName().equals(order.getOrderCustomer().getCustomerName())) {
                Object[] row = new Object[8];
                row[0] = order;
                row[1] = order.getMenu().getFoodName();
                row[2] = order.getItemQuantity() * order.getMenu().getFoodItemPrice();
                row[3] = order.getOrderRestaurant().getRestaurantName();
                row[4] = order.getMessage();
                row[5] = order.getOrderCustomer().getCustomerName();
                row[6] = order.getOrderStatus();
                row[7] = order.getItemQuantity();
                d.addRow(row);
            }
        }
    }
    
     public void populateRestaurantCombo() {
        boxRestaurantNames.removeAllItems();
        boxRestaurantNames.addItem("  ");
        for(Restaurant res : ecoSystem.getRestaurantDirectory().getRestaurantDirectory()) {
            //System.out.println("res" + res);
            boxRestaurantNames.addItem(res.getRestaurantName());
        }
    }
    public void populateTable() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblItem.getModel();
        defaultTableModel.setRowCount(0);
        String restaurantName = boxRestaurantNames.getSelectedItem().toString();
        Restaurant restaurant = ecoSystem.getRestaurantDirectory().getRestaurant(restaurantName);
        
         for(Menu m : ecoSystem.getMenuDirectory().getMenuDirectory()){
            
            if(restaurant.getRestaurantName().equals(m.getRestaurantName())) {
                
                
                Object [] row = new Object[2];
                row[0] = m.getFoodName();
                row[1] = m.getFoodItemPrice();
                defaultTableModel.addRow(row);
            }
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

        lblCustomer = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        boxRestaurantNames = new javax.swing.JComboBox<>();
        lblSelectRestaurant = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnConfirm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnViewMenu = new javax.swing.JButton();
        requestTestJButton = new javax.swing.JButton();
        txtComment = new javax.swing.JTextField();
        refreshTestJButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        lblCustomer.setBackground(new java.awt.Color(255, 255, 255));
        lblCustomer.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblCustomer.setForeground(new java.awt.Color(0, 181, 204));
        lblCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCustomer.setText("Coustmer :");

        lblValue.setText("<value>");

        boxRestaurantNames.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxRestaurantNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRestaurantNamesActionPerformed(evt);
            }
        });

        lblSelectRestaurant.setText("select restaurant");

        jLabel1.setText("Quantity:");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "ItemName", "Price", "Restaurant", "Message", "Receiver", "Status", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable);

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel2.setText("Comment:");

        btnViewMenu.setText("view menu");
        btnViewMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMenuActionPerformed(evt);
            }
        });

        requestTestJButton.setText("Add Comment");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item Name", "Price"
            }
        ));
        jScrollPane3.setViewportView(tblItem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(requestTestJButton)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(40, 40, 40)
                                                .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(452, 452, 452))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSelectRestaurant)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxRestaurantNames, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(btnViewMenu))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblSelectRestaurant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomer)
                    .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxRestaurantNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewMenu))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm))
                .addGap(75, 75, 75)
                .addComponent(refreshTestJButton)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(requestTestJButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boxRestaurantNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRestaurantNamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxRestaurantNamesActionPerformed

    private void btnViewMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMenuActionPerformed
        // TODO add your handling code here:
        if(boxRestaurantNames.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "select restaurant");
            return;
        }
        populateTable();
    }//GEN-LAST:event_btnViewMenuActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblItem.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int quantity = Integer.parseInt(txtQuantity.getText());
        String restaurantName = boxRestaurantNames.getSelectedItem().toString();
        Restaurant r = ecoSystem.getRestaurantDirectory().getRestaurant(restaurantName);
        Customer c = ecoSystem.getCustomerDirectory().getCustomer(userAccount.getEmployee().getName());
        Menu menu = (Menu) tblItem.getValueAt(selectedRow, 0);
        String status = "Order Placed";

        Order order = ecoSystem.getOrderDirectory().newOrder();
        order.setOrderCustomer(c);
        order.setOrderId(String.valueOf(cnt++));
        order.setItemQuantity(quantity);
        order.setMenu(menu);
        order.setOrderRestaurant(r);
        order.setOrderStatus(status);
        order.setOrderAssign(false);

        JOptionPane.showMessageDialog(null,"You have placed an order");
        populateRequestTable();

    }//GEN-LAST:event_btnConfirmActionPerformed

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        if(txtComment.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Field cannot be empty");
            return;
        }

        int selectedRow = workRequestJTable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Order order = (Order)workRequestJTable.getValueAt(selectedRow, 0);
        order.setMessage(txtComment.getText());
        populateRequestTable();
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxRestaurantNames;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnViewMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblSelectRestaurant;
    private javax.swing.JLabel lblValue;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField txtComment;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
