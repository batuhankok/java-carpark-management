/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpark;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author lenovo
 */
public class ShowDetailsClass {
    
    private int alan;
    private String plaka;
        
    public ShowDetailsClass(int alan) {
        this.alan = alan;
    }
    
    public ShowDetailsClass(String plaka) {
        this.plaka = plaka;
    }
    
    public String[] GetDetailsWithArea(){
        
            try{
               
                Database db = new Database();
                Connection conn = db.Connect();
                
                String[] details = new String[4];

                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM cars WHERE alan="+alan+"");

                if(rs.next()){
                    details[0] = rs.getString("plaka");
                    details[1] = rs.getString("musteri_adi");
                    details[2] = rs.getString("giris_saati");
                    details[3] = rs.getString("marka_model");
                }else{
                    details = null;
                }
                
                return details;
                
            }catch(Exception error){
                
                System.out.println("Detay görüntüle classında hata: " + error);
                return null;
                
            }
        
    }
    
    public String[] GetDetailsWithPlate(){
        
            try{
               
                Database db = new Database();
                Connection conn = db.Connect();
                
                String[] details = new String[4];

                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM cars WHERE plaka='"+plaka+"'");

                if(rs.next()){
                    details[0] = rs.getString("plaka");
                    details[1] = rs.getString("musteri_adi");
                    details[2] = rs.getString("giris_saati");
                    details[3] = rs.getString("marka_model");
                }else{
                    details = null;
                }
                
                return details;
                
            }catch(Exception error){
                
                System.out.println("Detay görüntüle classında hata: " + error);
                return null;
                
            }
        
    }
    
}
