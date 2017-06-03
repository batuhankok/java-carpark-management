/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpark;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author lenovo
 */

    public class NewCarClass {
    
        private String plaka;
        private String giris_saati;
        private String musteri_adi;
        private String arac_marka_model;
        private int selected_index;
        
        public NewCarClass(String plaka, String giris_saati, String musteri_adi, String arac_marka_model, int selected_index) {
            this.giris_saati = giris_saati;
            this.plaka = plaka;
            this.musteri_adi = musteri_adi;
            this.arac_marka_model = arac_marka_model;   
            this.selected_index = selected_index;
        }
        
        public boolean Insert() throws SQLException{
            
            Database db = new Database();
            Connection conn = db.Connect();

            try{
               
                PreparedStatement ps = conn.prepareStatement("INSERT INTO cars (plaka, musteri_adi, marka_model, alan, giris_saati) VALUES (?, ?, ?, ?, ?)");
                ps.setString(1,this.plaka);
                ps.setString(2,this.musteri_adi);
                ps.setString(3,this.arac_marka_model);
                ps.setInt(4,this.selected_index);
                ps.setString(5, this.giris_saati);

                int i = ps.executeUpdate();
                boolean result = false;

                if(i > 0){
                    result = true;
                }

                return result;
                
            }catch(Exception error){
                
                System.out.println("Yeni araç ekleme classında hata: " + error);
                return false;
                
            }
    
        }

    }
