package com.intvw.practise;



public class GarbageCollector 
{ 
    public static void main(String[] args) throws InterruptedException 
    { 
    	GarbageCollector t1 = new GarbageCollector(); 
    	GarbageCollector t2 = new GarbageCollector(); 
          
        // Nullifying the reference variable 
        t1 = null; 
          
        // requesting JVM for running Garbage Collector 
        System.gc(); 
          
        // Nullifying the reference variable 
        t2 = null; 
          
        // requesting JVM for running Garbage Collector 
        Runtime.getRuntime().gc(); 
        
    } 

    //
    
    protected void finalize() throws Throwable 
    { 
        System.out.println("Garbage collector called"); 
        System.out.println("Object garbage collected : " + this); 
    } 

    // finalize method is called on object once  
    // before garbage collecting it 
 
} 
