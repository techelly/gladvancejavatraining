package java8features.functionalinterfaceexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionFunctionalInterfaceMainApp {

	public static void main(String[] args) {
		List<Integer> listOfNumbers = Arrays.asList(10,40,50,60,54,21,25);
		Function<List<Integer>,Double> averageOfNumbers = listOfNums->{
			double total = 0.0;
			for(Integer num : listOfNums) {
				total+=num;
			}
			return total/(listOfNums.size());
		};
		System.out.println(averageOfNumbers.apply(listOfNumbers));
	}

}
