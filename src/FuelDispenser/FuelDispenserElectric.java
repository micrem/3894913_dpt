package FuelDispenser;
import FuelStation.IVehicle;

public class FuelDispenserElectric extends FuelDispenser {

	private FuelDispenser successor;

	/**
	 *
	 * @param vehicle
	 */
	public void handleVehicle(IVehicle vehicle) {
		if (vehicle.getFuelType()!=FuelType.Electric){
			successor.handleVehicle(vehicle);
		}

	}

}