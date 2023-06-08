package java11and17featuresdaythree.java17features.sealedcclasses.lisp;

public class Rectangle {
	private int width;
	private int heght;
	
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int width, int heght) {
		this.width = width;
		this.heght = heght;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeght() {
		return heght;
	}
	public void setHeght(int heght) {
		this.heght = heght;
	}
	
	//Calculate the area of a rectangle
	public int getArea() {
		return width * heght;
	}
}
