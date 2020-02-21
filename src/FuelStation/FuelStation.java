package FuelStation;

public class FuelStation {

	private StationEntrance entranceCar;
	private StationEntrance entranceTruck;
	private IWaitingArea waitingArea;

    public FuelStation() {
        initComponents();
    }

    public StationEntrance getEntranceCar() {
        return entranceCar;
    }

    public void setEntranceCar(StationEntrance entranceCar) {
        this.entranceCar = entranceCar;
    }

    public StationEntrance getEntranceTruck() {
        return entranceTruck;
    }

    public void setEntranceTruck(StationEntrance entranceTruck) {
        this.entranceTruck = entranceTruck;
    }

    public IWaitingArea getWaitingArea() {
        return waitingArea;
    }

    public void setWaitingArea(WaitingArea waitingArea) {
        this.waitingArea = waitingArea;
    }

    private void initComponents(){
        if (entranceCar == null) {
            entranceCar = new StationEntrance();
        }
        if (entranceTruck == null) {
            entranceTruck = new StationEntrance();
        }
        if (waitingArea == null) {
            waitingArea = new WaitingArea();
        }
    }

    public void addVehicle(IVehicle vehicle){
        waitingArea.addVehicle(vehicle);
    }

    /**
     * attempts to process a car and a truck in each of the entrances
     * to compensate for lack of parallelisation in overall program
     */
    public void processWaitingVehicle() {
        IVehicle nextVehicle;
        if (waitingArea.isEmpty()) return;
        nextVehicle = waitingArea.getNextVehicle();
        System.out.println("-processing: "+nextVehicle.getVehicleType() + " " +nextVehicle.getFuelType());
        if(nextVehicle.getVehicleType()==VehicleType.Car) entranceCar.handleVehicle(nextVehicle);
        if(nextVehicle.getVehicleType()==VehicleType.Truck) entranceTruck.handleVehicle(nextVehicle);
        //else refuel ship / horse / sled
        }

        //FIXME multithreading:
//        IVehicle nextCar = waitingArea.getNextVehicle(VehicleType.Car);
//        IVehicle nextTruck = waitingArea.getNextVehicle(VehicleType.Truck);
//
//        if (nextCar!=null){
//            // START THREAD HERE:
//              entranceCar.handleVehicle(nextCar);
//        }
//        if (nextTruck!=null){
//            // START ANOTHER THREAD HERE:
//          entranceTruck.handleVehicle(nextTruck);
//        }

 }


