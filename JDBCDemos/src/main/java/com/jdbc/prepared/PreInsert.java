package com.jdbc.prepared;

import java.sql.*;
import java.util.Scanner;

public class PreInsert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql =
                "insert into cab values(?,?,?,?,?,?)";
        try(
                Connection connection = DriverManager.getConnection(url,username,password);
                PreparedStatement statement = connection.prepareStatement(sql);
        ){
            Scanner scanner = new Scanner(System.in);
            for (int i=0;i<5;i++){
                int cabNumber = scanner.nextInt();
                String drop = scanner.next();
                String pickup = scanner.next();
                String time1 = scanner.next(); //"2024-03-07 16:00:00";
                String date = scanner.next(); //"2024-03-07";
                 String driverName = scanner.next();
//                Date date1 = Date.valueOf(date);

                //assign values tp placeholders
                statement.setInt(1,cabNumber);
                statement.setString(2,drop);
                statement.setString(3,pickup);
                statement.setTime(4, Time.valueOf(time1));
                statement.setDate(5, Date.valueOf(date));
                statement.setString(6,driverName);

                boolean result = statement.execute();
                System.out.println(result);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
