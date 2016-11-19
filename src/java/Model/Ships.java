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
public class Ships {

    private int shipId;
    private String shipName;
    private String shipType;
    private int displacement;
    private int expen;

    public String getShipsName() {
        return shipName;
    }

    public String getShipsType() {
        return shipType;
    }

    public int getDisplacement() {
        return displacement;
    }

    public int getExpen() {
        return expen;
    }

    public void setShipsName(String shipName) {
        this.shipName = shipName;
    }

    public void setShipsType(String shipType) {
        this.shipType = shipType;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void setExpen(int expen) {
        this.expen = expen;
    }

    public Ships() {
    }

    public void addShipsInfo(String shipname, String type, int displacement, int expen) {
        try {
            Connection con = ConnectionBuidler.getConnection();
            String sqlcmd = "INSERT INTO ship(shipName,shipType,Displacement,expenses) VALUES (?,?,?,?)";
//            PreparedStatement pstm = con.prepareStatement("INSERT INTO 'ship' (shipName,shipType,DisplacementTonnage,expenses) values (?,?,?,?)");
            PreparedStatement pstm = con.prepareStatement(sqlcmd);
            pstm.setString(1, shipname);
            pstm.setString(2, type);
            pstm.setInt(3, displacement);
            pstm.setInt(4, expen);
            pstm.executeUpdate();
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ships.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArrayList<Ships> findByName(String name) {
        ArrayList<Ships> s = new ArrayList<>();
        Ships ss;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from SHIP where Lower(Shipname) like ? or Upper(Shipname) like ? ");
            pstm.setString(1, name + "%");
            pstm.setString(2, name + "%");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ss = new Ships();
                ss.shipId = rs.getInt("shipId");
                ss.shipName = rs.getString("shipName");
                ss.shipType = rs.getString("shipType");
                ss.displacement = rs.getInt("Displacement");
                ss.expen = rs.getInt("expenses");
                s.add(ss);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ships.class.getName()).log(Level.SEVERE, null, ex);
        }

        return s;
    }

    public static Ships findById(int id) throws SQLException {
        Ships s = new Ships();
        Connection con = ConnectionBuidler.getConnection();
        PreparedStatement pstm = con.prepareStatement("select * from SHIP where shipid = ?");
        pstm.setInt(1, id);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            s.shipName = rs.getString("shipName");
            s.shipType = rs.getString("shipType");
            s.displacement = rs.getInt("Displacement");
            s.expen = rs.getInt("expenses");
        }
        pstm.close();
        con.close();

        return s;
    }

    public static ArrayList<Ships> shipList() {
        ArrayList<Ships> s = new ArrayList<>();
        Ships c;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from ship");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                c = new Ships();
                c.shipId = rs.getInt("shipid");
                c.shipName = rs.getString("shipname");
                s.add(c);
            }
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Captains.class.getName()).log(Level.SEVERE, null, ex);
        }

        return s;
    }

    public static Ships findIdByName(String name) {
        Ships ship = null;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from ship where shipName = ?");
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ship = new Ships();
                ship.shipId = rs.getInt("shipId");
            }
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomersCompany.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ship;
    }

    public static void main(String[] args) throws SQLException {
        Ships ship = new Ships();
        Connection con = ConnectionBuidler.getConnection();
        ship.addShipsInfo("Patis", "bananboat", 5000, 23456);
//        System.out.println(con);
////
//        Ships s = Ships.findIdByName("Patis");
//        System.out.println(s.getShipsId());
//  
    }

    public int getShipsId() {
        return shipId;
    }

    public void setShipsId(int shipId) {
        this.shipId = shipId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.shipId;
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
        final Ships other = (Ships) obj;
        if (this.shipId != other.shipId) {
            return false;
        }
        return true;
    }

    public Ships(ResultSet rs) throws SQLException {
        this.shipId = rs.getInt("shipid");
        this.shipName = rs.getString("shipname");
        this.shipType = rs.getString("shiptype");
        this.displacement = rs.getInt("displacement");
        this.expen = rs.getInt("expen");
    }

    public List<Ships> mainDataShips() throws SQLException {
        List<Ships> ls = null;
        Ships s = null;
        Connection con = ConnectionBuidler.getConnection();
        try {
            String sql = ("SELECT * FROM ship");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                s = new Ships(rs);
                if (ls == null) {
                    ls = new ArrayList();
                }
                ls.add(s);
            }
            st.close();
            con.close();
        } catch (Exception e) {
        }
        return ls;
    }
}
