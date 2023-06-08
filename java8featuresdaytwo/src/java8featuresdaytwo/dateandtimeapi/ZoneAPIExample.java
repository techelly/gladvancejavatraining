package java8featuresdaytwo.dateandtimeapi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneAPIExample {

	public static void main(String[] args) {
		// Methods to get Zoned Date and Time
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formattedCurrentDate = formatter1.format(date);
		System.out.println(formattedCurrentDate);

		ZonedDateTime currentZone = ZonedDateTime.now();
		System.out.println(currentZone);

		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		// We use withZoneSameInstant() -- which returns a copy of current date-time
		// with a different time-zone, retaining the instant
		ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);
		System.out.println("tokyo time zone is " + tokyoZone);
	}

}
