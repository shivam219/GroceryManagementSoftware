package dmart;

public class ManagerFrame extends javax.swing.JFrame {

    public ManagerFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddProduct = new javax.swing.JButton();
        btnOrders = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnViewPoint = new javax.swing.JButton();
        btnQuite = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btmBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        btnAddProduct.setBackground(new java.awt.Color(0, 153, 102));
        btnAddProduct.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAddProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagerTableImage/addproduct.png"))); // NOI18N
        btnAddProduct.setText("Add Products");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnOrders.setBackground(new java.awt.Color(0, 153, 102));
        btnOrders.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnOrders.setForeground(new java.awt.Color(255, 255, 255));
        btnOrders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagerTableImage/orders.png"))); // NOI18N
        btnOrders.setText("Orders");
        btnOrders.setAlignmentY(0.0F);
        btnOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersActionPerformed(evt);
            }
        });

        btnEmployee.setBackground(new java.awt.Color(0, 153, 102));
        btnEmployee.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagerTableImage/Employee.png"))); // NOI18N
        btnEmployee.setText("Employee ");
        btnEmployee.setAlignmentY(0.0F);
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        btnViewPoint.setBackground(new java.awt.Color(0, 153, 102));
        btnViewPoint.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnViewPoint.setForeground(new java.awt.Color(255, 255, 255));
        btnViewPoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ManagerTableImage/viewpoint.png"))); // NOI18N
        btnViewPoint.setText("ViewPoint");
        btnViewPoint.setAlignmentY(0.0F);
        btnViewPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPointActionPerformed(evt);
            }
        });

        btnQuite.setBackground(new java.awt.Color(0, 153, 102));
        btnQuite.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnQuite.setForeground(new java.awt.Color(255, 255, 255));
        btnQuite.setText("Quit");
        btnQuite.setAlignmentY(0.0F);
        btnQuite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuiteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Manager Table ");

        btmBack.setBackground(new java.awt.Color(0, 153, 102));
        btmBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btmBack.setForeground(new java.awt.Color(255, 255, 255));
        btmBack.setText("Back");
        btmBack.setAlignmentY(0.0F);
        btmBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shope2.png"))); // NOI18N
        jLabel2.setText("GroceryMart®");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btmBack, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuite))
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264))))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuite)
                    .addComponent(btmBack))
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersActionPerformed
        // TODO add your handling code here:
        new OrdersFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnOrdersActionPerformed

    private void btnViewPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPointActionPerformed
        // TODO add your handling code here:
        new ViewPointFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnViewPointActionPerformed

    private void btmBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBackActionPerformed
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btmBackActionPerformed

    private void btnQuiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuiteActionPerformed
        dispose();
    }//GEN-LAST:event_btnQuiteActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        new EmployeeTableFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        // TODO add your handling code here:
        new AddProductFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddProductActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmBack;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnOrders;
    private javax.swing.JButton btnQuite;
    private javax.swing.JButton btnViewPoint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
