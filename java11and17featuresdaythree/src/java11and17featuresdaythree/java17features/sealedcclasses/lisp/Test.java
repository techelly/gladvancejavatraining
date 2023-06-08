package java11and17featuresdaythree.java17features.sealedcclasses.lisp;

public class Test {

	public static void main(String[] args) {
			Rectangle rc = new Rectangle(2,3);
			getAreaTest(rc);
			
			Rectangle sq = new Square();
			sq.setWidth(5);
			getAreaTest(sq);

	}

	private static void getAreaTest(Rectangle r) {
		int width = r.getWidth();
		r.setHeght(10);
		System.out.println("Expected area of "+(width * 10) +", got "+r.getArea());
	}
}
