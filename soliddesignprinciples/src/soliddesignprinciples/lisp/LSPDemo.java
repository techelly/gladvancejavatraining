/**
 * 
 */
package soliddesignprinciples.lisp;

/**
 * @author UD SYSTEMS
 *
 */
public class LSPDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LSPDemo lsp = new LSPDemo();
		//lsp.calculateArea(new Rectangle());
		lsp.calculateArea(new Square());
	}
	
	// LSP-the functions that use references to the base classes must be able to use objects of derived class without knowing it.
	public void calculateArea(Rectangle r) {
		r.setLength(2);
		r.setWidth(4);
		System.out.println(r.getArea());
	}

}
