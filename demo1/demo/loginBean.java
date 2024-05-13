package com.example.demo;

import java.sql.*;

public class loginBean {
    public boolean checkLogin(String username, String password) throws SQLException {

            Connection connection = SQLComnection.getMySQLConnection();

            String query = "SELECT * FROM user WHERE username = ? AND password = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return true;
            }else {
                return  false;
            }



    }
}
