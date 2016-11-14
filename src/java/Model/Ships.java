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
public class Ships {
    private String shipName;
    private String shipType;
    private int displacement;
    private int expen;

    public String getShipName() {
        return shipName;
    }

    public String getShipType() {
        return shipType;
    }

    public int getDisplacement() {
        return displacement;
    }

    public int getExpen() {
        return expen;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void setExpen(int expen) {
        this.expen = expen;
    }
    
    
    
   public void  addShipInfo(String shipname,String type,int displacement,int expen){
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
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ships.class.getName()).log(Level.SEVERE, null, ex);
        }
      
   }
   
   public static Ships findById(int id) throws SQLException{
       Ships s = new Ships();
       Connection con = ConnectionBuidler.getConnection();
       PreparedStatement pstm = con.prepareStatement("select * from SHIP where shipid = ?");
       pstm.setInt(1, id);
       ResultSet rs = pstm.executeQuery();
       while(rs.next()){
           s.shipName = rs.getString("shipName");
           s.shipType = rs.getString("shipType");
           s.displacement = rs.getInt("Displacement");
           s.expen = rs.getInt("expenses");
       }
       con.close();
       
       return  s;
   }
    
    public static void main(String[] args) throws SQLException {
        Ships ship = new Ships();
        Connection con = ConnectionBuidler.getConnection();
        ship.addShipInfo("Patis", "bananboat", 5000, 23456);
//        System.out.println(con);

//    Ships s = Ships.findById(151);
//        System.out.println(s.getShipName()+s.getShipType()+s.getDisplacement()+s.getExpen());
//                
    }
}
