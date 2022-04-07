package dmart;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Pruduct extends javax.swing.JFrame {

    Statement st = ConnectionProvider.getStatement();
    ResultSet rs = null;
    DefaultTableModel billTableModel;
    LinkedHashMap<Integer, Integer> mapQty = new LinkedHashMap<>();//id and atuall available unit
    int TotalPriceOfQuantity = 0, TotalCountOfQuantity = 0, OrderID = 0;
    boolean isEnterDataToBillTable = false;

    public Pruduct() {
        initComponents();
        setLocationRelativeTo(null);
        billTableModel = (DefaultTableModel) jtablebiliing.getModel();
        setDataToVegitable();//fetch and set vegitable data to main table
        getOrderId();// generate order new Order Id
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuy = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlblTotalAmt = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jtfEnterQTYVegitable = new javax.swing.JTextField();
        jtfEnterIdVegitable = new javax.swing.JTextField();
        labelPId = new javax.swing.JLabel();
        btnVegitableAddToCart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableVegitable = new javax.swing.JTable();
        btnRefresh1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtablebiliing = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btnBuy.setBackground(new java.awt.Color(0, 153, 102));
        btnBuy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuy.setForeground(new java.awt.Color(255, 255, 255));
        btnBuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rupees.png"))); // NOI18N
        btnBuy.setText("Buy");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(0, 153, 102));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Billing section");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 102));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shope2.png"))); // NOI18N
        jLabel7.setText("GroceryMart®");

        jlblTotalAmt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblTotalAmt.setText("Totol amount >>");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Enter Quantity >>");

        jtfEnterIdVegitable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEnterIdVegitableActionPerformed(evt);
            }
        });

        labelPId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelPId.setText("Enter product ID >>");

        btnVegitableAddToCart.setBackground(new java.awt.Color(0, 153, 102));
        btnVegitableAddToCart.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVegitableAddToCart.setForeground(new java.awt.Color(255, 255, 255));
        btnVegitableAddToCart.setText("Add to cart");
        btnVegitableAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVegitableAddToCartActionPerformed(evt);
            }
        });

        jtableVegitable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Pack", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtableVegitable);

        btnRefresh1.setBackground(new java.awt.Color(0, 153, 102));
        btnRefresh1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRefresh1.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh1.setText("Back");
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRefresh1)
                        .addGap(18, 18, 18)
                        .addComponent(labelPId, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfEnterIdVegitable, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfEnterQTYVegitable, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVegitableAddToCart)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPId)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jtfEnterQTYVegitable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfEnterIdVegitable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVegitableAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Products list", jPanel3);

        jtablebiliing.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P ID", "Name", "Pack", "QTY", "Price", "Sub Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtablebiliing);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblTotalAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblTotalAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void getOrderId() {
        try {
            rs = st.executeQuery("select * from OrderHistory");//order ID for order history table
            if (rs != null) {
                while (rs.next()) {
                    OrderID = rs.getInt(1) + 1;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setDataToVegitable() {
        try {
            jtableVegitable.setModel(DbUtils.resultSetToTableModel(st.executeQuery("select * from gvegetable where quantity > 0")));
            DefaultTableModel model = (DefaultTableModel) jtableVegitable.getModel();
            model.setColumnIdentifiers(new String[]{"Product ID", "Name", "Pack", "Quantity", "Price"});
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error to fetch data from database to table");
        }
    }
    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRefresh1ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        billTableModel.setRowCount(0);//remove all rows from bill table
        TotalCountOfQuantity = 0;
        TotalPriceOfQuantity = 0;
        mapQty.clear();
        setDataToVegitable();
        jlblTotalAmt.setText("Totol amount >> ");
        isEnterDataToBillTable = false;
    }//GEN-LAST:event_btnRefreshActionPerformed
    private void btnVegitableAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVegitableAddToCartActionPerformed
        if (!jtfEnterIdVegitable.getText().isBlank() && !jtfEnterQTYVegitable.getText().isBlank()) {
            boolean pidFound = false;
            DefaultTableModel model = (DefaultTableModel) jtableVegitable.getModel();
            try {
                int jtfid = Integer.parseInt(jtfEnterIdVegitable.getText());
                int jtfQty = Integer.parseInt(jtfEnterQTYVegitable.getText());
                for (int i = 0; i < model.getRowCount(); i++) {
                    if (Integer.parseInt(model.getValueAt(i, 0).toString()) == jtfid) {
                        int tQty = Integer.parseInt(model.getValueAt(i, 3).toString());
                        pidFound = true;
                        if (tQty >= jtfQty) {
                            model.setValueAt(tQty - jtfQty, i, 3);
                            mapQty.put(jtfid, tQty - jtfQty);
                            String pname = model.getValueAt(i, 1).toString();
                            String pack = model.getValueAt(i, 2).toString();
                            int price = Integer.parseInt(model.getValueAt(i, 4).toString());
                            int totalPrice = jtfQty * price;
                            boolean isAllReady = false;
                            for (int j = 0; j < billTableModel.getRowCount(); j++) {
                                if (billTableModel.getValueAt(j, 0).toString().equals(jtfid + "")) {
                                    int Quantity = Integer.parseInt(billTableModel.getValueAt(j, 3).toString()) + jtfQty;
                                    billTableModel.setValueAt(Quantity, j, 3);
                                    billTableModel.setValueAt(price * Quantity, j, 5);
                                    TotalPriceOfQuantity = TotalPriceOfQuantity + (price * jtfQty);
                                    TotalCountOfQuantity = TotalCountOfQuantity + jtfQty;
                                    isAllReady = true;
                                    isEnterDataToBillTable = true;
                                    break;/* order id founded in billing table break the loop */
                                }
                            }
                            if (!isAllReady) {
                                billTableModel.addRow(new String[]{jtfid + "", pname, pack, jtfQty + "", price + "", totalPrice + ""});
                                TotalPriceOfQuantity = TotalPriceOfQuantity + totalPrice;
                                TotalCountOfQuantity = TotalCountOfQuantity + jtfQty;
                                isEnterDataToBillTable = true;
                            }
                            jlblTotalAmt.setText("Totol amount >> " + TotalPriceOfQuantity);

                        } else {
                            JOptionPane.showMessageDialog(this, "insufficient Quantity");
                        }
                        break;/*order id founded main then break the loop */
                    }
                }
                if (!pidFound) {
                    JOptionPane.showMessageDialog(this, "Product Id not founded");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Enter Valid data");
                jtfEnterQTYVegitable.setText("");
                jtfEnterIdVegitable.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Insert data in Both");
        }
    }//GEN-LAST:event_btnVegitableAddToCartActionPerformed
    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        if (isEnterDataToBillTable) {
            String amt = JOptionPane.showInputDialog(this, "Enter Amount  " + TotalPriceOfQuantity, "Grossery-Mart Billing", JOptionPane.INFORMATION_MESSAGE);
            if (amt != null && !amt.isBlank()) {
                try {
                    int amount = Integer.parseInt(amt);
                    if (amount > TotalPriceOfQuantity) {
                        JOptionPane.showMessageDialog(this, "Payment Done\nReturn " + (amount - TotalPriceOfQuantity), "Successful", JOptionPane.PLAIN_MESSAGE);
                        new OrderPlace(jtablebiliing, TotalPriceOfQuantity, OrderID, TotalCountOfQuantity, mapQty).setVisible(true);
                        dispose();
                    } else if (amount < TotalPriceOfQuantity) {
                        JOptionPane.showMessageDialog(this, "Payment failed", "Failed", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Payment Done", "Successful", JOptionPane.PLAIN_MESSAGE);
                        new OrderPlace(jtablebiliing, TotalPriceOfQuantity, OrderID, TotalCountOfQuantity, mapQty).setVisible(true);
                        dispose();
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Please Enter Only Digit", "Warring", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please first Add items to billing table");
        }

    }//GEN-LAST:event_btnBuyActionPerformed

    private void jtfEnterIdVegitableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEnterIdVegitableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEnterIdVegitableActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JButton btnVegitableAddToCart;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jlblTotalAmt;
    private javax.swing.JTable jtableVegitable;
    private javax.swing.JTable jtablebiliing;
    private javax.swing.JTextField jtfEnterIdVegitable;
    private javax.swing.JTextField jtfEnterQTYVegitable;
    private javax.swing.JLabel labelPId;
    // End of variables declaration//GEN-END:variables
}
