package core_java_1;

public class Demo {
    public static void main(String[] args) {
        explainRuntime();
        explainClassBasics();
        explainDataTypes();
        explainOperatorRules();
        explainAccessModifiers();
        runKeywordExample();
    }

    private static void explainRuntime() {
        System.out.println("=== JVM, JRE, JDK ===");
        System.out.println("JDK -> complete toolkit used to develop, compile, and run Java programs.");
        System.out.println("JRE -> provides libraries and JVM required to run Java programs.");
        System.out.println("JVM -> executes bytecode and manages memory, stack, heap, and garbage collection.");
        System.out.println();
    }

    private static void explainClassBasics() {
        System.out.println("=== Class Basics ===");
        System.out.println("A class is a blueprint that groups state (fields) and behavior (methods).");
        System.out.println("Top-level classes can use access modifiers: public or default(package-private).");
        System.out.println("Other valid top-level class keywords include abstract, final, and strictfp.");
        System.out.println();
    }

    private static void explainDataTypes() {
        System.out.println("=== Data Types ===");
        byte byteValue = 10;
        short shortValue = 2000;
        int intValue = 50000;
        long longValue = 9000000000L;
        float floatValue = 12.5f;
        double doubleValue = 145.678;
        char grade = 'A';
        boolean javaIsFun = true;
        String referenceType = "String is a reference type";

        System.out.println("byte=" + byteValue + ", short=" + shortValue + ", int=" + intValue + ", long=" + longValue);
        System.out.println("float=" + floatValue + ", double=" + doubleValue + ", char=" + grade + ", boolean=" + javaIsFun);
        System.out.println(referenceType);
        System.out.println();
    }

    private static void explainOperatorRules() {
        System.out.println("=== Operator Precedence And Associativity ===");
        int result = 10 + 4 * 2;
        int groupedResult = (10 + 4) * 2;
        int leftToRight = 20 - 5 - 3;

        System.out.println("10 + 4 * 2 = " + result + " because multiplication happens before addition.");
        System.out.println("(10 + 4) * 2 = " + groupedResult + " because parentheses are highest priority.");
        System.out.println("20 - 5 - 3 = " + leftToRight + " because subtraction is left to right.");
        System.out.println();
    }

    private static void explainAccessModifiers() {
        System.out.println("=== Access Modifiers ===");
        System.out.println("Top-level class: public or default(package-private).");
        System.out.println("Fields and methods: private, default, protected, public.");
        System.out.println("private -> same class only, default -> same package, protected -> package + subclasses, public -> everywhere.");
        System.out.println();
    }

    private static void runKeywordExample() {
        System.out.println("=== static, non-static, final ===");
        Main learner = new Main(101, "Harsha", 6);
        System.out.println(learner.describeLearner());

        learner.addPracticeHours(2);
        learner.markRevisionComplete();
        System.out.println(learner.learnerSummary());
        System.out.println(learner.describeLearner());

        System.out.println(Main.batchSummary());
        Main.updateBatchStrength(30);
        System.out.println(Main.batchSummary());
    }
}
