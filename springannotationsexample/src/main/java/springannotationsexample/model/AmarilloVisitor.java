package springannotationsexample.model;

import org.springframework.stereotype.Component;

@Component
public class AmarilloVisitor implements Visitor {
	private String name;
	private String greeting;
	
	
	public AmarilloVisitor() {
		System.out.println("created Amarillo visitor");
		this.name = "Joe Bob";
		this.greeting = "Howdy";
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getGreeting() {
		return greeting;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
