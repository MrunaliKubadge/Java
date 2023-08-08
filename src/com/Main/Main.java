package com.Main;

import java.util.Arrays;

import com.Mrunali.Student;
import com.Mrunali.Validate;

public class Main 
{
	
	public static void main(String[] args) 
	{
		Student student= new Student();
		student.enrollStudent();
		
		Validate validate =new Validate(student);
		boolean[] ans = new boolean[3];
		
		if(Arrays.equals(ans, validate.validateStudent())==true)
			System.out.println("Your Registration is Successful");
		else System.out.println("Incorrect Information!\nPlease enter correct information");
		
		
	}

}
