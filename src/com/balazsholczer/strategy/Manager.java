package com.balazsholczer.strategy;

public class Manager implements Strategy{

	private Strategy strategy;
	
	public void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}

	public void operation(int num1, int num2) {
		this.strategy.operation(num1, num2);
	}



}
