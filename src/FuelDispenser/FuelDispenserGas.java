package FuelDispenser;

public class FuelDispenserGas extends FuelDispenser {

	private FuelDispenser successor;


	@Override
	public FuelType getFuelType() {
		return FuelType.Gas;
	}
}