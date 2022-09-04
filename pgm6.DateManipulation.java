import java.text.*;
import java.util.*;
import java.time.*;
public class calendar {

	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String dt=sc.next();
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(dt);
		Date current=new Date();
		if(date1.after(current))
		{
			System.out.println("1.Given date is future date");
		}
		else if(date1.equals(current))
		{
			System.out.println("1.Given date is today");
		}
		else
		{
			System.out.println("1.Givem date is not future date");
		}
		
		System.out.println("2.First and LastDay of the month: ");
		Calendar c=Calendar.getInstance();
		c.setTime(date1);
		c.set(Calendar.DAY_OF_MONTH, 1);
		Date d=c.getTime();
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		Date end=c.getTime();
		Format f=new SimpleDateFormat("EEEE");
		String startday=f.format(d);
		String endday=f.format(end);
		System.out.println(startday+","+endday);
		
		
		c.setTime(date1);
		c.add(Calendar.DAY_OF_MONTH, 45);
		System.out.println("3.Date after 45 days: "+c.getTime());
	}

}
