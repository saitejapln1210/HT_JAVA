package core_java_5;

public class UpiPaymentService extends PaymentService {
    @Override
    public String processPayment(double amount) {
        return "UPI payment processed for " + amount;
    }
}
