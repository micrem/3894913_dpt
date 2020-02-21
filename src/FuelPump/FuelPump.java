package FuelPump;

import FuelStation.IVehicle;

public abstract class FuelPump implements IFuelPump {

	private IFuelPump successor;
	private IFuelPumpState state;
	private Fueltap fueltap;

    public FuelPump() {
        state = new S0();
    }

    /**
	 *
     * @param iVehicle
     */
    @Override
    public IFuelPump getCompatibleFuelstation(IVehicle iVehicle) {
        if (iVehicle.getFuelType() != getFuelType()) {
            if (successor == null) {
                throw new UnsupportedOperationException("Station can not handle fuel type:" + iVehicle.getFuelType());
            }
            return successor.getCompatibleFuelstation(iVehicle);
        }
        return this;
    }

	@Override
    public void pressB01() {
		state.pressB01();
	}

	@Override
    public void pressB02() {
		state.pressB02();
	}

	@Override
    public void pressB03() {
		state.pressB03(this);
	}

	/**
	 * 
	 * @param connected
	 */
	@Override
    public void sensorSignal(boolean connected) {
		state.sensorSignal(connected);
	}

	@Override
    public IFuelPump getSuccessor() {
		return successor;
	}

	@Override
    public void setSuccessor(IFuelPump successor) {
		this.successor = successor;
	}

	@Override
    public IFuelPumpState getState() {
		return state;
	}

	@Override
    public void setState(IFuelPumpState state) {
		this.state = state;
	}

    @Override
    public void fillVehicle(int ammount) {
        System.out.println("Refuel " +ammount + " units "+getFuelType());
    }

    @Override
    public void attachFueltap(IVehicle vehicle) {
	    //initalising fueltap can't be done in FuelPump constructor,
        //since 'this' reference is unreliable during constructor execution
        if(fueltap==null){fueltap = new Fueltap(this);}
        fueltap.connected(vehicle);
    }

    @Override
    public void disconnectFueltap() {
        fueltap.disconnected();
    }
}