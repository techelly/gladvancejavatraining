package dependencyinjectionexamplle.di;
//Dependent class
public class Customer {
	
	private IAddress address;
	
	//Dependency class Address reference is passed
	//Constructor based dependency
	public Customer(IAddress address) {
		this.address = address;
	}

	public IAddress getAddress() {
		return address;
	}

	//Setter based dependency injection
	public void setAddress(IAddress address) {
		this.address = address;
	}
	
	
}
