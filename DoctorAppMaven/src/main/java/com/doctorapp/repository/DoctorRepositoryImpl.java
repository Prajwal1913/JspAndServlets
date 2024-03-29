package com.doctorapp.repository;

import com.doctorapp.model.Doctor;
import com.doctorapp.util.DoctorDb;
import com.doctorapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImpl implements IDoctorRepository {
    @Override
    public void addDoctor(Doctor doctor) {
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY)) {
            statement.setString(1, doctor.getDoctorName());
            statement.setString(2, doctor.getSpeciality());
            statement.setDouble(3, doctor.getFees());
            statement.setInt(4, doctor.getRatings());
            statement.setInt(5, doctor.getExperience());

            boolean result = statement.execute();
            System.out.println("one row inserted "+!result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
    	 try (Connection connection = DoctorDb.openConnection();
                 PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);) {
                statement.setDouble(1, fees);
                statement.setInt(2, doctorId);

                int result = statement.executeUpdate();
                System.out.println("row updated " + result);

            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    @Override
    public void deleteDoctor(int doctorId) {
    	try (Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY);) {
               statement.setInt(1, doctorId);

               int result = statement.executeUpdate();
               System.out.println("Row deleted " + result);

           } catch (Exception e) {
               e.printStackTrace();
           }
    }

    @Override
    public List<Doctor> findAll() {
        List<Doctor> doctorList=new ArrayList<>();
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDALLQUERY);
             ResultSet resultSet = statement.executeQuery();
             ) {
            while(resultSet.next()){
                int doctorId = resultSet.getInt("doctorId");
                String doctorName = resultSet.getString("doctorName");
                String specility = resultSet.getString("speciality");
                int experience = resultSet.getInt("experience");
                double fees = resultSet.getDouble("fees");
                int ratings = resultSet.getInt("ratings");
                Doctor doctor = new Doctor(doctorId,doctorName,specility,fees, ratings, experience);
                doctorList.add(doctor);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public Doctor findById(int doctorId) {
    	Doctor doctor = null;
        List<Doctor> doctorList = new ArrayList<>();
        try(
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.FINDBYID);
        ) {
            statement.setInt(1,doctorId);
                    ResultSet resultSet = statement.executeQuery();
                while(resultSet.next()){
                    String doctorName = resultSet.getString("doctorName");
                    String speciality = resultSet.getString("speciality");
                    int experience = resultSet.getInt("experience");
                    int ratings = resultSet.getInt("ratings");
                    double fees = resultSet.getDouble("fees");
                    doctor = new Doctor();
                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience);
                    doctor.setFees(fees);
                    doctor.setRatings(ratings);
                    doctor.setDoctorId(resultSet.getInt("doctorId"));
                    doctorList.add(doctor);
                }
            }catch (Exception e) {
            e.printStackTrace();
        }
        return (Doctor) doctorList;
    }


    @Override
    public List<Doctor> findBySpeciality(String speciality) {
        List<Doctor> doctorList = new ArrayList<>();
       try(
               Connection connection = DoctorDb.openConnection();
               PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECIALITY);
               ) {
           statement.setString(1,speciality);
           try(
                   ResultSet resultSet = statement.executeQuery();
                   ){
               while(resultSet.next()){
                   Doctor doctor = new Doctor();
                   doctor.setDoctorName(resultSet.getString("doctorName"));
                   doctor.setSpeciality(resultSet.getString("speciality"));
                   doctor.setExperience(resultSet.getInt("experience"));
                   doctor.setRatings(resultSet.getInt("ratings"));
                   doctor.setFees(resultSet.getDouble("fees"));
                   doctor.setDoctorId(resultSet.getInt("doctorId"));
                   doctorList.add(doctor);
               }
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
       return doctorList;
    }

    @Override
    public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
    	List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDEXP);) {
            statement.setString(1, speciality);
            statement.setInt(2, experience);
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctorName"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setDoctorId(resultSet.getInt("doctorId"));
                    doctorList.add(doctor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpecialityAndLessFees(String speciality, double fees) {
    	List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDFEES);) {
            statement.setString(1, speciality);
            statement.setDouble(2, fees);
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctorName"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setDoctorId(resultSet.getInt("doctorId"));
                    doctorList.add(doctor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) {
    	List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDRATINGS);) {
            statement.setString(1, speciality);
            statement.setInt(2, ratings);
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctorName"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setDoctorId(resultSet.getInt("doctorId"));
                    doctorList.add(doctor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) {
        List<Doctor> doctorList = new ArrayList<>();
        try(
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDNAME);
        ) {
            statement.setString(1,speciality);
            statement.setString(2,doctorName);
            try(
                    ResultSet resultSet = statement.executeQuery();
            ){
                while(resultSet.next()){
                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctorName"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setDoctorId(resultSet.getInt("doctorId"));
                    doctorList.add(doctor);
                }
            }
        }
     catch (Exception e) {
        e.printStackTrace();
    }
        return doctorList;
    }
}
