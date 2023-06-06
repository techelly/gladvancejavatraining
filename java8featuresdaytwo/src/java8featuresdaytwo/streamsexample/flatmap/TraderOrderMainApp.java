package java8featuresdaytwo.streamsexample.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TraderOrderMainApp {

	public static void main(String[] args) {
		List<Trader> traders = new ArrayList<>();
		// Creating traders
		IntStream.range(1, 4).forEach(i -> traders.add(new Trader(i)));

		System.out.println(traders.size());
		System.out.println(traders);

		traders.forEach(t -> IntStream.range(1, 6).forEach(o -> t.addOrder(new Order())));
		System.out.println(traders);

		int i = 1;
		for (Trader trader : traders) {
			// trader.getOrders().forEach(System.out::println);
			trader.setTraderId(i);
			i++;
			for (Order order : trader.getOrders()) {
				order.setAmount(1500.00);
				order.setCurrency("INR");
			}
		}

		System.out.println("************************************");
		for (Trader trader : traders) {
			trader.getOrders().forEach(System.out::println);

		}

		System.out.println(traders);

		// Below code is printing the number of Stream<List<Order>> which will be equal
		// to the number of traders
		Long totalNumberOfOrders = traders.stream().map(t -> (t.getOrders())).count();
		System.out.println(totalNumberOfOrders);
		
		//Print the numbers of orders flattening Stream<List<Order>> to List<Order>
		Long totalNoOfOrders = traders.stream().flatMap(t->(t.getOrders().stream())).count();
		System.out.println("------------"+totalNoOfOrders);
	}

}
