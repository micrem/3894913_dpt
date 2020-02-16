package FuelStation;

public class FuelStation {

	private StationEntrance entranceCar;
	private StationEntrance entranceTruck;
	private WaitingArea waitingArea;

    public FuelStation(boolean initialze) {
        if (initialze) init();
    }

    public FuelStation() {
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

    private void init(){
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
}