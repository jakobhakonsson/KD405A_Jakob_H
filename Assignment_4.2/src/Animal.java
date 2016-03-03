/** Superclass */

public abstract class Animal {

	protected String latinName;
	protected String friendlyName;

	public Animal(String name) {
		this.latinName = name;

		// TODO Auto-generated constructor stub
	}

	public abstract String getInfo();

	/** setter and getter for String variable friendlyName. */

	public String setFriendlyName(String name) {
		this.friendlyName = name;
		return friendlyName;
	}

	public String getFriendlyName() {
		return friendlyName;
	}

}