package FuelStation;

public interface IWaitingArea {
    IVehicle getNextVehicle();
    boolean isEmpty();
    void addVehicle(IVehicle IVehicle);
    int getTotalVehicles();
}
