

public class mcqprctssegcd {
   
        public static int gcd(int n1,int n2)
        {
            if(n2!=0)
            {
                return gcd(n2,n1%n2);
            }
            else
            return n1;
        }
        public static void main(String[] args) {
        int n1=4,n2=8;
        int gcd=gcd(n1,n2);
        System.out.print("like is:"+gcd);
        
        }
    }  
    
