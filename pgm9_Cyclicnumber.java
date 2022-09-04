import java.util.*;
public class cyclicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n= sc.nextLong();
		boolean IsCyclic=checkCyclicNo(n);
		if(IsCyclic)
			System.out.println(n+"is cyclic number");
		else
			System.out.println(n+"is not a cyclic number");
	}
	
	public static boolean checkCyclicNo(long n)
	{
		long number=n,quotient=0,reminder=0,permut_number=n;
		int count=0;
		long digit=number%10;
		boolean samedigits=false;
		while(number>0)
		{
			number=number/10;
			count++;
			if(number%10 == digit)
				samedigits=true;
			
		}
		if(samedigits)
			return false;

		while(true)
		{
			reminder=permut_number%10;
			quotient=permut_number/10;
			permut_number=(long)((Math.pow(10, count-1)*reminder)+quotient);
			if(permut_number==n)
				break;
			if(permut_number%n!=0)
				return false;
		}
		return true;
	}

}
