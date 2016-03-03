public class Bike {

	private String color;
	private int price;
	private int size;

	public Bike(String color, int size) {
		this.color = color;
		this.size = size;
	}
/** Creates the boundaries for the bikes, such as which colors, sizes and prices are ok, refering to the values from Constants */ 
 
	public Bike(String color, int size, int price) {
		for (int i = 0; i < Constants.bikeColors.length; i++) {
			if (0 == color.compareTo(Constants.bikeColors[i].toString())) {
				this.color = color;
				break;
			} else {
				this.color = "FEL FÄRG";
/** The text "FEL FÄRG" appears when a color is written which does not exist in the string for bike colors. */
			}
		}
		
		if (size > Constants.MIN_SIZE && size <= Constants.MAX_SIZE) {
			this.size = size;
		} else {
			this.size = 404;
		}
		if (price > Constants.MIN_PRICE && price <= Constants.MAX_PRICE) {

			this.price = price;
		} else {
			this.price = 404;
/** The number "404" appears when a price or size is written which is outside the values stated in Constants under MIN and MAX int's. */
		}

	}

	// methods
	public String getColor() {
		return color;
	}

	public int getSize() {
		return size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}