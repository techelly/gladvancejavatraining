package java8featuresdaytwo.dateandtimeapi;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getTimeZone());
		
		
		cal.add(Calendar.DATE,5);
		System.out.println("5 days later : "+cal.getTime());
		

		cal.add(Calendar.MONTH,5);
		System.out.println("5 month later : "+cal.getTime());
		
		cal.add(Calendar.YEAR,5);
		System.out.println("5 year later : "+cal.getTime());
		
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
	}

}
