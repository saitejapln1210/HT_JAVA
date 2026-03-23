package core_java_1;

public class Main {
    public static final String COURSE_NAME = "Core Java Package 1";
    private static int batchStrength = 25;

    private final int learnerId;
    private String learnerName;
    protected int practiceHours;
    public boolean conceptRevisionComplete;

    public Main(int learnerId, String learnerName, int practiceHours) {
        this.learnerId = learnerId;
        this.learnerName = learnerName;
        this.practiceHours = practiceHours;
        this.conceptRevisionComplete = false;
    }

    public String describeLearner() {
        return "Learner " + learnerId + " - " + learnerName
                + " | practiceHours=" + practiceHours
                + " | revisionComplete=" + conceptRevisionComplete;
    }

    public void addPracticeHours(int extraHours) {
        practiceHours += extraHours;
    }

    public void markRevisionComplete() {
        conceptRevisionComplete = true;
    }

    public final String learnerSummary() {
        return learnerName + " is learning " + COURSE_NAME;
    }

    public static void updateBatchStrength(int updatedStrength) {
        batchStrength = updatedStrength;
    }

    public static String batchSummary() {
        return "Batch strength for " + COURSE_NAME + " is " + batchStrength;
    }
}
