package com.doctorapp.service;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.exception.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.repository.DoctorRepositoryImpl;
import com.doctorapp.repository.IDoctorRepository;

import java.util.Collections;
import java.util.List;

public class DoctorServiceImpl implements IDoctorService {
    private IDoctorRepository doctorRepository = new DoctorRepositoryImpl();
    @Override
    public void addDoctor(Doctor doctor) {
        doctorRepository.addDoctor(doctor);
    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
        doctorRepository.updateDoctor(doctorId,fees);
    }

    @Override
    public void deleteDoctor(int doctorId) {
        doctorRepository.deleteDoctor(doctorId);
    }

    @Override
    public Doctor getById(int doctorId) throws IdNotFoundException {
        List<Doctor> doctorList = doctorRepository.findBySpeciality(String.valueOf(doctorId));
        if(doctorList.isEmpty())
            throw new IdNotFoundException("doctor with the specified ID not found");
        Collections.sort(doctorList,
                (d1,d2)-> d1.getDoctorId().compareTo(d2.getDoctorId()));
        return (Doctor) doctorList;
    }

    @Override
    public List<Doctor> getAll() {
        return doctorRepository.findAll();
    }

    @Override
    public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
        List<Doctor> doctorList = doctorRepository.findBySpeciality(speciality);
        if(doctorList.isEmpty())
            throw new DoctorNotFoundException("doctor with the speciality and experience not found");
        Collections.sort(doctorList,
                (d1,d2)-> d1.getDoctorName().compareTo(d2.getDoctorName()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException{
        List<Doctor> doctorList = doctorRepository.findBySpecialityAndExp(speciality,experience);
        if(doctorList.isEmpty())
            throw new DoctorNotFoundException("doctor with the speciality and experience not found");
        Collections.sort(doctorList,
                (d1,d2)->((Integer)(d2.getExperience())).compareTo(d1.getExperience()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundException{
        List<Doctor> doctorList = doctorRepository.findBySpecialityAndLessFees(speciality,fees);
        if(doctorList.isEmpty())
            throw new DoctorNotFoundException("doctor with the speciality and lees fees are not found");
        Collections.sort(doctorList,
                (d1,d2)->(((Double)d2.getFees())).compareTo(d1.getFees()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException{
        List<Doctor> doctorList = doctorRepository.findBySpecialityAndRatings(speciality,ratings);
        if(doctorList.isEmpty())
            throw new DoctorNotFoundException("doctor with the speciality and ratings are not found");
        Collections.sort(doctorList,
                (d1,d2)->(((Integer)d2.getRatings())).compareTo(d1.getRatings()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName) throws DoctorNotFoundException{
        List<Doctor> doctorList = doctorRepository.findBySpecialityAndNameContains(speciality,doctorName);
        if(doctorList.isEmpty())
            throw new DoctorNotFoundException("doctor with the speciality and doctor name is not found");
        Collections.sort(doctorList,
                (d1,d2)->(d1.getDoctorName().compareTo(d1.getDoctorName())));
        return doctorList;
    }
}
