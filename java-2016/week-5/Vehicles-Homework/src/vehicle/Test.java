package vehicle;

public class Test {

	public static void main(String[] args) {
		System.out.println("buna ziua");

		int currentFuelAmmount = 27;
		String chasseNumber = "oiqe0934hkkadsn"; // extend from Car

		Car car = new Logan(chasseNumber, currentFuelAmmount) {

		};

		car.start();

		car.shiftGear(1);

		car.drive(0.01);// drives 0.01 KMs

		car.shiftGear(2);

		car.drive(0.02);

		car.shiftGear(3);

		car.drive(0.5);

		car.shiftGear(4);

		car.drive(0.5);

		car.shiftGear(4);

		car.drive(0.5);

		car.shiftGear(5);

		car.drive(10);

		car.shiftGear(4);

		car.drive(0.5);

		car.shiftGear(3);

		car.drive(0.1);

		car.stop();

		float availableFuel = car.getAvailableFuel(); // this value must be
		// smaller than the
		// initial value passed
		// in the constructor

		float fuleConsumedPer100Km = car.getAverageFuelConsumption();

	}

}
