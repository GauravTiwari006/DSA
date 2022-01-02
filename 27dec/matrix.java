import java.util.Scanner;

public class matrix {
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int arr[][]=new int[x][y];
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
            sc.close();
		}
	}
}