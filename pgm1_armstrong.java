import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int armstrong=0,rem=0,num=n;
        while(num>0)
        {
            rem=num%10;
            armstrong+=(rem*rem*rem);
            num=num/10;
        }
        if(n==armstrong)
        {
            System.out.println("It is an Armstrong number");
        }
        else
        {
            System.out.println("It is not an Armstrong number");
        }
	}
}
