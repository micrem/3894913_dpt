package FuelDispenser;

public class S0 implements IDispenserState {

	public void pressB01() {

	}

	public void pressB02() {

	}

	/**
	 * 
	 * @param fuelDispenser
	 */
	public void pressB03(FuelDispenser fuelDispenser) {
		fuelDispenser.setState(new S1());
		fuelDispenser.getState().pressB03(fuelDispenser); //dirty solution
	}

	/**
	 * 
	 * @param connected
	 */
	public void sensorSignal(boolean connected) {
	}

}