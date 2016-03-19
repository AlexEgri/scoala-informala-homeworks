package vehicle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("buna ziua");
		// Car car1 = new Car(); // Car should be a base class.

	
		int currentFuelAmmount = 27;
		String chasseNumber = "oiqe0934hkkadsn";							// extend from Car 
		
		//car = new Dacia(currentFuelAmmount, chasseNumber); // This should not be allowed! If I want to create a Dacia car, I will need to create an instance of a model.

		Car car = new Logan(currentFuelAmmount, chasseNumber); 
		
		car.start();

		car.shiftGear(1);
		//
		car.drive(0.01);// drives 0.01 KMs
		//
		// car.shiftGear(2);
		//
		// car.drive(0.02);
		//
		// car.shiftGear(3);
		//
		// car.drive(0.5);
		//
		// car.shiftGear(4);
		//
		// car.drive(0.5);
		//
		// car.shiftGear(4);
		//
		// car.drive(0.5);
		//
		// car.shiftGear(5);
		//
		// car.drive(10);
		//
		// car.shiftGear(4);
		//
		// car.drive(0.5);
		//
		// car.shiftGear(3);
		//
		// car.drive(0.1);
		//
		// car.stop();

		// float availableFuel = car.getAvailableFuel(); // this value must be
		// // smaller than the
		// // initial value passed
		// // in the constructor
		//
		// float fuleConsumedPer100Km = car.getAverageFuelConsumption();

	}

}
