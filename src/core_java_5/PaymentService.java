package core_java_5;

public abstract class PaymentService {
    public abstract String processPayment(double amount);
    PaymentService(){
        start();
    }
    public void start(){
        // process to do network connecton
    }
}
