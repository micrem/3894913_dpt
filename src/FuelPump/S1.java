package FuelPump;

import static java.lang.Thread.sleep;

/**
 * state: ready to pump
 */
public class S1 implements IFuelPumpState {
	int fuelAmount = 25;
	IFuelPump fuelPump;

	public void pressB01() {
		fuelAmount =Math.min(fuelAmount +5,50);
	}

	public void pressB02() {
		fuelAmount =Math.max(fuelAmount -5,0);
	}

	/**
	 * 
	 * @param fuelPump
	 */
	public void pressB03(IFuelPump fuelPump) {
	    this.fuelPump=fuelPump;
	}

	/**
	 * 
	 * @param connected
	 */
	public void sensorSignal(boolean connected) {
		if(connected){
		    fuelPump.fillVehicle(fuelAmount);
            try {
                sleep((int) (1000 + 2000*Math.random())); //wait 1-3s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            fuelPump.setState(new S2());
        }
	}

}