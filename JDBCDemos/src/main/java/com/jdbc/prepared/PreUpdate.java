package com.jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql =
                "update cab set driver_name=? where cab_number=?";
        try(
                Connection connection = DriverManager.getConnection(url,username,password);
                PreparedStatement statement = connection.prepareStatement(sql);
                Scanner scanner = new Scanner(System.in);
        ){

            int cabNumber = scanner.nextInt();
            String driverName = scanner.next();

            //assign values to placeholders

            statement.setInt(2,cabNumber);
            statement.setString(1,driverName);

            boolean result = statement.execute();
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
