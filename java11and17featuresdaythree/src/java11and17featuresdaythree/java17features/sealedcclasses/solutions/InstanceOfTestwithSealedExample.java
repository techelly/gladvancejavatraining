package java11and17featuresdaythree.java17features.sealedcclasses.solutions;
/**
 * 
 * @author UD SYSTEMS
 * For  instanceof tests, the compiler checks whether the class hierarchy allows the check
 * ever to return true.
 * If it does not, the compiler reports an "incompitable types" error
 * 
 */
public class InstanceOfTestwithSealedExample {
	public static void main(String[] args) {
		Integer num = 15;
		/**if(num instanceof String) {
			//An Integer object can never be an instance of String.
		}**/
		A a = new C();
		System.out.println(isAaB(a));
		
	}
	
	public static boolean isAaB(A a) {
		return a instanceof B;
	}
	
}


interface A{}
class B{}
class C extends B implements A{}

