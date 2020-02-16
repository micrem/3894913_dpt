package FuelStation;

public interface IWaitingArea {
    IVehicle getNextVehicle();
    boolean hasNextVehicle();
    void addVehicle(IVehicle IVehicle);
}
