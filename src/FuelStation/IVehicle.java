package FuelStation;

import FuelDispenser.FuelType;

public interface IVehicle {
    FuelType getFuelType();

    VehicleType getVehicleType();
}
