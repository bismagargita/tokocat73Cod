/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Java.koneksi;
import Java.modelTabelSupplier;
import com.mysql.jdbc.Connection;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author User
 */
public class Master_Supplier extends javax.swing.JFrame {

    private Java.koneksi koneksi;
    private Connection con;
    private ResultSet hasil,hasil2;
    private Statement stat;
    private Java.ListSupplier listSupplier;
    private List<Java.ListSupplier> list; 
    private TableModel model;
    private String query;
    private int x,kode_supplier,status, no_akhir;
    static int a=0,id=0, angka = 0, nilai_status;
    private String nama_supplier,contact_supplier,telepon_supplier;
    private String alamat_supplier, handphone_supplier, kota_supplier, keterangan, rekening;
    private double total_hutang;
    
    public Master_Supplier() throws SQLException {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        tampilTabel();
        fCari.requestFocusInWindow();
        
    }
    Master_Supplier_TambahEdit supplier_edit=new Master_Supplier_TambahEdit();
    
     public String tampilTabel(){
        String data = "";
        koneksi = new koneksi();
        con = (Connection) koneksi.Connect();
        try{
          data ="select *  from supplier order by kode_supplier+0";
          hasil = koneksi.ambilData(data);
          System.out.println("sukses query tampil tabel");
          setModel(hasil);
        }catch(Exception e){
            System.out.println("Error tampil tabel");
        }
        return data;
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel25 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fTabel = new javax.swing.JTable();
        fCari = new javax.swing.JTextField();
        fNew = new javax.swing.JLabel();
        fEdit = new javax.swing.JLabel();
        fDelete = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        fFilter = new javax.swing.JComboBox<>();
        hidden = new javax.swing.JLabel();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Kriteria");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.lightGray));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DAFTAR SUPPLIER");

        fTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama", "Alamat", "Telepon", "Handphone", "Contact", "Kota", "Total Hutang", "Keterangan", "Rekening"
            }
        ));
        fTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fTabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(fTabel);
        if (fTabel.getColumnModel().getColumnCount() > 0) {
            fTabel.getColumnModel().getColumn(0).setMinWidth(40);
            fTabel.getColumnModel().getColumn(0).setPreferredWidth(40);
            fTabel.getColumnModel().getColumn(0).setMaxWidth(40);
            fTabel.getColumnModel().getColumn(1).setMinWidth(250);
            fTabel.getColumnModel().getColumn(1).setPreferredWidth(250);
            fTabel.getColumnModel().getColumn(1).setMaxWidth(250);
            fTabel.getColumnModel().getColumn(2).setMinWidth(250);
            fTabel.getColumnModel().getColumn(2).setPreferredWidth(250);
            fTabel.getColumnModel().getColumn(2).setMaxWidth(250);
            fTabel.getColumnModel().getColumn(3).setMinWidth(120);
            fTabel.getColumnModel().getColumn(3).setPreferredWidth(120);
            fTabel.getColumnModel().getColumn(3).setMaxWidth(120);
            fTabel.getColumnModel().getColumn(4).setMinWidth(80);
            fTabel.getColumnModel().getColumn(4).setPreferredWidth(80);
            fTabel.getColumnModel().getColumn(4).setMaxWidth(80);
            fTabel.getColumnModel().getColumn(5).setMinWidth(80);
            fTabel.getColumnModel().getColumn(5).setPreferredWidth(80);
            fTabel.getColumnModel().getColumn(5).setMaxWidth(80);
            fTabel.getColumnModel().getColumn(6).setMinWidth(80);
            fTabel.getColumnModel().getColumn(6).setPreferredWidth(80);
            fTabel.getColumnModel().getColumn(6).setMaxWidth(80);
            fTabel.getColumnModel().getColumn(7).setMinWidth(80);
            fTabel.getColumnModel().getColumn(7).setPreferredWidth(80);
            fTabel.getColumnModel().getColumn(7).setMaxWidth(80);
            fTabel.getColumnModel().getColumn(8).setMinWidth(100);
            fTabel.getColumnModel().getColumn(8).setPreferredWidth(100);
            fTabel.getColumnModel().getColumn(8).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addContainerGap())
        );

        fCari.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        fCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fCariActionPerformed(evt);
            }
        });
        fCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fCariKeyReleased(evt);
            }
        });

        fNew.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        fNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/if_manilla-folder-new_23456.png"))); // NOI18N
        fNew.setText("F2-New");
        fNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fNewMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fNewMouseExited(evt);
            }
        });
        fNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fNewKeyPressed(evt);
            }
        });

        fEdit.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        fEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/if_gtk-edit_20500.png"))); // NOI18N
        fEdit.setText("F3-Edit");
        fEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fEditMouseClicked(evt);
            }
        });

        fDelete.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        fDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/if_document_delete_61766.png"))); // NOI18N
        fDelete.setText("F5-Delete");
        fDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fDeleteMouseClicked(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        fFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LIST SUPPLIER ACTIVE", "LIST SUPPLIER DEACTIVE", "ALL" }));
        fFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fFilterMouseClicked(evt);
            }
        });
        fFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(fCari, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fDelete)
                        .addGap(101, 101, 101)
                        .addComponent(hidden, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 189, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fEdit)
                                    .addComponent(fDelete)
                                    .addComponent(fNew))
                                .addComponent(fCari, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(hidden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(979, 562));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fNewMouseClicked
        try {
            buatnomor();
            a=1;
        } catch (SQLException ex) {
            Logger.getLogger(Master_Supplier.class.getName()).log(Level.SEVERE, null, ex);
        }
       supplier_edit.fkodesupplier.setText(Integer.toString(id));
    }//GEN-LAST:event_fNewMouseClicked

    private void fTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fTabelMouseClicked
//       Master_Supplier_KartuHutang kh=new Master_Supplier_KartuHutang();
//       kh.setVisible(true);
//       kh.setFocusable(true);
    }//GEN-LAST:event_fTabelMouseClicked

    private void fEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fEditMouseClicked
        if (fTabel.getSelectedRow()<0) {
            JOptionPane.showMessageDialog(null,"Pilih Supplier yang akan diedit");
        } else {
             try {
                 supplier_edit.setVisible(true);
                 ambilDataTabel();
                 supplier_edit.fkodesupplier.setText(Integer.toString(kode_supplier));
                 supplier_edit.fNamaSupplier.setText(nama_supplier);
                 supplier_edit.fAlamatSupplier.setText(alamat_supplier);
                 supplier_edit.fTelepon.setText(telepon_supplier);
                 supplier_edit.fHP.setText(handphone_supplier);
                 supplier_edit.fContactSupplier.setText(contact_supplier);
                 supplier_edit.fKotaSupplier.setText(kota_supplier);
                 supplier_edit.fTotalHutangSupplier.setText("");
                 supplier_edit.fKeteranganSupplier.setText(keterangan);
                 supplier_edit.fRekening.setText(rekening);
                 //menampilkan nilai status ditabel
                 query = "SELECT aktif_supplier FROM supplier where nama_supplier='"+nama_supplier+"' and alamat_supplier='"+alamat_supplier+"'";
                 hasil = koneksi.ambilData(query);
                 while(hasil.next()){
                     nilai_status = hasil.getInt("aktif_supplier");
                     System.out.println(nilai_status);
                 if (nilai_status==0) {
                     supplier_edit.RDactive.setSelected(true);
                 } else {
                     supplier_edit.RDdeactive.setSelected(true);
                 } 
                 }                
                 a=2;
             } catch (SQLException ex) {
                 Logger.getLogger(Master_Supplier.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }//GEN-LAST:event_fEditMouseClicked

    private void fCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fCariActionPerformed
      fTabel.requestFocusInWindow(); 
    }//GEN-LAST:event_fCariActionPerformed

    private void fCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fCariKeyReleased
        try{
        query= "SELECT * FROM supplier where kode_supplier like '%"+fCari.getText()+"%' or kota_supplier like '%"+fCari.getText()+"%' or alamat_supplier like '%"+fCari.getText()+"%' or nama_supplier like '%"+fCari.getText()+"%' order by kode_supplier+0";
        hasil = koneksi.ambilData(query);
        setModel(hasil);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {     
            fTabel.requestFocusInWindow();
        }
        }catch (Exception e) {
        }
    }//GEN-LAST:event_fCariKeyReleased

    private void fDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fDeleteMouseClicked
        if (fTabel.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Pilih Supplier yang akan dihapus");
        } else {
            ambilDataTabel();
            hidden.setText(Integer.toString(kode_supplier));
            hidden.hide();
            String sql = "DELETE from supplier WHERE kode_supplier='" + hidden.getText() + "'";
            try {
                stat = koneksi.Connect().createStatement(); //membuka layar query
                stat.executeUpdate(sql); //jalankan //menampung hasil
                stat.close();
                tampilTabel();
                JOptionPane.showMessageDialog(null, "Data telah dihapus");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan " + e);
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_fDeleteMouseClicked

    private void fFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fFilterMouseClicked
//        fTabel.requestFocusInWindow();
    }//GEN-LAST:event_fFilterMouseClicked

    private void fNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fNewMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_fNewMouseExited

    private void fFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fFilterActionPerformed
        if (fFilter.getSelectedItem()=="LIST SUPPLIER ACTIVE") {
            try {
                query = "SELECT * FROM supplier where aktif_supplier=0 order by kode_supplier+0";
                hasil = koneksi.ambilData(query);
                setModel(hasil);
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if(fFilter.getSelectedItem()=="LIST SUPPLIER DEACTIVE"){
            try {
                query = "select *  from supplier where aktif_supplier=1 order by kode_supplier+0";
                hasil = koneksi.ambilData(query);
                setModel(hasil);
            } catch (Exception e) {
                System.out.println(e);
            }
        }else{
            tampilTabel();
        }
    }//GEN-LAST:event_fFilterActionPerformed

    private void fNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNewKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_2) {
//            System.out.println("a");
//            try {
//                buatnomor();
//                a = 1;
//            } catch (SQLException ex) {
//                Logger.getLogger(Master_Supplier.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            supplier_edit.fkodesupplier.setText(Integer.toString(id));
//        }

    }//GEN-LAST:event_fNewKeyPressed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Master_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Master_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Master_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Master_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Master_Supplier().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Master_Supplier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fCari;
    private javax.swing.JLabel fDelete;
    private javax.swing.JLabel fEdit;
    private javax.swing.JComboBox<String> fFilter;
    public javax.swing.JLabel fNew;
    public javax.swing.JTable fTabel;
    private javax.swing.JLabel hidden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
    public void setModel(ResultSet hasil){
        try {
            list = new ArrayList<Java.ListSupplier>();
            while(hasil.next()){
                listSupplier = new Java.ListSupplier();
                listSupplier.setKode_supplier(hasil.getInt("kode_supplier"));
                listSupplier.setNama_supplier(hasil.getString("nama_supplier"));
                listSupplier.setAlamat_supplier(hasil.getString("alamat_supplier")); 
                listSupplier.setTelepon_supplier(hasil.getString("telepon_supplier"));
                listSupplier.setHp_supplier(hasil.getString("handphone_supplier"));
                listSupplier.setContact_supplier(hasil.getString("contact_supplier"));
                listSupplier.setKota_supplier(hasil.getString("kota_supplier"));
                listSupplier.setTotal_hutang(hasil.getDouble("totalhutang_supplier"));
                listSupplier.setKeterangan(hasil.getString("keterangan_supplier"));
                listSupplier.setRekening(hasil.getString("rekening_supplier"));
                list.add(listSupplier);
            }
            model = new modelTabelSupplier(list);
            fTabel.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void buatnomor() throws SQLException{
        query = "SELECT kode_supplier FROM supplier ORDER BY kode_supplier+0 DESC LIMIT 1";
        hasil = koneksi.ambilData(query);
        while(hasil.next()){   
            angka = hasil.getInt("kode_supplier");
            id=angka+1;
            System.out.println("angka baru : "+id);
            supplier_edit.setVisible(true);
            supplier_edit.fkodesupplier.setText(Integer.toString(id));
         }
    }   
    private void ambilDataTabel(){
        int row= fTabel.getSelectedRow();
        kode_supplier  = ((Integer)fTabel.getValueAt(row, 0));
        nama_supplier = ((String)fTabel.getValueAt(row, 1));
        alamat_supplier = ((String)fTabel.getValueAt(row, 2));
        telepon_supplier = ((String)fTabel.getValueAt(row, 3));
        handphone_supplier = ((String)fTabel.getValueAt(row, 4));
        contact_supplier = ((String)fTabel.getValueAt(row, 5));
        kota_supplier = ((String)fTabel.getValueAt(row, 6));
        total_hutang = ((Double)fTabel.getValueAt(row, 7));
        keterangan = ((String)fTabel.getValueAt(row, 8));
        rekening = ((String)fTabel.getValueAt(row, 9));
    } 
    public void edit(String kode, String nama, String alamat, String telepon, String hp, String contact, String kota, String keterangan, String rekening, int status) throws SQLException {
            System.out.println("ini kode"+a);
            if (a==2) {
                String sql = "Update supplier set nama_supplier = '" + nama + "',alamat_supplier='" +
                        alamat + "',telepon_supplier='" + telepon + "',handphone_supplier='" + 
                        hp + "',contact_supplier='" + contact + "',kota_supplier='" + kota + "',keterangan_supplier='" +
                        keterangan + "',rekening_supplier='" + rekening + "', aktif_supplier="+status+" where kode_supplier=" + kode;
                System.out.println(sql);
                koneksi.simpanData(sql);
                bersih();
                JOptionPane.showMessageDialog(null, "Data sukses di edit");
                tampilTabel();
            }if(a==1){
                angka = 0;
                String sql = "Insert into supplier values (" + kode + ",'" + nama + "','" + alamat + "','" + telepon + "','" + hp + "','" + contact + "','" + kota + "',0,'" + keterangan + "','" + rekening + "',"+status+")";
                System.out.println(sql);
                koneksi.simpanData(sql);
                JOptionPane.showMessageDialog(null, "Data sukses di simpan");
                tampilTabel();
          }
 }
        public void bersih(){
        angka=0;
        a=0;
        id = 0;
        x=0;
        supplier_edit.fNamaSupplier.setText("");
        supplier_edit.fAlamatSupplier.setText("");
        supplier_edit.fTelepon.setText("");
        supplier_edit.fHP.setText("");
        supplier_edit.fContactSupplier.setText("");
        supplier_edit.fKotaSupplier.setText("");
        supplier_edit.fTotalHutangSupplier.setText("");
        supplier_edit.fKeteranganSupplier.setText("");
        supplier_edit.fRekening.setText("");
    }
       

}
