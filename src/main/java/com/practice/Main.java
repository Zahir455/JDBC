package com.practice;

import java.sql.*;
public class Main {
    public static void main(String[] args) {
        Connection connection = new Connection();
        connection.connect();
    }
}