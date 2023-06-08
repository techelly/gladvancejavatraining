package java11and17featuresdaythree.java17features.recordclasses;

import java.util.Objects;

public record RectangleRecordClass(double length, double width) {
	
	//instance level variable which is not permitted
	//We cannot declare instance variables (non-static fields) or instance initializers in a record class.
	//private Integer rectId;//ERROR
	
	//constructor of a record class
	public RectangleRecordClass{
		 if (length <= 0 || width <= 0) {
	            throw new java.lang.IllegalArgumentException(
	                String.format("Invalid dimensions: %f, %f", length, width));
	        }
	}
	
	
	// Static field
    static double goldenRatio;

    // Static initializer
    static {
        goldenRatio = (1 + Math.sqrt(5)) / 2;
    }

    // Static method
    public static RectangleRecordClass createGoldenRectangle(double width) {
        return new RectangleRecordClass(width, width * goldenRatio);
    }
    
    
 // Public instance method
    public RectangleRecordClass getRotatedRectangleBoundingBox(double angle) {
        RotationAngle ra = new RotationAngle(angle);
        double x = Math.abs(length * Math.cos(ra.getAngle())) +
                   Math.abs(width * Math.sin(ra.getAngle()));
        double y = Math.abs(length * Math.sin(ra.getAngle())) +
                   Math.abs(width * Math.cos(ra.getAngle()));
        return new RectangleRecordClass(x, y);
    }
	
	// Public accessor method
    public double length() {
        System.out.println("Length is " + length);
        return length;
    }
    
    
    // Public accessor method
    public double width() {
        System.out.println("Width is " + width);
        return width;
    }


	@Override
	public int hashCode() {
		return Objects.hash(length, width);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RectangleRecordClass other = (RectangleRecordClass) obj;
		return Double.doubleToLongBits(length) == Double.doubleToLongBits(other.length)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}
    
    
}
