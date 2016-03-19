package vehicle;

public class Passat extends Volkswagen {

	private int passatLength;

	public Passat(String chasseNumber, int currentFuelAmount, int passatLength) {
		super(chasseNumber, currentFuelAmount);
		this.passatLength = passatLength;

	}

	public Passat(String chasseNumber, int currentFuelAmount) {
		super(chasseNumber, currentFuelAmount);

	}

	public int getPassatLength() {
		return passatLength;
	}

	public void setPassatLength(int passatLength) {
		this.passatLength = passatLength;
	}
}
