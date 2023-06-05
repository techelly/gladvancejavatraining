package java8features.interfaceexample;

public interface TaxRate {
	public double taxRateCal();
	public default double taxRate() {
		return 15.50;
	}
	
	public static double taxRates() {
		return 16.0;
	}
}
