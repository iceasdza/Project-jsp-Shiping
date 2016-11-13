/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patiz
 */
public class Shipping {
    private int travelNo;
    private int customer_in;
    private int customer_out;
    private int pic ;

    public int getTravelNo() {
        return travelNo;
    }

    public int getCustomer_in() {
        return customer_in;
    }

    public int getCustomer_out() {
        return customer_out;
    }

    public int getPic() {
        return pic;
    }

    public void setTravelNo(int travelNo) {
        this.travelNo = travelNo;
    }

    public void setCustomer_in(int customer_in) {
        this.customer_in = customer_in;
    }

    public void setCustomer_out(int customer_out) {
        this.customer_out = customer_out;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
    
    public void addShipping(int customerIn,int customerOut,int pic){
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("insert into shipping (customer_in,customer_out,pic) values(?,?,?)");
            pstm.setInt(1, customerIn);
            pstm.setInt(2, customerOut);
            pstm.setInt(3, pic);
            
            pstm.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shipping.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public static void main(String[] args) {
    }
}
