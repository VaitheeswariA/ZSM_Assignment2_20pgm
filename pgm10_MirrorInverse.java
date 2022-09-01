import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		
		for(int i=0;i<n;i++)
		{
		    nums[i]=sc.nextInt();
		}
		
		int start=0,end=n-1;
		boolean mirror_inverse=true;
		while(start<=end)
		{
		    if(nums[start]!=nums[end])
		    {
		        mirror_inverse=false;
		        break;
		    }
		    else
		    {
		        start++;
		        end--;
		    }
		 }
		 
		 if(mirror_inverse)
		    System.out.println("Given array is a mirror inverse");
		 else
		     System.out.println("Given array is not a mirror inverse");
		
	}
}
