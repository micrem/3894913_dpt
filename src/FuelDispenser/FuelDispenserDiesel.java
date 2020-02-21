package FuelDispenser;

import FuelStation.IVehicle;

public class FuelDispenserDiesel extends FuelDispenser {

	private FuelDispenser successor;

    public FuelType getFuelType(){
        return FuelType.Diesel;
    }



}