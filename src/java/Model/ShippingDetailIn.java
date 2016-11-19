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
 * @author Warhead_TH
 */
public class ShippingDetailIn {

    private int shippingNo;
    private int product;

    public ShippingDetailIn() {
    }

    
    public int getShippingNo() {
        return shippingNo;
    }

    public void setShippingNo(int shippingNo) {
        this.shippingNo = shippingNo;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.shippingNo;
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
        final ShippingDetailIn other = (ShippingDetailIn) obj;
        if (this.shippingNo != other.shippingNo) {
            return false;
        }
        return true;
    }

    public ShippingDetailIn(ResultSet rs) throws SQLException {
        this.shippingNo = rs.getInt("shippingno");
        this.product = rs.getInt("product");
    }

    public List<ShippingDetailIn> mainDataShippingDetailIn() throws SQLException {
        List<ShippingDetailIn> ls = null;
        ShippingDetailIn s = null;
        Connection con = ConnectionBuidler.getConnection();
        try {
            String sql = "SELECT * FROM shippingdetailin";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                s = new ShippingDetailIn(rs);
                if (ls == null) {
                    ls = new ArrayList();
                }
                ls.add(s);
            }

            con.close();
        } catch (Exception e) {
        }
        return ls;
    }

    public void addDetail() {

    }

    public void addShippingDetailIn(int travelno, int productid) {

        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("insert into shippingdetailin (shippingno,product) values(?,?)");
            pstm.setInt(1, travelno);
            pstm.setInt(2, productid);
            pstm.executeUpdate();
            pstm.close();
            con.close();
        } catch (SQLException ex) {

        }
    }

    public void addShippingDetailout(int travelno, int productid) {

        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("insert into shippingdetailout (shippingno,product) values(?,?)");
            pstm.setInt(1, travelno);
            pstm.setInt(2, productid);
            pstm.executeUpdate();
            pstm.close();
            con.close();
        } catch (SQLException ex) {

        }
    }

}
