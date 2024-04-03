package org.doctorapp.client;

import org.doctorapp.exceptions.DoctorNotFoundException;
import org.doctorapp.model.Doctor;
import org.doctorapp.model.Specialization;
import org.doctorapp.service.DoctorServiceImpl;
import org.doctorapp.service.IDoctorService;

import java.util.List;

public class User {
    public static void main(String[] args) throws DoctorNotFoundException {
      IDoctorService doctorService = new DoctorServiceImpl();

//      Specialization specialization =   Specialization.GYNAEC;
      String speciality = Specialization.GYNAEC.getSpeciality();

//      String special = Specialization.NEURO.getSpeciality();
//      Doctor doctor = new Doctor("GEETHA",speciality,900,3,1);

//      doctorService.addDoctor(doctor);
        List<Doctor> doctorList = doctorService.getAll();
        for (Doctor doctor: doctorList){
            System.out.println(doctor);
        }
    }
}
