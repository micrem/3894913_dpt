package FuelPump;

import FuelStation.IVehicle;

public class Fueltap {
    ConnectorSensor sensor = new ConnectorSensor();

    public Fueltap(IFuelPump pump) {
        sensor.addListener(pump);
    }

    public void connected(IVehicle vehicle) {
        sensor.connected();
    }

    public void disconnected() {
        sensor.disconnected();
    }
}
