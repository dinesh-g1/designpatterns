package adapter;

public class IciciAdapter implements PaymentGateway{
    private final Icici icici;

    public IciciAdapter(Icici icici) {
        this.icici = icici;
    }

    @Override
    public void processPayment(double amount) {
        icici.iciciProcessPayment(amount);
    }
}
