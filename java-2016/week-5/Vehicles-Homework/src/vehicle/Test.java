package vehicle;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println("buna ziua");

		Client c = new Client("Alex");

		BankAccount bankAccount = new BankAccount(1000000);

		c.setBankAccount(bankAccount);

		CarDealership compexit = new CarDealership("Compexit");

		List<Car> stock = compexit.listAllCars();

		/*
		 * Car car = // select from stock the car you like
		 * 
		 * compexit.sellCarToClient(car, client);
		 * 
		 * ClientAccount clientAccount = compexit.getAccount(client);
		 * 
		 * List<Car> myCars = clientAccount.myFleet();
		 * 
		 * myCars = clientAccount.myFleet(SORT_BY_AGE);
		 * 
		 * // Sell oldest car
		 * 
		 * Car oldestCar = myCars.get(0);
		 * 
		 * float carPrice = 4999f;
		 * 
		 * compexit.buyCarFromClient(oldestCar, client, carPrice);
		 * 
		 * // bank account should be updated
		 * 
		 */ // fleet should not contain the sold car.

		// int currentFuelAmmount = 27;
		//
		// String chasseNumber = "oiqe0934hkkadsn";
		//
		// // Car car = new Dacia(currentFuelAmmount, chasseNumber); // This
		// should
		// // not be allowed! If I want to create a Dacia car, I will need to
		// // create an instance of a model.
		//
		// Car car = new Logan(currentFuelAmmount, chasseNumber);
		//
		// car.start();
		//
		// car.shiftGear(1);
		//
		// car.drive(0.01);// drives 0.01 KMs
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
		//
		// float availableFuel = car.getAvailableFuel(); // this value must be
		// // smaller than the
		// // initial value passed
		// // in the constructor
		//
		// float fuleConsumedPer100Km = car.getAverageFuelConsumption();
		//
		// Vehicle vehicle = new VWGolf(30, "1987ddkshik289"); // available fuel
		// // and chassis
		// // number
		//
		// vehicle.start();
		//
		// vehicle.drive(1);
		//
		// vehicle.stop();
		//
		// Car car2 = (Car) vehicle;
		// // code yet unclear if it should run along with the rest above
		// // float availableFuel = car2.getAvailableFuel();
		//
		// // float fuleConsumedPer100Km = car2.getAverageFuelConsumption();

	}

}
