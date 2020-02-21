package FuelPump;

import java.util.ArrayList;

public class ConnectorSensor {

	private ArrayList<ISensorListener> listeners;

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
	 * 
	 * @param listener
	 */
	public void addListener(ISensorListener listener) {
		listeners.add(listener);
	}

	/**
	 * 
	 * @param listener
	 */
	public void removeListener(ISensorListener listener) {
		listeners.remove(listener);
	}

}