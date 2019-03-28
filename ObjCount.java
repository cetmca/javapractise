package com.intvw.practise;


public class ObjCount{

    public static void main(String []args){
       System.out.println("Hello World 123");
       ObjectCountTest objCount1 = new ObjectCountTest();
       ObjectCountTest objCount2 = new ObjectCountTest();
       ObjectCountTest objCount3 = new ObjectCountTest();
       
       
       System.out.println(ObjectCountTest.instanceKount);
       System.out.println(ObjectCountTest.instanceKount);

    }
}



class ObjectCountTest
{
   public static int instanceKount=0;
   
   ObjectCountTest()
   {
	   incrementCount();
   }
   
   public static synchronized void incrementCount() {
	   instanceKount++;
   }
   

}
