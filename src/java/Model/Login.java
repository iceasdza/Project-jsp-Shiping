/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import javax.naming.spi.DirStateFactory;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Warhead_TH
 */
public class Login {

    private String email;
    private String password;
    private String fisrtName;
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private Login(ResultSet rs) throws SQLException {
        this.email = rs.getString("email");
        this.password = rs.getString("password");
        this.fisrtName = rs.getString("firstname");
        this.lastName = rs.getString("lastname");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.email);
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
        final Login other = (Login) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    private static final String FIND_Email = "select * from staffs where lower(email) like ?";

    public static List<Login> findEmail(String param) throws SQLException {
        List<Login> logins = null;
        Login l = null;
        Connection con = ConnectionBuidler.getConnection();
        try {
            PreparedStatement pstm = con.prepareStatement(FIND_Email);
            pstm.setString(1, param.toLowerCase() + "%");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                l = new Login(rs);
                if (logins == null) {
                    logins = new ArrayList();
                }
                logins.add(l);
                pstm.close();
                con.close();
            }
        } catch (Exception e) {
            System.out.print(e);
        }
        return logins;
    }

    @Override
    public String toString() {
        return fisrtName + " " + lastName;
    }

}
