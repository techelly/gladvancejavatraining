package java8features.streamsexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> listOfNumbers = Arrays.asList(15, 11, 10, 9, 12, 13, 2, 5, 8, 1, 7, 6, 4, 14, 16);
		listOfNumbers.stream().filter(n -> n > 9).forEach(System.out::println);

		System.out.println("****************************************************");

		Stream<Integer> streamOfNumbers = listOfNumbers.stream();
		// Stream<Integer> filteredStream = streamOfNumbers.filter(n->n<5);
		// filteredStream.forEach(System.out::println);
		streamOfNumbers = streamOfNumbers.filter(n -> n < 5);
		streamOfNumbers.forEach(System.out::println);

		System.out.println("****************************************************");
		Stream<Integer> filterStream = listOfNumbers.stream().filter(num -> num > 3);
		// filterStream.forEach(System.out::println);
		System.out.println("*********************After skipping 5 elements*******************************");
		filterStream.skip(5).forEach(System.out::println);

		System.out.println("*********************Limit operation for  5 elements*******************************");
		listOfNumbers.stream().limit(5).forEach(System.out::println);

		/**
		 * System.out.println("****************************************************");
		 * listOfNumbers.stream() //source of stream .filter(num->num>3) //operation --
		 * intermediate .limit(5) //restricting stream processing for the first five
		 * elements .forEach(System.out::println); // --- iteration terminal operation
		 * System.out.println("***************************************");
		 * 
		 * listOfNumbers.stream() //source of stream .filter(num->num>3) //operation
		 * .skip(5) //stream processing skipped for the first five elements
		 * .forEach(System.out::println);
		 * 
		 **/

		System.out.println("**********************sort*****************");
		listOfNumbers.stream() // source of stream
				.sorted()// operation //By default, it returns stream items in natural order
				.forEach(System.out::println);
		System.out.println("**********************sort another example*****************");
		Stream<Integer> strmOfNumbers = listOfNumbers.stream();
		strmOfNumbers.sorted().forEach(System.out::println);

		System.out.println("***********************Objects example in stream ************************************");
		Order orderOne = new Order("AUD", 15000.00);
		Order orderTwo = new Order("INR", 5000.00);
		Order orderThree = new Order("USD", 150000.00);
		Order orderFour = new Order("EUR", 5000.00);
		Order orderFive = new Order("AUD", 8000.00);
		Order orderSix = new Order("EUR", 5001.00);
		Order orderSeven = new Order("EUR", 1000.00);

		List<Order> orderList = new ArrayList<Order>();
		orderList.add(orderOne);
		orderList.add(orderTwo);
		orderList.add(orderThree);
		orderList.add(orderFour);
		orderList.add(orderFive);
		orderList.add(orderSix);
		orderList.add(orderSeven);

		orderList.stream().filter(o -> o.getAmount() > 5000).sorted(Comparator.comparing(Order::getAmount).reversed())
				.forEach(System.out::println);

		System.out.println("*************Example of map() function********************");
		orderList.stream().filter(o -> o.getCurrency().equals("EUR")).map(Order::getAmount)
				.forEach(System.out::println);
		System.out.println("**********************************************************");
		orderList.stream().filter(o -> o.getCurrency().equals("EUR")).forEach(System.out::println);

		System.out.println("*****************************Reduce method usage*****************************");
		// Generating results from Streams - reduce()
		System.out.println(listOfNumbers);
		double total = listOfNumbers.stream().filter(n -> n > 10).reduce(0, (a, b) -> a + b);
		System.out.println(total);

		double totalEuroAmount = orderList.stream().filter(o -> o.getCurrency().equals("EUR")).map(Order::getAmount)
				.reduce(0.0, (o1, o2) -> {
					return (o1 + o2);
				});
		System.out.println(totalEuroAmount);

		System.out.println("*******************count*********************");
		double countOfFilteredNumbers = listOfNumbers.stream().filter(n -> n > 10).count();
		System.out.println(countOfFilteredNumbers);

		System.out.println("*******************min*******************");

		System.out.println(orderList.stream().filter(o -> o.getCurrency().equals("EUR"))
				.min(Comparator.comparing(Order::getAmount)));
		System.out.println("*******************max*******************");
		System.out.println(orderList.stream().filter(o -> o.getCurrency().equals("EUR"))
				.max(Comparator.comparing(Order::getAmount)));

		System.out.println("***********************************************************************************");
		List<Order> nonEUROOrders = orderList.stream().filter(o -> !(o.getCurrency().equals("EUR")))
				.collect(Collectors.toList());
		nonEUROOrders.forEach(System.out::println);
		
		System.out.println("***********************************************************************************");
		// Another example of Collectors.groupBy method
		Map<String, List<Order>> filteredOrders = orderList.stream().collect(Collectors.groupingBy(Order::getCurrency));

		System.out.println(filteredOrders);
	}

}
