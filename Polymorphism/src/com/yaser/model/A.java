package com.yaser.model;

public class A {

	void f() {
		System.out.println("Calling A f() ");
	}

	public A() {
		System.out.println("Before calling f( ) ");
		//ilk f fonksiyonunu A dan B ye gidip kullandýgý için degeri atanmadýgýndan 0 alýyoruz.
		f();
		// B de override methodu oldugu için B deki f methodunu kullanýyor.
		System.out.println("After calling  f( ) ");

	}

}
