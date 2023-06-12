package beanlifecycleexample.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// -------awareinterfaces---------
		ApplicationContext context1 =
		new ClassPathXmlApplicationContext("beans.xml");
		AwareBeanImpl awareBeanImpl = (AwareBeanImpl) context1.getBean("awareBean");
		((AbstractApplicationContext) context1).registerShutdownHook();

	}

}
