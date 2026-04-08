package core_java_8;

public class Demo {
    public static void main(String[] args) {
        Main guide = new Main();

        explainHierarchy(guide);
        explainCheckedAndUnchecked(guide);
        explainTryCatchFinally(guide);
        explainThrowAndThrows(guide);
        explainCustomExceptions(guide);
        explainConstructorThrows(guide);
        explainCheckedCategories(guide);
        explainTryWithResources(guide);
        explainFileStreams(guide);
        explainCatchVariations(guide);
        explainFinalFinallyFinalize(guide);
    }

    private static void explainHierarchy(Main guide) {
        System.out.println("=== Exception Handling Basics ===");
        System.out.println(guide.explainThrowableHierarchy());
        System.out.println(guide.explainErrorVsException());
        System.out.println();
    }

    private static void explainCheckedAndUnchecked(Main guide) {
        System.out.println("=== Checked And Unchecked Exceptions ===");
        System.out.println(guide.explainCheckedUnchecked());
        System.out.println(guide.explainHierarchyExamples());
        System.out.println();
    }

    private static void explainTryCatchFinally(Main guide) {
        System.out.println("=== try, catch, finally ===");
        System.out.println("try can exist with catch, with finally, or with both. catch without try is invalid.");
        System.out.println(guide.explainTryCatchFinally());
        System.out.println();
    }

    private static void explainThrowAndThrows(Main guide) {
        System.out.println("=== throw And throws ===");
        System.out.println("throw is used to create an exception explicitly. throws is used in method signature to delegate checked-exception handling.");
        System.out.println(guide.explainThrowAndThrows());
        System.out.println();
    }

    private static void explainCustomExceptions(Main guide) {
        System.out.println("=== Custom Exceptions ===");
        System.out.println("Custom exceptions are user-defined exceptions created to represent business-specific problems more clearly.");
        System.out.println(guide.explainCustomExceptions());
        System.out.println();
    }

    private static void explainConstructorThrows(Main guide) {
        System.out.println("=== throws With Constructor And Class Level ===");
        System.out.println(guide.explainThrowsWithConstructor());
        System.out.println(guide.explainWhyNoThrowsAtClassLevel());
        System.out.println();
    }

    private static void explainCheckedCategories(Main guide) {
        System.out.println("=== Partially Checked And Fully Checked ===");
        System.out.println(guide.explainCheckedScenarios());
        System.out.println();
    }

    private static void explainTryWithResources(Main guide) {
        System.out.println("=== Try With Resources ===");
        System.out.println(guide.explainTryWithResources());
        System.out.println(guide.explainMultipleResources());
        System.out.println();
    }

    private static void explainFileStreams(Main guide) {
        System.out.println("=== File Stream Example ===");
        System.out.println("File streams like FileInputStream and FileOutputStream are commonly used with try-with-resources.");
        System.out.println(guide.explainFileStreamExample());
        System.out.println();
    }

    private static void explainCatchVariations(Main guide) {
        System.out.println("=== Multiple Catch And Multi-Catch ===");
        System.out.println(guide.explainMultipleCatchAndMultiCatch());
        System.out.println();
    }

    private static void explainFinalFinallyFinalize(Main guide) {
        System.out.println("=== final, finally, finalize ===");
        System.out.println(guide.explainFinalFinallyFinalize());
    }
}
