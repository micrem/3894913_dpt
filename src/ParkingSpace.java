public class ParkingSpace {

	private Vehicle vehicle;
	private String id;

	public ParkingSpace(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}