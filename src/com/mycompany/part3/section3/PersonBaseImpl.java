package com.mycompany.part3.section3;

public abstract class PersonBaseImpl implements Person
{
	protected String name = " ";
	
	PersonBaseImpl(String _name)
	{
		name = _name;
	}
	
	public String getName()
	{
		return name;
	}
	
	
}
