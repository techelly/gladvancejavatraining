package java8features.functionalinterfaceexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionFunctionalInterfaceMainApp {

	public static void main(String[] args) {
		List<Integer> listOfNumbers = Arrays.asList(10, 40, 50, 60, 54, 21, 25);
		Function<List<Integer>, Double> averageOfNumbers = listOfNums -> {
			double total = 0.0;
			for (Integer num : listOfNums) {
				total += num;
			}
			return total / (listOfNums.size());
		};
		System.out.println(averageOfNumbers.apply(listOfNumbers));

		System.out.println("********************Example of andThen and compose*************");

		Function<Integer, Integer> addOne = x -> x + 1;
		Function<Integer, Integer> multiplyByTwo = x -> x * 2;

		// after(In this case first it perform addition and then multiplication)
		Function<Integer, Integer> andThenExample = addOne.andThen(multiplyByTwo);

		System.out.println(andThenExample.apply(10));

		// before(In this case first it perform multiplication and then addition)
		Function<Integer, Integer> composeExample = addOne.compose(multiplyByTwo);
		System.out.println(composeExample.apply(10));
		
		
		List<Integer> salaries = Arrays.asList(15000,10000,5000,21000,20000,16000);
		for(Integer salary : salaries) {
			System.out.println(andThenExample.apply(salary));
		}
	}

}
