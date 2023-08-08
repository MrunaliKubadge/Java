package com.Mrunali;
import com.DiffShapes.Circle;
import com.DiffShapes.Shapes;
import com.DiffShapes.Square;
import com.DiffShapes.Triangle;

public class Main {

	public static void main(String[] args)
	{
		Shapes shapes= new Shapes();
		shapes.addshapes();
		
		Square square= new Square(shapes);
		float AreaofSquare= square.calcArea();
		System.out.println("Area of Square = "+ AreaofSquare);
		
		Circle circle= new Circle(shapes);
		float AreaofCircle= circle.calcArea();
		System.out.println("Area of Circle = "+ AreaofCircle);
		
		Triangle triangle = new Triangle(shapes);
		float AreaofTriangle = triangle.calcArea();
		System.out.println("Area of Triangle= " + AreaofTriangle);
		
	}

}