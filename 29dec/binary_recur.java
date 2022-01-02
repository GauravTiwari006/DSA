

public class binary_recur {
    static void binarysearch(int arr[],int start,int end) {
        int target=5;
        int mid=start+(end-start)/2;
        if(arr[mid]==target) {
            System.out.println("Index: "+ mid);
        }
        else if(arr[mid]>target) {
            binarysearch(arr,start,mid-1);
        }
        else
            binarysearch(arr,mid+1,end);
    }
        public static void main(String[] args) {
            int arr[]= {1,2,3,4,5,6,9};
        int	h=arr.length-1;
         binarysearch(arr,0,h);
        }
    
}
