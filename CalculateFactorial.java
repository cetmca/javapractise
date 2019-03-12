package com.intvw.practise;

public class CalculateFactorial {
	
	static int fact(int n)
    {
        int result;
       if(n==0 || n==1)
         return 1;

       result = fact(n-1) * n;
       return result;
    }

	public static void main(String[] args) {
		int n=5;
		System.out.println(fact(5));
		
	}
		// TODO Auto-generated method stub

	}

