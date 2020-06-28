

/**
 *      Nama            : St. Hatijah H.Ilyas
 *      Stambuk         : 13020180061
 *      Hari/Tanggal    : Minggu, 28 Juli 2020
 *      Waktu           : 13.09 WITA
 */


package tiket;

import menu.form_login;
import server.Koneksi;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;


public class form_kereta extends javax.swing.JDialog {
    int Vip, Ekonomi, Harga, Beli, Total, Bayar, Kembali;
    tiket tik;

    /**
     * Creates new form form_kereta
     */
    public form_kereta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tik=new tiket();
        TableModel modelkereta;
        table_kereta.setModel(tik.modelkereta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbVip = new javax.swing.JRadioButton();
        rbEkonomi = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jurusan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtJml = new javax.swing.JTextField();
        txtByr = new javax.swing.JTextField();
        txtTtl = new javax.swing.JTextField();
        txtKembali = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btn_simpan = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_kereta = new javax.swing.JTable();

        jPanel1.setBackground(java.awt.Color.pink);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.pink);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("PENJUALAN TIKET KERETA API ONLINE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 70));

        jPanel4.setBackground(java.awt.Color.lightGray);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data Kereta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Jurusan");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Jenis");

        rbVip.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbVip.setText("VIP");
        rbVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVipActionPerformed(evt);
            }
        });

        rbEkonomi.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbEkonomi.setText("Ekonomi");
        rbEkonomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEkonomiActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Harga");

        jurusan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jurusanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbEkonomi)
                    .addComponent(rbVip)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbVip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbEkonomi)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("No Kursi");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Nama Penumpang");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Jumlah Beli");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Uang Bayar");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Total Bayar");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Uang Kembali");

        txtJml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJmlActionPerformed(evt);
            }
        });
        txtJml.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJmlKeyReleased(evt);
            }
        });

        txtByr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtByrKeyReleased(evt);
            }
        });

        txtTtl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTtlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNo, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(txtNama)
                    .addComponent(txtJml)
                    .addComponent(txtByr)
                    .addComponent(txtTtl)
                    .addComponent(txtKembali))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtJml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtByr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtTtl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.getAccessibleContext().setAccessibleName("");
        jPanel3.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 790, 240));

        jPanel5.setBackground(java.awt.Color.pink);

        btn_simpan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_edit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_keluar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btn_simpan)
                .addGap(42, 42, 42)
                .addComponent(btn_edit)
                .addGap(47, 47, 47)
                .addComponent(btn_hapus)
                .addGap(42, 42, 42)
                .addComponent(btn_reset)
                .addGap(53, 53, 53)
                .addComponent(btn_keluar)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan)
                    .addComponent(btn_edit)
                    .addComponent(btn_hapus)
                    .addComponent(btn_reset)
                    .addComponent(btn_keluar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 790, 70));

        table_kereta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table_kereta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 790, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean edit = false;
    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        String no_kursi=txtNo.getText();
        String nama=txtNama.getText();
        String bayar=txtByr.getText();
        String jml=txtJml.getText();
        String ttl=txtTtl.getText();
        String kembali=txtKembali.getText();
        if(txtNo.equals("")){
            JOptionPane.showMessageDialog(null, "Data Harus Diisi");
            txtNo.requestFocus();
        }
        else if(txtHarga.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Data Harus Diisi");
            txtHarga.requestFocus();
        }
        else if(txtNama.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Data Harus Diisi");
            txtNama.requestFocus();
        }
        else if(txtByr.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Data Harus Diisi");
            txtByr.requestFocus();
        }
        else if(txtJml.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Data Harus Diisi");
            txtJml.requestFocus();
        }
        else if(txtTtl.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Data Harus Diisi");
            txtTtl.requestFocus();
        }
        else if(txtKembali.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Data Harus Diisi");
            txtKembali.requestFocus();
        }
        else{
            if(edit==false){
                tik.simpan_tiket(no_kursi, nama, kembali, bayar, bayar, kembali);
            }
            else{
                tik.edit_tiket(no_kursi, nama, kembali, bayar, bayar, kembali);
            }
        }
        
        edit=false;
        tik.tampilDataKereta();
        txtNo.setText("");
        txtNama.setText("");
        txtJml.setText("");
        txtByr.setText("");
        txtTtl.setText("");
        txtKembali.setText("");
        txtNo.requestFocus();
        
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void txtJmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJmlActionPerformed
        // TODO add your handling code here:
        Beli = Integer.parseInt(txtJml.getText());
        Harga = Integer.parseInt(txtByr.getText());
        Total = Harga*Bayar;
        txtTtl.setText(String.valueOf(Total));
    }//GEN-LAST:event_txtJmlActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        boolean edit=false;
                edit=true;
        int row=table_kereta.getSelectedRow();
        String no_kursi=table_kereta.getValueAt(row, 0).toString();
        String nama=table_kereta.getValueAt(row, 1).toString();
        String jml=table_kereta.getValueAt(row, 2).toString();
        String byr=table_kereta.getValueAt(row, 3).toString();
        String ttl=table_kereta.getValueAt(row, 4).toString();
        String kembali=table_kereta.getValueAt(row, 5).toString();
        txtNo.setText(no_kursi);
        txtNama.setText(nama);
        txtJml.setText(jml);
        txtByr.setText(byr);
        txtTtl.setText(ttl);
        txtKembali.setText(kembali);
        txtNo.setEditable(true);
        txtNama.requestFocus();
        txtNama.selectAll();
        
        txtNo.setEditable(true);
        txtNama.setEditable(true);
        btn_simpan.setEnabled(true);
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Data Akan Dihapus?","Konfirmasi",JOptionPane.YES_OPTION);
        if(konfirmasi==JOptionPane.YES_OPTION){
            int row=table_kereta.getSelectedRow();
            String no_kursi=table_kereta.getValueAt(row, 0).toString();
            tik.hapus_tiket(no_kursi);
            tik.tampilDataKereta();
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    boolean New=false;
    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        txtNo.setText("");
        txtNama.setText("");
        txtJml.setText("");
        txtByr.setText("");
        txtTtl.setText("");
        txtKembali.setText("");
        btn_simpan.setEnabled(true);
        btn_reset.setEnabled(false);
        New = true;
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
        int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Ingin Keluar?","Konfirmasi",JOptionPane.YES_OPTION);
        if(konfirmasi==JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void txtTtlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTtlActionPerformed
        // TODO add your handling code here:
        Bayar=Integer.parseInt(txtByr.getText());
        Kembali=Integer.parseInt(txtTtl.getText());
        Total=Harga-Kembali;
        txtKembali.setText(String.valueOf(Total));
    }//GEN-LAST:event_txtTtlActionPerformed

    private void txtJmlKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJmlKeyReleased
        // TODO add your handling code here:
        int a,b,c;
        a=Integer.valueOf(txtHarga.getText());
        b=Integer.valueOf(txtJml.getText());
        c=a*b;
        txtTtl.setText(""+c);
    }//GEN-LAST:event_txtJmlKeyReleased

    private void txtByrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtByrKeyReleased
        // TODO add your handling code here:
        int a,b,c;
        a=Integer.valueOf(txtByr.getText());
        b=Integer.valueOf(txtTtl.getText());
        c=a-b;
        txtKembali.setText(""+c);
    }//GEN-LAST:event_txtByrKeyReleased

    private void rbVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVipActionPerformed
        // TODO add your handling code here:
        if(rbVip.isSelected());
        txtHarga.setText(String.valueOf(Vip));
    }//GEN-LAST:event_rbVipActionPerformed

    private void rbEkonomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEkonomiActionPerformed
        // TODO add your handling code here:
        if(rbEkonomi.isSelected());
        txtHarga.setText(String.valueOf(Ekonomi));
    }//GEN-LAST:event_rbEkonomiActionPerformed

    private void jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jurusanActionPerformed
        // TODO add your handling code here:
        if(jurusan.getSelectedItem().equals("Pilih Jurusan")){
            txtHarga.setText("");
        }
        else if(jurusan.getSelectedItem().equals("Pemalang")){
            Vip=160000;
            Ekonomi=95000;
        }
        else if(jurusan.getSelectedItem().equals("Solo")){
            Vip=140000;
            Ekonomi=85000;
        }
        else if(jurusan.getSelectedItem().equals("Semarang")){
            Vip=145000;
            Ekonomi=80000;
        }
        else if(jurusan.getSelectedItem().equals("Tegal")){
            Vip=130000;
            Ekonomi=100000;
        }
    }//GEN-LAST:event_jurusanActionPerformed

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
            java.util.logging.Logger.getLogger(form_kereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_kereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_kereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_kereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                form_kereta dialog = new form_kereta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e){
                        System.exit(0);
                    }
});
                dialog.setVisible(true);
                //new form_kereta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_simpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jurusan;
    private javax.swing.JRadioButton rbEkonomi;
    private javax.swing.JRadioButton rbVip;
    private javax.swing.JTable table_kereta;
    private javax.swing.JTextField txtByr;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJml;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtTtl;
    // End of variables declaration//GEN-END:variables
}
