package vehicle;

public class VWGolf extends Volkswagen {
	
	private String owner;

	public VWGolf(String chasseNumber, int currentFuelAmount, String owner) {
		super(chasseNumber, currentFuelAmount);
		this.owner = owner;
	}
	
	public VWGolf(String chasseNumber, int currentFuelAmount){
		super(chasseNumber, currentFuelAmount);
	}
	
	public VWGolf(int currentFuelAmount, String chasseNumber){
		super(chasseNumber, currentFuelAmount);
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
