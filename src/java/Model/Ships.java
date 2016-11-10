/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patiz
 */
public class Ships {
private int ship_Id;
private String  shipName;
private String shipType;
private String loadRank;
private String 	DisplacementTonnage;

    public int getShip_Id() {
        return ship_Id;
    }

    public String getShipName() {
        return shipName;
    }

    public String getShipType() {
        return shipType;
    }

    public String getLoadRank() {
        return loadRank;
    }

    public String getDisplacementTonnage() {
        return DisplacementTonnage;
    }

    public void setShip_Id(int ship_Id) {
        this.ship_Id = ship_Id;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public void setLoadRank(String loadRank) {
        this.loadRank = loadRank;
    }

    public void setDisplacementTonnage(String DisplacementTonnage) {
        this.DisplacementTonnage = DisplacementTonnage;
    }

    public static ArrayList<Ships> shipsInfo(String name){
        
         ArrayList<Ships> ship = new ArrayList<>();
    try {
        Connection con = ConnectionBuidler.getConnection();
        
        PreparedStatement pstm = con.prepareStatement("");
        return  ship;
    } catch (SQLException ex) {
        Logger.getLogger(Ships.class.getName()).log(Level.SEVERE, null, ex);
    }
    return  ship;
       
    }

}
