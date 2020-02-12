public class ParkingSpace {

	private Vehicle vehicle;
	private String name;

	public ParkingSpace(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}