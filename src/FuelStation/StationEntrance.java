package FuelStation;

import FuelPump.FuelPump;
import FuelPump.*;

import java.time.Instant;
import java.util.Random;

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
        Random r = new Random();
		IFuelPump fuelPump = fuelPumps[0].getCompatibleFuelstation(vehicle);
        r.setSeed(Instant.now().getNano());

        fuelPump.pressB03(); //initiate refuel
        for (int i = r.nextInt(4); i >0 ; i--) { //adjust fuel amount
            if(r.nextBoolean()){fuelPump.pressB01();} else {fuelPump.pressB02();}
        }
		fuelPump.attachFueltap(vehicle);
        if(r.nextBoolean()){fuelPump.pressB02();} //adjust payment method
		fuelPump.pressB03(); //pay
	}
}