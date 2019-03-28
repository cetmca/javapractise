package com.intvw.practise;

public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instantiating Singleton class with variable x 
        Singleton x = Singleton.getInstance(); 
  
        // instantiating Singleton class with variable y 
        Singleton y = Singleton.getInstance(); 
  
        // instantiating Singleton class with variable z 
        Singleton z = Singleton.getInstance(); 
  
        // changing variable of instance x 
        x.s = (x.s).toUpperCase(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
        System.out.println("\n"); 
  
        // changing variable of instance z 
        z.s = (z.s).toLowerCase(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
		
		
		//
        
        try
        {
        	int i=100;
        	System.out.println("inside TRYYY");
        }
        finally
        {
        	
        }
        

	}

}
