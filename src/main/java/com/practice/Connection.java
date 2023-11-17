package com.practice;

import java.sql.*;

public class Connection {
    public void connect(){
        try(java.sql.Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sakila",
                "root",
                "Zahirs12")){
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from actor;");
            while (rs.next()){
                System.out.println(rs.getString(2)+ " " + rs.getString("last_name"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
