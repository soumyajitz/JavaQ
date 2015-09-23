import java.util.*;
import java.text.*;
public class DateFormatter {
	public static void main(String[] args) throws Exception {
		String time1 = "07:10 am";
		String time2 = "12:21 pm";
		String amorpmhr1 = time1.substring(time1.length()-2);
		if(amorpmhr1.equalsIgnoreCase("pm"))
		{
			String hr1= time1.substring(0,2);
			int hour1 = Integer.parseInt(hr1)+12;
			System.out.println(hour1);
		}
		else if(amorpmhr1.equalsIgnoreCase("am"))
		{
			String hr1= time1.substring(0,2);
			int hour1 = Integer.parseInt(hr1);
			System.out.println(hour1);
		}
		else
		{
			System.out.println("Enter time properly");
		}
		String amorpmhr2 = time2.substring(time2.length()-2);
		if(amorpmhr2.equalsIgnoreCase("pm"))
		{
			String hr2= time2.substring(0,2);
			int hour2 = Integer.parseInt(hr2)+12;
			System.out.println(hour2);
		}
		else if(amorpmhr2.equalsIgnoreCase("am"))
		{
			String hr2= time2.substring(0,2);
			int hour2 = Integer.parseInt(hr2);
			System.out.println(hour2);
		}
		else
		{
			System.out.println("Enter time properly");
		}
		System.out.println(amorpmhr1);
		System.out.println(amorpmhr2);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
		Date d1 = sdf.parse(time1);
		Date d2 =sdf.parse(time2);
		long timediff = (d2.getTime() - d1.getTime())/1000;
		long hrs = timediff/3600;
		double diffmin = (((double)timediff)-((double)hrs*3600))/60;
		System.out.println(timediff+" secs or "+hrs+" hrs and "+diffmin+" mins");
	}

}
