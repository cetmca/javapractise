package com.intvw.practise;

class Helper 
{ 
    private int data; 
    private Helper() 
    { 
        data = 5; 
    } 
} 

class Base 
{ 
    public static String s = " Super Class "; 
    public Base() 
    { 
        System.out.printf("1"); 
    } 
} 
public abstract  class Derived extends Base 
{ 
    public Derived() 
    { 
       // System.out.printf("2"); 
        super(); 
    } 
      
    public static void main(String[] args) 
    { 
       // Derived obj = new Derived(); 
        System.out.printf(s); 
      //  Helper help = new Helper(); 
       // System.out.println(help.data); 
    } 
} 

