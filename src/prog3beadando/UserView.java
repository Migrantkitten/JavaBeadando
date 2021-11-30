
package prog3beadando;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class UserView extends javax.swing.JFrame {


    public UserView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jComboBoxBrands = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Color", "Manufature Year", "Brand Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jComboBoxBrands.setToolTipText("");
        jComboBoxBrands.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxBrandsFocusGained(evt);
            }
        });
        jComboBoxBrands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBrandsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addGap(47, 47, 47)
                        .addComponent(jButtonEdit)
                        .addGap(404, 404, 404)
                        .addComponent(jButtonRemove))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jComboBoxBrands, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jComboBoxBrands, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonRemove))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableFocusGained
        try {
            ArrayList<String> brands = new ArrayList<String>();
            Connection con = MyConnection.getConnection();
            String sql = "SELECT * FROM carparts";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            jComboBoxBrands.addItem("ALL");
            while(rs.next()){
                try {
                    String BrandName = rs.getString("BrandName");
                    brands.add(BrandName);
                } catch (SQLException ex) {
                    Logger.getLogger(UserView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            ArrayList<String> newList = new ArrayList<String>();
            for (String element : brands) {
                if (!newList.contains(element)) {
                    newList.add(element);
                }
            }
            for (String brandToLoad : newList) {
                jComboBoxBrands.addItem(brandToLoad);
            }  
        } catch (SQLException ex) { 
            Logger.getLogger(UserView.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        this.dispose();
        AddEditView aev = new AddEditView();
        aev.setVisible(true);
    }//GEN-LAST:event_jButtonAddActionPerformed

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

    private void jComboBoxBrandsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxBrandsFocusGained

    }//GEN-LAST:event_jComboBoxBrandsFocusGained

    private void jComboBoxBrandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBrandsActionPerformed
  
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel)jTable.getModel();
        tblModel.setRowCount(0);
        Object item = jComboBoxBrands.getSelectedItem();
        if ("ALL".equals(String.valueOf(item))) {
            try {
                tblModel = (DefaultTableModel)jTable.getModel();
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
            } catch (SQLException ex) {
                Logger.getLogger(UserView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{   
            try {
                tblModel = (DefaultTableModel)jTable.getModel();
                Connection con = MyConnection.getConnection();
                String sql = "SELECT * FROM carparts where BrandName=?";
                PreparedStatement st = con.prepareStatement(sql);
                st.setString(1, String.valueOf(item));
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
            } catch (SQLException ex) {
                Logger.getLogger(UserView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jComboBoxBrandsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JComboBox<String> jComboBoxBrands;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
