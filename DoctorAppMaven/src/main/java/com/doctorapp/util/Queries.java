package com.doctorapp.util;

public class Queries {
    public static final String INSERTQUERY ="insert into doctor(doctorName,speciality,fees,ratings,experience) values(?,?,?,?,?)";
    public static final String UPDATEQUERY ="update doctor set fees=? where doctorId=?";
    public static final String DELETEQUERY ="delete doctor where doctorId=?";
    public static final String FINDALLQUERY ="select * from doctor";
    public static final String FINDBYSPECIALITY ="select * from doctor where speciality>=?";
    public static final String FINDBYSPECANDRATINGS ="select * from doctor where speciality=? and rating>=?";
    public static final String FINDBYSPECANDFEES ="select * from doctor where speciality=? and fees<=?";
    public static final String FINDBYSPECANDNAME ="select * from doctor where speciality=? and doctorName=?";
    public static final String FINDBYID ="select * from doctor where doctorId=?";
    public static final String FINDBYSPECANDEXP ="SELECT * FROM DOCTOR WHERE speciality = ? AND experience >= ?";
}
