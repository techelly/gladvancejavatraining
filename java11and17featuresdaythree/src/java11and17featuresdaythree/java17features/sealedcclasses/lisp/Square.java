package java11and17featuresdaythree.java17features.sealedcclasses.lisp;

public class Square extends Rectangle{
	//private int size;
	private int width;
	private int height;
	public Square() {
		
	}
	//We set height and width to the same value in the constructor
	//but we do not want any client(who use our in their code) to change height or weight
	//in a way that can change(or violate) the square property we override the set Width and Heght methods
	public Square(int size) {
		width = height =size;
	}
	
	
	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeght(width);
	}
	
	
	@Override
	public void setHeght(int heght) {
		super.setWidth(heght);
		super.setHeght(heght);
	}
}
