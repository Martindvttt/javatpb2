package com.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static Connection conn;

    public static Connection Connection() throws Exception {
        if (conn == null) {
            String url = "jdbc:sqlite:/Users/Martindvt/Documents/IPI/Java/B2/dbtpjava.db";
            conn = DriverManager.getConnection(url);
        }
        return conn;
    }
}