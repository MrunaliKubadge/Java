package com.DiffShapes;

public class Square extends Shapes 
{
	
	private float areaSq;
	private Shapes shapes =new Shapes();
	
	public Square (Shapes shapes)
	{
		this.shapes=shapes;
	}
	
	public float calcArea()
	{
		areaSq= shapes.getSide()*shapes.getSide();
		return areaSq;
	}

}
