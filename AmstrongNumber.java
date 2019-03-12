package com.intvw.practise;

public class AmstrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=371;
		String num = String.valueOf(number);
		System.out.println(num);
		int kountTotal=0;
		for (int i=0;i<num.length();i++)
		{
			int number1 = Character.digit(num.charAt(i), 10);
			System.out.println(number1+"-------"+num.charAt(i));
			kountTotal += number1 * number1 * number1;
			
		}
		
		System.out.println( (kountTotal==number)? "Amstrong Number" : "Not Amstrong #");

	}

}
