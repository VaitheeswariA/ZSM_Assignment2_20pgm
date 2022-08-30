import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,i=0;
        for(i=0;i<=n/2;i++)
        {
            
            for(int j=0;j<=(2*i);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int k=i;k<n;k++)
        {
            temp-=2;
            for(int l=0;l<temp;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
