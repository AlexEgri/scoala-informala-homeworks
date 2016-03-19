package vehicle;

public class Car implements Vehicle {

	private String chasseNumber;
	private int fuelTankSize;
	private String fuelType;
	private int numberOfGears;
	protected float averageFuelConsumption;
	private int currentFuelAmount;
	protected float availableFuel;
	private int selectedGear = 1;
	private int burnedFuelQuantity;
	private int burnedFuelModifier;
	protected double totalDistanceDriven;
	protected int totalFuelConsumed;
	private double distanceDriven;

	public Car(String chasseNumber, int currentFuelAmount) {
		this.chasseNumber = chasseNumber;
		this.currentFuelAmount = currentFuelAmount;
	}

	public Car(float averageFuelConsumption) {
		this.averageFuelConsumption = averageFuelConsumption;
	}

	public Car(float availableFuel, float averageFuelConsumption) {
		this.availableFuel = availableFuel;
		this.averageFuelConsumption = availableFuel;
	}

	public void shiftGear(int selectedGear) {
		this.setSelectedGear(selectedGear);
		System.out.println("Changed in gear :" + selectedGear);
	}

	public void burnFuel() {
		burnedFuelModifier = currentFuelAmount - selectedGear;
		burnedFuelQuantity = currentFuelAmount - burnedFuelModifier;
		System.out.println("burned this much fuel: " + burnedFuelQuantity);
		this.currentFuelAmount = currentFuelAmount - burnedFuelQuantity;
		System.out.println("current fuel " + currentFuelAmount);

	}

	public void calculateSumOfDrivenDistance() {
		this.totalDistanceDriven = totalDistanceDriven + distanceDriven;
		System.out.println("total distance driven is " + totalDistanceDriven);

	}

	public void calculateSumOfBurnedFuel() {
		this.totalFuelConsumed = burnedFuelQuantity + totalFuelConsumed;
		System.out.println("totalFuelConsumed is" + totalFuelConsumed);
	}

	public void calculateAverageFuelConsumption() {
		this.averageFuelConsumption = (float) (totalDistanceDriven / totalFuelConsumed);
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
		getAverageFuelConsumption();
		System.out.println("AverageFuelConsumption is " + averageFuelConsumption);
		// TODO Auto-generated method stub

	}

	@Override
	public void drive(double distanceDriven) {
		this.distanceDriven = distanceDriven;
		burnFuel();
		calculateSumOfDrivenDistance();
		calculateSumOfBurnedFuel();
		calculateAverageFuelConsumption();
		getAverageFuelConsumption();
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
		this.averageFuelConsumption = (float) (totalDistanceDriven / totalFuelConsumed);
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
		this.availableFuel = currentFuelAmount;
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
