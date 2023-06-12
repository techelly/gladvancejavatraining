package springannotationsexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import springannotationsexample.model.Address;
import springannotationsexample.model.AmarilloVisitor;
import springannotationsexample.model.Customer;
import springannotationsexample.model.Greeter;
import springannotationsexample.model.JerseyVisitor;
import springannotationsexample.model.PopupGreeter;
import springannotationsexample.model.Visitor;

@Configuration
public class AppConfig {
	
	@Bean
	public Visitor createVisitor(){
		return new AmarilloVisitor();
	}
	
	@Bean(name="greeter")
	public Greeter createGreeter(){
		return new PopupGreeter();
	}

	@Bean("jerseyVisitor")
	public Visitor createJerseyVisitor(){
		return new JerseyVisitor();
	}
	
	@Bean("customer")
	@Scope("prototype")
	public Customer createCustomer() {
		return new Customer();
	}
	
	@Bean("addrBean1")
	public Address createAddrBean1() {
		return new Address();
	}
	
	@Bean("addrBean2")
	public Address createAddrBean2() {
		return new Address();
	}
	
	
}
