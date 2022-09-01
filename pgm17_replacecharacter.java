import java.util.*;
public class Main
{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char old_ch=sc.next().charAt(0);
	    char new_ch=sc.next().charAt(0);
	    s=s.replace(old_ch,new_ch);
	    System.out.println(s);
	}
}
