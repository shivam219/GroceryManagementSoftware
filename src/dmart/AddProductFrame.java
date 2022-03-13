package dmart;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class AddProductFrame extends javax.swing.JFrame {

    Statement st = ConnectionProvider.getStatement();
    ResultSet rs = null;
    boolean foundedId1 = false, foundedId2 = false;
    int SelectID1 = 0, SelectID2 = 0;

    public AddProductFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setId();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jtfProductID1 = new javax.swing.JTextField();
        btnShowData1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jlblProductID1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jlblShowProductName1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jlblShowProductPack1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlblShowProductPrice1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jlblShowProductTotalUnit1 = new javax.swing.JLabel();
        btnremove = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlblNewProductID1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtfNewProductName1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtfNewProductPack1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtfNewProductPrice1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jtfNewProductUnit1 = new javax.swing.JTextField();
        btnAddproduct1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jtfProductID2 = new javax.swing.JTextField();
        btnShowData2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jlblProductID2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jlblShowProductName2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jlblShowProductPack2 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jlblShowProductPrice2 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jlblShowProductTotalUnit2 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        jtfInPTotalUnit = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jtfInPName = new javax.swing.JTextField();
        jtfInPPack = new javax.swing.JTextField();
        jtfInPPrice = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Add Product table");

        jButton1.setBackground(new java.awt.Color(0, 153, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shope2.png"))); // NOI18N
        jLabel5.setText("GroceryMart®");

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 102)));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 450));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Enter product ID ");

        jtfProductID1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnShowData1.setBackground(new java.awt.Color(0, 153, 102));
        btnShowData1.setForeground(new java.awt.Color(255, 255, 255));
        btnShowData1.setText("Show Data");
        btnShowData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowData1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("product Description");

        jlblProductID1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblProductID1.setText("Product ID :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Product name is");

        jlblShowProductName1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblShowProductName1.setText("______________");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText(">>");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Product pack is");

        jlblShowProductPack1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblShowProductPack1.setText("______________");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText(">>");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Product price is");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText(">>");

        jlblShowProductPrice1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblShowProductPrice1.setText("______________");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Product total unit is");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText(">>");

        jlblShowProductTotalUnit1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblShowProductTotalUnit1.setText("______________");

        btnremove.setBackground(new java.awt.Color(0, 153, 102));
        btnremove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnremove.setForeground(new java.awt.Color(245, 250, 250));
        btnremove.setText("Remove product");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(btnShowData1)
                    .addComponent(jtfProductID1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblProductID1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(jlblShowProductName1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(jlblShowProductPack1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20)
                        .addComponent(jlblShowProductPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnremove)
                            .addComponent(jlblShowProductTotalUnit1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfProductID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnShowData1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblProductID1)
                .addGap(5, 5, 5)
                .addComponent(jLabel13)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jlblShowProductName1))
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jlblShowProductPack1))
                .addGap(10, 10, 10)
                .addComponent(jLabel15)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jlblShowProductPrice1))
                .addComponent(jLabel17)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jlblShowProductTotalUnit1))
                .addGap(18, 18, 18)
                .addComponent(btnremove)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 102)));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 450));

        jlblNewProductID1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblNewProductID1.setText("New Product ID : ");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Enter product name ");

        jtfNewProductName1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Enter product pack");

        jtfNewProductPack1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Enter product price");

        jtfNewProductPrice1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setText("Enter total product unit ");

        jtfNewProductUnit1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnAddproduct1.setBackground(new java.awt.Color(0, 153, 102));
        btnAddproduct1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddproduct1.setForeground(new java.awt.Color(245, 250, 250));
        btnAddproduct1.setText("Add Product");
        btnAddproduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddproduct1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddproduct1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblNewProductID1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(jtfNewProductName1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfNewProductPack1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)
                        .addComponent(jtfNewProductPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel41)
                        .addComponent(jtfNewProductUnit1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jlblNewProductID1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jtfNewProductName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel16)
                .addGap(12, 12, 12)
                .addComponent(jtfNewProductPack1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNewProductPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addComponent(jtfNewProductUnit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddproduct1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 102)));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 450));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("Enter product ID ");

        jtfProductID2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnShowData2.setBackground(new java.awt.Color(0, 153, 102));
        btnShowData2.setForeground(new java.awt.Color(255, 255, 255));
        btnShowData2.setText("Show Data");
        btnShowData2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowData2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("product Description");

        jlblProductID2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblProductID2.setText("Product ID :");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Product name is");

        jlblShowProductName2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblShowProductName2.setText("______________");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText(">>");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Product pack is");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText(">>");

        jlblShowProductPack2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblShowProductPack2.setText("______________");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Product price is");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText(">>");

        jlblShowProductPrice2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblShowProductPrice2.setText("______________");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Product total unit is");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText(">>");

        jlblShowProductTotalUnit2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblShowProductTotalUnit2.setText("______________");

        btnupdate.setBackground(new java.awt.Color(0, 153, 102));
        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(245, 250, 250));
        btnupdate.setText("Update product");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jtfInPTotalUnit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfInPTotalUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfInPTotalUnitActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setText("Fill new producat data");

        jtfInPName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfInPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfInPNameActionPerformed(evt);
            }
        });

        jtfInPPack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfInPPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText(">>");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setText(">>");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText(">>");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setText(">>");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnShowData2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel29)
                                            .addGap(20, 20, 20)
                                            .addComponent(jlblShowProductPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnupdate)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel32)
                                            .addGap(20, 20, 20)
                                            .addComponent(jlblShowProductTotalUnit2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jlblProductID2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21)
                                        .addComponent(jtfProductID2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(20, 20, 20)
                                .addComponent(jlblShowProductPack2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(20, 20, 20)
                                .addComponent(jlblShowProductName2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(20, 20, 20)
                        .addComponent(jtfInPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(jtfInPName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel35))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfInPTotalUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfInPPack, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jtfProductID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnShowData2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlblProductID2)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel39)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel36)
                                            .addComponent(jtfInPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel37))
                                            .addComponent(jtfInPPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel38)
                                            .addComponent(jtfInPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25)
                                            .addComponent(jlblShowProductName2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(jlblShowProductPack2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel29)
                                            .addComponent(jlblShowProductPrice2))
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel31)
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel32)
                                            .addComponent(jlblShowProductTotalUnit2))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnupdate))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel35)
                                .addGap(18, 18, 18)
                                .addComponent(jtfInPTotalUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(457, 457, 457)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setId() {
        try {
            rs = st.executeQuery("select * from gvegetable order by pid desc limit 1");
            if (rs != null) {
                while (rs.next()) {
                    int pid = rs.getInt(1) + 1;
                    jlblNewProductID1.setText("New Product ID :  " + pid);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ManagerFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    boolean isUpateName = false;
    boolean isUpatePack = false;
    boolean isUpatePrice = false;
    boolean isUpateUnit = false;

    public void isValidInput() {
        if (!jtfInPName.getText().isBlank()) {
            if (!jtfInPName.getText().toLowerCase().equals(jlblShowProductName2.getText().toLowerCase().trim())) {
                isUpateName = true;
            } else {
                JOptionPane.showMessageDialog(this, "Product name should be different");
            }
        }
        if (!jtfInPPack.getText().isBlank()) {
            if (!jtfInPPack.getText().toLowerCase().equals(jlblShowProductPack2.getText().toLowerCase().trim())) {
                isUpatePack = true;
            } else {
                JOptionPane.showMessageDialog(this, "Product pack should be different");
            }
        }
        if ( !jtfInPPrice.getText().isBlank()) {
            try {
                if (jlblShowProductPrice2.getText().equals(jtfInPPrice.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "Product Price should be different");
                    return; //below try line will not execute
                }
                int price = Integer.parseInt(jtfInPPrice.getText().trim());
                if (price < 1) {
                    JOptionPane.showMessageDialog(this, "please price More then 0");
                } else {
                    isUpatePrice = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Enter price In Digit");
            }
        }
        if (!jtfInPTotalUnit.getText().isBlank()) {
            try {
                if (jlblShowProductTotalUnit2.getText().equals(jtfInPTotalUnit.getText())) {
                    JOptionPane.showMessageDialog(this, "Product Unit should be different");
                    return; // below line will not execute 
                }
                int unit = Integer.parseInt(jtfInPTotalUnit.getText().trim());
                if (unit < 1) {
                    JOptionPane.showMessageDialog(this, "please Unit More then 0");
                } else {
                    isUpateUnit = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Enter Unit In Digit");
            }
        }
    }
    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        if (foundedId2) {
            isValidInput();
            try {
                boolean isUpdated = false;
                if (isUpateName) {
                    String pname = jtfInPName.getText().trim();
                    st.executeUpdate("update Gvegetable set pname= '" + pname + "'  where pid = " + SelectID2 + "");
                    jlblShowProductName2.setText(pname);
                    isUpdated = true;
                }
                if (isUpatePack) {
                    String pack = jtfInPPack.getText().trim();
                    st.executeUpdate("update Gvegetable set pack= '" + pack + "'  where pid = " + SelectID2 + "");
                    jlblShowProductPack2.setText(pack);
                    isUpdated = true;
                }
                if (isUpatePrice) {
                    int price = Integer.parseInt(jtfInPPrice.getText().trim());
                    st.executeUpdate("update Gvegetable set price= " + price + " where pid = " + SelectID2 + "");
                    jlblShowProductPrice2.setText(price + "");
                    isUpdated = true;
                }
                if (isUpateUnit) {
                    int unit = Integer.parseInt(jtfInPTotalUnit.getText().trim());
                    st.executeUpdate("update Gvegetable set quantity= " + unit + " where pid = " + SelectID2 + "");
                    jlblShowProductTotalUnit2.setText(unit + "");
                    isUpdated = true;
                }
                if (isUpdated) {
                    JOptionPane.showMessageDialog(this, "Product Updated Successfully");
                } else {
                    JOptionPane.showMessageDialog(this, "Please Fill Data Properly !!!");
                }
                isUpateName = false;
                isUpatePack = false;
                isUpatePrice = false;
                isUpateUnit = false;
                jtfInPName.setText("");
                jtfInPPack.setText("");
                jtfInPPrice.setText("");
                jtfInPTotalUnit.setText("");

            } catch (NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(this, "Error while updating");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Check the data is availble", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnupdateActionPerformed
    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        if (foundedId1) {
            try {
                st.executeUpdate("delete from Gvegetable where pid = " + SelectID1 + "");
                foundedId1 = false;
                jlblProductID1.setText("Product ID : ");
                jlblShowProductName1.setText("");
                jlblShowProductPack1.setText("");
                jlblShowProductPrice1.setText("");
                jlblShowProductTotalUnit1.setText("");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error with DataBase");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Check the data is availble", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnremoveActionPerformed
    private void btnShowData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowData1ActionPerformed
        if (!jtfProductID1.getText().isBlank()) {
            try {
                int pid = Integer.parseInt(jtfProductID1.getText());
                foundedId1 = false;
                rs = st.executeQuery("select * from Gvegetable where pid = " + pid + "");
                if (rs != null) {
                    while (rs.next()) {
                        SelectID1 = pid;
                        foundedId1 = true;
                        jlblProductID1.setText("Product ID : " + SelectID1);
                        jlblShowProductName1.setText(rs.getString(2));
                        jlblShowProductPack1.setText(rs.getString(3));
                        jlblShowProductPrice1.setText(rs.getInt(4) + "");
                        jlblShowProductTotalUnit1.setText(rs.getInt(5) + "");
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please Enter Number Only", "Error", JOptionPane.WARNING_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error with DataBase");
                e.printStackTrace();
            }
            if (!foundedId1) {
                JOptionPane.showMessageDialog(this, "Product ID Not available");
                refresh1();
            }
        }
    }//GEN-LAST:event_btnShowData1ActionPerformed

    public void refresh1() {
        jlblProductID1.setText("");
        jlblShowProductName1.setText("");
        jlblShowProductPack1.setText("");
        jlblShowProductPrice1.setText("");
        jlblShowProductTotalUnit1.setText("");
        jlblProductID1.setText("Product ID : ");
    }
    private void btnShowData2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowData2ActionPerformed
        if (!jtfProductID2.getText().isBlank()) {
            try {
                int pid = Integer.parseInt(jtfProductID2.getText().trim());
                foundedId2 = false;
                rs = st.executeQuery("select * from Gvegetable where pid = " + pid + "");
                if (rs != null) {
                    while (rs.next()) {
                        SelectID2 = pid;
                        foundedId2 = true;
                        jlblProductID2.setText("Product ID : " + SelectID2);
                        jlblShowProductName2.setText(rs.getString(2));
                        jlblShowProductPack2.setText(rs.getString(3));
                        jlblShowProductTotalUnit2.setText(rs.getInt(4) + "");
                        jlblShowProductPrice2.setText(rs.getInt(5) + "");
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please Enter Number Only", "Error", JOptionPane.WARNING_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error with DataBase");
                e.printStackTrace();
            }
            if (!foundedId2) {
                JOptionPane.showMessageDialog(this, "Product ID Not available");
                refresh2();
            }
        }
    }//GEN-LAST:event_btnShowData2ActionPerformed
    public void refresh2() {
        jlblProductID2.setText("");
        jlblShowProductName2.setText("");
        jlblShowProductPack2.setText("");
        jlblShowProductPrice2.setText("");
        jlblShowProductTotalUnit2.setText("");
        jlblProductID2.setText("Product ID : ");
    }
    private void btnAddproduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddproduct1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddproduct1ActionPerformed

    private void jtfInPTotalUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfInPTotalUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfInPTotalUnitActionPerformed

    private void jtfInPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfInPNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfInPNameActionPerformed

    public boolean checkNewProductDataIsValid() {
        if (jtfNewProductName1.getText().isBlank()) {
            return false;
        }
        if (jtfNewProductPack1.getText().isBlank()) {
            return false;
        }

        if (jtfNewProductPrice1.getText().isBlank()) {
            return false;
        } else {
            try {
                Integer.parseInt(jtfNewProductPrice1.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please Enter Only digt In price");
                return false;
            }
        }
        if (jtfNewProductUnit1.getText().isBlank()) {
            return false;
        } else {
            try {
                Integer.parseInt(jtfNewProductUnit1.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please Enter Only digt In Unit");
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProductFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddproduct1;
    private javax.swing.JButton btnShowData1;
    private javax.swing.JButton btnShowData2;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlblNewProductID1;
    private javax.swing.JLabel jlblProductID1;
    private javax.swing.JLabel jlblProductID2;
    private javax.swing.JLabel jlblShowProductName1;
    private javax.swing.JLabel jlblShowProductName2;
    private javax.swing.JLabel jlblShowProductPack1;
    private javax.swing.JLabel jlblShowProductPack2;
    private javax.swing.JLabel jlblShowProductPrice1;
    private javax.swing.JLabel jlblShowProductPrice2;
    private javax.swing.JLabel jlblShowProductTotalUnit1;
    private javax.swing.JLabel jlblShowProductTotalUnit2;
    private javax.swing.JTextField jtfInPName;
    private javax.swing.JTextField jtfInPPack;
    private javax.swing.JTextField jtfInPPrice;
    private javax.swing.JTextField jtfInPTotalUnit;
    private javax.swing.JTextField jtfNewProductName1;
    private javax.swing.JTextField jtfNewProductPack1;
    private javax.swing.JTextField jtfNewProductPrice1;
    private javax.swing.JTextField jtfNewProductUnit1;
    private javax.swing.JTextField jtfProductID1;
    private javax.swing.JTextField jtfProductID2;
    // End of variables declaration//GEN-END:variables
}
