package com.DiffShapes;
import java.util. Scanner;

public class Shapes 
{
		private float radius;
		private float side;
		private float base;
		private float height;
		
		public static Scanner scanner= new Scanner(System.in);
		public void addshapes()
		{
			radius= scanner.nextFloat();
			side= scanner.nextFloat();
			base= scanner.nextFloat();
			height =scanner.nextFloat();
		}	

	public float getradius()
	{
		return this.radius;
	}
	
	public float getSide ()
	{
		return this.side;
	}
	
	public float getbase()
	{
		return base;
	}
	
	public float getheight()
	{
		return height;
	}

}
