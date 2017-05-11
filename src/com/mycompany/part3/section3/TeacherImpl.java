package com.mycompany.part3.section3;

public class TeacherImpl extends PersonBaseImpl implements Teacher
{
	String thoughtCourseTitle = " ";
	
	
	TeacherImpl(String _name, String _thoughtCourseTitle)
	{
		super(_name);
		thoughtCourseTitle = _thoughtCourseTitle;
	}
	
	public String teachesFor()
	{
		return thoughtCourseTitle;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}
}
