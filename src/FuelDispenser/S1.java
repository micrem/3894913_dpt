package FuelDispenser;

public class S1 implements IDispenserState {
	int fuelAmmount = 25;
	FuelDispenser fuelDispenser;

	public void pressB01() {
		fuelAmmount=Math.min(fuelAmmount+5,50);
	}

	public void pressB02() {
		fuelAmmount=Math.max(fuelAmmount-5,0);
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
		    fuelDispenser.fillVehicle(fuelAmmount);
            fuelDispenser.setState(new S2());
        }
	}

}