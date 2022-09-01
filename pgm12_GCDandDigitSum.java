import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
	    int num2=sc.nextInt();
	    int small=(num1<num2) ? num1:num2;
	    int large=(num1<num2) ?num2:num1;
	    for(int i=small;i>0;i--)
	    {
	        if((small%i)==0 && (large%i)==0)
	        {
	            System.out.println("GCD of "+num1+" and "+num2+"="+i);
	            break;
	        }
	    }
	    
	    int rem=0,sum=0;
	    while(large>0)
	    {
	        rem=large%10;
	        sum+=rem;
	        large=large/10;
	    }
	    System.out.println("Sum of digits of a given number:"+sum);
	}
}
