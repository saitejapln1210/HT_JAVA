package core_java_4;

public class Demo {
    public static void main(String[] args) {
        explainConstructors();
        explainConstructorOverloading();
        explainThisKeyword();
        explainBlocksAndFlow();
    }

    private static void explainConstructors() {
        System.out.println("=== Constructors In Java ===");
        Main learner = new Main("Harshu", 5);
        System.out.println("A constructor runs automatically when an object is created.");
        System.out.println(learner.describeConstructorWork());
        System.out.println();
    }

    private static void explainConstructorOverloading() {
        System.out.println("=== Constructor Overloading ===");
        Main defaultLearner = new Main();
        Main namedLearner = new Main("Sai");
        Main detailedLearner = new Main("Teja", 7);
        System.out.println(defaultLearner.describeConstructorWork());
        System.out.println(namedLearner.describeConstructorWork());
        System.out.println(detailedLearner.describeConstructorWork());
        System.out.println();
    }

    private static void explainThisKeyword() {
        System.out.println("=== this Keyword Usage ===");
        Main learner = new Main("Keerthi", 4);
        System.out.println("this() calls another constructor in the same class.");
        System.out.println("this.variable refers to the current object fields.");
        System.out.println("this.method() calls another method of the current object.");
        learner.updateLearner("Keerthi Updated", 6);
        System.out.println(learner.callCurrentObjectMethod());
        System.out.println();
    }

    private static void explainBlocksAndFlow() {
        System.out.println("=== Static Block, Instance Block, And Constructor Flow ===");
        Main learner = new Main("Flow Learner", 3);
        System.out.println("courseName = " + Main.courseName);
        System.out.println("objectCounter = " + Main.objectCounter);
        System.out.println(learner.flowSummary());
    }
}
