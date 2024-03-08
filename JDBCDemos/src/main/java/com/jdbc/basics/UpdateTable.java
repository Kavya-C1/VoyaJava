package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";

        //get the connection object
        try(Connection connection =  DriverManager.getConnection(url,username,password);
        //create a statement object
        Statement statement = connection.createStatement();) {
            //pass the sql query to be executed
            String sql =
                    "update employee set city = 'Bangalore'";
            //pass the sql query inside execute method
            boolean result = statement.execute(sql);
            System.out.println("Table created " + !result);
        }catch(SQLException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
