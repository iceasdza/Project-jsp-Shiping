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

    private String idCountry;
    private String countryName;
    private Double timeTravel;

    public String getIdCountry() {
        return idCountry;
    }

    public String getCountryName() {
        return countryName;
    }

    public Double getTimeTravel() {
        return timeTravel;
    }

    public void setIdCountry(String idCountry) {
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
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Country.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Country> countryList() {
        ArrayList<Country> c = new ArrayList<>();
        Country co;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select idcountry from country");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                co = new Country();
                co.idCountry = rs.getString("idcountry");
                c.add(co);
            }
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Country.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    public static Country findById(String id) throws SQLException {
        Country c = null;
        Connection con = ConnectionBuidler.getConnection();
        PreparedStatement pstm = con.prepareStatement("select * from country where lower(idCountry) like ?");
        pstm.setString(1, "%" + id + "%");
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            c = new Country();
            c.countryName = rs.getString("nameCountry");
            c.timeTravel = rs.getDouble("time_travel");
        }

        pstm.close();
        con.close();
        return c;
    }

    public static void main(String[] args) throws SQLException {

//
//        Country cc = new Country();
//        cc.addCountry("HK", "HONGKONG",5.00);
//        
//        Country co = Country.findById("TH");
//        System.out.println(co.getCountryName());
        Country cc = new Country();
        ArrayList<Country> c = cc.countryList();
        for (Country country : c) {
            System.out.println(country.getIdCountry());
        }
    }
}
