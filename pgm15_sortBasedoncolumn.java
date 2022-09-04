import java.util.*;

public class Columnbasesort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		int val=sc.nextInt();
		int key=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int k=val-1;
		for(int r=1;r<row;r++)
		{
			int j=r-1;
			key=arr[r][k];
			while(j>=0 && arr[j][k]>key && k<col)
			{
				arr[j+1][k]=arr[j][k];
				j--;
			}
			arr[j+1][k]=key;
		}
		
		for(int i=0;i<row;i++)
		{
			System.out.println(arr[i][k]);
		}
	}

}
