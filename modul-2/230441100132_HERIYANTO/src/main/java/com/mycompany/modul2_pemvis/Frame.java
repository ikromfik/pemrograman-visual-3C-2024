/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.modul2_pemvis;

import javax.swing.JOptionPane;
/**
 *
 * @author engko
 */
public class Frame extends javax.swing.JFrame {
    int topping1 = 0;
    int topping2 = 0;
    /**
     * Creates new form Frame
     */
    public Frame() {
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RdWaffles = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        RdSwiss = new javax.swing.JRadioButton();
        RdPancakes = new javax.swing.JRadioButton();
        RdCherry = new javax.swing.JRadioButton();
        Matcha = new javax.swing.JRadioButton();
        RdCupcake = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        RdBrownies = new javax.swing.JRadioButton();
        notopping = new javax.swing.JRadioButton();
        Kacang = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Oreo = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Bkeluar = new javax.swing.JButton();
        ButtonMin = new javax.swing.JButton();
        ButtonPlus = new javax.swing.JButton();
        Jumlahpesan = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        JBTotal = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        JfKembali = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        JfCash = new javax.swing.JTextField();
        samadengan = new javax.swing.JLabel();
        JfTotalan = new javax.swing.JTextField();
        BReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(102, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\engko\\Pictures\\bg.png")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 210, 10));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon("C:\\Users\\engko\\Pictures\\2.png")); // NOI18N
        jLabel24.setText("089517667891");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\engko\\Pictures\\contak\\1.png")); // NOI18N
        jLabel25.setText("JUNOK BANGKALAN");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        jPanel9.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 210, 10));

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Owner");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\engko\\Pictures\\hu3.jpg")); // NOI18N
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setIcon(new javax.swing.ImageIcon("C:\\Users\\engko\\Pictures\\contak\\4.png")); // NOI18N
        jLabel28.setText("maonbakery@gmail.com");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setIcon(new javax.swing.ImageIcon("C:\\Users\\engko\\Pictures\\3.png")); // NOI18N
        jLabel29.setText("harrygr_");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 560));

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jLabel3.setBackground(new java.awt.Color(255, 255, 102));
        jLabel3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel3.setText("MENU ROTI");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 140, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\engko\\Pictures\\menu\\6.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        buttonGroup1.add(RdWaffles);
        RdWaffles.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        RdWaffles.setForeground(new java.awt.Color(255, 255, 255));
        RdWaffles.setText("RP 50.000");
        jPanel1.add(RdWaffles, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\engko\\Pictures\\menu\\1.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\engko\\Pictures\\menu\\2.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\engko\\Pictures\\menu\\3.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\engko\\Pictures\\menu\\4.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\engko\\Pictures\\menu\\5.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jLabel10.setBackground(new java.awt.Color(255, 255, 102));
        jLabel10.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel10.setText("TAMBAHAN TOPPING");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 150, -1));

        buttonGroup1.add(RdSwiss);
        RdSwiss.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        RdSwiss.setForeground(new java.awt.Color(255, 255, 255));
        RdSwiss.setText("RP 15.000");
        jPanel1.add(RdSwiss, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        buttonGroup1.add(RdPancakes);
        RdPancakes.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        RdPancakes.setForeground(new java.awt.Color(255, 255, 255));
        RdPancakes.setText("RP 45.000");
        jPanel1.add(RdPancakes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        buttonGroup1.add(RdCherry);
        RdCherry.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        RdCherry.setForeground(new java.awt.Color(255, 255, 255));
        RdCherry.setText("RP 35.000");
        jPanel1.add(RdCherry, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        Matcha.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Matcha.setForeground(new java.awt.Color(255, 255, 255));
        Matcha.setText("RP10.000");
        Matcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatchaActionPerformed(evt);
            }
        });
        jPanel1.add(Matcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, -1, -1));

        buttonGroup1.add(RdCupcake);
        RdCupcake.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        RdCupcake.setForeground(new java.awt.Color(255, 255, 255));
        RdCupcake.setText("RP 20.000");
        RdCupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdCupcakeActionPerformed(evt);
            }
        });
        jPanel1.add(RdCupcake, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        jLabel11.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 0));
        jLabel11.setText("Cherry pie");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        jLabel12.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 0));
        jLabel12.setText("Swiss roll");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        jLabel13.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 0));
        jLabel13.setText("Waffles");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        jLabel14.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 0));
        jLabel14.setText("Pancakes");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel15.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 255, 0));
        jLabel15.setText("Matcha");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, -1, 20));

        jLabel16.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 0));
        jLabel16.setText("Cupcake");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 307, -1, 20));

        buttonGroup1.add(RdBrownies);
        RdBrownies.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        RdBrownies.setForeground(new java.awt.Color(255, 255, 255));
        RdBrownies.setText("RP 30.000");
        jPanel1.add(RdBrownies, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        notopping.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        notopping.setForeground(new java.awt.Color(255, 255, 255));
        notopping.setText("RP 0");
        jPanel1.add(notopping, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, -1, -1));

        Kacang.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Kacang.setForeground(new java.awt.Color(255, 255, 255));
        Kacang.setText("RP 5.000");
        jPanel1.add(Kacang, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, -1, -1));

        jLabel17.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 0));
        jLabel17.setText("Brownies");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 307, -1, 20));

        jLabel19.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 255, 0));
        jLabel19.setText("Kacang");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, -1, 20));

        Oreo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Oreo.setForeground(new java.awt.Color(255, 255, 255));
        Oreo.setText("RP8.000");
        Oreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OreoActionPerformed(evt);
            }
        });
        jPanel1.add(Oreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, -1, -1));

        jLabel20.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 255, 0));
        jLabel20.setText("Oreo");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, -1, 20));

        jLabel21.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 255, 0));
        jLabel21.setText("No Topping");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, -1, 20));

        jLabel26.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 48)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 51));
        jLabel26.setText("MA'ON BAKERY");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 14, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bkeluar.setBackground(new java.awt.Color(153, 153, 255));
        Bkeluar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Bkeluar.setForeground(new java.awt.Color(255, 255, 255));
        Bkeluar.setText("Reset");
        Bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BkeluarActionPerformed(evt);
            }
        });
        jPanel5.add(Bkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        ButtonMin.setBackground(new java.awt.Color(153, 255, 255));
        ButtonMin.setText("-");
        ButtonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMinActionPerformed(evt);
            }
        });
        jPanel5.add(ButtonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        ButtonPlus.setBackground(new java.awt.Color(102, 255, 255));
        ButtonPlus.setText("+");
        ButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPlusActionPerformed(evt);
            }
        });
        jPanel5.add(ButtonPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        Jumlahpesan.setText("0");
        Jumlahpesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahpesanActionPerformed(evt);
            }
        });
        jPanel5.add(Jumlahpesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 30, -1));

        jLabel18.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Jumlah");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, 20));

        JBTotal.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        JBTotal.setText("Total");
        JBTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTotalActionPerformed(evt);
            }
        });
        jPanel5.add(JBTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 70, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 51));
        jLabel22.setText("Kembali");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        JfKembali.setEditable(false);
        JfKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JfKembaliActionPerformed(evt);
            }
        });
        jPanel5.add(JfKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 140, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 51));
        jLabel23.setText("Cash");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        JfCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JfCashActionPerformed(evt);
            }
        });
        JfCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JfCashKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JfCashKeyTyped(evt);
            }
        });
        jPanel5.add(JfCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 140, -1));

        samadengan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        samadengan.setText("=");
        jPanel5.add(samadengan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        JfTotalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JfTotalanActionPerformed(evt);
            }
        });
        jPanel5.add(JfTotalan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 110, -1));

        BReset.setBackground(new java.awt.Color(153, 153, 255));
        BReset.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        BReset.setForeground(new java.awt.Color(255, 255, 255));
        BReset.setText("Exit");
        BReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BResetActionPerformed(evt);
            }
        });
        jPanel5.add(BReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 620, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MatchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatchaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatchaActionPerformed

    private void RdCupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdCupcakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RdCupcakeActionPerformed

    private void OreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OreoActionPerformed

    private void BkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BkeluarActionPerformed
        // TODO add your handling code here:
        Jumlahpesan.setText("");
        JfTotalan.setText("");
        JfKembali.setText("");
        JfCash.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
    }//GEN-LAST:event_BkeluarActionPerformed

    private void ButtonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMinActionPerformed
        // TODO add your handling code here:
        int totalan = Integer.parseInt(Jumlahpesan.getText());
                if(totalan>0){
                    totalan--;}
                Jumlahpesan.setText(Integer.toString(totalan));
    }//GEN-LAST:event_ButtonMinActionPerformed

    private void ButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPlusActionPerformed
        // TODO add your handling code here:
         int totalan = Integer.parseInt(Jumlahpesan.getText());
                    totalan++;
                Jumlahpesan.setText(Integer.toString(totalan));
    }//GEN-LAST:event_ButtonPlusActionPerformed

    private void JumlahpesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahpesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahpesanActionPerformed

    private void JBTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTotalActionPerformed
        // TODO add your handling code here:                             
        try{
//        if(JfCash.getText().length() == 0){
//         JOptionPane.showMessageDialog(null, "Masukkan Jumlah Uang Anda", "Uang = 0", JOptionPane.WARNING_MESSAGE);
//        return;
//        }
//       if(buttonGroup2.getSelection()==null || buttonGroup1.getSelection()==null) {
//           JOptionPane.showMessageDialog(null, "Silahkan pilih Menu", "Peringatan", JOptionPane.WARNING_MESSAGE);
//           return;
//       }
        int jumlahRoti = Integer.parseInt(Jumlahpesan.getText());
//        if(jumlahRoti < 1){
//            JOptionPane.showMessageDialog(null, "Masukkan Jumlah Roti", "Jumlah Roti < 1", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        if(JfCash.getText().isEmpty() || JfCash.getText() == null){
//             JOptionPane.showMessageDialog(null, "Masukkan Jumlah Uang Anda", "Uang = 0", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        int uang = Integer.parseInt(JfCash.getText());
//        if(uang < 1000){
//            JOptionPane.showMessageDialog(null, "Jumlah Uang Anda Tidak Cukup", "Minggir Lu Miskin", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
        
        int hargaRoti = 0;
        if(RdSwiss.isSelected()){
            hargaRoti = 15000 * jumlahRoti;
        }
        if(RdPancakes.isSelected()){
           hargaRoti = 45000 * jumlahRoti;
       }
        if(RdCherry.isSelected()){
           hargaRoti = 35000 * jumlahRoti;
       }
        if(RdBrownies.isSelected()){
           hargaRoti = 30000 * jumlahRoti;
       }
        if(RdCupcake.isSelected()){
           hargaRoti = 20000 * jumlahRoti;
       }
        
        if(RdWaffles.isSelected()){
           hargaRoti = 50000 * jumlahRoti;
       }
        
        int hargatopping = 0;
        if(notopping.isSelected()){
            hargatopping = 0;
        }
        if(Kacang.isSelected()){
            hargatopping = 5000 * jumlahRoti;
            if( topping1==0){
                topping1 = hargatopping;
            }else{
                topping2 = hargatopping;
            }
            
        }
        if(Oreo.isSelected()){
            hargatopping = 8000 * jumlahRoti;
            if( topping1==0){
                topping1 = hargatopping;
            }else{
                topping2 = hargatopping;
            }
        }
        if(Matcha.isSelected()){
            hargatopping = 10000 * jumlahRoti;
            if( topping1==0){
                topping1 = hargatopping;
            }else{
                topping2 = hargatopping;
            }
        }
        
        
        int totalHarga = hargaRoti + topping1 + topping2 ;
        
        if (totalHarga > 100000){
            int diskon = totalHarga * 5 / 100;
            totalHarga = totalHarga - diskon;
        }
        JfTotalan.setText(Integer.toString(totalHarga));
//        if(uang < totalHarga ){
//            JOptionPane.showMessageDialog(null, "Jumlah Uang Anda tidak cukup", "Minggir Lu miskin", JOptionPane.WARNING_MESSAGE);
////        } else{
//            JfTotalan.setText("Rp." + Integer.toString(totalHarga));
//            JfKembali.setText("Rp." + Integer.toString((uang - totalHarga)));
//        }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "cash berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_JBTotalActionPerformed

    private void JfTotalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JfTotalanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JfTotalanActionPerformed

    private void BResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BResetActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BResetActionPerformed

    private void JfKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JfKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JfKembaliActionPerformed

    private void JfCashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JfCashKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JfCashKeyPressed

    private void JfCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JfCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JfCashActionPerformed

    private void JfCashKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JfCashKeyTyped
        // TODO add your handling code here:
        hitungKembalian();
    }//GEN-LAST:event_JfCashKeyTyped

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BReset;
    private javax.swing.JButton Bkeluar;
    private javax.swing.JButton ButtonMin;
    private javax.swing.JButton ButtonPlus;
    private javax.swing.JButton JBTotal;
    private javax.swing.JTextField JfCash;
    private javax.swing.JTextField JfKembali;
    private javax.swing.JTextField JfTotalan;
    private javax.swing.JTextField Jumlahpesan;
    private javax.swing.JRadioButton Kacang;
    private javax.swing.JRadioButton Matcha;
    private javax.swing.JRadioButton Oreo;
    private javax.swing.JRadioButton RdBrownies;
    private javax.swing.JRadioButton RdCherry;
    private javax.swing.JRadioButton RdCupcake;
    private javax.swing.JRadioButton RdPancakes;
    private javax.swing.JRadioButton RdSwiss;
    private javax.swing.JRadioButton RdWaffles;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton notopping;
    private javax.swing.JLabel samadengan;
    // End of variables declaration//GEN-END:variables

    private void hitungKembalian() {
    try{
          int melleh = Integer.parseInt(JfTotalan.getText());
          int pesse = Integer.parseInt(JfCash.getText());
          int sosongah =  pesse - melleh ;
          if (sosongah >=0){
             JfKembali.setText(""+sosongah);
             System.out.println("\nHarga Pembelian  \t\t:"+melleh+"\nUang Diberikan \t\t\t: "+ pesse +
                     "\nKembalian   \t\t\t:"+sosongah);
          }else if(sosongah<0){
              JfKembali.setText("Pessenah Korang Anjay");
          }
           else{
              System.out.println("Duh Taoh");
          }
          }catch (NumberFormatException e) {
              JfKembali.setText("");
          }
     }
}
