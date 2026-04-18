package core_java_11;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Main guide = new Main();

        explainGenericBasics(guide);
        explainGenericTypesAndMethods(guide);
        explainBoundsWildcardsAndPecs(guide);
        explainErasureRestrictionsAndVariance(guide);
        explainGenericDesignPatterns(guide);
        explainCollectionsUsage(guide);
    }

    private static void explainGenericBasics(Main guide) {
        System.out.println("=== Generics Fundamentals ===");
        System.out.println(guide.explainGenericsFundamentals());
        System.out.println(guide.demonstrateRawTypeVsGeneric());
        System.out.println();
    }

    private static void explainGenericTypesAndMethods(Main guide) {
        System.out.println("=== Generic Class, Constructor, And Methods ===");
        System.out.println(guide.demonstrateGenericClassAndConstructor());
        System.out.println(guide.demonstrateGenericMethodsAndTypeParameters());
        System.out.println(guide.demonstrateBoundedGenericsAndMultipleBounds());
        System.out.println();
    }

    private static void explainBoundsWildcardsAndPecs(Main guide) {
        System.out.println("=== Wildcards And PECS ===");
        System.out.println(guide.demonstrateWildcardsAndPecs());
        System.out.println();
    }

    private static void explainErasureRestrictionsAndVariance(Main guide) {
        System.out.println("=== Type Erasure, Restrictions, Invariance ===");
        System.out.println(guide.demonstrateTypeErasureAndBridgeMethods());
        System.out.println(guide.explainGenericRestrictions());
        System.out.println(guide.demonstrateArrayCovarianceGenericInvarianceAndHeapPollution());
        System.out.println();
    }

    private static void explainGenericDesignPatterns(Main guide) {
        System.out.println("=== Generic Interfaces, Inference, Patterns ===");
        System.out.println(guide.demonstrateGenericInterfaceUsage());
        System.out.println(guide.demonstrateTypeInference());
        System.out.println(guide.demonstrateGenericPatterns());
        System.out.println();
    }

    private static void explainCollectionsUsage(Main guide) {
        System.out.println("=== Generics In Collections ===");
        System.out.println(guide.demonstrateCollectionsWithComparableAndComparator());
    }
}
