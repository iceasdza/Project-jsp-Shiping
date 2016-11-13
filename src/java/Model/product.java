/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patiz
 */
public class product {
    private int idProduct;
    private String name;
    private String type;
    private String about;
    private int custId;

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getAbout() {
        return about;
    }

    public int getCustId() {
        return custId;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }
    
    public void addProduct(String name,String type,String about,int custId){
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("insert into product (name,type,about,custId) values (?,?,?,?) ");
            pstm.setString(1,name);
            pstm.setString(2,type);
            pstm.setString(3,about);
            pstm.setInt(4, custId);
            pstm.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static product findById(int id){
        product pd = new product();
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from product where idProduct = ?");
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
            pd.name = rs.getString("name");
            pd.type = rs.getString("type");
            pd.about = rs.getString("about");
            pd.custId=rs.getInt("custid");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pd;
    }
    
    
    
    
    public static void main(String[] args) {
        product p = product.findById(1);
        System.out.println(p.getName()+p.getType()+p.getAbout()+p.getCustId());
    }
}
