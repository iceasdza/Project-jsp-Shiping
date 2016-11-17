/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patiz
 */
public class Shippingdetailin {
    private int ShippingNo ;
    private int productId;

    public int getShippingNo() {
        return ShippingNo;
    }

    public void setShippingNo(int ShippingNo) {
        this.ShippingNo = ShippingNo;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
     public void addDetail(){
        
    }
    public void addShippingDetailIn(int travelno,int productid){
            
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("insert into shippingdetailin (shippingno,product) values(?,?)");
            pstm.setInt(1, travelno);
            pstm.setInt(2, productid);
            pstm.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shippingdetailin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public void addShippingDetailout(int travelno,int productid){
            
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("insert into shippingdetailout (shippingno,product) values(?,?)");
            pstm.setInt(1, travelno);
            pstm.setInt(2, productid);
            pstm.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shippingdetailin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        Shippingdetailin s = new Shippingdetailin();
    s.addShippingDetailIn(72, 11);
    }
     
}
