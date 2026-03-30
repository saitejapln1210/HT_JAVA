package core_java_6;

public class JavaStudent implements LearningContract, ProgressReport {
    private final String learnerName;

    public JavaStudent(String learnerName) {
        this.learnerName = learnerName;
    }

    @Override
    public String learnTopic() {
        return learnerName + " is learning through interface contract " + TRACK_NAME;
    }

    @Override
    public String progressStatus() {
        return "Overridden default method: " + learnerName + " completed interface practice successfully.";
    }
}
