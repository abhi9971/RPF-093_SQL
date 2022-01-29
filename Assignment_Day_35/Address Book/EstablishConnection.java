package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishConnection {
    /**
     CREATE CONNECTION ONLY ONE TIME & USE EVERYWHERE IT INSTANCE
     */

    String url = "jdbc:mysql://localhost:3306/addressBookService";

    String username ="root";

    String password ="Abhishek@09";

    public Connection getConnection() {

        Connection connection = null;
        try {

            connection =  DriverManager.getConnection(url,username,password);
            return connection;
        }
        catch (SQLException e ) {

            e.printStackTrace();
        }
        return null;
    }

}