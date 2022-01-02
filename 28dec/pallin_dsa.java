// pallin_dsa question 4

import java.util.Scanner;

class pallin_dsa {
    public static boolean palindrome(char str[],int start,int end)
    {
    	if(start==end || (end-start==1))
        {
            return true;
        }
        else
        {
            if(str[start]==str[end])
                return palindrome(str,start+1,end-1);
            else
                return false;
        }
      }
    public static void main(String args[])
    {
    	Scanner sc  = new Scanner(System.in);
    	String str=sc.nextLine();
    	int n=str.length();
    	char arr[]=str.toCharArray();
    	System.out.println(palindrome(arr,0,n-1)); 
        sc.close();       
    }
}