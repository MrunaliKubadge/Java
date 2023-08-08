package com.DiffShapes;

public class Triangle extends Shapes
{
	private float areaTri;
	private Shapes shapes = new Shapes();

	public Triangle(Shapes shapes)
	{
		this.shapes= shapes;
	}
	
	public float calcArea()
	{
		areaTri= 0.5f * shapes.getbase() * shapes.getheight();
		return areaTri;
	}

}
