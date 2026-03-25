package core_java_4;

public class Main {
    public static String courseName;
    public static int objectCounter;

    public String learnerName;
    public int practiceHours;

    static {
        courseName = "Core Java Package 4";
        objectCounter = 0;
        System.out.println("Static block runs once when the class is loaded.");
    }

    {
        objectCounter++;
        System.out.println("Instance initialization block runs before every constructor.");
    }

    public Main() {
        this("Default Learner", 0);
        System.out.println("No-argument constructor completed.");
    }

    public Main(String learnerName) {
        this(learnerName, 2);
        System.out.println("Single-argument constructor completed.");
    }

    public Main(String learnerName, int practiceHours) {
        this.learnerName = learnerName;
        this.practiceHours = practiceHours;
        System.out.println("Two-argument constructor set instance variables using this.");
    }

    public String describeConstructorWork() {
        return "Constructor initializes object state -> learnerName=" + learnerName
                + ", practiceHours=" + practiceHours;
    }

    public String callCurrentObjectMethod() {
        return this.describeConstructorWork();
    }

    public void updateLearner(String learnerName, int practiceHours) {
        this.learnerName = learnerName;
        this.practiceHours = practiceHours;
    }

    public String flowSummary() {
        return "Execution flow: static block -> instance initialization block -> constructor.";
    }

    public String constructorAccessModifierSummary() {
        PublicConstructorSample publicSample = new PublicConstructorSample();
        ProtectedConstructorSample protectedSample = new ProtectedConstructorSample();
        DefaultConstructorSample defaultSample = new DefaultConstructorSample();
        PrivateConstructorSample privateSample = PrivateConstructorSample.create();

        return "Constructors can be public, protected, default, or private -> "
                + publicSample.label + ", "
                + protectedSample.label + ", "
                + defaultSample.label + ", "
                + privateSample.label;
    }

    public String staticThisRule() {
        return "this cannot be used in a static context because this refers to the current object, and static code belongs to the class.";
    }

    public String constructorOverrideRule() {
        ChildLearner childLearner = new ChildLearner();
        return "Constructors are not overridden. Child constructor calls parent constructor first -> "
                + childLearner.creationFlow;
    }

    public String abstractAndInterfaceConstructorRule() {
        AbstractLearner abstractLearner = new ChildLearner();
        return "Abstract classes can have constructors and they run during child object creation, but interfaces cannot have constructors -> "
                + abstractLearner.baseMessage;
    }

    static class PublicConstructorSample {
        String label;

        public PublicConstructorSample() {
            label = "public constructor";
        }
    }

    static class ProtectedConstructorSample {
        String label;

        protected ProtectedConstructorSample() {
            label = "protected constructor";
        }
    }

    static class DefaultConstructorSample {
        String label;

        DefaultConstructorSample() {
            label = "default constructor";
        }
    }

    static class PrivateConstructorSample {
        String label;

        private PrivateConstructorSample() {
            label = "private constructor";
        }

        static PrivateConstructorSample create() {
            return new PrivateConstructorSample();
        }
    }

    abstract static class AbstractLearner {
        String baseMessage;


        AbstractLearner(String baseMessage) {
            this.baseMessage = baseMessage;
        }
    }

    interface PracticeContract {
        void practise();
    }

    static class ChildLearner extends AbstractLearner implements PracticeContract {
        String creationFlow;

        ChildLearner() {
            super("abstract constructor executed");
            creationFlow = "parent constructor -> child constructor";
        }

        @Override
        public void practise() {
        }
    }
}
