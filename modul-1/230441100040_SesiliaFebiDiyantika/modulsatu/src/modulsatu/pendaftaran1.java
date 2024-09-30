/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modulsatu;




import javax.swing.JOptionPane;
/**
 *
 * @author Sesilia Febi
 */
public class pendaftaran1 extends javax.swing.JFrame {

    
    public pendaftaran1() {
        initComponents();
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
        labelNama = new javax.swing.JLabel();
        labelNIM = new javax.swing.JLabel();
        labelProdi = new javax.swing.JLabel();
        labelFakutas = new javax.swing.JLabel();
        labelJenisKelamin = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        labelPilihan1 = new javax.swing.JLabel();
        labelPilihan2 = new javax.swing.JLabel();
        bBatal = new javax.swing.JButton();
        txtNama = new javax.swing.JTextField();
        txtNIM = new javax.swing.JTextField();
        txtProdi = new javax.swing.JTextField();
        cbFakultas = new javax.swing.JComboBox<>();
        cbPilihan1 = new javax.swing.JComboBox<>();
        cbPilihan2 = new javax.swing.JComboBox<>();
        txtAlamat = new javax.swing.JTextField();
        rbLk = new javax.swing.JRadioButton();
        rbPr = new javax.swing.JRadioButton();
        ckbCentang = new javax.swing.JCheckBox();
        buttonSimpan = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        txtForm1 = new javax.swing.JLabel();
        txtForm2 = new javax.swing.JLabel();
        txtForm3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        labelNama.setText("Nama");

        labelNIM.setText("NIM");

        labelProdi.setText("Prodi");

        labelFakutas.setText("Fakultas");

        labelJenisKelamin.setText("Jenis Kelamin");

        labelAlamat.setText("Alamat");

        labelPilihan1.setText("Pilihan1");

        labelPilihan2.setText("Pilihan2");

        bBatal.setBackground(new java.awt.Color(204, 204, 255));
        bBatal.setText("Batal");
        bBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBatalActionPerformed(evt);
            }
        });

        txtNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIMActionPerformed(evt);
            }
        });

        txtProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdiActionPerformed(evt);
            }
        });

        cbFakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik", "Hukum", "Ilmu Pendidikan", "Ekonomi Bisnis", "Ilmu Sastra Budaya", "Keislaman Pertanian", "Kedokteran" }));

        cbPilihan1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humas", "POSDM", "Infokom", "Mikat", "KWU" }));
        cbPilihan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPilihan1ActionPerformed(evt);
            }
        });

        cbPilihan2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humas", "POSDM", "Infokom", "Mikat", "KWU" }));
        cbPilihan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPilihan2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbLk);
        rbLk.setText("Laki Laki");

        buttonGroup1.add(rbPr);
        rbPr.setText("Perempuan");

        ckbCentang.setText("Data Yang Saya Masukkan Sudah Benar");

        buttonSimpan.setBackground(new java.awt.Color(204, 204, 255));
        buttonSimpan.setText("Simpan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonReset.setBackground(new java.awt.Color(204, 204, 255));
        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAlamat)
                            .addComponent(labelPilihan1)
                            .addComponent(labelPilihan2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbPilihan1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbPilihan2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(rbLk)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbPr))))
                            .addComponent(labelJenisKelamin)
                            .addComponent(labelFakutas)
                            .addComponent(txtProdi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNIM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelProdi)
                            .addComponent(labelNIM)
                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbCentang)
                            .addComponent(labelNama))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(buttonSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(buttonReset)
                .addGap(82, 82, 82)
                .addComponent(bBatal)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(labelNIM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelProdi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFakutas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelJenisKelamin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLk)
                    .addComponent(rbPr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelAlamat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPilihan1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPilihan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPilihan2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPilihan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbCentang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBatal)
                    .addComponent(buttonSimpan)
                    .addComponent(buttonReset))
                .addGap(9, 9, 9))
        );

        labelLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\ikamala-removebg-preview (2).png")); // NOI18N

        txtForm1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtForm1.setText("FORMULIR PENDAFTARAN KEPENGURUSAN IKAMALA");

        txtForm2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtForm2.setText("2024/2025");

        txtForm3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtForm3.setText("UNIVERSITAS TRUNOYOJO MADURA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(labelLogo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(txtForm1)
                        .addGap(77, 77, 77))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(txtForm3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(txtForm2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtForm1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtForm3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtForm2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPilihan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPilihan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPilihan1ActionPerformed

    private void cbPilihan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPilihan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPilihan2ActionPerformed

    private void bBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBatalActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bBatalActionPerformed

    private void txtProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdiActionPerformed

    private void txtNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNIMActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        // TODO add your handling code here:
        txtNama.setText("");
        txtNIM.setText("");
        txtProdi.setText("");
        cbFakultas.setSelectedItem("Teknik");
        buttonGroup1.clearSelection();
        txtAlamat.setText("");
        cbPilihan1.setSelectedItem("Humas");
        cbPilihan2.setSelectedItem("Humas");
        ckbCentang.setSelected(false);
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        // TODO add your handling code here:
        pendaftaran2 daftar = new pendaftaran2();
        daftar.txtNama.setText(txtNama.getText());
        daftar.txtNIM.setText(txtNIM.getText());
        daftar.txtProdi.setText(txtProdi.getText());
        daftar.txtFakultas.setText(cbFakultas.getSelectedItem().toString());
        if (rbLk.isSelected()){
            daftar.txtJK.setText("Laki Laki");
        }
        if (rbPr.isSelected()){
            daftar.txtJK.setText("Perempuan");
        }
        daftar.txtAsal.setText(txtAlamat.getText());
        daftar.txtPilihan1.setText(cbPilihan1.getSelectedItem().toString());
        daftar.txtPilihan2.setText(cbPilihan2.getSelectedItem().toString());
        if (ckbCentang.isSelected()){
            if(txtNama.getText().isEmpty()
                    || txtNIM.getText().isEmpty()
                    || txtProdi.getText().isEmpty() 
                    || txtAlamat.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Pastikan Data Anda Sudah Lengkap");}
            else{
            daftar.setVisible(true);
            dispose();
                }
        }
        
            
            
        
        
    }//GEN-LAST:event_buttonSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(pendaftaran1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pendaftaran1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pendaftaran1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pendaftaran1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pendaftaran1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBatal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonSimpan;
    public javax.swing.JComboBox<String> cbFakultas;
    public javax.swing.JComboBox<String> cbPilihan1;
    public javax.swing.JComboBox<String> cbPilihan2;
    private javax.swing.JCheckBox ckbCentang;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelFakutas;
    private javax.swing.JLabel labelJenisKelamin;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelNIM;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelPilihan1;
    private javax.swing.JLabel labelPilihan2;
    private javax.swing.JLabel labelProdi;
    public javax.swing.JRadioButton rbLk;
    public javax.swing.JRadioButton rbPr;
    public javax.swing.JTextField txtAlamat;
    private javax.swing.JLabel txtForm1;
    private javax.swing.JLabel txtForm2;
    private javax.swing.JLabel txtForm3;
    public javax.swing.JTextField txtNIM;
    public javax.swing.JTextField txtNama;
    public javax.swing.JTextField txtProdi;
    // End of variables declaration//GEN-END:variables
}
