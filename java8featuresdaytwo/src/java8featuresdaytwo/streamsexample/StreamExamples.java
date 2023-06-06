package java8featuresdaytwo.streamsexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;



public class StreamExamples {

	public static void main(String[] args) {
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
		
		Predicate<Order> predicate = o ->o.getAmount() > 5000;
		orderList.stream().filter(predicate).forEach(System.out::println);
		
		System.out.println("*************Example of map() function********************");
		Predicate<Order> pred = o -> o.getCurrency().equals("EUR");
		orderList.stream().filter(pred).map(Order::getAmount)
				.forEach(System.out::println);
	}

}
