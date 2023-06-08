package java11and17featuresdaythree.java17features.sealedcclasses.solutions;

/**
 * 
 * @author UD SYSTEMS
 *Local classes(i.e. classes defined within methods) must not extend sealed classes.
 */

/**
public sealed class LocalClassExample {
	
	public void myMethod() {
		
		class LocalChild extends LocalClassExample{
			
		}
	}
}**/


public class LocalClassExample {
	
	public void myMethod() {
		
		class LocalChild extends LocalClassExample{
			
		}
	}
}
