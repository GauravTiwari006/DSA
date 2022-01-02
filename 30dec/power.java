class power {
    static int result;
   public static int Power(int n,int p)
   {
       if(p==0)
       {
           return 1;
       }
        result=n*Power(n,p-1);
       return result;
      

   }
   public static void main(String[] args) {
     int n=2;
     int p=5;
     Power(n,p);
     System.out.println("Power of Given numbers is :"+n+"^"+p+"="+result);

   }
   
}