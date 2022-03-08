package dmart;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtflUserPWD = new javax.swing.JPasswordField();
        jtfUserID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnManageLogin = new javax.swing.JButton();
        btnEmployeeLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnQuit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnNight = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jtfUserID.setText("1");
        jtfUserID.setToolTipText("");
        jtfUserID.setAlignmentX(2.0F);
        jtfUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUserIDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setText("Enter User Id                   >>");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel2.setText("Enter User Possword    >>");

        btnManageLogin.setBackground(new java.awt.Color(0, 153, 102));
        btnManageLogin.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnManageLogin.setForeground(new java.awt.Color(226, 226, 226));
        btnManageLogin.setText("Manager Login");
        btnManageLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageLoginActionPerformed(evt);
            }
        });

        btnEmployeeLogin.setBackground(new java.awt.Color(0, 153, 102));
        btnEmployeeLogin.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnEmployeeLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployeeLogin.setText("Employee Login");
        btnEmployeeLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeLoginActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shope2.png"))); // NOI18N
        jLabel3.setText("GroceryMart®");

        btnQuit.setBackground(new java.awt.Color(0, 153, 102));
        btnQuit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(226, 226, 226));
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("Login to");

        btnNight.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNight.setText("Theme");
        btnNight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jtfUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jtflUserPWD, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnEmployeeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnManageLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel4)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNight))))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNight))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtflUserPWD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmployeeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageLoginActionPerformed
        if (isValid()) {
            Statement st = ConnectionProvider.getStatement();
            int eid = Integer.parseInt(jtfUserID.getText());
            String pass = new String(jtflUserPWD.getPassword());
            boolean founded = false;
            try {
                ResultSet rs = st.executeQuery("select * from manager where eid=" + eid + " and password='" + pass + "'");
                if (rs != null) {
                    while (rs.next()) {
                        int id = rs.getInt(1);
                        String fullName = rs.getString(2) + "  " + rs.getString(3);
                        JOptionPane.showMessageDialog(this, "Manager Id " + id + "\nName " + fullName);
                        founded = true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (founded) {
                new ManagerFrame().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Your or password is wrong");
            }

        } else {
            jtfUserID.setText("");
            jtflUserPWD.setText("");
            JOptionPane.showMessageDialog(this, "Please Enter user id and password perfectly","Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnManageLoginActionPerformed

    private void btnEmployeeLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeLoginActionPerformed
        if (isValid()) {
            Statement st = ConnectionProvider.getStatement();
            int eid = Integer.parseInt(jtfUserID.getText());
            String pass = new String(jtflUserPWD.getPassword());
            boolean founded = false;
            try {
                ResultSet rs = st.executeQuery("select * from employee where eid=" + eid + " and password='" + pass + "'");
                if (rs != null) {
                    while (rs.next()) {
                        int id = rs.getInt(1);
                        String fullName = rs.getString(2) + "  " + rs.getString(3);
                        JOptionPane.showMessageDialog(this, "Employee Id " + id + "\nName " + fullName);
                        founded = true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (founded) {
                dispose();
                new Pruduct().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Your or password is wrong");
            }

        } else {
            jtfUserID.setText("");
            jtflUserPWD.setText("");
            JOptionPane.showMessageDialog(this, "Please Enter user id and password perfectly","Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEmployeeLoginActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        dispose();
    }//GEN-LAST:event_btnQuitActionPerformed
    int day = 0;
    private void btnNightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNightActionPerformed
        try {
            if (day == 0) {
                btnNight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/day.png")));
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                btnNight.setText("");
                day = 1;
            } else if (day == 1) {
                btnNight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/night.png")));
                UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
                btnNight.setText("");
                day = 0;
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnNightActionPerformed

    private void jtfUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUserIDActionPerformed
    public boolean isValid() {
        try {
            if ( jtfUserID.getText().isBlank()) {
                return false;
            } else{
                try {
                    Integer.parseInt(jtfUserID.getText());
                } catch (Exception e) {
                    return false;
                }
            }if (new String(jtflUserPWD.getPassword()).isEmpty() || new String(jtflUserPWD.getPassword()).isBlank()) {
                return false;
            }
        } catch (Exception e) {
        }
        return true;
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmployeeLogin;
    private javax.swing.JButton btnManageLogin;
    private javax.swing.JButton btnNight;
    private javax.swing.JButton btnQuit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtfUserID;
    private javax.swing.JPasswordField jtflUserPWD;
    // End of variables declaration//GEN-END:variables
}
