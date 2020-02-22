package FuelPump;

/**
 * state: awaiting payment
 */
public class S2 implements IFuelPumpState {
    private PaymentMethod paymentMethod = PaymentMethod.Credit;

    public void pressB01() {
        paymentMethod = PaymentMethod.Credit;
    }

    public void pressB02() {
        paymentMethod = PaymentMethod.Debit;
    }

    /**
     * @param fuelPump
     */
    public void pressB03(IFuelPump fuelPump) {
        System.out.println("Paid with " + paymentMethod);
        fuelPump.setState(new S0());
    }

    /**
     * @param connected
     */
    public void sensorSignal(boolean connected) {
    }

}