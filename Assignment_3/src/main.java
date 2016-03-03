import java.util.ArrayList;

public class main {

	private static ArrayList<Bike> allBikes = new ArrayList<Bike>();
	private int price;

	public static void main(String[] args) {

		Bike Bike0 = new Bike("green", 35, 2500);
		allBikes.add(Bike0);
		Bike Bike1 = new Bike("blue", 12, 1000);
		allBikes.add(Bike1);
		Bike Bike2 = new Bike("red", 18, 2300);
		allBikes.add(Bike2);
		Bike Bike3 = new Bike("yellow", 29, 29000);
		allBikes.add(Bike3);
		Bike Bike4 = new Bike("pink", 55, 15000);
		allBikes.add(Bike4);
		Bike Bike5 = new Bike("black", 76, 4300);
		allBikes.add(Bike5);
		Bike Bike6 = new Bike("grey", 42, 2049);
		allBikes.add(Bike6);
		Bike Bike7 = new Bike("purple", 45, 1999);
		allBikes.add(Bike7);

		Bike b;

		// int i = 1;
		for (int i = 0; i < 8; i++) {
			b = allBikes.get(i);
			System.out.println(b.getSize() + " " + b.getPrice() + " " + b.getColor() + "/n");

			if (b.getPrice() < Constants.getMinPrice() || b.getPrice() > Constants.getMaxPrice()) {
				System.out.println(b.getPrice() + "är fel pris. Pris får vara mellan " + Constants.getMinPrice()
						+ " och " + Constants.getMaxPrice() + "/n");
			}
			if (b.getSize() < Constants.getMinSize() || b.getSize() > Constants.getMaxSize()) {
				System.out.println(b.getSize() + " är fel storlek. Storleken måste vara mellan "
						+ Constants.getMinSize() + " och " + Constants.getMaxSize() + "/n");

			}
		}

	}
}
