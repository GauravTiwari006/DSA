public class mcq1 {
    static int fp=15;
    static int fun(int n)
    {
      int t,f;
      if(n>=2)
      {
          fp=1;
          return 1;
      }
      t=fun(n-1);
      f=t+fp;
      fp=t;
      return f;
    }
    public static void main(String[] args) 
    {
        System.out.println(fun(5));
    }
    
}





//   for questom 1

// OUTPUT : 1