package core_java_6;

public interface ProgressReport {
    default String progressStatus() {
        return buildMessage("learner is making steady progress.");
    }

    static String reportType() {
        return formatStaticMessage("shared utility/report info");
    }

    default String privateMethodVersionInfo() {
        return "Private interface methods are supported from Java 9 -> " + buildMessage("internal helper reused by default method");
    }

    private String buildMessage(String status) {
        return "Default progress status: " + status;
    }

    private static String formatStaticMessage(String label) {
        return "Static interface method: " + label;
    }
}
