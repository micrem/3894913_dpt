package FuelDispenser;

import FuelStation.IVehicle;

public class FuelDispenserDiesel extends FuelDispenser {

	private FuelDispenser successor;


	public void handleVehicle(IVehicle iVehicle) {
		if (iVehicle.getFuelType()!=FuelType.Diesel){
			successor.handleVehicle(iVehicle);
			return;
		}
	}



}