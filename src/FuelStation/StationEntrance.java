package FuelStation;

import FuelPump.FuelPump;
import FuelPump.*;

public class StationEntrance {

	private IFuelPump[] fuelPumps;

	public StationEntrance() {
		fuelPumps = new FuelPump[6];
		int i;
		for (i = 0; i < 3; i++) {
			fuelPumps[i] = new FuelPumpElectric();
		}
		fuelPumps[i++] = new FuelPumpDiesel();
		fuelPumps[i++] = new FuelPumpGas();
		fuelPumps[i++] = new FuelPumpPetrol();
		for (int j = 0; j < 5; j++) {
			fuelPumps[j].setSuccessor(fuelPumps[j+1]);
		}
	}
	void handleVehicle(IVehicle vehicle){
		IFuelPump fuelPump = fuelPumps[0].getCompatibleFuelstation(vehicle);
        fuelPump.pressB03(); //initiate refuel
		fuelPump.attachFueltap(vehicle);
		fuelPump.pressB03(); //pay
	}
}