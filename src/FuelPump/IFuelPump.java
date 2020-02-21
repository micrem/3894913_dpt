package FuelPump;

import FuelStation.IVehicle;

public interface IFuelPump extends ISensorListener {
    IFuelPump getCompatibleFuelstation(IVehicle iVehicle);

    void pressB01();

    void pressB02();

    void pressB03();

    void sensorSignal(boolean connected);

    IFuelPump getSuccessor();

    void setSuccessor(IFuelPump successor);

    IFuelPumpState getState();

    void setState(IFuelPumpState state);

    void fillVehicle(int ammount);

    FuelType getFuelType();

    void attachFueltap(IVehicle vehicle);

    void disconnectFueltap();
}
