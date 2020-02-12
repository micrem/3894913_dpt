import FuelDispenser.FuelType;

import java.util.Random;

public class Vehicle {
	private static Random random = new Random();

	private FuelType fuelType= FuelType.values()[random.nextInt(4)];
	private VehicleType vehicleType;

	public Vehicle( VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
}