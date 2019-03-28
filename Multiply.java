package com.intvw.practise;



public class Multiply {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=10;
		int kount=6;
		int totalnumber=0;
		
		for (int i=0;i<kount;i++)
		{
		totalnumber +=number;	
		}
	PhoneNumber phoneNum = new PhoneNumber(415,126,2688);
    ObjectCount objCount1 = new ObjectCount();
    ObjectCount objCount2 = new ObjectCount();
    ObjectCount objCount3 = new ObjectCount();
   
    objCount1.incrementCount();
    objCount2.incrementCount();
    objCount3.incrementCount();
    System.out.println("Total Obj Kount "+ObjectCount.getCount());
    
    //
    
    MyParentClass childClass= new MyChildClass();
    JavaExample java1= new JavaExample();
    java1.setWeb("1234");
    JavaExample java2= new JavaExample(java1);
    System.out.println("-------->  "+java2.web);
    
    //
	
	
	}
}
// copy constructor

class JavaExample{  
	   String web; 
	   public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	private JavaExample(){  
		
	}
	JavaExample(String w){  
		web = w;
	   }  

	   /* This is the Copy Constructor, it 
	    * copies the values of one object
	    * to the another object (the object
	    * that invokes this constructor)
	    */
	   JavaExample(JavaExample je){  
		web = je.web; 
	   }  
	   void disp(){
		System.out.println("Website: "+web);
	   } 
}

//

class MyParentClass {
	   MyParentClass(){
		System.out.println("MyParentClass Constructor");
	   }
	}
	class MyChildClass extends MyParentClass{
	   MyChildClass() {
		System.out.println("MyChildClass Constructor");
	   }
	}

//


class ObjectCount
{
    public static int instanceKount=0;
    
   
    ObjectCount()
    {
       synchronized(this){
      // instanceKount++; 
    }
    }
    //
    public void incrementCount() {
        synchronized (ObjectCount.class) {
        	instanceKount++;
        }
    }
    
    synchronized static int getCount(){
        return instanceKount;
    }
    
    //
}
