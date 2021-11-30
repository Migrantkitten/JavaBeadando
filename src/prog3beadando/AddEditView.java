/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prog3beadando;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Levente
 */
public class AddEditView extends javax.swing.JFrame {

    String s = null;
    
    String[] data_ = new String[5];
    public AddEditView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    public AddEditView(String[] data) throws SQLException, IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        data_ = data;
        LoadData(data_);
    }
    
    private void LoadData(String data[]) throws SQLException, IOException{
        jTextFieldName.setText(data[1]);
        jTextFieldColor.setText(data[2]);
        jTextFieldManufactureYear.setText(data[3]);
        jTextFieldBrandName.setText(data[4]);
        
        Connection con = MyConnection.getConnection();
        String sql = "select * from carparts where ID=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, data[0]);
        ResultSet rs = ps.executeQuery();
        rs.next();
        Blob blob = rs.getBlob(6);
        if (blob != null) {
            InputStream in = blob.getBinaryStream();  
            BufferedImage image = ImageIO.read(in);
            jLabelPicture.setIcon(ResizeImage(image));
        }
        
        
    }
    public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(jLabelPicture.getWidth(), jLabelPicture.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
    public ImageIcon ResizeImage(BufferedImage image){
        ImageIcon MyImage = new ImageIcon(image);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(jLabelPicture.getWidth(), jLabelPicture.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon convertedImage = new ImageIcon(newImage);
        return convertedImage;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonClose = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jTextFieldName = new javax.swing.JTextField();
        jButtonAddPicture = new javax.swing.JButton();
        jLabelPicture = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldBrandName = new javax.swing.JTextField();
        jTextFieldManufactureYear = new javax.swing.JTextField();
        jTextFieldColor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(116, 124, 146));
        jPanel1.setForeground(new java.awt.Color(116, 124, 146));

        jButtonClose.setBackground(new java.awt.Color(58, 36, 73));
        jButtonClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonClose.setForeground(new java.awt.Color(161, 232, 175));
        jButtonClose.setText("Close");
        jButtonClose.setPreferredSize(new java.awt.Dimension(95, 40));
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        jButtonSave.setBackground(new java.awt.Color(58, 36, 73));
        jButtonSave.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonSave.setForeground(new java.awt.Color(161, 232, 175));
        jButtonSave.setText("Save");
        jButtonSave.setPreferredSize(new java.awt.Dimension(95, 40));
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jTextFieldName.setBackground(new java.awt.Color(161, 232, 175));
        jTextFieldName.setPreferredSize(new java.awt.Dimension(6, 38));

        jButtonAddPicture.setBackground(new java.awt.Color(58, 36, 73));
        jButtonAddPicture.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonAddPicture.setForeground(new java.awt.Color(161, 232, 175));
        jButtonAddPicture.setText("Add picture");
        jButtonAddPicture.setPreferredSize(new java.awt.Dimension(95, 40));
        jButtonAddPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPictureActionPerformed(evt);
            }
        });

        jLabelPicture.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPicture.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("ManufactureYear:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("BrandName ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Color:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Name:");

        jTextFieldBrandName.setBackground(new java.awt.Color(161, 232, 175));
        jTextFieldBrandName.setPreferredSize(new java.awt.Dimension(6, 38));

        jTextFieldManufactureYear.setBackground(new java.awt.Color(161, 232, 175));
        jTextFieldManufactureYear.setPreferredSize(new java.awt.Dimension(6, 38));

        jTextFieldColor.setBackground(new java.awt.Color(161, 232, 175));
        jTextFieldColor.setPreferredSize(new java.awt.Dimension(6, 38));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAddPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButtonAddPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4))
                    .addComponent(jTextFieldBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        try {
            InputStream is = null;
            if (s != null) {
                is = new FileInputStream(new File(s)); 
            }
            if (data_[0] != null) {
                Connection con = MyConnection.getConnection();
                String sql = "update carparts set PartName=?, PartColor=?, PartManufactureYear=?, BrandName=?, PartPicture=? where ID=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, jTextFieldName.getText());
                ps.setString(2, jTextFieldColor.getText());
                ps.setString(3, jTextFieldManufactureYear.getText());
                ps.setString(4, jTextFieldBrandName.getText());
                ps.setBlob(5, is);
                ps.setString(6, data_[0]);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Update Successful");
            }
            else{
                Connection con = MyConnection.getConnection();
                String sql = "insert into carparts(ID, PartName, PartColor, PartManufactureYear, BrandName, PartPicture) values(DEFAULT,?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, jTextFieldName.getText());
                ps.setString(2, jTextFieldColor.getText());
                ps.setString(3, jTextFieldManufactureYear.getText());
                ps.setString(4, jTextFieldBrandName.getText());
                if (rootPaneCheckingEnabled) {
                    ps.setBlob(5, is);
                }
                else{
                    ps.setString(5, null);
                }
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Update Successful");
            }
         } catch (SQLException ex) {
             Logger.getLogger(AddEditView.class.getName()).log(Level.SEVERE, null, ex);
         } catch (FileNotFoundException ex) {
            Logger.getLogger(AddEditView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();
        UserView uv = new UserView();
        uv.setVisible(true);
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonAddPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPictureActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            jLabelPicture.setIcon(ResizeImage(path));
            s = path;
        }
         else if(result == JFileChooser.CANCEL_OPTION){
             System.out.println("No Data");
        }
    }//GEN-LAST:event_jButtonAddPictureActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEditView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddPicture;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBrandName;
    private javax.swing.JTextField jTextFieldColor;
    private javax.swing.JTextField jTextFieldManufactureYear;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
