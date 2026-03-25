package core_java_5;

public class Main {
    public String explainDataHiding() {
        BankAccount account = new BankAccount("Harshu", 5000.0);
        account.deposit(1500.0);

        return "Data hiding protects account balance using private fields and controlled public methods -> "
                + account.getAccountSummary();
    }

    public String explainEncapsulation() {
        StudentProfile profile = new StudentProfile();
        profile.setLearnerName("Harshu");
        profile.setPracticeHours(12);

        return "Encapsulation binds data and methods together in one class -> " + profile.profileSummary();
    }

    public String explainAbstraction() {
        PaymentService service = new UpiPaymentService();
        return "Abstraction shows what to do and hides how it is done -> " + service.processPayment(750.0);
    }

    public String explainInterviewLevelEncapsulation() {
        StudentProfile profile = new StudentProfile();
        profile.setLearnerName("Harshu");
        profile.setPracticeHours(-3);

        return "Interview point: encapsulation allows validation before updating state -> "
                + profile.profileSummary();
    }

    public String explainInterviewLevelAbstraction() {
        PaymentService upiService = new UpiPaymentService();
        PaymentService cardService = new CardPaymentService();

        return "Interview point: the caller works with abstraction and implementation can vary -> "
                + upiService.processPayment(300.0) + " | " + cardService.processPayment(300.0);
    }

    static class BankAccount {
        private final String accountHolder;
        private double balance;

        BankAccount(String accountHolder, double balance) {
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }

        public double getBalance() {
            return balance;
        }

        public String getAccountSummary() {
            return accountHolder + " balance=" + balance;
        }
    }

    static class StudentProfile {
        private String learnerName;
        private int practiceHours;

        public void setLearnerName(String learnerName) {
            if (learnerName != null && !learnerName.isBlank()) {
                this.learnerName = learnerName;
            }
        }

        public void setPracticeHours(int practiceHours) {
            if (practiceHours >= 0) {
                this.practiceHours = practiceHours;
            }
        }

        public String profileSummary() {
            return "learnerName=" + learnerName + ", practiceHours=" + practiceHours;
        }
    }

    abstract static class PaymentService {
        public abstract String processPayment(double amount);
    }

    static class UpiPaymentService extends PaymentService {
        @Override
        public String processPayment(double amount) {
            return "UPI payment processed for " + amount;
        }
    }

    static class CardPaymentService extends PaymentService {
        @Override
        public String processPayment(double amount) {
            return "Card payment processed for " + amount;
        }
    }
}
