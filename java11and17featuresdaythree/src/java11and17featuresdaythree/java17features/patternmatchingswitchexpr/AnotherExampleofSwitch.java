package java11and17featuresdaythree.java17features.patternmatchingswitchexpr;

import java.util.Arrays;
import java.util.List;

public class AnotherExampleofSwitch {

	public static void main(String[] args) {
		List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		System.out.println(guardedPattern(listOfNumbers));
		
	}
	public static String guardedPattern(List<Integer> coll) {
		
		  return switch(coll) {
		    case (coll.size() > 10) -> 
		        "I am a big List. My size is " + coll.size();
		    case coll.size()<10-> 
		        "I am a small List. My size is " + coll.size();
		    default -> 
		        "Unsupported collection: " + coll.getClass();
		  };
		}

}
