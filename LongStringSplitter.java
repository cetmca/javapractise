package com.intvw.practise;

public class LongStringSplitter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="this is a very large string with strnth more than five words";
		
		String[] strarray =str.split("\\s");
		String[] newarray = null;
		int j=0;
		
StringBuilder sb= new StringBuilder();
String temp="";
String word="";
String newword="";
String prevtemp="";
		
for (String line : strarray) {
	prevtemp=temp;
    temp+=line+" ";
   // System.out.println(temp);
    if(temp.length() >10)
    {
    	//temp+="\n";
    }
 System.out.println(temp + temp.length());   
 }



}
}
