package java8features.lambdaexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AdditionDemo {

	public static void main(String[] args) {
			Addition add = new AdditionImpl();
			int result = add.add(15, 10);
			System.out.println(result);
			 //implementation of an abstract method of an interface Addition
			Addition addition = (a,b) -> a+b;
			System.out.println(addition);
			int sum = addition.add(15, 10);
			System.out.println(sum);
			
			//Another example of lambda
			List<String> currencies = Arrays.asList("USD","JPY","EUR","HKD","INR","AUD");
			System.out.println("Unsorted currencies  ----"+currencies);
			//sort is a higher order function which takes another function as an argument
			//here lambda expression is an anonymous function or function without 
			Collections.sort(currencies,(String a , String b)->{return a.compareTo(b);});
			System.out.println("Sorted currencies -----"+currencies);
			
			System.out.println("**********************forEach using lambda expression**********************");
			currencies.forEach(c->System.out.println(c));
			
			
			System.out.println("**********************for loop old approach**********************");
			
			for(String currency : currencies ) {
				System.out.println(currency);
			}
			
						
			System.out.println("**********************forEach using method reference**********************");
			currencies.forEach(System.out::println);
			
			System.out.println("************************************************");
			currencies.forEach((String currency)->System.out.printf("\n Currency is %s ",currency));
	}

}
