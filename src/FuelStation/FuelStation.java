package FuelStation;

public class FuelStation {

	private StationEntrance entranceCar;
	private StationEntrance entranceTruck;
	private WaitingArea waitingArea;

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

    public WaitingArea getWaitingArea() {
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

    public void handleVehicle(IVehicle vehicle){
        VehicleType vehicleType = vehicle.getVehicleType();
        switch (vehicleType){
            case Car:
                entranceCar.handleVehicle(vehicle);
                break;
            case Truck:
                entranceTruck.handleVehicle(vehicle);
                break;
            default:
                break;
        }
    }


}