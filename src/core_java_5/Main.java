package core_java_5;

public class Main {
    public String explainDataHiding() {
        BankAccount account = new BankAccount("Harshu", 5000.0);
        account.deposit(1500.0);
        account.withdraw(300.0);

        return "Private balance stays hidden and changes only through validated methods -> "
                + account.getAccountSummary();
    }

    public String explainJavaSupportForDataHiding() {
        return "Java supports data hiding with access modifiers, private fields, controlled getters/setters, and validation logic inside methods.";
    }

    public String explainEncapsulation() {
        StudentProfile profile = new StudentProfile("Harshu", 12, "Core Java");
        profile.addPracticeHours(3);
        profile.changeTrack("Advanced Core Java");

        return "Encapsulation combines private data with related behavior -> " + profile.profileSummary();
    }

    public String explainEncapsulationEdgeCase() {
        StudentProfile profile = new StudentProfile("Harshu", 8, "Core Java");
        profile.addPracticeHours(-5);
        profile.changeTrack("");

        return "Encapsulation protects valid state by rejecting invalid updates -> " + profile.profileSummary();
    }

    public String explainAbstraction() {
        PaymentService service = new UpiPaymentService();
        return "Abstraction exposes a payment contract and hides implementation details -> "
                + service.processPayment(750.0);
    }

    public String explainAbstractionVariations() {
        PaymentService upiService = new UpiPaymentService();
        PaymentService cardService = new CardPaymentService();
        NotificationChannel notificationChannel = new EmailNotificationService();

        return "Same abstraction can use multiple implementations -> "
                + upiService.processPayment(300.0) + " | "
                + cardService.processPayment(300.0) + " | "
                + notificationChannel.send("Payment success");
    }

    public String explainWhyAbstractionCanHaveConstructors() {
        LearningModule module = new AbstractionRulesGuide("Abstraction Basics");

        return "Abstract classes can have constructors because child objects still need base-state initialization -> "
                + module.moduleHeader() + " | " + module.deliverTopic();
    }

    public String explainRulesOfAbstraction() {
        return "Rules: an abstract class cannot be instantiated, it can contain abstract and concrete methods, if a class has an abstract method it must be abstract, and a concrete child must implement inherited abstract methods unless the child is abstract.";
    }
}
