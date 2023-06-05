package java8features.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		Order orderOne = new Order("AUD", 15000.00);
		Order orderTwo = new Order("INR", 5000.00);
		Order orderThree = new Order("USD", 150000.00);
		Order orderFour = new Order("EUR", 25000.00);
		Order orderFive = new Order("AUD", 8000.00);
		Order orderSix = new Order("EUR", 5000.00);

		List<Order> orderList = new ArrayList<Order>();
		orderList.add(orderOne);
		orderList.add(orderTwo);
		orderList.add(orderThree);
		orderList.add(orderFour);
		orderList.add(orderFive);
		orderList.add(orderSix);
		System.out.println("*************Unsorted orderList ********************");
		orderList.forEach(System.out::println);

		// getAmount method reference of Order is passed to Comparator comparing method
		Collections.sort(orderList, Comparator.comparing(Order::getAmount));
		System.out.println("*************Sorted orderList ********************");
		orderList.forEach(System.out::println);
		//System.out.println("*************Sorted orderList Reverse********************");
		//Collections.reverse(orderList);
		//orderList.forEach(System.out::println);
		System.out.println("**********************Reverser Order*******************************");
		Collections.sort(orderList,Collections.reverseOrder(Comparator.comparing(Order::getAmount)));
		orderList.forEach(System.out::println);
		
		System.out.println("*****************************************************");
		List<Integer> listOfInteger = Arrays.asList(5,3,2,7,1,4);
		Collections.sort(listOfInteger,Collections.reverseOrder());
		listOfInteger.forEach(System.out::println);
	}

}
