interface FuncInterface 
{ 
    // An abstract function 
    void abstractFun(int x,int y); 
    // void abstractFun(int x); 
    // A non-abstract (or default) function 
    
    default void normalFun() 
    { 
       System.out.println("Hello "); 
    } 
} 

interface NumericTest {
	boolean computeTest(int n); 
}

interface StringTest {
	public StringBuilder StringReverse(String str); 
}
  
class LamdaTest 
{ 
    public static void main(String args[]) 
    { 
        // lambda expression to implement above 
        // functional interface. This interface 
        // by default implements abstractFun() 
       // FuncInterface fobj = (int x)->System.out.println(2*x); 

        FuncInterface fobj = (p1, p2) -> System.out.println("Multiple parameters: " + p1 + ", " + p2);
        NumericTest isEven = (n) -> (n % 2) == 0;
	    NumericTest isNegative = (n) -> (n < 0);
  
        // This calls above lambda expression and prints 10. 
        fobj.abstractFun(5,10); 
        fobj.normalFun(); 

StringTest stringTest = (s) -> {
     StringBuilder sb= new StringBuilder();
     for(int i=s.length()-1; i>=0;i--)
     {
         sb.append(s.charAt(i));
     }
    return sb;
     };

System.out.println(stringTest.StringReverse("MalayalaM in reverse"));
	// Output: false
	System.out.println(isEven.computeTest(5));
	// Output: true
    System.out.println(isNegative.computeTest(-5));
    } 
} 

