package soliddesignprinciples.lisp;

//Assume Square IS A Rectangle
public class Square extends Rectangle{
	
	public void setBreadth(double breadth) {
		super.setWidth(breadth);
		super.setLength(breadth);
	}
	
	public void setLength(double length) {
		super.setLength(length);
		super.setWidth(length);
	}

}
