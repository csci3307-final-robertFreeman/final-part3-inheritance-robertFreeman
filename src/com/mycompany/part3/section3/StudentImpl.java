package com.mycompany.part3.section3;

public class StudentImpl extends PersonBaseImpl implements Student
{
	String takenCourseTitle = " ";
	
	StudentImpl(String _name, String _takenCourseTitle)
	{
		super(_name);
		takenCourseTitle = _takenCourseTitle;
	}
	
	public String studiesFor()
	{
		return takenCourseTitle;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
