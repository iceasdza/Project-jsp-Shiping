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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patiz
 */
public class Captains {

    private int id;
    private String firstname;
    private String lastname;
    private int level;
    private String email;
    private String tel;
    private String address;
    private int expen;

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getLevel() {
        return level;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public String getAddress() {
        return address;
    }

    public int getExpen() {
        return expen;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setExpen(int expen) {
        this.expen = expen;
    }

    public Captains() {
    }

    public static boolean checkEmail(String email) {
        boolean b = true;
        ArrayList<Captains> c = new ArrayList<>();
        Captains a;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from CAPTAINS where email = ?");
            pstm.setString(1, email);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                a = new Captains();
                a.email = rs.getString("email");
                c.add(a);
                b = false;
            }
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Captains.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    public void addInfo(String fname, String lname, int level, String email, String tel, String addr, int expen) {
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("INSERT INTO CAPTAINS (firstname,lastname,level,email,tel,address,expenses) values(?,?,?,?,?,?,?)");
            pstm.setString(1, fname);
            pstm.setString(2, lname);
            pstm.setInt(3, level);
            pstm.setString(4, email);
            pstm.setString(5, tel);
            pstm.setString(6, addr);
            pstm.setInt(7, expen);
            pstm.executeUpdate();

            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Captains.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Captains> findByName(String name) {
        ArrayList<Captains> cap = new ArrayList<>();
        Captains caps;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from captains where lower(firstname) like ? or upper(firstname) like ?");
            pstm.setString(1, name + "%");
            pstm.setString(2,  name + "%");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                caps = new Captains();
                caps.id=rs.getInt("id");
                caps.firstname = rs.getString("firstname");
                caps.lastname = rs.getString("lastname");
                caps.level = rs.getInt("level");
                caps.email = rs.getString("email");
                caps.tel = rs.getString("tel");
                caps.address = rs.getString("address");
                caps.expen = rs.getInt("expenses");
                cap.add(caps);
            }
            pstm.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(Captains.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cap;
    }

    public static Captains findIdByName(String name, String lastname) {
        Captains cap = null;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from Captains where firstname = ? && lastname = ?");
            pstm.setString(1, name);
            pstm.setString(2, lastname);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                cap = new Captains();
                cap.id = rs.getInt("Id");
            }
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersCompany.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cap;
    }

    public static ArrayList<Captains> captainsList() {
        ArrayList cap = new ArrayList();
        Captains c;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from captains");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                c = new Captains();
                c.id = rs.getInt("id");
                c.firstname = rs.getString("firstname");
                c.lastname = rs.getString("lastname");
                cap.add(c);
            }
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Captains.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cap;
    }

    public static void main(String[] args) {
         ArrayList<Captains> c = Captains.findByName("a");
         for (Captains captains : c) {
             System.out.println(captains.getId());
        }

    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Captains other = (Captains) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public Captains(ResultSet rs) throws SQLException {
        this.id = rs.getInt("id");
        this.firstname = rs.getString("firstname");
        this.lastname = rs.getString("lastname");
        this.level = rs.getInt("level");
        this.address = rs.getString("address");
        this.email = rs.getString("email");
        this.tel = rs.getString("tel");
    }

    public List<Captains> mainDataCaptains() throws SQLException {
        List<Captains> lc = null;
        Captains c = null;
        Connection con = ConnectionBuidler.getConnection();
        try {
            String sql = ("SELECT * FROM captains");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                c = new Captains(rs);
                if (lc == null) {
                    lc = new ArrayList();
                }
                lc.add(c);
            }

            con.close();
        } catch (Exception e) {
        }
        return lc;
    }
}
