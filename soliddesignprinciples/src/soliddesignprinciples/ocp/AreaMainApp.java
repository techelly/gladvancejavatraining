/**
 * 
 */
package soliddesignprinciples.ocp;

/**
 * @author UD SYSTEMS
 *
 */
public class AreaMainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square = new Square();
		square.setSide(10.0);
		System.out.println(square.calculateArea());
		
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(15.0);
		rectangle.setWidth(16.0);
		System.out.println(rectangle.calculateArea());

		Shape shape = new RightTriangle(5, 10);
		AreaCalculator ac = new AreaCalculator();
		System.out.println(ac.calculateShapeArea(shape));
	}

}
