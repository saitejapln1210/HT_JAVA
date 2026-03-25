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
}
