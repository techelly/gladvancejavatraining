package java8features.functionalinterfaceexample;

public class PrintInformationImpl implements PrintInformation{

	@Override
	public void printMessage(String message) {
		System.out.println("Hello all  --"+message);
		
	}

}
