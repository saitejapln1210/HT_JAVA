package core_java_9;

public class Demo {
    public static void main(String[] args) {
        Main guide = new Main();

        explainObjectBasics(guide);
        explainObjectMethods(guide);
        explainEqualsHashCodeContracts(guide);
        explainPracticalScenarios(guide);
        explainInterviewFocus(guide);
    }

    private static void explainObjectBasics(Main guide) {
        System.out.println("=== Object Class Basics ===");
        System.out.println(guide.explainObjectClass());
        System.out.println(guide.explainImplicitInheritance());
        System.out.println();
    }

    private static void explainObjectMethods(Main guide) {
        System.out.println("=== Methods Available From Object Class ===");
        System.out.println(guide.explainObjectClassMethods());
        System.out.println();
    }

    private static void explainEqualsHashCodeContracts(Main guide) {
        System.out.println("=== equals() And hashCode() ===");
        System.out.println(guide.explainEqualsAndHashCodeInternals());
        System.out.println(guide.explainEqualsContract());
        System.out.println(guide.explainHashCodeContract());
        System.out.println();
    }

    private static void explainPracticalScenarios(Main guide) {
        System.out.println("=== Practical Scenarios ===");
        System.out.println(guide.demonstrateReferenceVsLogicalEquality());
        System.out.println(guide.demonstrateHashSetWithProperContract());
        System.out.println(guide.demonstrateHashSetWithBrokenContract());
        System.out.println(guide.demonstrateDatatypeEqualityScenarios());
        System.out.println();
    }

    private static void explainInterviewFocus(Main guide) {
        System.out.println("=== Interview Specific Notes ===");
        System.out.println(guide.explainInterviewScenarios());
    }
}
