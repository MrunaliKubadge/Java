package com.DiffShapes;

public class Circle extends Shapes
{
	private float areaCir;
	private Shapes shapes = new Shapes();
	
	public Circle(Shapes shapes)
	{
		this.shapes= shapes;
	}
	
	public float calcArea()
	{
		areaCir= 3.14f* shapes.getradius()*shapes.getradius();
		return areaCir;
	}

}
