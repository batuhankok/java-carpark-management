/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpark;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author batuhan
 */
public class AdminAuthorization extends javax.swing.JFrame {

    private String islem;
    private String plaka;
    
    /**
     * Creates new form AdminAuthorization
     */
    public AdminAuthorization() {
        initComponents();
    }
    
    public AdminAuthorization(String islem) {

        this.islem = islem;
        initComponents();
        
        islem_tf.setText(islem + " işlemi için yetki isteniyor...");
        
    }
    
    public AdminAuthorization(String islem, String plakano) {

        this.plaka = plakano;
        this.islem = islem;
        initComponents();
        
        islem_tf.setText(islem + " işlemi için yetki isteniyor...");
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admin_sifre = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        islem_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Admin Girişi");
        setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N

        admin_sifre.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        jButton1.setText("Onayla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        jButton2.setText("İptal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        jLabel1.setText("Admin Şifresi:");

        islem_tf.setEditable(false);
        islem_tf.setBackground(getBackground());
        islem_tf.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        islem_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        islem_tf.setText("İşlem...");
        islem_tf.setBorder(null);
        islem_tf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpark/images/admin_girisi.png"))); // NOI18N
        jLabel2.setText("  ADMİN GİRİŞİ");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(islem_tf)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(admin_sifre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(islem_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admin_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String admin_sifresi = new String(admin_sifre.getPassword());
        String admin_sifre = "";

        try{

            Database db = new Database();
            Connection conn = db.Connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM settings WHERE id=1");

            while(rs.next()){
                admin_sifre = rs.getString("admin_sifre");
            }
            
            if( admin_sifresi.equals(admin_sifre) ){
            
                if( islem.equals("Ücretsiz Çıkış") ){

                    try{

                        PreparedStatement ps = conn.prepareStatement("DELETE FROM cars WHERE plaka = '"+this.plaka+"'");

                        int i = ps.executeUpdate();

                        if( i > 0  ){
                            JOptionPane.showMessageDialog(this, this.plaka+" plaka numaralı araç başarıyla ücretsiz olarak çıkarıldı.", "Başarılı", JOptionPane.INFORMATION_MESSAGE);

                            new AdminAuthorization().setVisible(false);
                            new Main().setVisible(true);
                        }else{
                            JOptionPane.showMessageDialog(this, "Araç Çıkarılamadı!", "HATA", JOptionPane.ERROR_MESSAGE);
                        }

                    }catch(Exception error){

                        System.out.println("Hata CarExit: " + error);

                    }

                }else if( islem.equals("Araçları Temizle") ){

                    try{

                        PreparedStatement ps1 = conn.prepareStatement("DELETE FROM cars");

                        int i1 = ps1.executeUpdate();

                        if( i1 >= 0  ){
                            JOptionPane.showMessageDialog(this, "Araçlar başarıyla sıfırlandı.", "Başarılı", JOptionPane.INFORMATION_MESSAGE);

                            new AdminAuthorization().setVisible(false);
                            new Main().setVisible(true);
                        }else{
                            JOptionPane.showMessageDialog(this, "Araçlar sıfırlanamadı!", "HATA", JOptionPane.ERROR_MESSAGE);
                        }

                    }catch(Exception error){

                        System.out.println("Hata main: " + error);

                    }

                }else if( islem.equals("Kurulumu Temizle") ){
                    
                    try{

                        PreparedStatement ps = conn.prepareStatement("UPDATE settings SET admin_sifre = ?, personel_sifre = ?, saatlik_fiyat = ? WHERE id = ?");
                        ps.setString(1, "");
                        ps.setString(2, "");
                        ps.setString(3, "");
                        ps.setInt(4, 1);

                        int i = ps.executeUpdate();
                        if( i > 0 ){
                            new AdminAuthorization().setVisible(false);
                            new Main().setVisible(true);
                            dispose();
                        }else{
                            JOptionPane.showMessageDialog(this, "Kurulum sıfırlanamadı, tekrar deneyin!", "HATA", JOptionPane.ERROR_MESSAGE);
                        }

                    }catch(Exception error){
                        JOptionPane.showMessageDialog(this, "Hata:" + error, "HATA", JOptionPane.ERROR_MESSAGE);
                    }
                    
                }

            }else{
                JOptionPane.showMessageDialog(this, "Yönetici şifresi yanlış!", "HATA", JOptionPane.ERROR_MESSAGE);
            }

        }catch(Exception error){
            System.out.println("Admin yetkilendirme sayfasında hata:" + error);
        }
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        if( islem.equals("Ücretsiz Çıkış") ){
            this.setVisible(false);
            new CarExit(plaka).setVisible(true);
        }else if( islem.equals("Araçları Temizle") ){
            this.setVisible(false);
            new Main().setVisible(true);
        }else if( islem.equals("Kurulumu Temizle") ){
            this.setVisible(false);
            new Main().setVisible(true);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAuthorization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAuthorization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAuthorization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAuthorization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAuthorization().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField admin_sifre;
    private javax.swing.JTextField islem_tf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
