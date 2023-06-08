package java11and17featuresdaythree.java17features.sealedcclasses.lisp;

public class LispExample {
	/**
	 * Liskov Substitution Principle states that subclasses should be substitutable for
	 * their base class
	 * 
	 * This means that, given that class B(or class Square) is a subclass of 
	 * class A(or class Rectangle), 
	 * we should be able to pass an object of class B(or class Square) to any method that
	 * expects an object of
	 * class A(or class Rectangle) and the method should not give any 
	 * weird output in that case
	 * 
	 * This is expected behavior , because when we use inheritance we assume
	 * that the child class inherits everything that the superclass has.
	 * The child class extends the behavior but never narrows it down
	 * 
	 * Therefore, when a class does not obey this principle,it lead to some nasty bugs
	 * that are hard to detect
	 */
}
