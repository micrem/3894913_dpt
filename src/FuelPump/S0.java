package FuelPump;

/**
 * state: initial state of fuel pump
 */
public class S0 implements IFuelPumpState {

	public void pressB01() {

	}

	public void pressB02() {

	}

	/**
	 * 
	 * @param fuelPump
	 */
	public void pressB03(IFuelPump fuelPump) {
		fuelPump.setState(new S1());
		//dirty solution: B3 doesn't change state here,
		// only sets fuelPump reference
		fuelPump.getState().pressB03(fuelPump);
	}

	/**
	 * 
	 * @param connected
	 */
	public void sensorSignal(boolean connected) {
	}

}