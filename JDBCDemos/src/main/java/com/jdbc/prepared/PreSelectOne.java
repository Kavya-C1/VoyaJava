package com.jdbc.prepared;


import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class PreSelectOne {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql =
                "select * from cab where drop_loc=?";
        try(
                Connection connection = DriverManager.getConnection(url,username,password);
                PreparedStatement statement = connection.prepareStatement(sql);

        ){
            statement.setString(1,"btm");
            try( ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    int cabNumber = resultSet.getInt("cab_number");
                    String drop = resultSet.getString("drop_loc");
                    String pickup = resultSet.getString("pickup_loc");
                    String driverName = resultSet.getString("driver_name");
                    Time time1 = resultSet.getTime("pickup_time"); //"16:00:00";
//                Date date = resultSet.getDate("date"); //"2024-03-07";
                    LocalTime pickupTime = LocalTime.parse(time1.toString());
                    LocalDate pickupDate = LocalDate.parse(resultSet.getDate("pickup_date").toString());

//                int employeeId = resultSet.getInt("employeeID");
//                String city = resultSet.getString("city");
                    System.out.println(cabNumber + "\t" + drop + "\t" + pickup + "\t" + time1 + "\t" + pickupDate + "\t" + driverName);
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Done");
        }
    }
