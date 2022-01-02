public class mcqpractice {
    public static int tree(int n,int r)
    {
       if(n>0)
       {
           return(n%r+tree(n/r,r));
       }
       else 
       return 0;
    }
    public static void main(String[] args) {
        System.out.println(tree(513,2));
    }

    
}