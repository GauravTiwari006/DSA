public class frequency {
  
	public static void main(String[] args) {

		int target=6,i;
		int count=0;
		int[] arr={2,2,3,3,3,3,3,6,6,6,6,6,6,7,7};
		for( i=0;i<arr.length;i++)
		{
		if(arr[i]==target)
		{
			
		  count++;  
		}
		} 
		System.out.println("Frequency of target "+target+"="+count);
	}
	}