package core_java_6;

public interface ProgressReport {
    default String progressStatus() {
        return "Default progress status: learner is making steady progress.";
    }

    static String reportType() {
        return "Static interface method: shared utility/report info";
    }
}
