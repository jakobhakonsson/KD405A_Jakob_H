
public class Dog extends Mammal {

	boolean stupid;

	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid = stupid;
	}

	public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName) {
		super(latinName, gestationTime);
		friendlyName = setFriendlyName(friendlyName);
		this.stupid = stupid;
	}

	/**
	 * String method that returns string with information about current animal
	 */

	public String getInfo() {
		String isStupid = "";
		if (stupid == true) {
			isStupid = "stupid";
		} else {
			isStupid = "smart";
		}
		if (friendlyName == null) {
			setFriendlyName("Noname");
		}
		String s = "The dog named " + getFriendlyName() + " (" + "latin name: " + latinName.toString() + ")"
				+ " nurses for " + gestationTime + " months and is " + isStupid;
		return s;
	}

	/**
	 * Method that checks if stupid boolean is true or false
	 */

	public boolean isStupid() {
		return stupid;
	}
}