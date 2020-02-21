package FuelDispenser;

import FuelStation.IVehicle;

public abstract class FuelDispenser implements ISensorListener {

	private FuelDispenser successor;
	private IDispenserState state;

	/**
	 *
	 * @param iVehicle
     */
    public void getCompatibleFuelstation(IVehicle iVehicle) {
        if (iVehicle.getFuelType() != FuelType.Diesel) {
            if (successor == null){
                throw new UnsupportedOperationException("Station can not handle fuel type:"+iVehicle.getFuelType());
            }
            successor.getCompatibleFuelstation(iVehicle);
            return;
        }

    }

	public void pressB01() {
		state.pressB01();
	}

	public void pressB02() {
		state.pressB02();
	}

	public void pressB03() {
		state.pressB03(this);
	}

	/**
	 * 
	 * @param connected
	 */
	public void sensorSignal(boolean connected) {
		state.sensorSignal(connected);
	}

	public FuelDispenser getSuccessor() {
		return successor;
	}

	public void setSuccessor(FuelDispenser successor) {
		this.successor = successor;
	}

	public IDispenserState getState() {
		return state;
	}

	public void setState(IDispenserState state) {
		this.state = state;
	}

    public void fillVehicle(int ammount) {
    }

    public abstract FuelType getFuelType();
}