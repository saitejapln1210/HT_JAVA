package core_java_5;

public class Demo {
    public static void main(String[] args) {
        Main guide = new Main();

        explainDataHiding(guide);
        explainJavaSupportForDataHiding(guide);
        explainEncapsulation(guide);
        explainAbstraction(guide);
        explainAdvancedAbstractionRules(guide);
        explainInterviewFocus(guide);
    }

    private static void explainDataHiding(Main guide) {
        System.out.println("=== Data Hiding In Java ===");
        System.out.println("Data hiding means restricting direct access to internal data.");
        System.out.println(guide.explainDataHiding());
        System.out.println();
    }

    private static void explainJavaSupportForDataHiding(Main guide) {
        System.out.println("=== What Java Provides For Data Hiding ===");
        System.out.println(guide.explainJavaSupportForDataHiding());
        System.out.println("Java also uses encapsulation patterns to keep object state valid.");
        System.out.println();
    }

    private static void explainEncapsulation(Main guide) {
        System.out.println("=== Encapsulation ===");
        System.out.println("Encapsulation binds data and related methods into one unit, usually a class.");
        System.out.println(guide.explainEncapsulation());
        System.out.println(guide.explainEncapsulationEdgeCase());
        System.out.println();
    }

    private static void explainAbstraction(Main guide) {
        System.out.println("=== Abstraction ===");
        System.out.println("Abstraction focuses on required behavior and hides internal implementation details.");
        System.out.println(guide.explainAbstraction());
        System.out.println(guide.explainAbstractionVariations());
        System.out.println();
    }

    private static void explainAdvancedAbstractionRules(Main guide) {
        System.out.println("=== Why Abstraction Can Have Constructors And Rules ===");
        System.out.println(guide.explainWhyAbstractionCanHaveConstructors());
        System.out.println(guide.explainRulesOfAbstraction());
        System.out.println();
    }

    private static void explainInterviewFocus(Main guide) {
        System.out.println("=== Interview Focus ===");
        System.out.println("Encapsulation interview tip -> talk about validation, controlled updates, and object consistency.");
        System.out.println("Abstraction interview tip -> talk about contracts, loose coupling, and switching implementations.");
    }
}
