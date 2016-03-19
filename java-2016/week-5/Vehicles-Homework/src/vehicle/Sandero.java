package vehicle;

public class Sandero extends Dacia {
	private int carHeight;

	public Sandero(String chasseNumber, int currentFuelAmmount, int carHeight) {
		super(chasseNumber, currentFuelAmmount);
		this.carHeight = carHeight;
	}

	public Sandero(String chasseNumber, int currentFuelAmmount) {
		super(chasseNumber, currentFuelAmmount);

	}

	public int getCarHeight() {
		return carHeight;
	}

	public void setCarHeight(int carHeight) {
		this.carHeight = carHeight;
	}
}
