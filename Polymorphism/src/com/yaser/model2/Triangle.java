package com.yaser.model2;

public class Triangle extends Shape {
	//Dik ücgeni ele alalım
	private int kenar1 ;
	private int kenar2;
	
	public Triangle() {
		this(1,1);
		System.out.println("Ücgen olusturuldu");
	}
	public Triangle(int kenar1 , int kenar2) {
		this.kenar1=kenar1;
		this.kenar2=kenar2;
		
	}
	@Override
	public int calculateArea() {
		
		return ((kenar1*kenar2)/2);
	}
	
	
}
