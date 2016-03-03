
public class Snake extends Animal {

	boolean poisonus;
	
	public Snake(String latinName, boolean poisonus, String friendlyName) {
		super(latinName);
		this.poisonus = poisonus;
		friendlyName = setFriendlyName(friendlyName);
	}
	
	/**Method to check if invariable is true or false*/
	
	public boolean isPoisonus(){
		
		return poisonus;
	}
	
	/**Method that return a string with information about the current animal.*/
	
	public String getInfo(){
		String poison = "";
		if(poisonus == true){
			poison = " poisonus";
		}
		else{
			poison = "harmless";
		}
		if(friendlyName.equals("")){
			setFriendlyName("Noname");
		}
		String info = "The snake named " + getFriendlyName() + " (" + "latin name: " + latinName.toString() + ")" + " is " + poison;
	return info;	
	}

}