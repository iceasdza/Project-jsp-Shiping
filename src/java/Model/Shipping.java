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
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patiz
 */
public class Shipping {

    private int noTravel;
    private int customer_in;
    private int customer_out;
    private int pic;

    public int getTravelNo() {
        return noTravel;
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

    public void setTravelNo(int noTravel) {
        this.noTravel = noTravel;
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

    public Shipping() {
    }

    public void addShipping(int notravel, int customerIn, int customerOut, int pic) {
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("insert into shipping (travelno,customer_in,customer_out,pic) values(?,?,?,?)");
            pstm.setInt(1, notravel);
            pstm.setInt(2, customerIn);
            pstm.setInt(3, customerOut);
            pstm.setInt(4, pic);

            pstm.executeUpdate();
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shipping.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArrayList<Shipping> ListShipping() {
        ArrayList<Shipping> sp = new ArrayList<>();
        Shipping s;
        try {
            Connection con = ConnectionBuidler.getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from shipping");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                s = new Shipping();
                s.noTravel = rs.getInt("travelno");
                sp.add(s);
            }
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shipping.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sp;
    }

    public static void main(String[] args) {
        Shipping s = new Shipping();
        int t = travel.currenttravelNo();
        s.addShipping(t, 91, 1551, 21);//<--- staffId
        //^    ^ idcompany from customer company
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.noTravel;
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
        final Shipping other = (Shipping) obj;
        if (this.noTravel != other.noTravel) {
            return false;
        }
        return true;
    }

    private Shipping(ResultSet rs) throws SQLException {
        this.noTravel = rs.getInt("travelno");
        this.customer_in = rs.getInt("customer_in");
        this.customer_out = rs.getInt("customer_out");
        this.pic = rs.getInt("pic");
    }

    public List<Shipping> mainDataShipping() throws SQLException {
        List<Shipping> ls = null;
        Shipping s = null;
        Connection con = ConnectionBuidler.getConnection();
        try {
            String sql = "SELECT * FROM shipping";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                s = new Shipping(rs);
                if (ls == null) {
                    ls = new ArrayList();
                }
                ls.add(s);
            }
        } catch (Exception e) {
        }

        con.close();
        return ls;
    }

    @Override
    public String toString() {
        return "Shipping{" + "noTravel=" + noTravel + ", customer_in=" + customer_in + ", customer_out=" + customer_out + ", pic=" + pic + '}';
    }

}
