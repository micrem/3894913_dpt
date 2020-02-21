package FuelStation;

import FuelDispenser.FuelDispenser;
import FuelDispenser.*;

public class StationEntrance {

	private FuelDispenser[] fuelDispensers;

	public StationEntrance() {
		fuelDispensers = new FuelDispenser[6];
		int i;
		for (i = 0; i < 3; i++) {
			fuelDispensers[i] = new FuelDispenserElectric();
		}
		fuelDispensers[i++] = new FuelDispenserDiesel();
		fuelDispensers[i++] = new FuelDispenserGas();
		fuelDispensers[i++] = new FuelDispenserPetrol();
		for (int j = 0; j < 5; j++) {
			fuelDispensers[j].setSuccessor(fuelDispensers[j+1]);
		}
	}
	void handleVehicle(IVehicle vehicle){
		fuelDispensers[0].handleVehicle(vehicle);
	}
}