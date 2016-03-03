import java.util.ArrayList;

public class Bikeshop {

	private ArrayList<Bike> allBikes = new ArrayList<Bike>();

	public String getAllBikes1() {

		String returnString = "";
		int i = 1;
		for (Bike bike : allBikes) {
			returnString = returnString + " bikes " + i + " is the size " + bike.getSize() + " and is the color "
					+ bike.getColor() + " and has the price " + bike.getPrice() + "\n";
			i++;
		}
		return returnString;
	}

	public void addBike(String color, int size, int price) {
		allBikes.add(new Bike(color, size, price));
	}
	/*
	 * public BikeShop() { this.allBikes1 = allBikes; } public void
	 * addBike(allBikes){ allBikes.add(s);
	 */
}
