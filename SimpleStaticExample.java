package com.intvw.practise;

class SimpleStaticExample{
	   static int num;
	   static String mystr;
	   static{
	      num = 97;
	      mystr = "Static keyword in Java";
	   }
	   
	   static{
		      num = 87;
		      mystr = "Static keyword in Java - method 2";
		   }
	   public static void main(String args[])
	   {
	      System.out.println("Value of num: "+num);
	      System.out.println("Value of mystr: "+mystr);
	   }
	}