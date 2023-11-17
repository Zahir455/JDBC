package com.practice;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {
    public void connect(){
        try(java.sql.Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employees",
                "root",
                "Zahirs12")){
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from employees;");
            while (rs.next()){
                System.out.println(rs.getString(2)+ " " + rs.getString("last_name"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
