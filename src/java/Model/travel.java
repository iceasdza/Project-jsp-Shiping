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
public class travel {
    private int notravel;
    private String status;
    private String starttime;
    private String finishtime;
    private int captain;
    private int ship;
    private String country_from;
    private String country_to;

    public int getNotravel() {
        return notravel;
    }

    public void setNotravel(int notravel) {
        this.notravel = notravel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(String finishtime) {
        this.finishtime = finishtime;
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

    public travel(int notravel, String status, String starttime, String finishtime, int captain, int ship, String country_from, String country_to) {
        this.notravel = notravel;
        this.status = status;
        this.starttime = starttime;
        this.finishtime = finishtime;
        this.captain = captain;
        this.ship = ship;
        this.country_from = country_from;
        this.country_to = country_to;
    }

    public travel() {
    }
    
    
    public void addTravel(String status, String starttime, String finishtime, int captain, int ship, String country_from, String country_to){
        travel t = new travel();
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("insert into travel (status,starttime,finishtime,captian,ship,country_from,country_to) values(?,?,?,?,?,?,?)");
            pstm.setString(1, status);
            pstm.setString(2, starttime);
            pstm.setString(3,finishtime);
            pstm.setInt(4,captain);
            pstm.setInt(5,ship);
            pstm.setString(6,country_from);
            pstm.setString(7, country_to);
            pstm.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(travel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static int currentTravelNo(){
            ArrayList<travel> t  = new ArrayList<>();
            travel tt ;
            int max =0;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from travel");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {                
                tt = new travel();
                tt.notravel= rs.getInt("notravel");
                t.add(tt);
            }
            con.close();
            for (travel s : t) {
                if(s.getNotravel()>max){
                    max = s.getNotravel();
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Shipping.class.getName()).log(Level.SEVERE, null, ex);
        }
                    return max;
    }
     public static travel findByNoTravel(int no){
         
         travel t = new travel();
        try {
            Connection con = ConnectionBuidler.getConnection();
         PreparedStatement pstm =con.prepareStatement("select * from travel where notravel = ?");
         pstm.setInt(1, no);
            ResultSet rs =   pstm.executeQuery();
            while(rs.next()){
                t.status = rs.getString("status");
                t.starttime = rs.getString("starttime");
                t.finishtime = rs.getString("finishtime");
                t.captain =rs.getInt("captian");
                t.ship=rs.getInt("ship");
                t.country_from=rs.getString("country_from");
                t.country_to=rs.getString("country_to");
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(travel.class.getName()).log(Level.SEVERE, null, ex);
        }
         return t;
     }
     public static void main(String[] args) {
        travel t  = new travel();
        t.addTravel("GOING", "7/11/2016 12:12", "7/11/2016 12:15", 251, 251, "HK", "TH");
//                int t = travel.currentTravelNo();
//                System.out.println(t);
    }
}
