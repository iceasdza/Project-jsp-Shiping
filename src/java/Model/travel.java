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
public class travel {

    private int noTravel;
    private String status;
    private String startTime;
    private String finishTime;
    private int captain;
    private int ship;
    private String country_from;
    private String country_to;

    public int getNotravel() {
        return noTravel;
    }

    public void setNotravel(int noTravel) {
        this.noTravel = noTravel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStarttime() {
        return startTime;
    }

    public void setStarttime(String startTime) {
        this.startTime = startTime;
    }

    public String getFinishtime() {
        return finishTime;
    }

    public void setFinishtime(String finishTime) {
        this.finishTime = finishTime;
    }

    public int getCaptain() {
        return captain;
    }

    public void setCaptain(int captain) {
        this.captain = captain;
    }

    public int getShip() {
        return ship;
    }

    public void setShip(int ship) {
        this.ship = ship;
    }

    public String getCountry_from() {
        return country_from;
    }

    public void setCountry_from(String country_from) {
        this.country_from = country_from;
    }

    public String getCountry_to() {
        return country_to;
    }

    public void setCountry_to(String country_to) {
        this.country_to = country_to;
    }

    public travel(int noTravel, String status, String startTime, String finishTime, int captain, int ship, String country_from, String country_to) {
        this.noTravel = noTravel;
        this.status = status;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.captain = captain;
        this.ship = ship;
        this.country_from = country_from;
        this.country_to = country_to;
    }

    public travel() {
    }

    public void addtravel(String status, String startTime, String finishTime, int captain, int ship, String country_from, String country_to) {
        travel t = new travel();
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("insert into travel (status,startTime,finishTime,captian,ship,country_from,country_to) values(?,?,?,?,?,?,?)");
            pstm.setString(1, status);
            pstm.setString(2, startTime);
            pstm.setString(3, finishTime);
            pstm.setInt(4, captain);
            pstm.setInt(5, ship);
            pstm.setString(6, country_from);
            pstm.setString(7, country_to);
            pstm.executeUpdate();
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(travel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static int currenttravelNo() {
        ArrayList<travel> t = new ArrayList<>();
        travel tt;
        int max = 0;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from travel");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                tt = new travel();
                tt.noTravel = rs.getInt("noTravel");
                t.add(tt);
            }
            pstm.close();
            con.close();
            for (travel s : t) {
                if (s.getNotravel() > max) {
                    max = s.getNotravel();
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Shipping.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }

    public static travel findByNotravel(int no) {

        travel t = new travel();
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from travel where noTravel = ?");
            pstm.setInt(1, no);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                t.status = rs.getString("status");
                t.startTime = rs.getString("startTime");
                t.finishTime = rs.getString("finishTime");
                t.captain = rs.getInt("captian");
                t.ship = rs.getInt("ship");
                t.country_from = rs.getString("country_from");
                t.country_to = rs.getString("country_to");
                pstm.close();
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(travel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }

    public static ArrayList<travel> Listtravel() {
        ArrayList<travel> tt = new ArrayList<>();
        travel t = null;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from travel");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                t = new travel();
                t.noTravel = rs.getInt("noTravel");
                t.status = rs.getString("status");
                t.startTime = rs.getString("startTime");
                t.finishTime = rs.getString("finishTime");
                t.captain = rs.getInt("captian");
                t.ship = rs.getInt("ship");
                t.country_from = rs.getString("country_from");
                t.country_to = rs.getString("country_to");
                tt.add(t);
            }
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(travel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tt;
    }

    public static void main(String[] args) {
        ArrayList<travel> t = travel.Listtravel();
        for (travel object : t) {
            System.out.println(object.getNotravel());
        }

    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.noTravel;
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
        final travel other = (travel) obj;
        if (this.noTravel != other.noTravel) {
            return false;
        }
        return true;
    }

    private travel(ResultSet rs) throws SQLException {
        this.noTravel = rs.getInt("noTravel");
        this.ship = rs.getInt("ship");
        this.captain = rs.getInt("captian");
        this.country_from = rs.getString("country_from");
        this.country_to = rs.getString("country_to");
        this.status = rs.getString("status");
        this.startTime = rs.getString("startTime");
        this.finishTime = rs.getString("finishTime");
    }

    public List<travel> mainDatatravel() throws SQLException {
        List<travel> lt = null;
        travel t = null;
        Connection con = ConnectionBuidler.getConnection();
        try {
            String sql = "SELECT * FROM travel";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                t = new travel(rs);
                if (lt == null) {
                    lt = new ArrayList();
                }
                lt.add(t);
            }
            st.close();
            con.close();
        } catch (Exception e) {
        }

        return lt;
    }

    public String checkFinishTime(int noTravel) throws SQLException {
        String finish = null;
        Connection con = ConnectionBuidler.getConnection();
        PreparedStatement pstm = con.prepareStatement("SELECT finishTime from travel WHERE noTravel = ?");
        pstm.setInt(1, noTravel);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            finish = rs.getString("finishTime");
        }
        pstm.close();
        con.close();
        return finish;
    }

    public void updateStartTime(int noTravel, String st) throws SQLException {
        Connection con = ConnectionBuidler.getConnection();
        PreparedStatement pstm = con.prepareStatement("UPDATE travel SET startTime ='?' WHERE noTravel = ?");
        pstm.setString(1, st);
        pstm.setInt(2, noTravel);
        pstm.executeUpdate();
        pstm.close();
        con.close();
    }

    public void updateFinishTime(int noTravel, String st) throws SQLException {
        Connection con = ConnectionBuidler.getConnection();
        PreparedStatement pstm = con.prepareStatement("UPDATE travel SET finishTime ='?' WHERE noTravel = ?");
        pstm.setString(1, st);
        pstm.setInt(2, noTravel);
        pstm.executeUpdate();
        pstm.close();
        con.close();
    }

    public void updateStatus(int noTravel, String st) throws SQLException {
        Connection con = ConnectionBuidler.getConnection();
        PreparedStatement pstm = con.prepareStatement("UPDATE travel SET Status ='?' WHERE noTravel = ?");
        pstm.setString(1, st);
        pstm.setInt(2, noTravel);
        pstm.executeUpdate();
        pstm.close();
        con.close();
    }

    public String pullStatus(int noTravel) throws SQLException {
        String status = null;
        Connection con = ConnectionBuidler.getConnection();
        PreparedStatement pstm = con.prepareStatement("SELECT status FROM travel WHERE noTravel = ?");
        pstm.setInt(1, noTravel);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            status = rs.getString("status");
        }
        pstm.close();
        con.close();
        return status;
    }

    public void changeCountry(int noTravel, String country_to, String country_from) throws SQLException {
        Connection con = ConnectionBuidler.getConnection();
        PreparedStatement pstm = con.prepareStatement("UPDATE travel SET country_to = '?',country_from = '?' WHERE noTravel = ?");
        pstm.setString(1, country_from);
        pstm.setString(2, country_to);
        pstm.setInt(3, noTravel);
        pstm.executeUpdate();
        pstm.close();
        con.close();
    }

    @Override
    public String toString() {
        return "travel{" + "noTravel=" + noTravel + ", status=" + status + ", startTime=" + startTime + ", finishTime=" + finishTime + ", captain=" + captain + ", ship=" + ship + ", country_from=" + country_from + ", country_to=" + country_to + '}';
    }

}
