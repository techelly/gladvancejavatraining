package java11and17featuresdaythree.java17features.recordclasses.serialization;

import java.io.Serializable;

public record RangeRecord (int lo, int hi) implements Serializable { 
	
}