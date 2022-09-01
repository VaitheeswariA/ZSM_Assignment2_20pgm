import java.util.*;
public class Main
{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int n1=sc.nextInt();
	    int n2=sc.nextInt();
	    int[] num1=new int[n1];
	    int[] num2=new int[n2];
	    int[] result=new int[n1+n2];
	    int pos=0;
	    for(int i=0;i<n1;i++)
	    {
	        num1[i]=sc.nextInt();
	        result[pos++]=num1[i];
	    }
	    for(int i=0;i<n2;i++)
	    {
	        num2[i]=sc.nextInt();
	        result[pos++]=num2[i];
	    }
	   
	   
	    for(int i=0;i<result.length;i++)
	    {
	        System.out.println(result[i]);
	    }
	}
}
