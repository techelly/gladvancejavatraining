package java8featuresdaytwo.dateandtimeapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class NewApIAnotherExample {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2020, 3, 22);
		
		checkingPeriod(date1, date2);
		
		
		LocalTime time1 = LocalTime.now();
		Duration sixHours = Duration.ofHours(6);
		
		
		LocalTime time2 = time1.plus(sixHours);
		System.out.println(time1);
		System.out.println(time2);
		//System.out.println(sixHours);
		checkDuration(time1, time2);
	}

	private static void checkDuration(LocalTime time1, LocalTime time2) {
		Duration gap = Duration.between(time1, time2);
		System.out.println("Duration gap between time1 and time time2 "+gap);
		System.out.println(gap.toHours());
		
	}

	private static void checkingPeriod(LocalDate date1, LocalDate date2) {
		Period gap = Period.between(date1, date2);
		System.out.println("Gap between dates is a period of "+gap);
		System.out.println(gap.toTotalMonths());
		
	}

}
