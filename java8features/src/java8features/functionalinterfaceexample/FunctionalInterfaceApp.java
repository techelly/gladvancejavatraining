package java8features.functionalinterfaceexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceApp {

	public static void main(String[] args) {
		Order orderOne = new Order("AUD",15000.00);
		Order orderTwo = new Order("INR",5000.00);
		Order orderThree = new Order("USD",150000.00);
		Order orderFour = new Order("EUR",5000.00);
		Order orderFive = new Order("AUD",8000.00);
		Order orderSix = new Order("EUR",5000.00);
		Order orderSeven = new Order("EUR",1000.00);
		
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(orderOne);
		orderList.add(orderTwo);
		orderList.add(orderThree);
		orderList.add(orderFour);
		orderList.add(orderFive);
		orderList.add(orderSix);
		orderList.add(orderSeven);
		
		/**
		 * In evaluate method 2 parameters are passed. 
		 * One is a collection namely "orderList"
		 * and another parameters in a lambda expression 
		 * which is an implementation of a functional interface Consumer
		 * In this example, we are trying to display amount of each order from orderList
		 * 
		 */
		evaluate(orderList,o->System.out.println(o.getAmount()));
		evaluate(orderList,o->System.out.println(o.getCurrency()));
		List<Order> filteredOrder= evaluatePredicate(orderList,o->o.getAmount()<10000);
		System.out.println(filteredOrder);
		
		//Function interface
		Function<List<Order>,Double> averageOrder = orderLists->{
			double total = 0.0;
			for(Order order: orderLists) {
				total+=order.getAmount();//total=total+order.getAmount
			}
			return total/orderList.size();//calculating the average
		};
		System.out.println(averageOrder.apply(orderList));
	}

	public static void evaluate(List<Order> orderList,Consumer<Order> consumer) {
		for(Order order : orderList) {
			consumer.accept(order);
		}
	}
	
	public static List<Order> evaluatePredicate(List<Order> orderList,Predicate<Order> predicate) {
		List<Order> filteredOrder = new ArrayList<Order>();
		for(Order order:orderList) {
			if(predicate.test(order)) {
				filteredOrder.add(order);
			}
		}
		return filteredOrder;
	}
	
}
