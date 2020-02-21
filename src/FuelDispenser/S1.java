package FuelDispenser;

public class S1 implements IDispenserState {
	int fuelAmount = 25;
	FuelDispenser fuelDispenser;

	public void pressB01() {
		fuelAmount =Math.min(fuelAmount +5,50);
	}

	public void pressB02() {
		fuelAmount =Math.max(fuelAmount -5,0);
	}

	/**
	 * 
	 * @param fuelDispenser
	 */
	public void pressB03(FuelDispenser fuelDispenser) {
	    this.fuelDispenser=fuelDispenser;
	}

	/**
	 * 
	 * @param connected
	 */
	public void sensorSignal(boolean connected) {
		if(connected){
		    fuelDispenser.fillVehicle(fuelAmount);
            fuelDispenser.setState(new S2());
        }
	}

}