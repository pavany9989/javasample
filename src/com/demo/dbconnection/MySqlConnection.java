/*package com.demo.dbconnection;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySqlConnection {
    private Connection con;
    private String name;
    private String url;
    private String password;
    private String driver;

    public MySqlConnection() {
        this.name = "root";
        this.password = "";
        this.url = "jdbc:mysql://localhost:3306/upssample";
        this.driver = "com.mysql.jdbc.Driver";
    }

    public Connection getConnection() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySqlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}*/