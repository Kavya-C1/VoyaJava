package org.doctorapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DoctorDb {
    static Connection connection;

    public DoctorDb() {
    }

    public static Connection OpenConnection(){
        String url = "jdbc:mysql://localhost:3306/doctorappmaven";
        String username = "root";
        String password = "root";
        try{
             connection = DriverManager.getConnection(url, username, password);
            System.out.println("connected to db");

        }catch (Exception e){
            e.printStackTrace();

        }
        return DoctorDb.connection;
    }
}
