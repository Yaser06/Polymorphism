package com.yaser.model;

public class A {

	void f() {
		System.out.println("Calling A f() ");
	}

	public A() {
		System.out.println("Before calling f( ) ");
		//ilk f fonksiyonunu A dan B ye gidip kulland�g� i�in degeri atanmad�g�ndan 0 al�yoruz.
		f();
		// B de override methodu oldugu i�in B deki f methodunu kullan�yor.
		System.out.println("After calling  f( ) ");

	}

}
