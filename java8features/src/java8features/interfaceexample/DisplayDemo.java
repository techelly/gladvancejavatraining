package java8features.interfaceexample;

public class DisplayDemo {

	public static void main(String[] args) {
		Display disp = new DisplayImpl();
		disp.displayMessage();
		disp.anotherDisplayMessage();
		
		disp.displayInfo();
		
		Display disp1 = new DisplayImpl();
		Display.printMessage("Fardeen");
	}

}
