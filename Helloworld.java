package com.intvw.practise;

import java.util.ArrayList;

class Temp 
{ 
    private Temp(int data) 
    { 
        System.out.printf(" Constructor called "); 
    } 
    protected static Temp create(int data) 
    { 
        Temp obj = new Temp(data); 
        return obj; 
    } 
    public void myMethod() 
    { 
        System.out.printf(" Method called "); 
    } 
} 

public class Helloworld {
    /**
     * Standard main method, JVM will only call this method
     * even if you provided multiple overloaded version.
     * 
     */
    public static void main(String[] args) {
        System.out.println("Inside main(String[] args) method ....");
        
        
        //
        Employee emp1 = new Employee(101,"Manash");
        Employee emp2 = new Employee(101,"Manash");
        Employee emp3 = new Employee(103,"Ranjan");
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.equals(emp3));
        
        
        
        //
        
        Manager manager = new Manager();
        manager.setStrategy(new Division());
        manager.operation(4, 2);
        
        
        int[] obj = new int[] { 1, 2, 3 };
		Integer[] newObj = toObject(obj);
		main(newObj);
		
	String testString="reverse string question test    scripts";
	
	testString=testString.replaceAll("\\s+"," ");
	
	String[] listOfWords=testString.split(" ");
	System.out.println("testString-"+testString+"--"+listOfWords.length);
	
	for (String s: listOfWords) {           
	    //Do your stuff here
	    System.out.print(reverseString(s)+" "); 
	}
	
	System.out.println(System.getProperty("java.version"));
	//
	ArrayList<Integer> arrL = new ArrayList<Integer>(); 
    arrL.add(1); 
    arrL.add(2); 
    arrL.add(3); 
    arrL.add(4); 

    // Using lambda expression to print all elements 
    // of arrL 
	//arrL.forEach(n -> System.out.println(n)); 

    // Using lambda expression to print even elements 
    // of arrL 
  //  arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); }); 
	
    
    Temp obj1 = Temp.create(20); 
    obj1.myMethod(); 
	
	//
	
		
       
    }
    
    /**
     * An overloaded main method which accepts Integer[] instead of
     * String[] as argument. 
     * @param args
     */
    public static void main(Integer[] args){
        System.out.println("Inside main(Integer[] args) method ....");
    }
    
 // Convert int[] to Integer[]
 	public static Integer[] toObject(int[] intArray) {

 		Integer[] result = new Integer[intArray.length];
 		for (int i = 0; i < intArray.length; i++) {
 			result[i] = Integer.valueOf(intArray[i]);
 		}
 		return result;

 	}
    
    
    /**
     * Another overloaded main method which accepts Double[] instead of
     * String[] as argument. 
     * @param args
     */
    public static void main(Double[] args){
        System.out.println("Inside main(Double[] args) method ....");
    }
    
    public static String reverseString(String str){
        StringBuffer revString = new StringBuffer();
        for(int i=str.length()-1;i>=0;i--)
        {
        	revString.append(str.charAt(i));
        }
        
        return revString.toString();
    }

}




