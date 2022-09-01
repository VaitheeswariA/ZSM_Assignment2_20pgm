import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    String[] words=s.split("\\s+");
	    for(int i=0;i<words.length;i++)
	    {
	        System.out.println(words[i]);
	    }
	}
}
