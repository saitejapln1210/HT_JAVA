package core_java_5;

public class CardPaymentService extends PaymentService {
    @Override
    public String processPayment(double amount) {
        return "Card payment processed for " + amount;
    }
}
