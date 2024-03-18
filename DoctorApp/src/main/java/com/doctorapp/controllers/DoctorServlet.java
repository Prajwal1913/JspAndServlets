package com.doctorapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorapp.model.Doctor;


@WebServlet("/doctorServlet")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DoctorServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String doctorName = request.getParameter("doctorName");
		String dId = request.getParameter("doctorId");
		int doctorId = Integer.parseInt(dId);
		String speciality = request.getParameter("speciality");
		String Fees = request.getParameter("fees");
		double fees = Double.parseDouble(Fees);
		String Ratings = request.getParameter("ratings");
		int ratings = Integer.parseInt(Ratings);
		String Experience = request.getParameter("experience");
		int experience = Integer.parseInt(Experience);

		Doctor doctor = new Doctor();
		doctor.setDoctorName(doctorName);
		doctor.setDoctorId(doctorId);
		doctor.setSpeciality(speciality);
		doctor.setFees(fees);
		doctor.setRatings(ratings);
		doctor.setExperience(experience);
		
		request.setAttribute("doctor", doctor);
		RequestDispatcher dispatcher = request.getRequestDispatcher("doctorsuccess.jsp");
		dispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


}
