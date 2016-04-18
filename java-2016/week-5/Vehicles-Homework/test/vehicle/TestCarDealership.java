package vehicle;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCarDealership {
	Car car1 = new Car();

	@Before
	public void setUp() throws Exception {
		car1.setAvailableFuel(50);
		car1.setCarAge(10);
		car1.setChasseNumber("ala11");
		car1.setFuelTankSize(50);
		car1.setNumberOfGears(5);
		String fuelType = "Diesel";
		car1.setFuelType(fuelType);
		Car car2 = new Car() {
		};
		car2.setCarAge(1);
		car2.setChasseNumber("ala12");
		car2.setFuelTankSize(30);
		car2.setFuelType(fuelType);
		car2.setNumberOfGears(6);
		car2.setAvailableFuel(25);

		List<Car> carDealerStock = new ArrayList<Car>();
		CarDealership compexit = new CarDealership("compexit", carDealerStock);
		carDealerStock.add(car1);
		carDealerStock.add(car2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCarsInStock() {

		compexit.listAllCars();
		assertNotEquals(car1, car2);
		assertNotNull(carDealerStock);
	}

	@Override
	public String toString() {
		return "TestCarDealership [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
