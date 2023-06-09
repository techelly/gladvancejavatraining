package designpattern.cake;

public class BlackForest extends Cake {

	public BlackForest() {
		setName("BlackForest");
		setType("Eggless");
		setPrice(1500);
	}

	@Override
	public void recipe() {
		System.out.println("------------BlackForest Recipe---------");
		System.out.println("Sieve together Maida and Cocoa Powder");
		System.out.println("Add Milk and Vanilla essence");
		System.out.println("Top with Whipped Cream and Cherries");
		System.out.println("Chill and Serve");

	}

	@Override
	public void myFans() {
		System.out.println("Both adults and kids love me");

	}

}
