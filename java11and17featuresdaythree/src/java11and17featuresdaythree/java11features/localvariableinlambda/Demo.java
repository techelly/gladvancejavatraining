package java11and17featuresdaythree.java11features.localvariableinlambda;

public class Demo {

	public static void main(String[] args) {
		Cal cal = (var a, v   ar b) -> a + b;
		int result = cal.sum(10, 20);
		System.out.println(result);
		/**
		 * 
		 * 
		 * (var s1, s2) -> s1 + s2 //no skipping allowed 
		 * (var s1, String y) -> s1 + y //no mixing allowed 
		 * var s1 -> s1 //not allowed. Need parentheses if you use var in lambda. 
		 * 
		 * If there are multiple parameters then use var with all the
		 * parameters. No skipping allowed.
		 * 
		 * If one parameter use var then other parameters must use var rather than other
		 * types like int, float, etc.
		 * 
		 * Must use parenthesis () while using the var with the parameters.
		 */

	}

}
