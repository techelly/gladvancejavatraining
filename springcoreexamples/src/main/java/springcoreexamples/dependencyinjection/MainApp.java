package springcoreexamples.dependencyinjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// configuration metadata
		String springConfigurationFile = "springconfig.xml";

		// Instantiating a Spring IoC container
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(springConfigurationFile);
		// Here using context.getBean method we are trying to get an instance of
		// Customer class
		Customer cust = context.getBean("customer", Customer.class);
		System.out.println(cust);

		// Using cust object/bean instance we are accessing the object method
		System.out.println(cust.getCustomerId());
		System.out.println(cust.getCustomerName());
		System.out.println(cust.getAddress().getCity());

		Address addrs = context.getBean("addrBean1", Address.class);
		System.out.println(addrs);

		Address addrs2 = context.getBean("addrBean2", Address.class);
		System.out.println(addrs2);
		addrs2.setAddressId(1);
		addrs2.setCity("New Delhi");
		addrs2.setCountry("IN");
		addrs2.setState("Delhi");
		System.out.println(addrs2);

		// Person and its dependent beans
		Person person = context.getBean("personBean", Person.class);
		System.out.println(person.getResidentialAddress().getCity());
		System.out.println(person.getPermanentAddress().getCity());
		System.out.println(person.getAdharCardNumber());
		context.close();
	}

}
