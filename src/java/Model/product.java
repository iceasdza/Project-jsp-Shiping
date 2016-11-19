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
import java.util.ArrayList;
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
    private String custname;

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

    public void addProduct(String name, String type, String about, int custId) {
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("insert into product (name,type,about,custId) values (?,?,?,?) ");
            pstm.setString(1, name);
            pstm.setString(2, type);
            pstm.setString(3, about);
            pstm.setInt(4, custId);
            pstm.executeUpdate();
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static product findByName(String name) {
        product pd = new product();
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from product where name = ?");
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                pd.idProduct = rs.getInt("idproduct");
                pd.name = rs.getString("name");
                pd.type = rs.getString("type");
                pd.about = rs.getString("about");
                pd.custId = rs.getInt("custid");
            }
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pd;
    }

    public static ArrayList<product> productList() {
        ArrayList<product> pd = new ArrayList<>();
        product p;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from product");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                p = new product();
                p.idProduct = rs.getInt("idproduct");
                p.name = rs.getString("name");
                p.type = rs.getString("type");
                p.about = rs.getString("about");
                p.custId = rs.getInt("custid");
                pd.add(p);
            }
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pd;
    }
    public static ArrayList<product> ListName(String name){
         ArrayList<product> pd = new ArrayList<>();
         product p ;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM product p JOIN customerscompany c on p.custid = c.idCompany WHERE lower(p.name) LIKE ? or upper(p.name) like ?");
            pstm.setString(1, "%"+name+"%");
            pstm.setString(2, "%"+name+"%");
            ResultSet rs = pstm.executeQuery();
             while (rs.next()) {
                p = new product();
                p.idProduct = rs.getInt("idproduct");
                p.name = rs.getString("name");
                p.type = rs.getString("type");
                p.about = rs.getString("about");
                p.custId = rs.getInt("custid");
                p.custname=rs.getString("nameCompany");
                pd.add(p);
        }
            con.close();
    }   catch (SQLException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        }
         return pd;
    }

    public static void main(String[] args) {
        ArrayList<product> p = product.ListName("");
        for (product object : p) {
            System.out.println(object.getCustname());
        }

    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }
}
