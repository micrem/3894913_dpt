package FuelDispenser;

public class FuelDispenserElectric extends FuelDispenser {

	private FuelDispenser successor;

	@Override
	public FuelType getFuelType() {
		return FuelType.Electric;
	}
}