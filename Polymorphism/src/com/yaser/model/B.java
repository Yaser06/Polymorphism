package com.yaser.model;

public class B extends A {

	private int field = 1;

	public B(int field) {
		this.field = field;
		System.out.println("B Constructor with field " + field);
	}

	@Override
	void f() {
		System.out.println("B.f() with field " + field);
	}

}
