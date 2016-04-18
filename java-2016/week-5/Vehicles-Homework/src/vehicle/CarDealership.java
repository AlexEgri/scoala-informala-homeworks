package vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CarDealership {
	List<Car> carDealerStock = new ArrayList<Car>();
	Map<Client, Car> clientAccount;
	private String carDealerShipName;

	public CarDealership(String carDealerShipName) {
		this.carDealerShipName = carDealerShipName;
	}

	public CarDealership(String carDealerShipName, List<Car> carDealerStock) {
		this(carDealerShipName);
		this.carDealerStock = carDealerStock;
	}

	public void sellCarToClient(Car car, Client client) {

		System.out.println("selling car to client");
	}

	public String getCarDealerShipName() {
		return carDealerShipName;
	}

	public void setCarDealerShipName(String carDealerShipName) {
		this.carDealerShipName = carDealerShipName;
	}

	public List<Car> listAllCars() {
		for (Car g : carDealerStock)
			System.out.println(g);
		return carDealerStock;

	}

}
