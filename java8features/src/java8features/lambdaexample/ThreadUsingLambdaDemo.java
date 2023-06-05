package java8features.lambdaexample;

public class ThreadUsingLambdaDemo {

	/**
	 * Lambda expression is a shorthand or concise way of writing an implementation
	 * of our abstract method present in an Interface
	 * 
	 */
	public static void main(String[] args) {
		new Thread(
				//Left hand side you have empty paranthesis then arrow then on RHS expression to be evaluated
				()->{ System.out.println("I am new thread using lambda");}
		).start();

	}

}
