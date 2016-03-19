package vehicle;

public class Car implements Vehicle {

	private String chasseNumber;
	private int fuelTankSize;
	private String fuelType;
	private int numberOfGears;
	private float averageFuelConsumption;
	private int currentFuelAmount;
	private float availableFuel;
	private int selectedGear;
	private int burnedFuelQuantity;
	private int burnedFuelModifier;

	public Car(String chasseNumber, int currentFuelAmount) {
		this.chasseNumber = chasseNumber;
		this.currentFuelAmount = currentFuelAmount;
	}

	public void shiftGear(int selectedGear) {
		this.setSelectedGear(selectedGear);
		System.out.println("Changed in gear :" + selectedGear);
	}

	public void burnFuel() {
		burnedFuelModifier = currentFuelAmount - selectedGear;
		burnedFuelQuantity = currentFuelAmount - burnedFuelModifier;
		System.out.println("burned this much fuel: " + burnedFuelQuantity);
		this.currentFuelAmount = currentFuelAmount -burnedFuelQuantity;

	}

	@Override
	public void start() {
		getAvailableFuel();
		getCurrentFuelAmount();
		System.out.println("this is the beggining fuel amount " + currentFuelAmount);
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		System.out.println("currentfuel at stop" + currentFuelAmount);
		setAvailableFuel(currentFuelAmount);
		System.out.println("availablefuel at stop" + availableFuel);
		// TODO Auto-generated method stub

	}

	@Override
	public void drive(double kilometers) {
		burnFuel();
		// TODO Auto-generated method stub

	}

	public String getChasseNumber() {
		return chasseNumber;
	}

	public void setChasseNumber(String chasseNumber) {
		this.chasseNumber = chasseNumber;
	}

	public int getFuelTankSize() {
		return fuelTankSize;
	}

	public void setFuelTankSize(int fuelTankSize) {
		this.fuelTankSize = fuelTankSize;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getNumberOfGears() {
		return numberOfGears;
	}

	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}

	public float getAverageFuelConsumption() {
		return averageFuelConsumption;
	}

	public void setAverageFuelConsumption(float averageFuelConsumption) {
		this.averageFuelConsumption = averageFuelConsumption;
	}

	public int getCurrentFuelAmount() {
		return currentFuelAmount;
	}

	public void setCurrentFuelAmount(int currentFuelAmount) {
		this.currentFuelAmount = currentFuelAmount;
	}

	public float getAvailableFuel() {
		return availableFuel;
	}

	public void setAvailableFuel(float availableFuel) {
		this.availableFuel = availableFuel;
	}

	public int getSelectedGear() {
		return selectedGear;
	}

	public void setSelectedGear(int selectedGear) {
		this.selectedGear = selectedGear;
	}

	public int getBurnedFuelQuantity() {
		return burnedFuelQuantity;
	}

	public void setBurnedFuelQuantity(int burnedFuelQuantity) {
		this.burnedFuelQuantity = burnedFuelQuantity;
	}

}
