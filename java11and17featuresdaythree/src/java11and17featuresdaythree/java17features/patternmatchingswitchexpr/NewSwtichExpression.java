package java11and17featuresdaythree.java17features.patternmatchingswitchexpr;

public class NewSwtichExpression {

	public static void main(String[] args) {
		// Set the value of the day
		int day = 3;
		switch (day) {
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednesday");
		case 4 -> System.out.println("Thursday");
		default -> System.out.println("Invalid day");
		}

		
		//Pattern Matching
		String course = "Advanced Java";

		switch (course) {
		case "Java" -> System.out.println("This is an java course");
		case "Advanced Java" -> System.out.println("This is an advance java course");
		case "C Program" -> System.out.println("This is an C Programming course");
		default -> System.out.println("No courses selected");
		}
		
		
		//Matching an Enum constants
		enum Month{JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY};
		Month month = Month.MARCH;
		
		switch(month) {
		case JANUARY -> System.out.println("The month is January");
		case FEBRUARY -> System.out.println("The month is February");
		case MARCH -> System.out.println("The month is March");
		case APRIL -> System.out.println("The month is March");
		default -> System.out.println("Select the proper month");
		
		}

		enum Day{ SUNDAY, MONDAY, TUESDAY,WEDNESDAY, THURSDAY, FRIDAY, SATURDAY };
	    Day dayO = Day.WEDNESDAY;    
	    System.out.println(
	        switch (dayO) {
	            case MONDAY, FRIDAY, SUNDAY -> 6;
	            case TUESDAY                -> 7;
	            case THURSDAY, SATURDAY     -> 8;
	            case WEDNESDAY              -> 9;
	            default -> throw new IllegalStateException("Invalid day: " + day);
	        }
	    );    
	    
	    Day dayO1 = Day.TUESDAY;
	    int numLetters = switch (dayO1) {
        case MONDAY, FRIDAY, SUNDAY -> {
            System.out.println(6);
            yield 6;
        }
        case TUESDAY -> {
            System.out.println(7);
            yield 7;//take one argument, which is the value that the case label produces in a switch expression.
            //return 7; //return statement is not permitted in switch expression instead use yield
        }
        case THURSDAY, SATURDAY -> {
            System.out.println(8);
            //yield 8;// no yield statement will give you error
            yield 8;
        }
        case WEDNESDAY -> {
            System.out.println(9);
            yield 9;
        }
        default -> {
            throw new IllegalStateException("Invalid day: " + day);
        }
    };  
    
    System.out.println(numLetters);
	Person person = new Person(1,"Raj");
	Person person1 = new Person(2,"Raju");
	
    Day dayO2 = Day.WEDNESDAY;
    Person persons = switch (dayO2) {
    case MONDAY, FRIDAY, SUNDAY -> {
        System.out.println(6);
        yield person;
    }
    case TUESDAY -> {
        System.out.println(7);
        yield person1;//take one argument, which is the value that the case label produces in a switch expression.
        //return 7; //return statement is not permitted in switch expression instead use yield
    }
    case THURSDAY, SATURDAY -> {
        System.out.println(8);
        //yield 8;// no yield statement will give you error
        yield person;
    }
    case WEDNESDAY -> {
        System.out.println(9);
        yield person1;
    }
    default -> {
        throw new IllegalStateException("Invalid day: " + day);
    }	
    };
	System.out.println(persons);
	}

	
	/**
    static void testSwitchStatementExhaustive(Object obj) {
        switch (obj) {  // error: the switch statement does not cover
                        //        all possible input values
            case String s: 
                System.out.println(s);
                break;
            case Integer i:
                System.out.println("Integer");
                break;
        }    
    }**/
	
	/**
    static void testSwitchStatementExhaustive(Object obj) {
        switch (obj) { 
            case String s: 
                System.out.println(s);
                break;
            case Integer i:
                System.out.println("Integer");
                break;
            default:
                break;
        }    
    }
   **/
	
	
	
}
