/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

/**
 *
 * @author ADMIN
 */
public class Dao extends DBContext{
    public User check(String user, String pass) {
        String sql = "select * from [User] where username= ? and password=?";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            st.setString(2, pass);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                User c = new User(rs.getString("username"), rs.getString("password"));
                return c;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static void main(String[] args) {
        Dao d=new Dao();
        User c= d.check("mra", "mra");
        System.out.println(c.getUsername());
    }
}
