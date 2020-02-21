package FuelDispenser;

public class FuelDispenserPetrol extends FuelDispenser {

	private FuelDispenser successor;

	@Override
	public FuelType getFuelType() {
		return FuelType.Petrol;
	}
}