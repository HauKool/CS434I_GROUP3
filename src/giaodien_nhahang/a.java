package giaodien_nhahang;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class a extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    private ThaoTac a = new ThaoTac();
    int h, c;

    public a() {
        initComponents();

        table.setModel(dtm);
        dtm.addColumn("HoTen");
        dtm.addColumn("NamSinh");
        dtm.addColumn("ChucVu");
        dtm.addColumn("SoNgayLam");
        dtm.addColumn("Luong");
        dtm.addColumn("GioiTinh");
        dtm.addColumn("SĐT");
        dtm.addColumn("NguoiDamHo");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jText1 = new javax.swing.JTextField();
        jText2 = new javax.swing.JTextField();
        jText3 = new javax.swing.JTextField();
        jText4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jText5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jText6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jText7 = new javax.swing.JTextField();
        Xoa = new javax.swing.JButton();
        Nhap = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Doc = new javax.swing.JButton();
        Luu = new javax.swing.JButton();
        Thoat = new javax.swing.JButton();

        jTextField3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QL_NhanVien_A.Teo_restaurant");
        setBackground(new java.awt.Color(51, 153, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("HoTen");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("NamSinh");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setText("ChucVu");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setText("SoNgayLam");

        jText1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jText2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jText3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText3ActionPerformed(evt);
            }
        });

        jText4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel5.setText("LuongCoBan/30ngay");

        jText5.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jText5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel7.setText("SĐT");

        jText6.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jText6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText6ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel6.setText("GioiTinh");

        jComboBox1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nu" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jRadioButton1.setText(">18");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jRadioButton2.setText("16< <18");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel8.setText("NguoiDamHo");

        jText7.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        Xoa.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        Xoa.setText("Xoa");
        Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaActionPerformed(evt);
            }
        });

        Nhap.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        Nhap.setText("Nhap");
        Nhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhapActionPerformed(evt);
            }
        });

        table.setBackground(new java.awt.Color(204, 255, 153));
        table.setFont(table.getFont().deriveFont((float)15));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        table.setGridColor(new java.awt.Color(0, 0, 0));
        table.setSelectionBackground(new java.awt.Color(102, 204, 255));
        table.setSelectionForeground(new java.awt.Color(0, 51, 51));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        Doc.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        Doc.setText("DocFile");
        Doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocActionPerformed(evt);
            }
        });

        Luu.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        Luu.setText("LuuFile");
        Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuActionPerformed(evt);
            }
        });

        Thoat.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        Thoat.setText("Thoat");
        Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jText1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jText2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jText4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jText5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jRadioButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Nhap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Xoa))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 140, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Luu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Doc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Thoat))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jText5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jText6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel8)
                    .addComponent(jText7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Xoa)
                    .addComponent(Nhap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Doc)
                    .addComponent(Luu)
                    .addComponent(Thoat)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText3ActionPerformed
    }//GEN-LAST:event_jText3ActionPerformed
    private void HienThi() {
        dtm = new DefaultTableModel();
        table.setModel(dtm);
        dtm.addColumn("HoTen");
        dtm.addColumn("NamSinh");
        dtm.addColumn("ChucVu");
        dtm.addColumn("SoNgayLam");
        dtm.addColumn("Luong");
        dtm.addColumn("GioiTinh");
        dtm.addColumn("SĐT");
        dtm.addColumn("NguoiDamHo");
        for (int i = 0; i < a.size(); i++) {
            NhanVien x = a.get(i);
            dtm.addRow(new Object[]{
                x.getHoTen(), x.getNamSinh(), x.getChucVu(), x.getSoNgayLam(), x.getLuong(), x.isGioiTinh(), x.getSdt(), x.getHoTenNguoiDamHo()});
            System.out.println(a.get(i));
        }
    }

    private void lammoi() {
        jText1.setText("");
        jText2.setText("");
        jText3.setText("");
        jText4.setText("");
        jText5.setText("");
        jText6.setText("");
        jText7.setText("");
        jText1.requestFocus();

    }
    private void XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaActionPerformed
        a.xoa(h);
        dtm = new DefaultTableModel();
        table.setModel(dtm);
        dtm.addColumn("HoTen");
        dtm.addColumn("NamSinh");
        dtm.addColumn("ChucVu");
        dtm.addColumn("SoNgayLam");
        dtm.addColumn("Luong");
        dtm.addColumn("GioiTinh");
        dtm.addColumn("SĐT");
        dtm.addColumn("NguoiDamHo");
        for (int i = 0; i < a.size(); i++) {
            NhanVien x = a.get(i);
            dtm.addRow(new Object[]{
                x.getHoTen(), x.getNamSinh(), x.getChucVu(), x.getSoNgayLam(), x.getLuong(), x.isGioiTinh(), x.getSdt(), x.getHoTenNguoiDamHo()});
        }
    }//GEN-LAST:event_XoaActionPerformed

    private void ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ThoatActionPerformed

    private void NhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhapActionPerformed
        String HoTen = "", ChucVu = "";
        String GioiTinh = (String) jComboBox1.getSelectedItem();
        int NamSinh;
        double SoNgayLam;
        double Luong;
        String Sdt, HoTenNguoiDamHo = "";
        HoTen = jText1.getText();
        ChucVu = jText3.getText();
        NamSinh = Integer.parseInt(jText2.getText());
        SoNgayLam = Double.parseDouble(jText4.getText());
        Luong = Double.parseDouble(jText5.getText());
        Sdt = jText6.getText();
        HoTenNguoiDamHo = jText7.getText();

        NhanVien x;

        if (jRadioButton1.isSelected()) {
            x = new NV_tren18t(HoTen, ChucVu, GioiTinh, NamSinh, SoNgayLam, Luong, Sdt);
        } else {
            x = new NV_tu16den18t(HoTenNguoiDamHo, HoTen, ChucVu, GioiTinh, NamSinh, SoNgayLam, Luong, Sdt);
        }

        a.add(x);
        dtm.addRow(new Object[]{
            x.getHoTen(), x.getNamSinh(), x.getChucVu(), x.getSoNgayLam(), x.TinhLuong(), x.isGioiTinh(), x.getSdt(), x.getHoTenNguoiDamHo()});
        lammoi();
    }//GEN-LAST:event_NhapActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.showSaveDialog(null);
        String tenfile = fc.getSelectedFile().getPath();
        try {
            File f = new File(tenfile);
            if (!f.exists()) {
                PrintStream out = new PrintStream(f);
                for (int i = 0; i < a.size(); i++) {
                    out.print(a.get(i).toString());
                }
                out.close();

            } else {
                System.out.println("file da ton tai!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_LuuActionPerformed

    private void jText5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText5ActionPerformed
    }//GEN-LAST:event_jText5ActionPerformed

    private void DocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocActionPerformed
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        String tenfile = fc.getSelectedFile().getPath();
        a.del();
        a.docfile(tenfile);
        HienThi();

    }//GEN-LAST:event_DocActionPerformed

    private void jText6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText6ActionPerformed
    }//GEN-LAST:event_jText6ActionPerformed

    private void tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMousePressed
        // TODO add your handling code here:
        h = table.getSelectedRow();
        System.out.println(h);
    }//GEN-LAST:event_tableMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new a().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Doc;
    private javax.swing.JButton Luu;
    private javax.swing.JButton Nhap;
    private javax.swing.JButton Thoat;
    private javax.swing.JButton Xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jText1;
    private javax.swing.JTextField jText2;
    private javax.swing.JTextField jText3;
    private javax.swing.JTextField jText4;
    private javax.swing.JTextField jText5;
    private javax.swing.JTextField jText6;
    private javax.swing.JTextField jText7;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
