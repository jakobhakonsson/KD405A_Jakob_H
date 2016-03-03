
public class Constants {
/** The boundaries for the possibe size, price and number of bikes. */
	
	public static final int MIN_SIZE = 8;
	public static final int MAX_SIZE = 28;
	public static final int MIN_PRICE = 0;
	public static final int MAX_PRICE = 30000;
	public static final int MAX_NUMBER_OF_BIKES = 20;

/** The availabe colors one can put in to generate the bike. The methods under Bike decide what happens if the inserted color is none of the below*/	
	public static final String[] bikeColors = new String[] { "green", "blue", "red", "yellow", "pink", "black", "grey",
			"purple" };

	// methods in main, min and max size and price

	public static int getMinSize() {
		return MIN_SIZE;
	}

	public static int getMaxSize() {
		return MAX_SIZE;
	}

	public static int getMinPrice() {
		return MIN_PRICE;
	}

	public static int getMaxPrice() {
		return MAX_PRICE;
	}

	public static int getMaxNumberOfBikes() {
		return MAX_NUMBER_OF_BIKES;
	}

	public Constants() {
	}
	/*
	 * public static void main(String[]args){
	 * 
	 * for(int i = 0; i < 9; i++){
	 * 
	 * System.out.println(bikeColors[i]); } }
	 */
}