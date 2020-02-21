package FuelPump;

public class FuelPumpElectric extends FuelPump {

	@Override
	public FuelType getFuelType() {
		return FuelType.Electric;
	}
}