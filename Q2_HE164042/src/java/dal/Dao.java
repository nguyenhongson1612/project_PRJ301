/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Paper;

/**
 *
 * @author ADMIN
 */
public class Dao extends DBContext{
    public List<Paper> list() {
        List<Paper> list = new ArrayList<>();
        String sql = " select * from Paper";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Paper c = new Paper(rs.getInt("pid"), rs.getString("title"), rs.getString("published_date"), rs.getBoolean("open_access"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
}
