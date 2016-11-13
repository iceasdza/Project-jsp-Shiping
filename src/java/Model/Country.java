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
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author patiz
 */
public class Country {

    private int idCountry;
    private String countryName;
    private Double timeTravel;

    public int getIdCountry() {
        return idCountry;
    }

    public String getCountryName() {
        return countryName;
    }

    public Double getTimeTravel() {
        return timeTravel;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setTimeTravel(Double timeTravel) {
        this.timeTravel = timeTravel;
    }

    public void addCountry(String id, String name, Double time) {
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("insert into country (idCountry,nameCountry,time_travel) values(?,?,?)");
            pstm.setString(1, id);
            pstm.setString(2, name);
            pstm.setDouble(3, time);
            pstm.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Country.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Country findById(String id) throws SQLException {
        Country c = new Country();
        Connection con = ConnectionBuidler.getConnection();
        PreparedStatement pstm = con.prepareStatement("select * from country where lower(idCountry) like ?");
        pstm.setString(1, "%"+id+"%");
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            c.countryName = rs.getString("nameCountry");
            c.timeTravel = rs.getDouble("time_travel");
        }

        con.close();
        return c;
    }

    public static void main(String[] args) throws SQLException {
        
        
//
//        Country cc = new Country();
//        cc.addCountry("TH04", "THAI",150.151);
        
        Country co = Country.findById("TH02");
        System.out.println(co.getCountryName());
    }
}
