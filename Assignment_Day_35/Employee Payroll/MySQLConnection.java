package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    /**
     CREATE CONNECTION ONLY ONE TIME & USE EVERYWHERE IT INSTANCE
     */

    String url = "jdbc:mysql://localhost:3306/employeePayrollService";
    String username ="root";
    String password ="root";

    public Connection getConnection(){
        Connection connection = null;
        try {
            connection =  DriverManager.getConnection(url,username,password);
            return connection;

        }catch (SQLException e ){
            e.printStackTrace();
        }
        return null;
    }

}