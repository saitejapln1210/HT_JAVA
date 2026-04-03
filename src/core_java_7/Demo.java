package core_java_7;

public class Demo {
    public static void main(String[] args) {
        Main guide = new Main();

        explainInheritance(guide);
        explainSuperKeyword(guide);
        explainTypesOfInheritance(guide);
        explainRules(guide);
        explainOverloadingAndOverriding(guide);
        explainSpecialCases(guide);
    }

    private static void explainInheritance(Main guide) {
        System.out.println("=== Inheritance In Java ===");
        System.out.println(guide.explainInheritance());
        System.out.println();
    }

    private static void explainSuperKeyword(Main guide) {
        System.out.println("=== super Keyword Usage ===");
        System.out.println(guide.explainSuperKeyword());
        System.out.println();
    }

    private static void explainTypesOfInheritance(Main guide) {
        System.out.println("=== Types Of Inheritance ===");
        System.out.println(guide.explainTypesOfInheritance());
        System.out.println();
    }

    private static void explainRules(Main guide) {
        System.out.println("=== Rules In Inheritance ===");
        System.out.println(guide.explainInheritanceRules());
        System.out.println();
    }

    private static void explainOverloadingAndOverriding(Main guide) {
        System.out.println("=== Overloading And Overriding In Inheritance ===");
        System.out.println(guide.explainOverloadingInInheritance());
        System.out.println(guide.explainOverridingInInheritance());
        System.out.println(guide.explainOverridingRules());
        System.out.println();
    }

    private static void explainSpecialCases(Main guide) {
        System.out.println("=== Cyclic Inheritance, Edge Cases, Tight Coupling ===");
        System.out.println(guide.explainCyclicInheritance());
        System.out.println(guide.explainEdgeCases());
        System.out.println(guide.explainTightCouplingAndUsage());
    }
}
