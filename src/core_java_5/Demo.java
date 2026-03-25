package core_java_5;

public class Demo {
    public static void main(String[] args) {
        Main guide = new Main();

        explainDataHiding(guide);
        explainJavaSupportForDataHiding();
        explainEncapsulation(guide);
        explainAbstraction(guide);
        explainInterviewFocus(guide);
    }

    private static void explainDataHiding(Main guide) {
        System.out.println("=== Data Hiding In Java ===");
        System.out.println("Data hiding means restricting direct access to internal data.");
        System.out.println(guide.explainDataHiding());
        System.out.println();
    }

    private static void explainJavaSupportForDataHiding() {
        System.out.println("=== What Java Provides For Data Hiding ===");
        System.out.println("Java mainly provides data hiding through private fields and controlled access methods.");
        System.out.println("Access modifiers like private, default, protected, and public decide visibility.");
        System.out.println();
    }

    private static void explainEncapsulation(Main guide) {
        System.out.println("=== Encapsulation ===");
        System.out.println("Encapsulation binds data and related methods into one unit, usually a class.");
        System.out.println(guide.explainEncapsulation());
        System.out.println();
    }

    private static void explainAbstraction(Main guide) {
        System.out.println("=== Abstraction ===");
        System.out.println("Abstraction focuses on required behavior and hides internal implementation details.");
        System.out.println(guide.explainAbstraction());
        System.out.println();
    }

    private static void explainInterviewFocus(Main guide) {
        System.out.println("=== Interview Focus ===");
        System.out.println(guide.explainInterviewLevelEncapsulation());
        System.out.println(guide.explainInterviewLevelAbstraction());
    }
}
