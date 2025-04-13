package adapter;

public class RupayAdapter implements PaymentGateway{
    private final Rupay rupay;

    public RupayAdapter(Rupay rupay) {
        this.rupay = rupay;
    }

    @Override
    public void processPayment(double amount) {
        rupay.rupayCharges(amount);
    }
}
