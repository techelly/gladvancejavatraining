package java8features.lambdaexample;

public class PerformationDemo {

	public static void main(String[] args) {
		/*
		 * PerformOperation odd = (x)-> { if(x%2 == 1){ return true; }else{ return
		 * false; }};
		 */
		PerformOperation odd = (x) -> {
			if (x % 2 == 1) {
				return true;
			} else {
				return false;
			}
		};

		System.out.println(odd.isOdd(15));
	}

}
