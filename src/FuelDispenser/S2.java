package FuelDispenser;

public class S2 implements IDispenserState {
	private PaymentMethod paymentMethod=PaymentMethod.Credit;

	public void pressB01() {
		paymentMethod=PaymentMethod.Credit;
	}

	public void pressB02() {
		paymentMethod=PaymentMethod.Debit;
	}

	/**
	 * 
	 * @param fuelDispenser
	 */
	public void pressB03(FuelDispenser fuelDispenser) {
		System.out.println("Paid with "+paymentMethod);
		fuelDispenser.setState(new S0());
	}

	/**
	 * 
	 * @param connected
	 */
	public void sensorSignal(boolean connected) {
	}

}