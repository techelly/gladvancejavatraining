package java8featuresdaytwo.streamsexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreamsExample {

	public static void main(String[] args) {
		
		Stream<String> currencies = Stream.of("USD","EUR","JPY","INR");
		currencies.sorted().forEach(System.out::println);
		
		
		//Create stream from Arrays 
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		IntStream intStrm = Arrays.stream(numbers);
		
		OptionalDouble average =intStrm.filter(x->x>5).average();
		System.out.println(average);
		System.out.println(average.getAsDouble());
		
		List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Stream<Integer> intStream= listOfInteger.stream();
		
		List<Integer> listOfIntNums = new ArrayList<Integer>();
		listOfIntNums.add(1);
		listOfIntNums.add(2);
		listOfIntNums.add(3);
		listOfIntNums.add(4);
		listOfIntNums.add(5);
		listOfIntNums.add(6);
		listOfIntNums.add(7);
		listOfIntNums.add(8);
		listOfIntNums.add(9);
		listOfIntNums.add(10);
		listOfIntNums.stream().forEach(System.out::println);
		
		/**
		 * Reading data from order.csv file to create a stream
		 */
		try {
			Stream<String> lines = Files.lines(Paths.get("C:\\Users\\UD SYSTEMS\\Desktop\\orders.csv"));
			lines.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
