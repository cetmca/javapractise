package com.balazsholczer.strategy;

public class Add implements Strategy{

	public void operation(int num1, int num2) {
		System.out.println(num1+num2);
	}
}
