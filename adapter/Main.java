package adapter;

public class Main {
    public static void main(String[] args) {
        PaymentGateway pg1 = new RupayAdapter(new Rupay());
        PaymentGateway pg2 = new IciciAdapter(new Icici());

        pg1.processPayment(300);
        pg2.processPayment(200);
    }
}
