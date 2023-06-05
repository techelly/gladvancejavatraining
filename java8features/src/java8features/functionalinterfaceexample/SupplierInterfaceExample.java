package java8features.functionalinterfaceexample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierInterfaceExample {

	public static void main(String[] args) {
		//Supplier example
		Supplier<LocalDateTime> supplier = ()->LocalDateTime.now();
		LocalDateTime time =supplier.get();
		System.out.println(time);
		//Example using date time formatter
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		Supplier<String> str = ()->dtf.format(LocalDateTime.now());
		String time1 = str.get();
		System.out.println(time1);
		//Another example
		Person per1 = personFactory(Person::new);//passing  method reference using new keyword
		System.out.println(per1);
		
		Person per2 = personFactory(()->new Person("Apoorv"));
		System.out.println(per2);
	}
	
	public static Person personFactory(Supplier<? extends Person> supplier) {
		Person person = supplier.get();//from supplier.get() we are retrieving Person class object
		if(person.getName() == null || "".equals(person.getName()))
		{
			person.setName("default");
		}
		person.setSalary(15555.50);
		person.setDob(LocalDate.of(1996, 10, 15));
		return person;
	}

}
