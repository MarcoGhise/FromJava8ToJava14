package it.blog.java.version.java8;

/*
 * Now when a class will implement Interface1, it is not mandatory to provide implementation for default methods of interface. 
 * This feature will help us in extending interfaces with additional methods, 
 * all we need is to provide a default implementation.
 * 
 */
public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}

	@Override
	public void log(String str) {
		Interface2.super.log(str);
	}


}