package com.Mrunali;
import com.Mrunali.Student;
import java.io.*;

public class Validate extends Student 
{
	private Student student =new Student();
	
	public Validate (Student student)
	{
		this.student =student;
	}
	

	public boolean[] validateStudent()
	{
		boolean ans[]= new boolean[3];
		ans[0]=valName( student.getName());
		ans[1]=valId(student.getEnrollmentId());
		ans[2]=valMarks(student.getMarks());
		return ans;
		
	}
	
	public boolean valName(String name)
	{
		name= this.student.getName();
		for (int i=0;i<name.length();i++)
		{
			if (Character.isAlphabetic(name.charAt(i))==false);
				return false;
		}
		
		return true;//As for returning true for loop wont check all the string characters it would only check
		//1 character and return true so we need run all the iterations of for loop and then return true  	
	}

	public boolean valId(int Id)
	{
		boolean ans= Character.isDigit(Id)==true? true:false;
		return ans;
	}
	
	public boolean valMarks(int[] marks)
	{
		marks= student.getMarks();
		for (int i=0;i<marks.length;i++)
		{
			if (Character.isDigit(marks[i])==false)
				return false;
		}
		 return true;
	}


}
