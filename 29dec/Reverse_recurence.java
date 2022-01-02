public class Reverse_recurence {
    static int revs=0;
    public static int Reverse(int n)
    {
if(n==0)
{
   
  return revs;

}
   if(n>0)
   {
       int temp=n%10;
       revs=revs*10+temp;
       Reverse(n/10);
   }
   return revs;
}
    
    public static void main(String[] args) {
        int n=342;
       int res;
       res=Reverse(n);
       System.out.println("Reverse number:"+res);
    }
    
}