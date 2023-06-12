package springannotationsexample.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import springannotationsexample.config.AppConfig;
import springannotationsexample.model.Address;
import springannotationsexample.model.Customer;
import springannotationsexample.model.Greeter;

public class Driver {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Greeter g = context.getBean("greeter",Greeter.class);
		System.out.println("Got greeter "+ g);
		g.greet();
		
		Customer c= context.getBean("customer",Customer.class);
		System.out.println(c);
		
		Address addrBean1= context.getBean("addrBean1",Address.class);
		System.out.println(addrBean1);
		
		Address addrBean2= context.getBean("addrBean2",Address.class);
		System.out.println(addrBean2);
		System.out.println("*****************************************************");
		System.out.println(c.hashCode());
		Customer d= context.getBean("customer",Customer.class);
		System.out.println(d);
		System.out.println(d.hashCode());
		context.close();
		
		

	}

}
