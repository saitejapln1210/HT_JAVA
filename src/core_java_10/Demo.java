package core_java_10;

public class Demo {
    public static void main(String[] args) {
        Main guide = new Main();

        explainWrapperClass(guide);
        explainBoxingUnboxing(guide);
        explainStrings(guide);
        explainImmutability(guide);
        explainInterviewScenarios(guide);
    }

    private static void explainWrapperClass(Main guide) {
        System.out.println("=== Wrapper Class Basics ===");
        System.out.println(guide.explainWrapperClassBasics());
        System.out.println(guide.explainWrapperUtilities());
        System.out.println();
    }

    private static void explainBoxingUnboxing(Main guide) {
        System.out.println("=== Boxing And Unboxing ===");
        System.out.println(guide.explainBoxingAndUnboxing());
        System.out.println(guide.explainWrapperEdgeCases());
        System.out.println();
    }

    private static void explainStrings(Main guide) {
        System.out.println("=== Strings In Java ===");
        System.out.println(guide.explainStringCreation());
        System.out.println(guide.explainStringMethods());
        System.out.println();
    }

    private static void explainImmutability(Main guide) {
        System.out.println("=== String Immutability ===");
        System.out.println(guide.explainStringImmutability());
        System.out.println(guide.explainMutableAlternative());
        System.out.println(guide.explainStringBuilderVsStringBuffer());
        System.out.println();
    }

    private static void explainInterviewScenarios(Main guide) {
        System.out.println("=== Interview Edge Scenarios ===");
        System.out.println(guide.explainStringPoolScenario());
        System.out.println(guide.explainCompileTimeConcatenationPooling());
    }
}
