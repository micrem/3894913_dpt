package FuelStation;

import FuelPump.FuelType;

import java.util.Random;

public class Vehicle implements IVehicle{
	private static Random random = new Random();

	private FuelType fuelType= FuelType.values()[random.nextInt(4)];

	private VehicleType vehicleType;

	public Vehicle( VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

    public static IVehicle getRandomVehicle() {
	    VehicleType newVehicleType = random.nextBoolean() ? VehicleType.Car : VehicleType.Truck;
        return new Vehicle(newVehicleType);
    }

    @Override
	public FuelType getFuelType() {
		return fuelType;
	}

	@Override
	public VehicleType getVehicleType() {
		return vehicleType;
	}
}