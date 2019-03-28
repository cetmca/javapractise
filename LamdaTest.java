package com.intvw.practise;

public class LamdaTest {

public static void main(String[] args) {
		
		Greetings greetingsInstance=n -> System.out.println("Hello World " + n);
		greet(greetingsInstance, "Tom");
	}

private static void greet(Greetings greetingsInstance, String name) {
		greetingsInstance.sayHello(name);
	}

}
