package FuelDispenser;

public interface IDispenserState {

	void pressB01();

	void pressB02();

	/**
	 * 
	 * @param fuelDispenser
	 */
	void pressB03(FuelDispenser fuelDispenser);

	/**
	 * 
	 * @param connected
	 */
	void sensorSignal(boolean connected);

}