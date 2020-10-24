package com.yaser.model2;

public class Square extends Shape {
	private int kenar ;
	
	public Square() {
		this(1);
		System.out.println("Kare olusturuldu");
	}
	
	public Square(int kenar) {
		this.kenar=kenar;
	}
	@Override
	public int calculateArea() {
		return kenar*kenar ;
	}
	
}
