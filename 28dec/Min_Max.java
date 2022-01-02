//pass arr in every fuction call question 1
class Min_Max {
    public static int Minimum(int a[], int n)
    {
      if(n == 1)
        return a[0];
         
        return Math.min(a[n-1], Minimum(a, n-1));
    }
    public static int Maximum(int a[], int n)
    {
      if(n == 1)
        return a[0];
         
        return Math.max(a[n-1], Maximum(a, n-1));
    }
    public static void main(String args[])
    {
        int arr[] = {1,-1,0,2,-2,3,-3,4,-4};
        int n = arr.length;
        System.out.println(Maximum(arr, n));
        System.out.println(Minimum(arr, n));
    }