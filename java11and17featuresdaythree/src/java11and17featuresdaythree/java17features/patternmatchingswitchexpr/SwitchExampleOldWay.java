package java11and17featuresdaythree.java17features.patternmatchingswitchexpr;

public class SwitchExampleOldWay {
	public static void main(String[] args) {
		String str = "";

		int result = 0;
		int a = 10, b = 20;
		
		switch (str) {

		case "add":
			result = a + b;
			break;
		case "sub":
			result = a - b;
			break;

		case "mul":
			result = a * b;
			break;
		default:
			System.out.println("Please choose proper operations");
			break;

		}
		
		System.out.println(result);
	}
}
