package com.Mrunali;

import java.util.Scanner;
import java.util.Arrays;

public class Student
{
	private String name;
	private int enId;
	private int[] marks= new int[3];
	private String highQual;
	
	public static Scanner scanner=new Scanner(System.in);
	
	public void enrollStudent()
	{
		name=scanner.next();
		enId=scanner.nextInt();
		for (int i=0;i<marks.length;i++)
			marks[i]=scanner.nextInt();
		highQual=scanner.next();
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getEnrollmentId()
	{
		return enId;
	}

    public int[] getMarks()
    {
    	 return marks;
    }
}
