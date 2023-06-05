package java8features.functionalinterfaceexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<Integer>  consumer = x->System.out.println(" "+x);
		List<Integer> listOfInteger = Arrays.asList(1,10,200,101,-10,0);
		
		printIntegers(listOfInteger,consumer);

	}

	private static void printIntegers(List<Integer> listOfInteger, Consumer<Integer> consumer) {
		for(Integer integer : listOfInteger) {
			consumer.accept(integer);
		}
		
	}

}
