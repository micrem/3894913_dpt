import java.util.Map;

public class WaitingArea {

	private ParkingSpace[] carParkingSpaces = new ParkingSpace[15];
	private ParkingSpace[] truckParkingSpaces = new ParkingSpace[35];

	public WaitingArea() {
		for (int i = 0; i < carParkingSpaces.length; i++) {
			int j=i+1;
			carParkingSpaces[i] = new ParkingSpace( "P"+(j>9?j:("0"+j)) );
		}
		for (int i = 0; i < truckParkingSpaces.length; i++) {
			int j=i+16;
			truckParkingSpaces[i] = new ParkingSpace("P"+(j>9?j:("0"+j)));
		}
	}

	public ParkingSpace getParkingSpace(int index) {
		return index<15?carParkingSpaces[index]:truckParkingSpaces[index-15];
	}

	public ParkingSpace getFreeCarParkingSpace(){
		for (int i = 0; i < carParkingSpaces.length; i++) {
			if(carParkingSpaces[i].getVehicle()==null) return carParkingSpaces[i];
		}
		return null;
	}

	public ParkingSpace getFreeTruckParkingSpace(){
		for (int i = 0; i < truckParkingSpaces.length; i++) {
			if(truckParkingSpaces[i].getVehicle()==null) return truckParkingSpaces[i];
		}
		return null;
	}

	public Vehicle getWaitingVehicle(){
		for (int i = 0; i < 50; i++) {
			if (getParkingSpace(i)!=null) {
				Vehicle vehicle = getParkingSpace(i).getVehicle();
				getParkingSpace(i).setVehicle(null);
				return vehicle;
			}
		}
		return null;
	}
}