package java8featuresdaytwo.streamsexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AnotherExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Predicate<Integer> predicate = n -> {
			System.out.println("filtering " + n);
			return n % 2 != 0;
		};

		Function<Integer, Integer> function = n -> {
			System.out.println("mapping " + n);
			return n * n;
		};
		List<Integer> oddSquares = numbers.stream().filter(predicate).map(function).limit(3)
				.collect(Collectors.toList());

	}

}
