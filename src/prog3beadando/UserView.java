package prog3beadando;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public class UserView extends javax.swing.JFrame {

    public UserView() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAdd = new javax.swing.JButton();
<<<<<<< HEAD
<<<<<<< HEAD
        jButtonEdit = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
=======
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
>>>>>>> parent of 21ef467 ()
=======
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
>>>>>>> parent of 21ef467 ()
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
<<<<<<< HEAD
<<<<<<< HEAD
=======
        jButtonAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\kszab\\Downloads\\button\\add.png")); // NOI18N
>>>>>>> parent of 21ef467 ()
=======
        jButtonAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\kszab\\Downloads\\button\\add.png")); // NOI18N
>>>>>>> parent of 21ef467 ()
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

<<<<<<< HEAD
<<<<<<< HEAD
        jButtonEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonRemove.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
=======
=======
>>>>>>> parent of 21ef467 ()
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\kszab\\Downloads\\button\\edit.png")); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\kszab\\Downloads\\button\\remove_button.png")); // NOI18N
        jButton3.setText("Remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
<<<<<<< HEAD
>>>>>>> parent of 21ef467 ()
=======
>>>>>>> parent of 21ef467 ()
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Color", "Year", "Brand Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        jTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
<<<<<<< HEAD
<<<<<<< HEAD
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
=======
>>>>>>> parent of 21ef467 ()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(84, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
<<<<<<< HEAD
>>>>>>> parent of 21ef467 ()
=======
>>>>>>> parent of 21ef467 ()
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
<<<<<<< HEAD
<<<<<<< HEAD
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
=======
>>>>>>> parent of 21ef467 ()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButtonAdd)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
<<<<<<< HEAD
>>>>>>> parent of 21ef467 ()
=======
>>>>>>> parent of 21ef467 ()
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        
        try {
            int row = jTable.getSelectedRow();
            String[] data = new String[5];
            for (int i = 0; i < 5; i++) {
                data[i] = String.valueOf(jTable.getValueAt(row, i));
            }
            AddEditView aev = new AddEditView(data);
            aev.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(UserView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        int row = jTable.getSelectedRow();
        String ID = String.valueOf(jTable.getValueAt(row, 0));
        Connection con = MyConnection.getConnection();
        String sql = "delete from carparts where ID=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ID);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UserView.class.getName()).log(Level.SEVERE, null, ex);
        }
        ((DefaultTableModel)jTable.getModel()).setRowCount(0);
        try {
            DefaultTableModel tblModel;
            tblModel = (DefaultTableModel)jTable.getModel();
            if (tblModel.getRowCount() == 0) {
                con = MyConnection.getConnection();
                sql = "SELECT * FROM carparts";
                PreparedStatement st = con.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    ID = String.valueOf(rs.getString("ID"));
                    String PartName = rs.getString("PartName");
                    String PartColor = rs.getString("PartColor");
                    String PartManufactureYear = String.valueOf(rs.getString("PartManufactureYear"));
                    String BrandName = rs.getString("BrandName");
                    String tbData[] = {ID, PartName, PartColor, PartManufactureYear, BrandName};
                    tblModel.addRow(tbData);
                } 
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        this.dispose();
        AddEditView aev = new AddEditView();
        aev.setVisible(true);
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableFocusGained
        try {
            DefaultTableModel tblModel;
            tblModel = (DefaultTableModel)jTable.getModel();
            if (tblModel.getRowCount() == 0) {
                Connection con = MyConnection.getConnection();
                String sql = "SELECT * FROM carparts";
                PreparedStatement st = con.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    String ID = String.valueOf(rs.getString("ID"));
                    String PartName = rs.getString("PartName");
                    String PartColor = rs.getString("PartColor");
                    String PartManufactureYear = String.valueOf(rs.getString("PartManufactureYear"));
                    String BrandName = rs.getString("BrandName");
                    String tbData[] = {ID, PartName, PartColor, PartManufactureYear, BrandName};
                    tblModel.addRow(tbData);
                } 
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableFocusGained

         
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UserView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UserView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
<<<<<<< HEAD
<<<<<<< HEAD
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonRemove;
=======
>>>>>>> parent of 21ef467 ()
=======
>>>>>>> parent of 21ef467 ()
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
