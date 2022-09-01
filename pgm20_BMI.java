import java.util.*;
public class Main
{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    double weight=sc.nextDouble();
	    double height=sc.nextDouble();
	    double BMI;
	    
	    BMI=weight/(height*height);
	    System.out.println(BMI);
	}
}
