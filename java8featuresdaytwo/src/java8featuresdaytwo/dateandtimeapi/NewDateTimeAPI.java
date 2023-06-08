package java8featuresdaytwo.dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NewDateTimeAPI {

	public static void main(String[] args) {
		/**
		 * New datetime introduced in Java 8 to solve the following drawbacks: 1. Old
		 * date time api was not thread safe. 2. In old api there are only few date
		 * operations
		 * 
		 * New API: It prvoides many date operations It is immutable and doesn't setter
		 * methods
		 * 
		 * java.time package contains class of new api 1. Local : Simplified date-time
		 * API with no complexity of timezone handling 2. Zoned : Specialized date-time
		 * API to deal with various timezones.
		 */
		LocalDate date = LocalDate.now();
		System.out.println("The current date is " + date);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("The current date and time is " + dateTime);

		LocalTime time = LocalTime.now();
		System.out.println("The current time is " + time);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formatedDateTime = dateTime.format(formatter);
		System.out.println(formatedDateTime);

		// Print some specified date
		LocalDate date2 = LocalDate.of(1947, 8, 15);
		System.out.println(date2);
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(date2.format(formatter1));
		
		int month = date2.getDayOfMonth();
		System.out.println(month);
		int year = date2.getYear();
		System.out.println(year);
		System.out.println(date2.isLeapYear());
		

		System.out.println("Day of week for 15-08-1947-- "+date2.getDayOfWeek());
		System.out.println("Day of year for 15-08-1947-- "+date2.getDayOfYear());
		System.out.println("Month value for 15-08-1947-- "+date2.getMonthValue());
		System.out.println("Second in "+dateTime+"--- "+dateTime.getSecond());
		
		System.out.println("Minute in "+dateTime+"--- "+dateTime.getMinute());
		System.out.println("Date after "+date2+"----"+date2.isAfter(date));
		System.out.println("Date before "+date2+"----"+date2.isBefore(date));
		System.out.println(date.isLeapYear());
	}

}
