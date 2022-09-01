import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean f=false;
		if(n==0)
		    f=true;
		for(int i=1;i<=n/2;i++)
		{
		    if(n%i==0 && (i*(i+1))==n)
		    {
		      f=true;
		      break;
		    }
		}
		if(f)
		    System.out.println("Pronic number");
		else
		    System.out.println("Not a pronic number");
	}
}
