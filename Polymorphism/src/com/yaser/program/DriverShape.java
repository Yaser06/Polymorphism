package com.yaser.program;

import com.yaser.model2.Shape;
import com.yaser.model2.Square;
import com.yaser.model2.Triangle;

public class DriverShape {
	
	public static void shapeAreaCalculater(Shape shape) {
		//Burada shape t�r�nde bir static metod olu�turdum.Verdi�im objenin calculatene girip hesaplama yapt�.
		System.out.println(shape.calculateArea());
	}
	
	
	public static void main(String[] args) {
		System.out.print("�cgenin alan� : ");
		shapeAreaCalculater(new Triangle(5,6));
		
		System.out.print("Karenin alan� : ");
		shapeAreaCalculater(new Square(5));
	}

}
