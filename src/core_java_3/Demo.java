package core_java_3;

public class Demo {
    public static void main(String[] args) {
        explainMemoryAreas();
        explainVisibilityRules();
    }

    private static void explainMemoryAreas() {
        System.out.println("=== Memory Of Variables, Classes, Methods, And Objects ===");
        Main learner = new Main("Harshu", 5);

        System.out.println("programName is static, so it belongs to the class memory area.");
        System.out.println("learner reference variable is local to this method, so the reference lives in stack.");
        System.out.println(learner.describeObjectMemory());
        System.out.println(learner.describeClassMemory());
        System.out.println(learner.methodCreatesStackAndHeap());
        System.out.println();
    }

    private static void explainVisibilityRules() {
        System.out.println("=== Visibility Of Static And Instance Members ===");
        Main learner = new Main("Sai", 8);

        System.out.println("Static method cannot directly use instance variables because no object is guaranteed.");
        System.out.println(Main.staticMethodVisibility());
        System.out.println(Main.staticMethodUsingObject(learner));
        System.out.println("Instance method can directly use both instance and static members.");
        System.out.println(learner.instanceMethodVisibility());
        System.out.println(learner.instanceMethodUsingStaticMethod());
    }
}
