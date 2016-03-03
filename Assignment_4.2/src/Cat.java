public class Cat extends Mammal {
    int numberOfLifes;
    
	public Cat(String latinName, int gestationTime, int numberOfLifes, String friendlyName) {
		super(latinName, gestationTime);
		this.numberOfLifes = numberOfLifes;	
		friendlyName = setFriendlyName(friendlyName);
	}
	
	/**String method that returns string with information about current animal*/
	
	public String getInfo(){
		if(friendlyName.equals("")){
			setFriendlyName("Missen");
		}
		
		String s = "The cat named " + getFriendlyName() + " ("+"latin name: " + latinName.toString()+ ")" + " nurses for " + gestationTime + " months" + " and has " + getNumberOfLifes() + " lives.";
		
		return s;
	}
	
	public int getNumberOfLifes(){
		return numberOfLifes;
	}
	
	public void setNumberOfLifes(int i){
		this.numberOfLifes = i;
	}
}
