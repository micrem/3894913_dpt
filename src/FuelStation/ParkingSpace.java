package FuelStation;

public class ParkingSpace {

	private IVehicle IVehicle;
	private String name;

	public ParkingSpace(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public IVehicle getVehicle() {
		return IVehicle;
	}

	public void setVehicle(IVehicle IVehicle) {
		this.IVehicle = IVehicle;
	}
}