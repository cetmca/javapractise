package com.state;

public class App {

	public static void main(String[] args) {
		
		Context context = new Context();
		
		//State onState = new OnState();
		State onState = new OffState();
		onState.doAction(context);
		System.out.println(context.getState().toString());
		
	}
}
