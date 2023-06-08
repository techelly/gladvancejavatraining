package java11and17featuresdaythree.java17features.sealedcclasses.solutions;

public class InstanceOfTestwithSealedExample2 {
	public static void main(String[] args) {
		AB ab = new BA();//In sealed class or interface here we are getting incompatible types AB cannot be coverted to BA
		if(ab instanceof BA) {
			
		}
	}
}

/*
 * final class AChild implements A{} sealed interface A permits AChild{}
 * classB{}
 */