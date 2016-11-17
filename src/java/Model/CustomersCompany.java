/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patiz
 */
public class CustomersCompany {
    
    private int idCompany;
    private String nameCompany;
    private int lvCompany;
    private String addrCompany;
    private String country;

    public int getIdCompany() {
        return idCompany;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public int getLvCompany() {
        return lvCompany;
    }

    public String getAddrCompany() {
        return addrCompany;
    }

    public String getCountry() {
        return country;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public void setLvCompany(int lvCompany) {
        this.lvCompany = lvCompany;
    }

    public void setAddrCompany(String addrCompany) {
        this.addrCompany = addrCompany;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public void addCompany(String name,int lv,String addr,String country){
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("insert into customerscompany (nameCompany,lvCompany,addCompany,country) values (?,?,?,?)");
            pstm.setString(1, name);
            pstm.setInt(2, lv);
            pstm.setString(3, addr);
            pstm.setString(4, country);
            pstm.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersCompany.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static CustomersCompany findById(int id){
        CustomersCompany cust = new CustomersCompany();
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from customersCompany where idCompany = ?");
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                cust.nameCompany = rs.getString("nameCompany");
                cust.lvCompany = rs.getInt("lvCompany");
                cust.addrCompany = rs.getString("addCompany");
                cust.country = rs.getString("country");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersCompany.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return  cust;
    }
     public static ArrayList<CustomersCompany> customerList(){
            ArrayList<CustomersCompany> cust = new ArrayList();
            CustomersCompany c ;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from customerscompany");
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                c = new CustomersCompany();
                c.idCompany = rs.getInt("idCompany");
                c.nameCompany=rs.getString("namecompany");
                
                cust.add(c);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Captains.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cust;
    }
      public static CustomersCompany findIdByName(String name){
        CustomersCompany cust = null;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from customersCompany where namecompany = ?");
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                cust  = new CustomersCompany();
                cust.idCompany = rs.getInt("idCompany");
                cust.nameCompany = rs.getString("nameCompany");
                cust.lvCompany = rs.getInt("lvCompany");
                cust.addrCompany = rs.getString("addCompany");
                cust.country = rs.getString("country");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersCompany.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return  cust;
    }
    
    public static ArrayList<CustomersCompany> customersCompanys(){
        ArrayList<CustomersCompany> cust = new ArrayList<>();
        CustomersCompany c ;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from customerscompany");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {                
                c = new CustomersCompany();
                c.idCompany = rs.getInt("idCompany");
                c.nameCompany=rs.getString("nameCompany");
                cust.add(c);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersCompany.class.getName()).log(Level.SEVERE, null, ex);
        }
            return  cust;
    }
    
    public static ArrayList<CustomersCompany> findByCountry(String country){
        ArrayList<CustomersCompany> cust = new ArrayList<>();
            CustomersCompany c ;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from customerscompany where country = ?");
            pstm.setString(1, country);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {                
                c = new CustomersCompany();
                c.nameCompany = rs.getString("nameCompany");
                c.idCompany=rs.getInt("idCompany");
                cust.add(c);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersCompany.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  cust;
    }
    
    public static void main(String[] args) {
//        CustomersCompany c = new CustomersCompany();
//        c.addCompany("DDD", 2, "hell", "TH01");
      ArrayList<CustomersCompany> c = CustomersCompany.customerList();
                   for (CustomersCompany customersCompany : c) {
                       System.out.println(customersCompany.getNameCompany());
        }
//        CustomersCompany c = CustomersCompany.findIdByName("Patiz customer");
//        System.out.println(c.getIdCompany());
    }
}
