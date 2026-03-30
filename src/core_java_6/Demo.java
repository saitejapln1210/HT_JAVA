package core_java_6;

public class Demo {
    public static void main(String[] args) {
        Main guide = new Main();

        explainInterfaces(guide);
        explainDefaultMethods(guide);
        explainInterfaceMembers(guide);
        explainRules(guide);
        explainDesignChoice(guide);
        explainSpecialInterfaces(guide);
        explainEdgeCases(guide);
    }

    private static void explainInterfaces(Main guide) {
        System.out.println("=== Interfaces In Java ===");
        System.out.println("An interface gives a contract. Implementing classes provide the actual logic.");
        System.out.println(guide.explainInterfaces());
        System.out.println();
    }

    private static void explainDefaultMethods(Main guide) {
        System.out.println("=== Default Methods ===");
        System.out.println("Default methods allow interfaces to add reusable behavior without breaking existing implementations.");
        System.out.println(guide.explainDefaultMethods());
        System.out.println(guide.explainWhyDefaultAndStaticMethodsExist());
        System.out.println(guide.explainOverrideRulesForDefaultAndStaticMethods());
        System.out.println(guide.explainPrivateInterfaceMethods());
        System.out.println();
    }

    private static void explainInterfaceMembers(Main guide) {
        System.out.println("=== Interface Members And Modifiers ===");
        System.out.println(guide.explainInterfaceAccessModifiers());
        System.out.println(guide.explainStaticAndFinalInInterface());
        System.out.println(guide.explainInterfaceConstructorRule());
        System.out.println("Example static interface method -> " + ProgressReport.reportType());
        System.out.println();
    }

    private static void explainRules(Main guide) {
        System.out.println("=== Interface Rules And Multiple Interfaces ===");
        System.out.println(guide.explainInterfaceRules());
        System.out.println("One class can implement multiple interfaces -> " + guide.explainMultipleInterfaces());
        System.out.println();
    }

    private static void explainDesignChoice(Main guide) {
        System.out.println("=== Abstraction Vs Interface ===");
        System.out.println(guide.explainAbstractionVsInterface());
        System.out.println();
    }

    private static void explainSpecialInterfaces(Main guide) {
        System.out.println("=== Marker And Functional Interfaces ===");
        System.out.println(guide.explainMarkerInterface());
        System.out.println(guide.explainFunctionalInterface());
        System.out.println();
    }

    private static void explainEdgeCases(Main guide) {
        System.out.println("=== Interface Edge Cases ===");
        System.out.println(guide.explainInterfaceEdgeCases());
        System.out.println(guide.explainDiamondProblemResolution());
    }
}
