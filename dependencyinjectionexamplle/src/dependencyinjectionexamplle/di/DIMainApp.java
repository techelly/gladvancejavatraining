package dependencyinjectionexamplle.di;

public class DIMainApp {

	public static void main(String[] args) {
		
		//Create object of Address and Customer
		IAddress addr = new AddressImpl();
		Customer cust = new Customer(addr);// address dependency is injected to customer
		
	

	}

}
