package FuelPump;

import java.util.ArrayList;
import java.util.List;

public class ConnectorSensor {

    private List<ISensorListener> listeners;

    public ConnectorSensor() {
        this.listeners = new ArrayList<>();
    }

    public void connected() {
        for (ISensorListener listener :
                listeners) {
            listener.sensorSignal(true);
        }
    }

    public void disconnected() {
        for (ISensorListener listener :
                listeners) {
            listener.sensorSignal(false);
        }
    }

    /**
     * @param listener
     */
    public void addListener(ISensorListener listener) {
        listeners.add(listener);
    }

    /**
     * @param listener
     */
    public void removeListener(ISensorListener listener) {
        listeners.remove(listener);
    }

}