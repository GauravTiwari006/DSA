public class avrage_recurence {
    public static int Avg(int arr[],int n)
    {
        if(n<=0)
        {
            return 0;
        }
        return Avg(arr,n-1)+arr[n-1];

    }
    public static void main(String[] args) {
        int[] arr={4,5,12,8,3,1};
        int n=arr.length;
       int sum=Avg(arr,n);
       System.out.println("Average of array:"+sum/n);
    }
}