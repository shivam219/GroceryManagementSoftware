package dmart;

import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class EmployeeTableFrame extends javax.swing.JFrame {
    Statement st = ConnectionProvider.getStatement();
    public EmployeeTableFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setData();
    }

    public void setData() {
        try {
            jtableEmp.setModel(DbUtils.resultSetToTableModel(ConnectionProvider.getStatement().executeQuery("select * from employee")));
            DefaultTableModel model = (DefaultTableModel) jtableEmp.getModel();
            model.setColumnIdentifiers(new String[]{"Employee ID", "First Name", "Last Name ", "Phone", "Password"});
        } catch (Exception e) {
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRemoveEmp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableEmp = new javax.swing.JTable();
        btnAddEmp = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        btnRemoveEmp.setBackground(new java.awt.Color(0, 153, 102));
        btnRemoveEmp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRemoveEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveEmp.setText("Remove Employee");
        btnRemoveEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEmpActionPerformed(evt);
            }
        });

        jtableEmp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtableEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "EmployeeId", "FirstName", "LastName", "Phone No", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtableEmp);
        if (jtableEmp.getColumnModel().getColumnCount() > 0) {
            jtableEmp.getColumnModel().getColumn(0).setResizable(false);
            jtableEmp.getColumnModel().getColumn(1).setResizable(false);
            jtableEmp.getColumnModel().getColumn(2).setResizable(false);
        }

        btnAddEmp.setBackground(new java.awt.Color(0, 153, 102));
        btnAddEmp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmp.setText("Add Employee");
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 153, 102));
        btnBack.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Employee Management Table");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shope2.png"))); // NOI18N
        jLabel2.setText("GroceryMart®");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnRemoveEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnRemoveEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEmpActionPerformed

        String sid = JOptionPane.showInputDialog(this, "Enter Employee ID");
        int i = -1;
        if (sid != null && !sid.isEmpty() && !sid.isBlank()) {
            try {
                int id = Integer.parseInt(sid);
                i = st.executeUpdate("delete from employee where eid =" + id);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please Enter Id in number");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error with database");
            }
            if (i == 0) {
                JOptionPane.showMessageDialog(this, "Employee is not availble");
            }
            if (i == 1) {
                JOptionPane.showMessageDialog(this, "Employee Deleted Successfully");
                setData();
            }
        }
    }//GEN-LAST:event_btnRemoveEmpActionPerformed
    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
        new AddEmployeeFram().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddEmpActionPerformed
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new ManagerFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemoveEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableEmp;
    // End of variables declaration//GEN-END:variables
}
