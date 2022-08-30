import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=(2*n),num1=1,num2=1;
        for(int i=0;i<n;i++)
        {
            num1=1;
            num2=i+1;
            temp-=2;
           for(int j=0;j<=i;j++)
           {
               System.out.print(num1++);
           }
           for(int k=0;k<temp;k++)
           {
               System.out.print(" ");
           }
           for(int l=0;l<=i;l++)
           {
               System.out.print(num2--);
           }
           System.out.println();
        }
	}
}
