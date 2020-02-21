package FuelStation;

import FuelPump.FuelType;

public interface IVehicle {
    FuelType getFuelType();

    VehicleType getVehicleType();
}
