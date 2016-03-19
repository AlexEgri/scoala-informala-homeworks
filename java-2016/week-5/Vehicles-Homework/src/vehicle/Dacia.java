package vehicle;

public abstract class Dacia extends Car {

	

	public Dacia(String chasseNumber,int currentFuelAmount) {
		super(chasseNumber , currentFuelAmount );
	}

	public Dacia(float averageFuelConsumption){
		super(averageFuelConsumption);
	}
}
