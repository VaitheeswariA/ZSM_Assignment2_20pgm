import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		boolean f=true;
		int n=0;
		if(n==0)
		    System.out.print(n+" ");
		while(n<=N)
		{
		    for(int i=1;i<=n/2;i++)
		    {
		        if(n%i==0 && (i*(i+1))==n)
		        {
		            System.out.print(n+" ");
		            break;
		        }
		        
		    }
		    n++;
		}
		n=2;
		System.out.println();
		while(n<=N)
		{
		    f=true;
		    for(int i=2;i<=n/2;i++)
		    {
		        if(n%i ==0)
		        {
		            f=false;
		            break;
		        }
		    }
		    if(f)
		        System.out.print(n+" ");
		   n++;
		  
		}
	}
}
