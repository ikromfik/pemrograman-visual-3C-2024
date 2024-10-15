/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistempemesananbunga;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author natas
 */
public class SistemPemesananBucketBunga extends javax.swing.JFrame {

    /**
     * Creates new form SistemPemesananBucketBunga
     */
    public SistemPemesananBucketBunga() {
        initComponents();
        tfJumlah.setText("1");
        tfCash.getDocument().addDocumentListener(new DocumentListener() {
            public void removeUpdate(DocumentEvent e) {
                hitungKembalian();
            }
            public void insertUpdate(DocumentEvent e) {
                hitungKembalian();
            }

            public void changedUpdate(DocumentEvent e) {
                 }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgrKatalog = new javax.swing.ButtonGroup();
        btgrAksenTambahan = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lKataKata = new javax.swing.JLabel();
        rbMysticalDelight = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        lAksenTambahan = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lJumlah = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        tfJumlah = new javax.swing.JTextField();
        btnTotal = new javax.swing.JButton();
        lTotal = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lCash = new javax.swing.JLabel();
        lKembali = new javax.swing.JLabel();
        tfCash = new javax.swing.JTextField();
        tfKembali = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        lMysticalDelight = new javax.swing.JLabel();
        lkatalog = new javax.swing.JLabel();
        rbBloomingHarmony = new javax.swing.JRadioButton();
        lBloomingHarmony = new javax.swing.JLabel();
        rbGoldenSunshine = new javax.swing.JRadioButton();
        lGoldenSunshine = new javax.swing.JLabel();
        lSweetRomance = new javax.swing.JLabel();
        rbSweetRomance = new javax.swing.JRadioButton();
        rbCharmingWhimsy = new javax.swing.JRadioButton();
        lCharmingWhimsy = new javax.swing.JLabel();
        rbRadiantCelebration = new javax.swing.JRadioButton();
        lRadiantCelebration = new javax.swing.JLabel();
        cbHiasanBintang = new javax.swing.JCheckBox();
        cbOrnamenBunga = new javax.swing.JCheckBox();
        cbKainGoni = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 229, 229));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\natas\\Documents\\tugas natasya\\SEMESTER III\\PEMVIS\\TUGAS\\PRAKTIKUM\\Tugas Praktikum\\Modul2\\logo 2 idar.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 286, 115));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(134, 26, 26));
        jLabel2.setText("Membuat momen lebih indah dengan bunga");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(134, 26, 26));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempemesananbunga/icons8-tiktok-30.png"))); // NOI18N
        jLabel3.setText("TikTok : natasyaflorist_");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(134, 26, 26));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempemesananbunga/icons8-phone-24.png"))); // NOI18N
        jLabel4.setText("Telepon : 085159443849");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(134, 26, 26));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempemesananbunga/icons8-instagram-24.png"))); // NOI18N
        jLabel5.setText("Instagram : @natasyaflorist_");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(134, 26, 26));
        jLabel7.setText("Promo Spesial!");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(134, 26, 26));
        jLabel8.setText("Diskon 5% untuk Setiap Pemesanan Rangkaian");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(134, 26, 26));
        jLabel9.setText("Jika Total Pembelian melebihi Rp.100.000");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(134, 26, 26));
        jLabel10.setText("Ikuti Kami di Media Sosial untuk Update Terbaru");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(134, 26, 26));
        jLabel11.setText("Senin - Sabtu, 09:00 - 20:00 WIB");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(134, 26, 26));
        jLabel12.setText("Jl. Lakarsantri, No.58, Surabaya");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(134, 26, 26));
        jLabel13.setText("Berlaku Hingga 30 Oktober 2024");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        jPanel2.setPreferredSize(new java.awt.Dimension(660, 1000));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lKataKata.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        lKataKata.setForeground(new java.awt.Color(134, 26, 26));
        lKataKata.setText("Pilih dan Rangkai Bucket Bunga Anda!");
        jPanel2.add(lKataKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 30));

        btgrKatalog.add(rbMysticalDelight);
        rbMysticalDelight.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbMysticalDelight.setForeground(new java.awt.Color(134, 26, 26));
        rbMysticalDelight.setText("Mystical Delight - Rp. 59.000");
        rbMysticalDelight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMysticalDelightActionPerformed(evt);
            }
        });
        jPanel2.add(rbMysticalDelight, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 190, -1));

        jSeparator1.setPreferredSize(new java.awt.Dimension(300, 2));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 480, 10));

        lAksenTambahan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lAksenTambahan.setForeground(new java.awt.Color(134, 26, 26));
        lAksenTambahan.setText("Aksen Tambahan");
        jPanel2.add(lAksenTambahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 110, -1));

        jSeparator2.setPreferredSize(new java.awt.Dimension(300, 2));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 480, 10));

        lJumlah.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lJumlah.setForeground(new java.awt.Color(134, 26, 26));
        lJumlah.setText("Jumlah");
        jPanel2.add(lJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 46, -1));

        btnTambah.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(134, 26, 26));
        btnTambah.setText("+");
        btnTambah.setPreferredSize(new java.awt.Dimension(40, 30));
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jPanel2.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));
        jPanel2.add(tfJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 50, 30));

        btnTotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTotal.setForeground(new java.awt.Color(134, 26, 26));
        btnTotal.setText("Total");
        btnTotal.setPreferredSize(new java.awt.Dimension(100, 50));
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });
        jPanel2.add(btnTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 70, 40));

        lTotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lTotal.setForeground(new java.awt.Color(134, 26, 26));
        lTotal.setText("Total");
        jPanel2.add(lTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, -1));

        tfTotal.setEditable(false);
        jPanel2.add(tfTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 140, 30));

        jSeparator3.setPreferredSize(new java.awt.Dimension(300, 2));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 480, 10));

        lCash.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lCash.setForeground(new java.awt.Color(134, 26, 26));
        lCash.setText("Cash");
        jPanel2.add(lCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 31, -1));

        lKembali.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lKembali.setForeground(new java.awt.Color(134, 26, 26));
        lKembali.setText("Kembali");
        jPanel2.add(lKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, -1, -1));

        tfCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCashActionPerformed(evt);
            }
        });
        jPanel2.add(tfCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 150, 30));

        tfKembali.setEditable(false);
        tfKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKembaliActionPerformed(evt);
            }
        });
        jPanel2.add(tfKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 160, 30));

        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(134, 26, 26));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, -1, -1));

        btnKurang.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnKurang.setForeground(new java.awt.Color(134, 26, 26));
        btnKurang.setText("-");
        btnKurang.setPreferredSize(new java.awt.Dimension(40, 30));
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });
        jPanel2.add(btnKurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, 30));

        lMysticalDelight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempemesananbunga/icons8-bouquet-62 (1).png"))); // NOI18N
        jPanel2.add(lMysticalDelight, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        lkatalog.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lkatalog.setForeground(new java.awt.Color(134, 26, 26));
        lkatalog.setText("Flower Bouquet Catalogue");
        jPanel2.add(lkatalog, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 200, 30));

        btgrKatalog.add(rbBloomingHarmony);
        rbBloomingHarmony.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbBloomingHarmony.setForeground(new java.awt.Color(134, 26, 26));
        rbBloomingHarmony.setText("Blooming Harmony - Rp.90.000");
        rbBloomingHarmony.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBloomingHarmonyActionPerformed(evt);
            }
        });
        jPanel2.add(rbBloomingHarmony, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 210, -1));

        lBloomingHarmony.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempemesananbunga/icons8-bouquet-64 (3).png"))); // NOI18N
        jPanel2.add(lBloomingHarmony, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 60));

        btgrKatalog.add(rbGoldenSunshine);
        rbGoldenSunshine.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbGoldenSunshine.setForeground(new java.awt.Color(134, 26, 26));
        rbGoldenSunshine.setText("Golden Sunshine - Rp.85.000 ");
        jPanel2.add(rbGoldenSunshine, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 200, -1));

        lGoldenSunshine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempemesananbunga/icons8-bouquet-64 (4).png"))); // NOI18N
        jPanel2.add(lGoldenSunshine, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 60));

        lSweetRomance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempemesananbunga/icons8-bouquet-64 (5).png"))); // NOI18N
        jPanel2.add(lSweetRomance, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        btgrKatalog.add(rbSweetRomance);
        rbSweetRomance.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbSweetRomance.setForeground(new java.awt.Color(134, 26, 26));
        rbSweetRomance.setText("Sweet Romance - Rp. 75.000");
        jPanel2.add(rbSweetRomance, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 190, -1));

        btgrKatalog.add(rbCharmingWhimsy);
        rbCharmingWhimsy.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbCharmingWhimsy.setForeground(new java.awt.Color(134, 26, 26));
        rbCharmingWhimsy.setText("Charming Whimsy - Rp.88.000");
        rbCharmingWhimsy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCharmingWhimsyActionPerformed(evt);
            }
        });
        jPanel2.add(rbCharmingWhimsy, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 200, -1));

        lCharmingWhimsy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempemesananbunga/icons8-bouquet-66 (1).png"))); // NOI18N
        jPanel2.add(lCharmingWhimsy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 60, 70));

        btgrKatalog.add(rbRadiantCelebration);
        rbRadiantCelebration.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbRadiantCelebration.setForeground(new java.awt.Color(134, 26, 26));
        rbRadiantCelebration.setText("Radiant Celebration - Rp.65.000");
        rbRadiantCelebration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRadiantCelebrationActionPerformed(evt);
            }
        });
        jPanel2.add(rbRadiantCelebration, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 200, -1));

        lRadiantCelebration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempemesananbunga/icons8-bouquet-70 (2).png"))); // NOI18N
        jPanel2.add(lRadiantCelebration, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        cbHiasanBintang.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cbHiasanBintang.setForeground(new java.awt.Color(134, 26, 26));
        cbHiasanBintang.setText("Hiasan Bintang Kecil – Rp. 10.000");
        jPanel2.add(cbHiasanBintang, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        cbOrnamenBunga.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cbOrnamenBunga.setForeground(new java.awt.Color(134, 26, 26));
        cbOrnamenBunga.setText("Ornamen Daun Eucalyptus – Rp. 15.000");
        cbOrnamenBunga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrnamenBungaActionPerformed(evt);
            }
        });
        jPanel2.add(cbOrnamenBunga, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        cbKainGoni.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cbKainGoni.setForeground(new java.awt.Color(134, 26, 26));
        cbKainGoni.setText("Kain Goni Pembungkus – Rp. 20.000");
        jPanel2.add(cbKainGoni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempemesananbunga/Untitled design (2).jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMysticalDelightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMysticalDelightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMysticalDelightActionPerformed

    private void hitungKembalian() {
    try {
        // Ambil total harga dari TextField tfTotal
        int total = Integer.parseInt(tfTotal.getText());
    
        // Ambil jumlah uang yang diinputkan oleh pembeli dari TextField tfCash
        int uangPembeli = Integer.parseInt(tfCash.getText());

        // Hitung kembalian
        int kembali = uangPembeli - total;

        // Tampilkan kembalian di TextField tfKembalian
        if (kembali < 0) {
            tfKembali.setText("Uang tidak cukup");
        } else {
            tfKembali.setText(String.valueOf(kembali));
        }
    } catch (NumberFormatException e) {
        // Jika input belum valid (misalnya kosong atau bukan angka), kosongkan tfKembalian
        tfKembali.setText("");
    }
}

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        if(!rbBloomingHarmony.isSelected() && !rbGoldenSunshine .isSelected() && !rbCharmingWhimsy .isSelected() && !rbRadiantCelebration.isSelected()
           && !rbSweetRomance.isSelected() && !rbMysticalDelight.isSelected()){
            // Jika tidak ada menu yang dipilih, tampilkan pesan peringatan
            JOptionPane.showMessageDialog(null, "Silahkan pilih catalogue terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }else{
            int total = 0;
            int jumlah = Integer.parseInt(tfJumlah.getText()); // Ambil nilai jumlah

            if (rbBloomingHarmony.isSelected()) total+= 90000;
                else if (rbGoldenSunshine.isSelected()) total += 85000;
                else if (rbCharmingWhimsy.isSelected()) total += 88000;
                else if (rbRadiantCelebration.isSelected()) total += 65000;
                else if (rbSweetRomance.isSelected()) total += 75000;
                else if (rbMysticalDelight.isSelected()) total += 59000;
                
            if (cbOrnamenBunga.isSelected()) total+= 15000;
            if (cbHiasanBintang.isSelected()) total+= 10000;
            if (cbKainGoni.isSelected()) total+= 20000;
                
            // Hitung total berdasarkan jumlah
             total *= jumlah;

             // Diskon 5% jika total lebih dari Rp 100.000
             if (total > 100000) {
                 total *= 0.95;
             }

             // Tampilkan total harga ke TextField 
             tfTotal.setText(String.valueOf(total));
           }
     
    }//GEN-LAST:event_btnTotalActionPerformed

    private void tfKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKembaliActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
                tfKembali.setText("");
                tfTotal.setText("");
                tfJumlah.setText("1");
                tfCash.setText("");
                btgrKatalog.clearSelection();
                cbOrnamenBunga.setSelected(false);
                cbHiasanBintang.setSelected(false);
                cbKainGoni.setSelected(false);
    }//GEN-LAST:event_btnResetActionPerformed

    private void rbBloomingHarmonyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBloomingHarmonyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbBloomingHarmonyActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
            int jumlah = Integer.parseInt(tfJumlah.getText());
            jumlah++; // Menambah jumlah pesanan
            tfJumlah.setText(String.valueOf(jumlah));
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
                int jumlah = Integer.parseInt(tfJumlah.getText());
                if (jumlah > 1) { // Minimal pesanan adalah 1
                    jumlah--; // Mengurangi jumlah pesanan
                }
                tfJumlah.setText(String.valueOf(jumlah));
    }//GEN-LAST:event_btnKurangActionPerformed

    private void rbRadiantCelebrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRadiantCelebrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbRadiantCelebrationActionPerformed

    private void rbCharmingWhimsyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCharmingWhimsyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCharmingWhimsyActionPerformed

    private void tfCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCashActionPerformed

    private void cbOrnamenBungaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrnamenBungaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrnamenBungaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        // Buat JFrame
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SistemPemesananBucketBunga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemPemesananBucketBunga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemPemesananBucketBunga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemPemesananBucketBunga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemPemesananBucketBunga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgrAksenTambahan;
    private javax.swing.ButtonGroup btgrKatalog;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTotal;
    private javax.swing.JCheckBox cbHiasanBintang;
    private javax.swing.JCheckBox cbKainGoni;
    private javax.swing.JCheckBox cbOrnamenBunga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lAksenTambahan;
    private javax.swing.JLabel lBloomingHarmony;
    private javax.swing.JLabel lCash;
    private javax.swing.JLabel lCharmingWhimsy;
    private javax.swing.JLabel lGoldenSunshine;
    private javax.swing.JLabel lJumlah;
    private javax.swing.JLabel lKataKata;
    private javax.swing.JLabel lKembali;
    private javax.swing.JLabel lMysticalDelight;
    private javax.swing.JLabel lRadiantCelebration;
    private javax.swing.JLabel lSweetRomance;
    private javax.swing.JLabel lTotal;
    private javax.swing.JLabel lkatalog;
    private javax.swing.JRadioButton rbBloomingHarmony;
    private javax.swing.JRadioButton rbCharmingWhimsy;
    private javax.swing.JRadioButton rbGoldenSunshine;
    private javax.swing.JRadioButton rbMysticalDelight;
    private javax.swing.JRadioButton rbRadiantCelebration;
    private javax.swing.JRadioButton rbSweetRomance;
    private javax.swing.JTextField tfCash;
    private javax.swing.JTextField tfJumlah;
    private javax.swing.JTextField tfKembali;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables

    private void isSelected() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
