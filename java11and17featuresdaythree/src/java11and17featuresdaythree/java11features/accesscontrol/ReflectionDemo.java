package java11and17featuresdaythree.java11features.accesscontrol;

import java.lang.reflect.Method;

public class ReflectionDemo {

	/**
 * 
 * Reflection is a feature in the Java language.
 * It allows an executing Java program to examine or "introspect" upon iteself,and 
 * manipulate internal properties of the program.
 *
 */

	public static void main(String[] args) {
	
		try {
			//One way of obtaining a Class object
			Class c = Class.forName(args[0]);//creating an object using reflection 
			Method m[] = c.getDeclaredMethods();//retrieving methods of a class or its instance
			
			for(int i=0; i<m.length;i++) {
				System.out.println(m[i].toString());
			}
			
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
