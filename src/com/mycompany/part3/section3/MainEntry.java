package com.mycompany.part3.section3;

public class MainEntry 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Person p1, p2;
		Teacher t = new TeacherImpl("ilker", "java");
		Student s = new StudentImpl("robertFreeman", "java");
		p1 = t;
		p2 = s;
		System.out.println("p1 Name: " + p1.getName() +"\np2 Name: " +  p2.getName());

	}

}
