package org.doctorapp.util;

public class Queries {
    public static final String INSERTQUERY =
            "insert into doctor(doctor_name,speciality,experience,ratings,fees) values(?,?,?,?,?)";

    public static final String UPDATEQUERY =
            "update doctor set fees=? where doctor_id=?";

    public static final String DELETEQUERY =
            "DELETE FROM DOCTOR where doctor_id=?";

    public static final String FINDALLQUERY =
            "SELECT * FROM DOCTOR";

    public static final String FINDBYSPECIALITY =
            "SELECT * FROM DOCTOR WHERE speciality=?";

    public static final String FINDBYSPECANDEX =
            "SELECT * FROM DOCTOR WHERE speciality=? AND experience>=?";

    public static final String FINDBYSPECANDRATINGS =
            "SELECT * FROM DOCTOR WHERE speciality=? AND ratings>=?";

    public static final String FINDBYSPECANDFEES =
            "SELECT * FROM DOCTOR WHERE speciality=? AND fees<=?";

    public static final String FINDBYSPECANDNAME =
            "SELECT * FROM DOCTOR WHERE speciality=? AND doctor_name like ?";

    public static final String FINDBYID =
            "SELECT * FROM DOCTOR WHERE doctor_id=?";
}
