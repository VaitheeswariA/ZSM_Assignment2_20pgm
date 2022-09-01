import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		int odd_sum=0,even_sum=0;
		for(int i=0;i<n;i++)
		{
		    nums[i]=sc.nextInt();
		    
		    if((nums[i]%2)==0)
		        even_sum+=nums[i];
		    else
		        odd_sum+=nums[i];
		}
		
		System.out.println("Sum of odd element in array="+odd_sum);
		System.out.println("Sum of even element in array="+even_sum);
	}
}
