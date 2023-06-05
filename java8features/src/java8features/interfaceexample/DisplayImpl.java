package java8features.interfaceexample;

public class DisplayImpl implements Display {

	@Override
	public void displayMessage() {
	
		System.out.println("Good Morning Evereyone");
	}

	@Override
	public void anotherDisplayMessage() {
		System.out.println("Another Display Message method");
		
	}

}
