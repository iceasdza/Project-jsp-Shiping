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
public class Staff {
    private int id;
    private String fistname;
    private String lastname;
    private String email;
    private String address;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFistname() {
        return fistname;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void addStaff(String fname,String lname,String email,String addr,String password){
        Staff st = new Staff();
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("insert into staffs (firstname,lastnames,email,address,password) values(?,?,?,?,?)");
            pstm.setString(1, fname);
            pstm.setString(2,lname);
            pstm.setString(3,email);
            pstm.setString(4,addr);
            pstm.setString(5,password);
            pstm.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<Staff> findByName(String name){
        ArrayList<Staff> st = new ArrayList<>();
        Staff s = new Staff();
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from staffs where name like ?");
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                s.id = rs.getInt("id");
                s.fistname = rs.getString("firstname");
                s.lastname = rs.getString("lastnames");
                s.email = rs.getString("email");
                s.address = rs.getString("address");
                s.password = rs.getString("password");
                st.add(s);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
        return st;
    }
 
    public static void main(String[] args) {
        Staff st = new Staff();
        st.addStaff("Patiz", "Jongsiriwanich", "ice_za.007@hotmail.com", "hell", "fufufufufu");
    }
    
}
