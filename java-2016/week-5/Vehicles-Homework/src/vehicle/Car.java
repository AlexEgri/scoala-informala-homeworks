package vehicle;

public abstract class Car implements Vehicle {

	private String chasseNumber;
	private int fuelTankSize;
	protected String fuelType;
	protected int numberOfGears;
	private int selectedGear;
	private float initalFuelAmount;
	private float averageFuelConsumption;
	private float availableFuel;
	private float currentFuelConsumption;
	private double kilometers;
	private float kilometersDriven;
	private float currentFuelAmmount;

	public Car() {

	}

	public Car(float currentFuelAmount, String chasseNumber) {

	}

	public void stop() {
		System.out.println("You consumed " + (getInitalFuelAmount() - getCurrentFuelAmmount()));
		System.out.println("This is your fuel level: " + getAvailableFuel());
	}

	public void start() {
		System.out.println("car has started!" + " You have " + getCurrentFuelAmmount() + " fuel!");
	}

	public void drive(double kilometers) {
		this.kilometers = kilometers;
		System.out.println("You are driving for " + getKilometers());

	}

	public void shiftGear(int selectedGear) {
		this.selectedGear = selectedGear;
		System.out.println("Changed in gear :" + selectedGear);
	}

	public float calculateAverageFuelConsumption() {
		return averageFuelConsumption = (float) (100 * (initalFuelAmount - currentFuelAmmount) / kilometers);
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

	public void setFuelTankCapacity(int fuelTankSize) {
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

	public float getInitalFuelAmount() {
		return initalFuelAmount;
	}

	public void setInitalFuelAmount(float initalFuelAmount) {
		this.initalFuelAmount = initalFuelAmount;
	}

	public float getAverageFuelConsumption() {
		return averageFuelConsumption;
	}

	public void setAverageFuelConsumption(float averageFuelConsumption) {
		this.averageFuelConsumption = availableFuel / kilometersDriven;
	}

	public float getAvailableFuel() {
		return availableFuel;
	}

	public void setAvailableFuel(float availableFuel) {
		this.availableFuel = availableFuel;
	}

	public float getCurrentFuelConsumption() {
		return currentFuelConsumption;
	}

	public void setCurrentFuelConsumption(float currentFuelConsumption) {
		this.currentFuelConsumption = currentFuelConsumption;
	}

	public int getSelectedGear() {
		return selectedGear;
	}

	public void setSelectedGear(int selectedGear) {
		this.selectedGear = selectedGear;
	}

	public double getKilometers() {
		return kilometers;
	}

	public void setKilometers(double kilometers) {
		this.kilometers = kilometers;
	}

	public float getCurrentFuelAmmount() {
		return currentFuelAmmount;
	}

	public void setCurrentFuelAmmount(float currentFuelAmmount) {
		this.currentFuelAmmount = currentFuelAmmount;
	}

}
