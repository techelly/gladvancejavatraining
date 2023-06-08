package java11and17featuresdaythree.java17features.sealedcclasses.solutions;

/**
 * 
 * @author UD SYSTEMS
 *
 *Sealing with in a "Compilation Unit"
 *The permits keyword can be omitted if subclasses derived from a sealed class
 *are defined within the same class file("compilation unit")
 *These are then considered "implicitly declared permitted subclass"
 */
public sealed class SealedParentWithoutPermits {
	
	public final class ChildInSameCompilationUnit extends SealedParentWithoutPermits{
		
	}
}
