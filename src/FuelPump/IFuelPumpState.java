package FuelPump;

public interface IFuelPumpState {

    void pressB01();

    void pressB02();

    /**
     * @param fuelPump
     */
    void pressB03(IFuelPump fuelPump);

    /**
     * @param connected
     */
    void sensorSignal(boolean connected);

}