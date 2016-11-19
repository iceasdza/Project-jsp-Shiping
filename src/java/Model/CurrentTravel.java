/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Warhead_TH
 */
public class CurrentTravel {

    private int noTravel;
    private String country;
    private String ship;
    private String caption;
    private String status;
    private String buss1;
    private String buss2;
    private String outProduct;
    private String inProduct;
    private String startTime;
    private String estimatedTime;

    public CurrentTravel() {

    }

    public int getNoTravel() {
        return noTravel;
    }

    public void setNoTravel(int noTravel) {
        this.noTravel = noTravel;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBuss1() {
        return buss1;
    }

    public void setBuss1(String buss1) {
        this.buss1 = buss1;
    }

    public String getBuss2() {
        return buss2;
    }

    public void setBuss2(String buss2) {
        this.buss2 = buss2;
    }

    public String getOutProduct() {
        return outProduct;
    }

    public void setOutProduct(String outProduct) {
        this.outProduct = outProduct;
    }

    public String getInProduct() {
        return inProduct;
    }

    public void setInProduct(String inProduct) {
        this.inProduct = inProduct;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(String estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.noTravel;
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
        final CurrentTravel other = (CurrentTravel) obj;
        if (this.noTravel != other.noTravel) {
            return false;
        }
        return true;
    }

    private CurrentTravel(ResultSet rs) throws SQLException {

        this.noTravel = rs.getInt("notravel");
        this.country = rs.getString("country");
        this.ship = rs.getString("ship");
        this.caption = rs.getString("caption");
        this.status = rs.getString("status");
        this.buss1 = rs.getString("buss1");
        this.buss2 = rs.getString("buss2");
        this.outProduct = rs.getString("outproduct");
        this.inProduct = rs.getString("inproduct");
        this.startTime = rs.getString("starttime");
        this.estimatedTime = rs.getString("estimatedTime");
    }

    public List<CurrentTravel> mainData() throws ClassNotFoundException, SQLException {
        List<CurrentTravel> lct = null;
        CurrentTravel cto = null;
        Connection con = ConnectionBuidler.getConnection();
        try {
            String sql = ("SELECT * FROM currenttravel");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                cto = new CurrentTravel(rs);
                System.out.println(cto);
                if (lct == null) {
                    lct = new ArrayList();
                }
                lct.add(cto);
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(lct);
        return lct;
    }

    public void addTravel(int noTravel, String country, String ship, String caption, String status, String buss1, String buss2,
            String outProduct, String inProduct, Date startTime, Date currentTime, Date estimatedTime) throws ClassNotFoundException, SQLException {
        Connection con = ConnectionBuidler.getConnection();
        try {
            PreparedStatement pstm = con.prepareStatement("INSERT INTO currentTravel(noTravel,country,ship,caption,buss1,buss2"
                    + "outProduct,inProduct) VALUES(?,?,?,?,?,?,?,?)");
            pstm.setInt(1, noTravel);
            pstm.setString(2, country);
            pstm.setString(3, ship);
            pstm.setString(4, caption);
            pstm.setString(5, buss1);
            pstm.setString(6, buss2);
            pstm.setString(7, outProduct);
            pstm.setString(8, inProduct);
            pstm.executeUpdate();
            pstm.close();
            con.close();
        } catch (Exception e) {
        }
    }

    public void addStartTime(Date starttime) throws ClassNotFoundException, SQLException {
        Connection con = ConnectionBuidler.getConnection();
        try {
            PreparedStatement pstm = con.prepareStatement("insert into currentTravel(starttime) Values(?)");
            pstm.setDate(1, starttime);
            pstm.executeUpdate();
            pstm.close();
            con.close();
        } catch (Exception e) {
        }
    }

    public void addEstimatedTime(Date estimatedTime) throws ClassNotFoundException, SQLException {
        Connection con = ConnectionBuidler.getConnection();
        try {
            PreparedStatement pstm = con.prepareStatement("insert into currentTravel(estimatedtime) Values(?)");
            pstm.setDate(1, estimatedTime);
            pstm.executeUpdate();
            pstm.close();
            con.close();
        } catch (Exception e) {
        }
    }

    public static boolean checkShip(String ship) throws ClassNotFoundException, SQLException {
        Connection con = ConnectionBuidler.getConnection();
        PreparedStatement pstm = con.prepareStatement("select ship from currecttravel where lower(ship) = ?");
        pstm.setString(1, ship.toLowerCase());
        ResultSet rs = pstm.executeQuery();
        boolean b = false;
        if (rs.next()) {
            b = true;
        }
        pstm.close();
        con.close();
        return b;
    }

    public static boolean checkCaption(String caption) throws ClassNotFoundException, SQLException {
        Connection con = ConnectionBuidler.getConnection();
        PreparedStatement pstm = con.prepareStatement("select caption from currecttravel where lower(ship) = ?");
        pstm.setString(1, caption.toLowerCase());
        ResultSet rs = pstm.executeQuery();
        boolean b = false;
        if (rs.next()) {
            b = true;
        }
        pstm.close();
        con.close();
        return b;
    }

    public List<CurrentTravel> detailList(int id) throws ClassNotFoundException, SQLException {
        List<CurrentTravel> lct = null;
        CurrentTravel cto = null;
        Connection con = ConnectionBuidler.getConnection();
        try {
            String sql = ("SELECT * FROM currenttravel WHERE notravel = ?");
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                cto = new CurrentTravel(rs);
                System.out.println(cto);
                if (lct == null) {
                    lct = new ArrayList();
                }
                lct.add(cto);
            }
            pstm.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        //System.out.println(lct);
        return lct;
    }

    @Override
    public String toString() {
        return "CurrentTravel{" + "noTravel=" + noTravel + ", country=" + country + ", ship=" + ship + ", caption=" + caption + ", status=" + status + ", buss1=" + buss1 + ", buss2=" + buss2 + ", outProduct=" + outProduct + ", inProduct=" + inProduct + ", startTime=" + startTime + ", estimatedTime=" + estimatedTime + '}';
    }

}
