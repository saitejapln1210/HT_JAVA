package core_java_3;

public class Main {
    public static String programName = "Core Java Package 3";
    public static int totalObjectsCreated = 0;

    public String learnerName;
    public int practiceHours;

    public Main(String learnerName, int practiceHours) {
        this.learnerName = learnerName;
        this.practiceHours = practiceHours;
        totalObjectsCreated++;
    }

    public String describeObjectMemory() {
        return "Object for " + learnerName + " is stored in heap and keeps instance data like practiceHours="
                + practiceHours;
    }

    public String describeClassMemory() {
        return "Class-level data like programName and totalObjectsCreated is shared across objects.";
    }

    public String methodCreatesStackAndHeap() {
        int sessionHours = 2;
        Main helper = new Main("Helper Learner", 1);

        return "sessionHours is a local stack variable, helper reference is in stack, and helper object is in heap -> "
                + helper.learnerName + " | sessionHours=" + sessionHours
                + " | totalObjectsCreated=" + totalObjectsCreated;
    }

    public static String staticMethodVisibility() {
        return "Static method directly accesses static data -> programName=" + programName
                + ", totalObjectsCreated=" + totalObjectsCreated;
    }

    public String instanceMethodVisibility() {
        return "Instance method accesses instance data -> learnerName=" + learnerName
                + ", practiceHours=" + practiceHours + " and also static programName=" + programName;
    }

    public String instanceMethodUsingStaticMethod() {
        return "Instance method can call static method -> " + staticMethodVisibility();
    }

    public static String staticMethodUsingObject(Main learner) {
        return "Static method needs object reference to access instance data -> learnerName=" + learner.learnerName
                + ", practiceHours=" + learner.practiceHours;
    }
}
