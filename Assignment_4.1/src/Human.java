
public class Human  {
	
	private Dog dog;
	private String name;
	

	public Human(String name) {
		this.name = name;
		System.out.println(name);
	}
	
	public String getName(){
		return name;
	}
	/**Method that creates a new dog object from the object created in the GUI*/
	
	public Dog buyDog(Dog dog1){
		dog = new Dog("");
		this.dog = dog1;
		return dog;
		
	}
	/**String method that checks if dog is created and return different strings depending on the state of dog*/
	
	public String getInfo(){
		if(dog == null ){
			String line = name + " äger inte en hund.";
			return line;
		}
		else{
		String line = name + " äger en hund som heter " + dog.getDogName();
		return line;
		}
		
		
		
	}

}