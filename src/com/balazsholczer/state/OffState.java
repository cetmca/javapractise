package com.balazsholczer.state;

public class OffState implements State{


	public void doAction(Context context) {
		System.out.println("This is off state...");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "Off state...";
	}
}
