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

/**
 *
 * @author Warhead_TH
 */
public class ShippingDetailOut {

    private int shippingNo;
    private int product;

    public ShippingDetailOut() {
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
        hash = 47 * hash + this.shippingNo;
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
        final ShippingDetailOut other = (ShippingDetailOut) obj;
        if (this.shippingNo != other.shippingNo) {
            return false;
        }
        return true;
    }

    public ShippingDetailOut(ResultSet rs) throws SQLException {
        this.shippingNo = rs.getInt("shippingno");
        this.product = rs.getInt("product");
    }

    public List<ShippingDetailOut> mainDataShippingDetailOut() throws SQLException {
        List<ShippingDetailOut> ls = null;
        ShippingDetailOut s = null;
        Connection con = ConnectionBuidler.getConnection();
        try {
            String sql = "SELECT * FROM shippingdetailout";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                s = new ShippingDetailOut(rs);
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
