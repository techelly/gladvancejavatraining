package java11and17featuresdaythree.java17features.recordclasses;

public class MainApp {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(4,5);
		double area =r.length()*r.width();
		System.out.println(area);
		//System.out.println(Rectangle::length());
	}

}
