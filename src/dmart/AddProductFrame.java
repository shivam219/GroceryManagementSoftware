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
        btnupdate = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        btnAddproduct = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtfNewProductName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfNewProductPack = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfNewProductPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfProductID1 = new javax.swing.JTextField();
        jlblShowProductName1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlblShowProductPack1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlblShowProductPrice1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jlblShowProductTotalUnit1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jtfProductID2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jlblShowProductName2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jlblShowProductPack2 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jlblShowProductPrice2 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jlblShowProductTotalUnit2 = new javax.swing.JLabel();
        jlblProductID1 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jtfInPName = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jtfInPPack = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jtfInPPrice = new javax.swing.JTextField();
        jtfInPTotalUnit = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jtfNewProductUnit = new javax.swing.JTextField();
        jlblNewProductID = new javax.swing.JLabel();
        jlblProductID2 = new javax.swing.JLabel();
        btnShowData1 = new javax.swing.JButton();
        btnShowData2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

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

        btnupdate.setBackground(new java.awt.Color(0, 153, 102));
        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(245, 250, 250));
        btnupdate.setText("Update product");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnremove.setBackground(new java.awt.Color(0, 153, 102));
        btnremove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnremove.setForeground(new java.awt.Color(245, 250, 250));
        btnremove.setText("Remove product");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        btnAddproduct.setBackground(new java.awt.Color(0, 153, 102));
        btnAddproduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddproduct.setForeground(new java.awt.Color(245, 250, 250));
        btnAddproduct.setText("Add Product");
        btnAddproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddproductActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Enter product name ");

        jtfNewProductName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Enter product pack");

        jtfNewProductPack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Enter product price");

        jtfNewProductPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Enter product ID ");

        jtfProductID1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jlblShowProductName1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblShowProductName1.setText("---------------");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText(">>");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Product pack is");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Product name is");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText(">>");

        jlblShowProductPack1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblShowProductPack1.setText("---------------");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Product price is");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText(">>");

        jlblShowProductPrice1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblShowProductPrice1.setText("---------------");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Product total unit is");

        jlblShowProductTotalUnit1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblShowProductTotalUnit1.setText("---------------");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText(">>");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("Enter product ID ");

        jtfProductID2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Product name is");

        jlblShowProductName2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblShowProductName2.setText("---------------");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setText("Product pack is");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText(">>");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText(">>");

        jlblShowProductPack2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblShowProductPack2.setText("---------------");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setText("Product price is");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText(">>");

        jlblShowProductPrice2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblShowProductPrice2.setText("---------------");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setText("Product total unit is");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText(">>");

        jlblShowProductTotalUnit2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblShowProductTotalUnit2.setText("---------------");

        jlblProductID1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblProductID1.setText("Product ID :");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setText("Fill new producat data");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText(">>");

        jtfInPName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText(">>");

        jtfInPPack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setText(">>");

        jtfInPPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfInPTotalUnit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setText(">>");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setText("Enter total product unit ");

        jtfNewProductUnit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jlblNewProductID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblNewProductID.setText("New Product ID : ");

        jlblProductID2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblProductID2.setText("Product ID :");

        btnShowData1.setBackground(new java.awt.Color(0, 153, 102));
        btnShowData1.setForeground(new java.awt.Color(255, 255, 255));
        btnShowData1.setText("Show Data");
        btnShowData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowData1ActionPerformed(evt);
            }
        });

        btnShowData2.setBackground(new java.awt.Color(0, 153, 102));
        btnShowData2.setForeground(new java.awt.Color(255, 255, 255));
        btnShowData2.setText("Show Data");
        btnShowData2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowData2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shope2.png"))); // NOI18N
        jLabel5.setText("GroceryMart®");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("product Data");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("product Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblNewProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jtfNewProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jtfNewProductPack, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jtfNewProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40)
                            .addComponent(jtfNewProductUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(btnAddproduct))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(btnShowData1)
                            .addComponent(jtfProductID1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblProductID1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20)
                                .addComponent(jlblShowProductName1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(20, 20, 20)
                                .addComponent(jlblShowProductPack1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(20, 20, 20)
                                .addComponent(jlblShowProductPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnremove)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(20, 20, 20)
                                .addComponent(jlblShowProductTotalUnit1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jtfProductID2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(20, 20, 20)
                                        .addComponent(jlblShowProductName2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(20, 20, 20)
                                        .addComponent(jlblShowProductPack2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addGap(20, 20, 20)
                                        .addComponent(jlblShowProductPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblProductID2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnupdate)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addGap(20, 20, 20)
                                        .addComponent(jlblShowProductTotalUnit2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11)
                                    .addComponent(btnShowData2))
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(20, 20, 20)
                                .addComponent(jtfInPName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(20, 20, 20)
                                .addComponent(jtfInPPack, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel35)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(20, 20, 20)
                                .addComponent(jtfInPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addGap(20, 20, 20)
                                .addComponent(jtfInPTotalUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jlblNewProductID)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5)
                        .addComponent(jtfNewProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7)
                        .addGap(15, 15, 15)
                        .addComponent(jtfNewProductPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8)
                        .addGap(5, 5, 5)
                        .addComponent(jtfNewProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel40)
                        .addGap(25, 25, 25)
                        .addComponent(jtfNewProductUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jtfInPTotalUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addGap(18, 18, 18)
                            .addComponent(jtfProductID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addComponent(jLabel35)
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel36)
                                        .addComponent(jtfInPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel37))
                                        .addComponent(jtfInPPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel38)
                                        .addComponent(jtfInPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnShowData2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jlblProductID2)
                                    .addGap(5, 5, 5)
                                    .addComponent(jLabel22)
                                    .addGap(5, 5, 5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel25)
                                        .addComponent(jlblShowProductName2))
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel26)
                                        .addComponent(jlblShowProductPack2))
                                    .addComponent(jLabel28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel29)
                                        .addComponent(jlblShowProductPrice2))
                                    .addGap(0, 0, 0)
                                    .addComponent(jLabel31)
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel32)
                                        .addComponent(jlblShowProductTotalUnit2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnupdate))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(6, 6, 6)
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jlblShowProductName1))
                            .addGap(10, 10, 10)
                            .addComponent(jLabel12)
                            .addGap(5, 5, 5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jlblShowProductPack1))
                            .addGap(10, 10, 10)
                            .addComponent(jLabel15)
                            .addGap(5, 5, 5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jlblShowProductPrice1))
                            .addComponent(jLabel17)
                            .addGap(5, 5, 5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19)
                                .addComponent(jlblShowProductTotalUnit1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnremove)
                                .addComponent(btnAddproduct)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setId() {
        try {
            rs = st.executeQuery("select * from gvegetable order by pid desc limit 1");
            if (rs != null) {
                while (rs.next()) {
                    int pid = rs.getInt(1) + 1;
                    jlblNewProductID.setText("New Product ID :  " + pid);

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
    private void btnAddproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddproductActionPerformed
        if (checkNewProductDataIsValid()) {
            boolean isAlreadyProduct = false;
            try {
                String pname = jtfNewProductName.getText();
                rs = st.executeQuery("select * from Gvegetable where pname = '" + pname + "'");
                if (rs != null) {
                    while (rs.next()) {
                        isAlreadyProduct = true;
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error with database");
                e.printStackTrace();
            }
            if (!isAlreadyProduct) {
                try {
                    String pname = jtfNewProductName.getText();
                    String pack = jtfNewProductPack.getText();
                    int unit = Integer.parseInt(jtfNewProductUnit.getText());
                    int price = Integer.parseInt(jtfNewProductPrice.getText());
                    st.executeUpdate("insert into Gvegetable (pname,pack,quantity,price) values ('" + pname + "'  , '" + pack + "'  ,  " + unit + " ," + price + ")");
                    JOptionPane.showMessageDialog(this, "Book inserted successfully");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error with database");
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Book is Already Exits");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Insert valid data","Error", JOptionPane.WARNING_MESSAGE);
            jtfNewProductName.setText("");
            jtfNewProductPack.setText("");
            jtfNewProductPrice.setText("");
            jtfNewProductUnit.setText("");
        }
    }//GEN-LAST:event_btnAddproductActionPerformed

    public boolean checkNewProductDataIsValid() {
        if (jtfNewProductName.getText().isBlank()) {
            return false;
        }
        if (jtfNewProductPack.getText().isBlank()) {
            return false;
        }

        if (jtfNewProductPrice.getText().isBlank()) {
            return false;
        } else {
            try {
                Integer.parseInt(jtfNewProductPrice.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please Enter Only digt In price");
                return false;
            }
        }
        if (jtfNewProductUnit.getText().isBlank()) {
            return false;
        } else {
            try {
                Integer.parseInt(jtfNewProductUnit.getText());
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
    private javax.swing.JButton btnAddproduct;
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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlblNewProductID;
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
    private javax.swing.JTextField jtfNewProductName;
    private javax.swing.JTextField jtfNewProductPack;
    private javax.swing.JTextField jtfNewProductPrice;
    private javax.swing.JTextField jtfNewProductUnit;
    private javax.swing.JTextField jtfProductID1;
    private javax.swing.JTextField jtfProductID2;
    // End of variables declaration//GEN-END:variables
}
