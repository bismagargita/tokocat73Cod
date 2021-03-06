/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Java.koneksi;
import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dii
 */
public class Master_Rekening extends javax.swing.JFrame {

    private Java.koneksi koneksi;
    private Connection con;
    private ResultSet hasil;
    private Statement stat;
    DefaultTableModel tabel_model;
    private String query;
    private int id;
    private String bank;
    private String norek;
    private String nama;
    private String status;
    private String bool;
    
    public Master_Rekening() {
        initComponents();
        this.setLocationRelativeTo(null);
        buatTabel();
        bool = "false";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dTambahUpdateRekening = new javax.swing.JDialog();
        fBank = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        fBatal = new javax.swing.JButton();
        fNorek = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        fNama = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        fSimpan = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        fDeactive = new javax.swing.JRadioButton();
        fActive = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        fTambah = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        fTabel = new javax.swing.JTable();
        fCari = new javax.swing.JTextField();
        fEdit = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();

        dTambahUpdateRekening.setTitle("Tambah/Update Akun");
        dTambahUpdateRekening.setBackground(new java.awt.Color(255, 255, 255));
        dTambahUpdateRekening.setResizable(false);
        dTambahUpdateRekening.setSize(new java.awt.Dimension(366, 196));
        dTambahUpdateRekening.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dTambahUpdateRekeningKeyPressed(evt);
            }
        });

        fBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fBankActionPerformed(evt);
            }
        });
        fBank.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fBankKeyPressed(evt);
            }
        });

        jLabel40.setText("Bank");

        fBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/if_document_delete_61766.png"))); // NOI18N
        fBatal.setText("Batal");
        fBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fBatalActionPerformed(evt);
            }
        });
        fBatal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fBatalKeyPressed(evt);
            }
        });

        fNorek.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fNorekKeyPressed(evt);
            }
        });

        jLabel41.setText("Nomor Rekening");

        fNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fNamaKeyPressed(evt);
            }
        });

        jLabel42.setText("Atas Nama Rekening");

        fSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/if_manilla-folder-new_23456.png"))); // NOI18N
        fSimpan.setText("Simpan");
        fSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSimpanActionPerformed(evt);
            }
        });
        fSimpan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fSimpanKeyPressed(evt);
            }
        });

        jLabel43.setText("Status");

        buttonGroup1.add(fDeactive);
        fDeactive.setText("Deactive");
        fDeactive.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fDeactiveKeyPressed(evt);
            }
        });

        buttonGroup1.add(fActive);
        fActive.setText("Active");
        fActive.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fActiveKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout dTambahUpdateRekeningLayout = new javax.swing.GroupLayout(dTambahUpdateRekening.getContentPane());
        dTambahUpdateRekening.getContentPane().setLayout(dTambahUpdateRekeningLayout);
        dTambahUpdateRekeningLayout.setHorizontalGroup(
            dTambahUpdateRekeningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dTambahUpdateRekeningLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(fSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fBatal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(dTambahUpdateRekeningLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dTambahUpdateRekeningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43))
                .addGap(48, 48, 48)
                .addGroup(dTambahUpdateRekeningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fNama, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(fBank)
                    .addComponent(fNorek)
                    .addGroup(dTambahUpdateRekeningLayout.createSequentialGroup()
                        .addComponent(fDeactive)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fActive)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dTambahUpdateRekeningLayout.setVerticalGroup(
            dTambahUpdateRekeningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dTambahUpdateRekeningLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dTambahUpdateRekeningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dTambahUpdateRekeningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNorek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dTambahUpdateRekeningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dTambahUpdateRekeningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(fDeactive)
                    .addComponent(fActive))
                .addGap(8, 8, 8)
                .addGroup(dTambahUpdateRekeningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fBatal)
                    .addComponent(fSimpan))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        fTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/if_manilla-folder-new_23456.png"))); // NOI18N
        fTambah.setText("Tambah Rekening");
        fTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTambahActionPerformed(evt);
            }
        });
        fTambah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fTambahKeyPressed(evt);
            }
        });

        fTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Nama Rekening", "Nomor Rekening", "Atas Nama", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        fTabel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        fTabel.getTableHeader().setReorderingAllowed(false);
        fTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fTabelMouseClicked(evt);
            }
        });
        fTabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fTabelKeyPressed(evt);
            }
        });
        jScrollPane9.setViewportView(fTabel);
        if (fTabel.getColumnModel().getColumnCount() > 0) {
            fTabel.getColumnModel().getColumn(0).setResizable(false);
            fTabel.getColumnModel().getColumn(1).setResizable(false);
            fTabel.getColumnModel().getColumn(2).setResizable(false);
            fTabel.getColumnModel().getColumn(3).setResizable(false);
            fTabel.getColumnModel().getColumn(4).setResizable(false);
        }

        fCari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fCariFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fCariFocusLost(evt);
            }
        });
        fCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fCariMouseEntered(evt);
            }
        });
        fCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fCariKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fCariKeyReleased(evt);
            }
        });

        fEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/if_gtk-edit_20500.png"))); // NOI18N
        fEdit.setText("Edit");
        fEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fEditActionPerformed(evt);
            }
        });
        fEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fEditKeyPressed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel35.setText("Rekening");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fCari, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fTambah)
                    .addComponent(fCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fEdit))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(523, 310));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTambahActionPerformed
        id=0;
        dTambahUpdateRekening.show();
        dTambahUpdateRekening.setLocationRelativeTo(null);
        bersih();
    }//GEN-LAST:event_fTambahActionPerformed

    private void fCariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fCariFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_fCariFocusGained

    private void fCariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fCariFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_fCariFocusLost

    private void fBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fBatalActionPerformed
        dTambahUpdateRekening.dispose();
        bersih();
    }//GEN-LAST:event_fBatalActionPerformed

    private void fEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fEditActionPerformed
        ambilDataTabel();
        if("true".equals(bool)){
            dTambahUpdateRekening.setVisible(true);
            dTambahUpdateRekening.setLocationRelativeTo(null);
            fBank.setText(bank);
            fNorek.setText(norek);
            if("Deactive".equals(status)){
                fDeactive.setSelected(true);
            }else{
                fActive.setSelected(true);
            }
            fNama.setText(nama);
        }else{
            JOptionPane.showMessageDialog(null, "Pilih salah satu data di tabel terlebih dahulu");
        }
    }//GEN-LAST:event_fEditActionPerformed

    private void fCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fCariKeyReleased
       try{
            hapusTabel();
            String query= "SELECT kode_nama_keuangan, nama_keuangan, nomor_keuangan, "
                        + "atas_nama, status FROM transaksi_nama_keuangan where "
                        + "nama_keuangan like '%"+fCari.getText()+"%' or "
                        + "nomor_keuangan like '%"+fCari.getText()+"%' or "
                        + "atas_nama like '%"+fCari.getText()+"%' or "
                        + "status like '%"+fCari.getText()+"%'";
            con = (Connection) koneksi.Connect();
            hasil = koneksi.ambilData(query);
            String Object[] = new String[4];
            System.out.println("///");
            while (hasil.next()){
                    tabel_model.addRow(new Object[] {hasil.getString(1),hasil.getString(2),hasil.getString(3),hasil.getString(4),hasil.getString(5)});

            }
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {     
                fTabel.requestFocusInWindow();
            }
            }catch (Exception e) {
        }
    }//GEN-LAST:event_fCariKeyReleased

    private void fBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fBankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fBankActionPerformed

    private void fSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSimpanActionPerformed
        simpanAtauEdit();
    }//GEN-LAST:event_fSimpanActionPerformed

    private void fTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fTabelMouseClicked
        bool ="true";
    }//GEN-LAST:event_fTabelMouseClicked

    private void fCariMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fCariMouseEntered
        fTabel.requestFocusInWindow();
    }//GEN-LAST:event_fCariMouseEntered

    private void fTambahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fTambahKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            setVisible(false);
        }
    }//GEN-LAST:event_fTambahKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fCari.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void fCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fCariKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            fTabel.requestFocus();
        }
        if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            setVisible(false);
        }
    }//GEN-LAST:event_fCariKeyPressed

    private void fEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fEditKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            setVisible(false);
        }
    }//GEN-LAST:event_fEditKeyPressed

    private void fTabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fTabelKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {  
            bool="true";
           if("true".equals(bool)){
                dTambahUpdateRekening.setVisible(true);
                dTambahUpdateRekening.setLocationRelativeTo(null);
                ambilDataTabel();
                fBank.setText(bank);
                fNorek.setText(norek);
                if("Deactive".equals(status)){
                    fDeactive.setSelected(true);
                }else{
                    fActive.setSelected(true);
                }
                fNama.setText(nama);
            }else{
                JOptionPane.showMessageDialog(null, "Pilih salah satu data di tabel terlebih dahulu");
        }
        }
        if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            setVisible(false);
        }
        if (evt.getKeyCode()==KeyEvent.VK_DOWN || evt.getKeyCode()==KeyEvent.VK_UP) {
            bool="true";
        }
    }//GEN-LAST:event_fTabelKeyPressed

    private void dTambahUpdateRekeningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dTambahUpdateRekeningKeyPressed
       if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            setVisible(false);
        }
    }//GEN-LAST:event_dTambahUpdateRekeningKeyPressed

    private void fBankKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fBankKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            dTambahUpdateRekening.setVisible(false);
        }
    }//GEN-LAST:event_fBankKeyPressed

    private void fNorekKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNorekKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            dTambahUpdateRekening.setVisible(false);
        }
    }//GEN-LAST:event_fNorekKeyPressed

    private void fNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNamaKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            dTambahUpdateRekening.setVisible(false);
        }
    }//GEN-LAST:event_fNamaKeyPressed

    private void fDeactiveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fDeactiveKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            dTambahUpdateRekening.setVisible(false);
        }
    }//GEN-LAST:event_fDeactiveKeyPressed

    private void fActiveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fActiveKeyPressed
       if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            dTambahUpdateRekening.setVisible(false);
        }
    }//GEN-LAST:event_fActiveKeyPressed

    private void fSimpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fSimpanKeyPressed
       if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            dTambahUpdateRekening.setVisible(false);
        }
    }//GEN-LAST:event_fSimpanKeyPressed

    private void fBatalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fBatalKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            dTambahUpdateRekening.setVisible(false);
        }
    }//GEN-LAST:event_fBatalKeyPressed

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
            java.util.logging.Logger.getLogger(Master_Rekening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Master_Rekening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Master_Rekening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Master_Rekening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Master_Rekening().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDialog dTambahUpdateRekening;
    private javax.swing.JRadioButton fActive;
    private javax.swing.JTextField fBank;
    private javax.swing.JButton fBatal;
    private javax.swing.JTextField fCari;
    private javax.swing.JRadioButton fDeactive;
    private javax.swing.JButton fEdit;
    private javax.swing.JTextField fNama;
    private javax.swing.JTextField fNorek;
    private javax.swing.JButton fSimpan;
    private javax.swing.JTable fTabel;
    private javax.swing.JButton fTambah;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables

     private void buatTabel(){
        tabel_model = new DefaultTableModel();
        tabel_model.addColumn("No");
        tabel_model.addColumn("Nama Rekening");
        tabel_model.addColumn("Nomor Rekening");
        tabel_model.addColumn("Atas Nama");
        tabel_model.addColumn("Status");
        fTabel.setModel(tabel_model);
        //Untuk mengatur lebar kolom
        fTabel.getColumnModel().getColumn(0).setPreferredWidth(20);
        fTabel.getColumnModel().getColumn(1).setPreferredWidth(130); 
        fTabel.getColumnModel().getColumn(2).setPreferredWidth(130); 
        fTabel.getColumnModel().getColumn(3).setPreferredWidth(130); 
        fTabel.getColumnModel().getColumn(4).setPreferredWidth(80); 
        
        tampil();
    }
     
     private void tampil(){
        try {
             String query ="select kode_nama_keuangan, nama_keuangan, nomor_keuangan, atas_nama, status from transaksi_nama_keuangan";
             System.out.println("///");
             koneksi = new koneksi();
             con = (Connection) koneksi.Connect();
             hasil = koneksi.ambilData(query);
             String Object[] = new String[4];
             System.out.println("///");
             while (hasil.next()){
                     tabel_model.addRow(new Object[] {hasil.getString(1),hasil.getString(2),hasil.getString(3),hasil.getString(4),hasil.getString(5)});

             }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
            System.out.println(e);
        }
     }
     
     private void hapusTabel(){
        int row = tabel_model.getRowCount();
        for (int i=0; i<row; i++){
            tabel_model.removeRow(0);
        }
    }
     
    private void radio(){
        if (fDeactive.isSelected()){
            fActive.setSelected(false);
            status = fDeactive.getText();
            System.out.println(status);
        }else{
            fActive.setSelected(false);
            status = fActive.getText();
            System.out.println(status);
        }
    }
    
    private void simpanAtauEdit(){ 
        if(id > 0){
            edit();
        }else{
            bank = this.fBank.getText();
            norek = this.fNorek.getText();
            nama = this.fNama.getText();
            int angka = 0;
            radio();

            try{
                query= "SELECT kode_nama_keuangan FROM transaksi_nama_keuangan ORDER BY kode_nama_keuangan DESC LIMIT 1";
                hasil = koneksi.ambilData(query);
                while(hasil.next()){
                    angka = hasil.getInt("kode_nama_keuangan");
                    System.out.println(angka);

                    id = angka + 1;
                    System.out.println("id"+id);


                    String sql= "Insert into transaksi_nama_keuangan values ('"+id+"', '"+bank+"', '"+norek+"', '"+nama+"', '0', '"+status+"')";
                    System.out.println(sql);
                    koneksi.simpanData(sql);

                    JOptionPane.showMessageDialog(null,"Data sukses di input");
                    dTambahUpdateRekening.dispose();

                    buatTabel();
                    bersih();
                }

            }catch (SQLException e){
                System.out.println();
            }
        }    
    }
    
    private void edit(){
        try {
           String sql="Update transaksi_nama_keuangan set nama_keuangan=?, "
                    + "nomor_keuangan=?, atas_nama=?, status=? where kode_nama_keuangan=?" ;
            PreparedStatement p = (PreparedStatement) koneksi.Connect().prepareStatement(sql);
                p.setString(1, fBank.getText());
                p.setString(2, fNorek.getText());
                p.setString(3, fNama.getText());
                p.setString(4, status);
                p.setInt(5, id);
                p.executeUpdate();

                dTambahUpdateRekening.dispose();
                buatTabel();
                System.out.print(p);
                JOptionPane.showMessageDialog(null,"Data sukses di edit");
                bersih();
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }
    }
    
    private void ambilDataTabel(){
        int row= fTabel.getSelectedRow();
        if("true".equals(bool)){
            id  = (Integer.parseInt((String) fTabel.getValueAt(row, 0)));
            bank = ((String)fTabel.getValueAt(row, 1));
            norek = ((String)fTabel.getValueAt(row, 2));
            nama = ((String)fTabel.getValueAt(row, 3));
            status = ((String) fTabel.getValueAt(row, 4));
            bool="true";
        }else{
            id=0;
        }
    }
    
    private void bersih(){
        id = 0;
        fBank.setText("");
        fNorek.setText("");
        fNama.setText("");
    }
}
