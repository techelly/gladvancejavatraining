package java11and17featuresdaythree.java17features.recordclasses;

public class RectangleNew {

	private final double length;
	private final double width;

	public RectangleNew(double length, double width) {
		this.length = length;
		this.width = width;
	}

	double length() {
		return this.length;
	}

	double width() {
		return this.width;
	}
	
	// Implementation of equals() and hashCode(), which specify
    // that two record objects are equal if they
    // are of the same type and contain equal field values.
    public boolean equals() {return true;}
    public int hashCode(){return 1;}

    // An implementation of toString() that returns a string
    // representation of all the record class's fields,
    // including their names.
    public String toString() {return length + " " +width;}
}
