package com.intvw.practise;

public class CalculateFactorial {
	
	int fact(int n)
    {
        int result;
       if(n==0 || n==1)
         return 1;

       result = fact(n-1) * n;
       return result;
    }

}
