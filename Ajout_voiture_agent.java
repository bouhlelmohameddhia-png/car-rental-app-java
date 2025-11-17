package myapp_location;

import java.sql.*;
import java.io.*;
import java.math.BigDecimal;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.math.BigDecimal;
import java.util.Calendar;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Ajout_voiture_agent extends javax.swing.JFrame {
    private int userid;
    public Ajout_voiture_agent(int userid) {
        this.userid=userid;
        initComponents();
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollBar verticalBar = jScrollPane1.getVerticalScrollBar();
        verticalBar.setUI(new BasicScrollBarUI() {
          @Override
          protected void configureScrollBarColors() {
          this.thumbColor = Color.GRAY; 
          this.trackColor = Color.LIGHT_GRAY; 
         }
        });
    }


private void showError(String message, JTextField field) {
    // Show error message dialog
    JOptionPane.showMessageDialog(
        this,                     // Parent component
        message,                  // Error message
        "Validation Error",       // Dialog title
        JOptionPane.ERROR_MESSAGE // Message type
    );
    
    // Focus and select the problematic field
    field.requestFocusInWindow();
    field.selectAll();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        immatricule = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        marque = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        modele = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        annee = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        couleur = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        prix_journalier = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        etat_technique = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        statut_metier = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        type = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        chemin_img = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        myButton1 = new buttons.MyButton();
        to_acceuil = new javax.swing.JLabel();
        to_settings = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel6.setText("<");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Immatricule :");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setText("Marque:");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setText("Modèle :");

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("Année :");

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel11.setText("Couleur :");

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel14.setText("Prix journalier :");

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel15.setText("Etat Technique :");

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel16.setText("Statut métier : ");

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel17.setText("Type :");

        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel18.setText("Image (chemin) :");

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));

        myButton1.setText("Ajouter");
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(immatricule, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(jLabel11))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel15)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(etat_technique, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel16)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(statut_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel17)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                            .addGap(6, 6, 6)
                                                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jSeparator14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel18)
                                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(chemin_img, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(prix_journalier, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel14))))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(marque, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(couleur, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(annee, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(223, 223, 223))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(modele, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addComponent(immatricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(marque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(annee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(couleur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prix_journalier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etat_technique, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statut_metier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chemin_img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(265, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        to_acceuil.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\4-dots (4).jpg"));
        to_acceuil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                to_acceuilMouseClicked(evt);
            }
        });

        to_settings.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") +"\\src\\main\\java\\pic\\settings-jp (1).jpg"));
        to_settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                to_settingsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(to_acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(to_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(to_acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(to_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void to_acceuilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_acceuilMouseClicked
        Acceuil_agent e = new Acceuil_agent(userid);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_to_acceuilMouseClicked

    private void to_settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_settingsMouseClicked
        Settings_agent s = new Settings_agent(userid);
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_to_settingsMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Acceuil_agent a = new Acceuil_agent(userid) ;
        a.setVisible(true);
        this.dispose() ;
    }//GEN-LAST:event_jLabel6MouseClicked

    private void boutton_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_ajouterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boutton_ajouterActionPerformed

    private void boutton_ajouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutton_ajouterMouseClicked
        //  ajout de la voiture dans la base 
        
        
         if (!validateAllFields()) {
        return; // Stop if validation fails
    }
    
    // 2. If validation passes, proceed with database insertion
    Connection conn = null;
    PreparedStatement pstmt = null;
    FileInputStream fis = null;
    
    try {
        // Get database connection
        conn = getDatabaseConnection();
        
        // Prepare SQL statement
        String sql = "INSERT INTO Voiture (immatricule, marque, modele, annee, couleur, "
                   + "prix_journalier, etat_technique, statut_disponibilite, type, photo) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        pstmt = conn.prepareStatement(sql);
        
        // Set parameters from form fields
        pstmt.setString(1, immatricule.getText().trim());
        pstmt.setString(2, marque.getText().trim());
        pstmt.setString(3, modele.getText().trim());
        
        // Handle optional year field
        if (!annee.getText().trim().isEmpty()) {
            pstmt.setInt(4, Integer.parseInt(annee.getText().trim()));
        } else {
            pstmt.setNull(4, Types.INTEGER);
        }
        
        // Handle optional color field
        pstmt.setString(5, couleur.getText().trim().isEmpty() ? null : couleur.getText().trim());
        
        // Set price (required field, already validated)
        pstmt.setBigDecimal(6, new BigDecimal(prix_journalier.getText().trim()));
        
        // Set technical state (default to 'en marche' if empty)
        String etatTech = etat_technique.getText().trim();
        pstmt.setString(7, etatTech.isEmpty() ? "en marche" : etatTech);
        
        // Set default availability status
        pstmt.setString(8, "disponible");
        
        // Handle optional type field
        pstmt.setString(9, type.getText().trim().isEmpty() ? null : type.getText().trim());
        
        // Handle image file
        if (!chemin_img.getText().trim().isEmpty()) {
            File imageFile = new File(chemin_img.getText().trim());
            fis = new FileInputStream(imageFile);
            pstmt.setBinaryStream(10, fis, (int)imageFile.length());
        } else {
            pstmt.setNull(10, Types.BLOB);
        }
        
        // Execute the insert
        int rowsAffected = pstmt.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, 
                "Voiture ajoutée avec succès!", 
                "Succès", 
                
                JOptionPane.INFORMATION_MESSAGE);
                clearForm();
                
            
        }
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, 
            "Erreur de base de données: " + e.getMessage(),
            "Erreur SQL", 
            JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Erreur: " + e.getMessage(),
            "Erreur", 
            JOptionPane.ERROR_MESSAGE);
    } finally {
        // Close resources
        try {
            if (fis != null) fis.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        
        
        
    }//GEN-LAST:event_boutton_ajouterMouseClicked

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        if (!validateAllFields()) {
        return; // Stop if validation fails
    }
    
    // 2. If validation passes, proceed with database insertion
    Connection conn = null;
    PreparedStatement pstmt = null;
    FileInputStream fis = null;
    
    try {
        // Get database connection
        conn = getDatabaseConnection();
        
        // Prepare SQL statement
        String sql = "INSERT INTO Voiture (immatricule, marque, modele, annee, couleur, "
                   + "prix_journalier, etat_technique, statut_disponibilite, type, photo) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        pstmt = conn.prepareStatement(sql);
        
        // Set parameters from form fields
        pstmt.setString(1, immatricule.getText().trim());
        pstmt.setString(2, marque.getText().trim());
        pstmt.setString(3, modele.getText().trim());
        
        // Handle optional year field
        if (!annee.getText().trim().isEmpty()) {
            pstmt.setInt(4, Integer.parseInt(annee.getText().trim()));
        } else {
            pstmt.setNull(4, Types.INTEGER);
        }
        
        // Handle optional color field
        pstmt.setString(5, couleur.getText().trim().isEmpty() ? null : couleur.getText().trim());
        
        // Set price (required field, already validated)
        pstmt.setBigDecimal(6, new BigDecimal(prix_journalier.getText().trim()));
        
        // Set technical state (default to 'en marche' if empty)
        String etatTech = etat_technique.getText().trim();
        pstmt.setString(7, etatTech.isEmpty() ? "en marche" : etatTech);
        
        // Set default availability status
        pstmt.setString(8, "disponible");
        
        // Handle optional type field
        pstmt.setString(9, type.getText().trim().isEmpty() ? null : type.getText().trim());
        
        // Handle image file
        if (!chemin_img.getText().trim().isEmpty()) {
            File imageFile = new File(chemin_img.getText().trim());
            fis = new FileInputStream(imageFile);
            pstmt.setBinaryStream(10, fis, (int)imageFile.length());
        } else {
            pstmt.setNull(10, Types.BLOB);
        }
        
        // Execute the insert
        int rowsAffected = pstmt.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, 
                "Voiture ajoutée avec succès!", 
                "Succès", 
                JOptionPane.INFORMATION_MESSAGE);
            
            clearForm();
            Acceuil_agent acc= new Acceuil_agent(userid);
                acc.setVisible(true);
                this.dispose();
        }
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, 
            "Erreur de base de données: " + e.getMessage(),
            "Erreur SQL", 
            JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Erreur: " + e.getMessage(),
            "Erreur", 
            JOptionPane.ERROR_MESSAGE);
    } finally {
        // Close resources
        try {
            if (fis != null) fis.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        
        
        
    }//GEN-LAST:event_myButton1ActionPerformed
private void clearForm() {
    immatricule.setText("");
    marque.setText("");
    modele.setText("");
    annee.setText("");
    couleur.setText("");
    prix_journalier.setText("");
    etat_technique.setText("");
    type.setText("");
    chemin_img.setText("");
    immatricule.requestFocus();
}
    private boolean validateAllFields() {
    // Contrôle de l'immatriculation (obligatoire, max 20 caractères)
    if (immatricule.getText().trim().isEmpty()) {
        showError("Le numéro d'immatriculation est obligatoire", immatricule);
        return false;
    }
    if (immatricule.getText().trim().length() > 20) {
        showError("L'immatriculation ne doit pas dépasser 20 caractères", immatricule);
        return false;
    }

    // Contrôle de la marque (obligatoire, max 50 caractères)
    if (marque.getText().trim().isEmpty()) {
        showError("La marque est obligatoire", marque);
        return false;
    }
    if (marque.getText().trim().length() > 50) {
        showError("La marque ne doit pas dépasser 50 caractères", marque);
        return false;
    }

    // Contrôle du modèle (obligatoire, max 50 caractères)
    if (modele.getText().trim().isEmpty()) {
        showError("Le modèle est obligatoire", modele);
        return false;
    }
    if (modele.getText().trim().length() > 50) {
        showError("Le modèle ne doit pas dépasser 50 caractères", modele);
        return false;
    }

    // Contrôle de l'année (optionnelle, entre 1900 et année courante)
    if (!annee.getText().trim().isEmpty()) {
        try {
            int year = Integer.parseInt(annee.getText().trim());
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            if (year < 1900 || year > currentYear) {
                showError("L'année doit être entre 1900 et " + currentYear, annee);
                return false;
            }
        } catch (NumberFormatException e) {
            showError("Format d'année invalide (doit être un nombre)", annee);
            return false;
        }
    }

    // Contrôle de la couleur (optionnelle, max 30 caractères)
    if (couleur.getText().trim().length() > 30) {
        showError("La couleur ne doit pas dépasser 30 caractères", couleur);
        return false;
    }

    // Contrôle du prix journalier (obligatoire, nombre positif)
    if (prix_journalier.getText().trim().isEmpty()) {
        showError("Le prix journalier est obligatoire", prix_journalier);
        return false;
    }
    try {
        BigDecimal prix = new BigDecimal(prix_journalier.getText().trim());
        if (prix.compareTo(BigDecimal.ZERO) <= 0) {
            showError("Le prix journalier doit être supérieur à 0", prix_journalier);
            return false;
        }
        // Vérification de 2 décimales max
        if (prix.scale() > 2) {
            showError("Le prix doit avoir au maximum 2 décimales", prix_journalier);
            return false;
        }
    } catch (NumberFormatException e) {
        showError("Format de prix invalide (ex: 125.50)", prix_journalier);
        return false;
    }

    // Contrôle de l'état technique (optionnel mais doit être dans les valeurs ENUM)
    if (!etat_technique.getText().trim().isEmpty()) {
        String etat = etat_technique.getText().trim().toLowerCase();
        if (!etat.equals("en marche") && !etat.equals("en panne")) {
            showError("L'état technique doit être 'en marche' ou 'en panne'", etat_technique);
            return false;
        }
    }

    // Contrôle du type (optionnel, max 30 caractères)
    if (type.getText().trim().length() > 30) {
        showError("Le type ne doit pas dépasser 30 caractères", type);
        return false;
    }

    // Contrôle du chemin de l'image (optionnel mais doit être un fichier valide si renseigné)
    if (!chemin_img.getText().trim().isEmpty()) {
        File imageFile = new File(chemin_img.getText().trim());
        if (!imageFile.exists() || !imageFile.isFile()) {
            showError("Le fichier image spécifié n'existe pas", chemin_img);
            return false;
        }
        
        // Vérification de l'extension du fichier
        String fileName = imageFile.getName().toLowerCase();
        if (!fileName.endsWith(".jpg") && !fileName.endsWith(".jpeg") 
            && !fileName.endsWith(".png") && !fileName.endsWith(".gif")) {
            showError("Le fichier image doit être de type JPG, PNG ou GIF", chemin_img);
            return false;
        }
    }

    return true;
}

private Connection getDatabaseConnection() throws SQLException {

    String url = "jdbc:mysql://localhost:3306/location";
        String user = "root";
        String password = "Meddhia@2004";
    return DriverManager.getConnection(url, user, password);
}
    // faut ecrire les fonctions qui controle la saisie !!!
    
    
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Ajout_voiture_agent().setVisible(true);
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField annee;
    private javax.swing.JTextField chemin_img;
    private javax.swing.JTextField couleur;
    private javax.swing.JTextField etat_technique;
    private javax.swing.JTextField immatricule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField marque;
    private javax.swing.JTextField modele;
    private buttons.MyButton myButton1;
    private javax.swing.JTextField prix_journalier;
    private javax.swing.JTextField statut_metier;
    private javax.swing.JLabel to_acceuil;
    private javax.swing.JLabel to_settings;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
