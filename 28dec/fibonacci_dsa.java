 //   fibonacci_dsa  question 2
 import java.util.Scanner;

class fibonacci_dsa {
    public static int fibonacci(int n)
    {
      if(n <=1)
    	  return n;
      else
    	  return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String args[])
    {
    	Scanner sc  = new Scanner(System.in);
    	int n=sc.nextInt();
    	for(int i = 1;i<=n;i++) {
    	   System.out.print(fibonacci(i)+" ");   
           sc.close();     
    	   }
    }
}
