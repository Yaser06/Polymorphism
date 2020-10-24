package com.yaser.program;

import com.yaser.model2.Shape;
import com.yaser.model2.Square;
import com.yaser.model2.Triangle;

public class DriverShape {
	
	public static void shapeAreaCalculater(Shape shape) {
		//Burada shape türünde bir static metod oluþturdum.Verdiðim objenin calculatene girip hesaplama yaptý.
		System.out.println(shape.calculateArea());
	}
	
	
	public static void main(String[] args) {
		System.out.print("Ücgenin alaný : ");
		shapeAreaCalculater(new Triangle(5,6));
		
		System.out.print("Karenin alaný : ");
		shapeAreaCalculater(new Square(5));
	}

}
