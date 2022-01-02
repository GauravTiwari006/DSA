//factorial_dsa question 3

import java.util.Scanner;

class factorial_dsa {
    public static int factorial(int n)
    {
    	if(n==0)
    		return 1;
    	return n*factorial(n-1);
    }
    public static void main(String args[])
    {
    	Scanner sc  = new Scanner(System.in);
    	int n=sc.nextInt();
    	System.out.println(factorial(n));  
        sc.close();      
    }
}