package FuelStation;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class WaitingArea implements  IWaitingArea{
    final int personalCarMax=35;
    final int truckMax=15;
    final int spacesMax=personalCarMax+truckMax;
    private Queue<IVehicle> queue = new ArrayDeque<>();

	private ParkingSpace[] carParkingSpaces = new ParkingSpace[personalCarMax];
	private ParkingSpace[] truckParkingSpaces = new ParkingSpace[truckMax];

	public WaitingArea() {
		for (int i = 0; i < carParkingSpaces.length; i++) {
			int j=i+1;
			carParkingSpaces[i] = new ParkingSpace( "P"+(j>9?j:("0"+j)) );
		}
		for (int i = 0; i < truckParkingSpaces.length; i++) {
			int j=i+truckMax+1;
			truckParkingSpaces[i] = new ParkingSpace( "P"+(j>9?j:("0"+j)) );
		}

		//fill to 80% = 40/50
        for (int i = 0; i < 28; i++) {
            addVehicle(new Vehicle(VehicleType.Car));
        }
        for (int i = 0; i < 12; i++) {
            addVehicle(new Vehicle(VehicleType.Truck));
        }
	}

	public ParkingSpace getParkingSpace(int index) {
		return index<personalCarMax?carParkingSpaces[index]:truckParkingSpaces[index-personalCarMax];
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

	public IVehicle getWaitingVehicle(){
		for (int i = 0; i < spacesMax; i++) {
			if (getParkingSpace(i)!=null) {
				IVehicle IVehicle = getParkingSpace(i).getVehicle();
				getParkingSpace(i).setVehicle(null);
				return IVehicle;
			}
		}
		return null;
	}

    public ArrayList<VehicleType> getMixedParkingSpaceOrder() {
        int pCounter=0;
        int tCounter=0;
        final double carTruckRatio=personalCarMax/truckMax;
        double ptCurrentRatio;
        ArrayList<VehicleType> parkspaceOrder = new ArrayList<>();
        parkspaceOrder.add(VehicleType.Truck); tCounter++;
        for(int i =0;i<(spacesMax-1);i++){
            ptCurrentRatio=((double)pCounter)/tCounter;
            if( ptCurrentRatio<carTruckRatio ){
                parkspaceOrder.add(VehicleType.Car);
                pCounter++;
            } else {
                parkspaceOrder.add(VehicleType.Truck);
                tCounter++;
            }
        }
        return parkspaceOrder;
    }

    @Override
    public IVehicle getNextVehicle() {
        return queue.poll();
    }

    @Override
    public boolean hasNextVehicle() {
        return !queue.isEmpty();
    }

    @Override
    public void addVehicle(IVehicle IVehicle) {
	    queue.add(IVehicle);
    }
}