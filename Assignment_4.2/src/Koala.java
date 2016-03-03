
public class Koala extends Mammal {

	boolean cute;
	
	public Koala(String latinName, int gestationTime, boolean cute, String friendlyName) {
		super(latinName, gestationTime);
		friendlyName = setFriendlyName(friendlyName);
		this.cute = cute;
	}

	/** Method to check if invariable is true or false */

	public boolean isCute() {

		return cute;
	}

	/**
	 * Method that return a string with information about the current animal.
	 */

	public String getInfo() {
		String cuteness = "";
		if (cute == true) {
			cuteness = " cute";
		} else {
			cuteness = " not cute";
		}
		if (friendlyName.equals("")) {
			setFriendlyName("Noname");
		}
		String info = "The koala named " + getFriendlyName() + " (" + "latin name: " + latinName.toString() + ")"
				+ " is" + cuteness;
		return info;
	}

}
