import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n,rev=0,rem=0;
		
		while(num>0)
		{
		    rem=num%10;
		    rev=(rev*10)+rem;
		    num=num/10;
		}
		
		 if(rev==n)
		    System.out.println("Given number is Palindrome");
		 else
		     System.out.println("Given number is not a Palindrome");
		
	}
}
