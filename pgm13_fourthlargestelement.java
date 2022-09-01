import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] num=new int[n];
		int key=0,j=0;
		for(int i=0;i<n;i++)
		{
		    num[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
		    key=num[i];
		    j=i-1;
		    while(j>=0 && key<num[j])
		    {
		        num[j+1]=num[j];
		        j--;
		    }
		    num[j+1]=key;
		}
		
		System.out.println("Fourth largest element is:"+num[n-4]);
	}
}
