
public abstract class Mammal extends Animal {

	protected int gestationTime;

	public Mammal(String latinName, int gestationTime) {
		super(latinName);
		this.gestationTime = gestationTime;

	}

	/** Getter that gets an integer */
	
	public int getGestationTime() {
		return gestationTime;
	}

}
