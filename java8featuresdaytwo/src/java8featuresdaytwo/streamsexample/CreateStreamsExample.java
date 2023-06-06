package java8featuresdaytwo.streamsexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Properties;
import java.util.stream.Collectors;
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
			//lines.filter(price->price<50000).forEach(System.out::println);
			lines.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("***************************************");
		Properties prop = new Properties();
		
		try {
			InputStream input = new FileInputStream("src/application.properties");
			prop.load(input);
			System.out.println(prop.size());
			System.out.println(prop.get("filePath"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		List<String> listOfData = new ArrayList<String>();
		try {
			Stream<String> textDataStrm = Files.lines(Paths.get("src/text"));
			listOfData = textDataStrm.filter(line -> line.startsWith("Reading")).map(String::toLowerCase)
			.collect(Collectors.toList());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		listOfData.forEach(System.out::println);
		
		
		

		// FlatMap Operation
		try (Stream<String> lines = Files.lines(Paths.get(prop.getProperty("filePathtwo")))) {
			//flatMap()- processes a Stream<String[]> It uses Arrays::stream to generate Stream<String> from Stream<String[]>
			//lines.map() after splitting the the line text returns Stream of type arrays of string Stream<String[]>
			lines.map(line->line.split("\\s+")).flatMap(Arrays::stream).distinct().forEach(System.out::println);
			//lines.forEach(System.out::println);
		}
			
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}

}
