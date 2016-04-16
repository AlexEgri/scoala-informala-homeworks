package vehicle;

public abstract class Volkswagen extends Car {

	public Volkswagen(String chasseNumber, int currentFuelAmount) {
		super(chasseNumber, currentFuelAmount);
	}

	public Volkswagen(float availableFuel, float averageFuelConsumption, String chasseNumber) {
		super(availableFuel, averageFuelConsumption, chasseNumber);
	}
}
