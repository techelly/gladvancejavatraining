package java8features.interfaceexample;

public interface Display {
	// abstract method
	public void displayMessage();

	// another abstract method
	public void anotherDisplayMessage();

	// Since Java 8 default and static methods are allowed inside an interface
	// Default method
	default void displayInfo() {
		System.out.println("I am into display info which is a default method");
	}

	// static method
	public static void printMessage(String name) {
		System.out.println("Hello Good Morning " + name + " I am static method in an interface");
	}
}
