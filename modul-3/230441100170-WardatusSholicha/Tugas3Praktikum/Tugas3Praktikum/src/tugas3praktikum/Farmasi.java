/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas3praktikum;


import javax.swing.JOptionPane;
import javax.swing.*; // Untuk semua komponen Swing
import java.awt.*; // Untuk layout dan komponen lainnya
import java.awt.event.*; // Untuk menangani event


/**
 *
 * @author HP
 */
public class Farmasi extends javax.swing.JFrame {
            
    public Farmasi() {
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

        PanelGejala = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DetailObat = new javax.swing.JPanel();
        detail = new javax.swing.JPanel();
        tfNamaObat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDetail = new javax.swing.JTextArea();
        lbDetail = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Tombol = new javax.swing.JPanel();
        btnHapus = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        Obat = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CBAllopurinol = new javax.swing.JCheckBox();
        CBParacetamol = new javax.swing.JCheckBox();
        CBOmeprazole = new javax.swing.JCheckBox();
        CBAmoxicillin = new javax.swing.JCheckBox();
        CBSplasminal = new javax.swing.JCheckBox();
        CBIbuProfen = new javax.swing.JCheckBox();
        CBKetoconazole = new javax.swing.JCheckBox();
        CBLodyah = new javax.swing.JCheckBox();
        CBAtovarstatin = new javax.swing.JCheckBox();
        CBMefanamat = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.BorderLayout(5, 5));

        PanelGejala.setBackground(new java.awt.Color(255, 255, 255));
        PanelGejala.setMinimumSize(new java.awt.Dimension(120, 26));
        PanelGejala.setPreferredSize(new java.awt.Dimension(100, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Selamat Datang di \"Care & Cure Pharmacy\"");
        PanelGejala.add(jLabel1);

        getContentPane().add(PanelGejala, java.awt.BorderLayout.PAGE_START);

        DetailObat.setBackground(new java.awt.Color(188, 228, 228));
        DetailObat.setMaximumSize(new java.awt.Dimension(120, 120));
        DetailObat.setMinimumSize(new java.awt.Dimension(100, 100));
        DetailObat.setPreferredSize(new java.awt.Dimension(300, 200));
        DetailObat.setLayout(new javax.swing.BoxLayout(DetailObat, javax.swing.BoxLayout.Y_AXIS));

        detail.setBackground(new java.awt.Color(255, 204, 204));
        detail.setPreferredSize(new java.awt.Dimension(90, 95));
        detail.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfNamaObat.setPreferredSize(new java.awt.Dimension(10, 15));
        detail.add(tfNamaObat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 230, 30));

        taDetail.setColumns(20);
        taDetail.setRows(5);
        taDetail.setPreferredSize(new java.awt.Dimension(60, 80));
        jScrollPane1.setViewportView(taDetail);

        detail.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        lbDetail.setText("Nama Obat :");
        detail.add(lbDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/bg.png"))); // NOI18N
        detail.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 500));

        DetailObat.add(detail);

        getContentPane().add(DetailObat, java.awt.BorderLayout.LINE_START);

        Tombol.setBackground(new java.awt.Color(204, 204, 255));

        btnHapus.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        Tombol.add(btnHapus);

        btnInfo.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnInfo.setText("Detail Obat");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        Tombol.add(btnInfo);

        getContentPane().add(Tombol, java.awt.BorderLayout.PAGE_END);

        Obat.setBackground(new java.awt.Color(255, 255, 255));
        Obat.setPreferredSize(new java.awt.Dimension(100, 80));
        Obat.setLayout(new java.awt.GridLayout(2, 5, 2, 3));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/spasminal.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 60, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/Atorvastatin.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/pharmacy.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 160, 10));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/pharmacy.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 170, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/pharmacy.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 170, 10));

        CBAllopurinol.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        CBAllopurinol.setText("Allopurinol");
        jPanel1.add(CBAllopurinol, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        CBParacetamol.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        CBParacetamol.setText("Paracetamol");
        jPanel1.add(CBParacetamol, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        CBOmeprazole.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        CBOmeprazole.setText("Omperazole");
        jPanel1.add(CBOmeprazole, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        CBAmoxicillin.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        CBAmoxicillin.setText("Amoxicillin");
        jPanel1.add(CBAmoxicillin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        CBSplasminal.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        CBSplasminal.setText("Spasminal");
        jPanel1.add(CBSplasminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        CBIbuProfen.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        CBIbuProfen.setText("Ibuprofen");
        CBIbuProfen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBIbuProfenActionPerformed(evt);
            }
        });
        jPanel1.add(CBIbuProfen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        CBKetoconazole.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        CBKetoconazole.setText("Ketoconazole");
        jPanel1.add(CBKetoconazole, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        CBLodyah.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        CBLodyah.setText("Lodia");
        jPanel1.add(CBLodyah, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        CBAtovarstatin.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        CBAtovarstatin.setText("Atorvastatin");
        CBAtovarstatin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBAtovarstatinActionPerformed(evt);
            }
        });
        jPanel1.add(CBAtovarstatin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        CBMefanamat.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        CBMefanamat.setText("Asam Mefanamat");
        jPanel1.add(CBMefanamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/paracetamol.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/Ibuprofen.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/pharmacy.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 170, 10));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/pharmacy.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, 10));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/pharmacy.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 170, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/amoxicillin.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/lodia.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/omprazole.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/ketoconazole.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/Allopurinol.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/mefanamat.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        Obat.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(110, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas3praktikum/kasir .png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 220));

        Obat.add(jPanel2);

        getContentPane().add(Obat, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(774, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        CBParacetamol.setSelected(false);
        CBMefanamat.setSelected(false);
        CBLodyah.setSelected(false);
        CBOmeprazole.setSelected(false);
        CBAmoxicillin.setSelected(false);
        CBIbuProfen.setSelected(false);
        CBSplasminal.setSelected(false);
        CBKetoconazole.setSelected(false);
        CBAtovarstatin.setSelected(false);
        
        DetailObat.removeAll(); 
    
    DetailObat.revalidate(); 
    DetailObat.repaint(); 
        

    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        DetailObat.removeAll();
        
        if (CBParacetamol.isSelected()) {
            addDetail("Paracetamol", "Digunakan untuk mengurangi rasa sakit dan demam.", "1-2 tablet setiap 4-6 jam.");
        }
        if (CBMefanamat.isSelected()) {
            addDetail("Asam Mefenamat", "Digunakan untuk meredakan nyeri ringan hingga sedang.", "500 mg, diulang setiap 6-8 jam jika diperlukan.");
        }
        if (CBLodyah.isSelected()) {
            addDetail("Lodia", "Digunakan untuk mengobati alergi.", "Sesuai petunjuk dokter.");
        }
        if (CBOmeprazole.isSelected()) {
            addDetail("Omeprazole", "Digunakan untuk mengobati tukak lambung.", "20 mg sekali sehari.");
        }
        if (CBIbuProfen.isSelected()) {
            addDetail("Ibuprofen", "Digunakan untuk mengurangi nyeri dan peradangan.", "200-400 mg setiap 4-6 jam.");
        }
        if (CBAmoxicillin.isSelected()) {
            addDetail("Amoxicillin", "Antibiotik untuk mengobati infeksi bakteri.", "250-500 mg setiap 8 jam.");
        }
        if (CBSplasminal.isSelected()) {
            addDetail("Spasminal", "Digunakan untuk mengatasi kram perut.", "Sesuai petunjuk dokter.");
        }
        if (CBKetoconazole.isSelected()) {
            addDetail("Ketoconazole", "Antijamur untuk mengobati infeksi jamur.", "Sesuai petunjuk dokter.");
        }
        if (CBAtovarstatin.isSelected()) {
            addDetail("Atorvastatin", "Digunakan untuk menurunkan kolesterol.", "10-80 mg sekali sehari.");
        }
        if (CBAllopurinol.isSelected()) {
            addDetail("Allopurinol", "Digunakan untuk mengobati gout.", "Dosis ditentukan oleh dokter.");
        }

        // Refresh panel agar perubahan terlihat
        DetailObat.revalidate();
        DetailObat.repaint();
    }

    private void addDetail(String namaObat, String detail, String caraPakai) {
        JTextField tfNamaObat = new JTextField(namaObat);
        tfNamaObat.setEditable(false);
        tfNamaObat.setColumns(20);
        
        JTextArea taDetail = new JTextArea(5, 20);
        taDetail.setText("Detail Obat :" + detail + "\n Cara Pakai :" + "\n" + caraPakai);
        taDetail.setWrapStyleWord(true);
        taDetail.setLineWrap(true);
        taDetail.setEditable(false);
        taDetail.setOpaque(false); 
        
        DetailObat.add(new JLabel("Nama Obat:")); 
        DetailObat.add(tfNamaObat); 
        DetailObat.add(taDetail); 
    }//GEN-LAST:event_btnInfoActionPerformed

    private void CBAtovarstatinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBAtovarstatinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBAtovarstatinActionPerformed

    private void CBIbuProfenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBIbuProfenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBIbuProfenActionPerformed

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
            java.util.logging.Logger.getLogger(Farmasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Farmasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Farmasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Farmasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Farmasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CBAllopurinol;
    private javax.swing.JCheckBox CBAmoxicillin;
    private javax.swing.JCheckBox CBAtovarstatin;
    private javax.swing.JCheckBox CBIbuProfen;
    private javax.swing.JCheckBox CBKetoconazole;
    private javax.swing.JCheckBox CBLodyah;
    private javax.swing.JCheckBox CBMefanamat;
    private javax.swing.JCheckBox CBOmeprazole;
    private javax.swing.JCheckBox CBParacetamol;
    private javax.swing.JCheckBox CBSplasminal;
    private javax.swing.JPanel DetailObat;
    private javax.swing.JPanel Obat;
    private javax.swing.JPanel PanelGejala;
    private javax.swing.JPanel Tombol;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnInfo;
    private javax.swing.JPanel detail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDetail;
    private javax.swing.JTextArea taDetail;
    private javax.swing.JTextField tfNamaObat;
    // End of variables declaration//GEN-END:variables
}