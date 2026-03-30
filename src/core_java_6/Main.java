package core_java_6;

public class Main {
    public String explainInterfaces() {
        LearningContract learner = new JavaStudent("Harshu");
        return "Interface defines a contract and implementing class provides behavior -> " + learner.learnTopic();
    }

    public String explainDefaultMethods() {
        ProgressReport report = new JavaStudent("Harshu");
        return "Default methods let interfaces share reusable behavior and can still be overridden by implementing classes -> "
                + report.progressStatus();
    }

    public String explainPrivateInterfaceMethods() {
        ProgressReport report = new JavaStudent("Harshu");
        return report.privateMethodVersionInfo();
    }

    public String explainWhyDefaultAndStaticMethodsExist() {
        return "Default methods are useful when interfaces need reusable instance-level behavior for implementing classes, while static methods are useful for interface-related utility logic that belongs to the interface itself, not to objects.";
    }

    public String explainOverrideRulesForDefaultAndStaticMethods() {
        ProgressReport report = new JavaStudent("Harshu");
        return "Default methods can be overridden by implementing classes -> " + report.progressStatus()
                + " | static interface methods cannot be overridden; they are called using the interface name -> "
                + ProgressReport.reportType();
    }

    public String explainInterfaceAccessModifiers() {
        return "Interface fields are public static final by default, abstract methods are public abstract by default, and interfaces can also have default and static methods.";
    }

    public String explainStaticAndFinalInInterface() {
        return "Interfaces can have static methods and all interface variables are implicitly public static final, but interface methods are not declared final because implementing classes may need to provide behavior.";
    }

    public String explainInterfaceConstructorRule() {
        return "Interfaces cannot have constructors because interfaces do not create or initialize objects; implementing classes create objects.";
    }

    public String explainInterfaceRules() {
        return "Rules: interface cannot be instantiated, a class uses implements, one class can implement multiple interfaces, and a concrete class must implement all inherited abstract methods.";
    }

    public String explainMultipleInterfaces() {
        MultiSkillLearner learner = new MultiSkillLearner("Harshu");
        return learner.learnTopic() + " | " + learner.attendPractice();
    }

    public String explainAbstractionVsInterface() {
        ContentModule module = new JavaWorkshopModule("Interface Decision Guide");
        return "Use abstract class when shared state/base implementation is needed, use interface when multiple unrelated classes should follow the same contract -> "
                + module.moduleSummary();
    }

    public String explainMarkerInterface() {
        RapidRevisionNotes notes = new RapidRevisionNotes();
        return "Marker interface carries metadata without methods -> markedForQuickReview="
                + (notes instanceof RapidRevisionMarker);
    }

    public String explainFunctionalInterface() {
        ScoreCalculator calculator = new ScoreCalculator() {
            @Override
            public int calculate(int theory, int lab) {
                return theory + lab;
            }
        };

        return "Functional interface has exactly one abstract method -> totalScore=" + calculator.calculate(40, 45);
    }

    public String explainDiamondProblemResolution() {
        DiamondProblemResolver resolver = new DiamondProblemResolver();
        return resolver.sessionPlan();
    }

    public String explainInterfaceEdgeCases() {
        return "Edge cases: interface variables are constants, default-method conflicts must be resolved by the class, private interface methods are available from Java 9 for internal reuse, and if a class does not implement all abstract methods it must be declared abstract.";
    }
}
