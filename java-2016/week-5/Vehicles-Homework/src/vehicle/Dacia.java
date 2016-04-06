package vehicle;

public abstract class Dacia extends Car {

	// TODO CODE REVIEW: It would have been nice if the Dacia and Volkswagen car
	// classes extended the Car logic with something. e.g Volkswagen's might
	// have by default airbags, while Dacia might have them for premium models
	// only.
	public Dacia(String chasseNumber, int currentFuelAmount) {
		super(chasseNumber, currentFuelAmount);
	}

}
