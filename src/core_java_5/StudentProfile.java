package core_java_5;

public class StudentProfile {
    private String learnerName;
    private int practiceHours;
    private String trackName;

    public StudentProfile(String learnerName, int practiceHours, String trackName) {
        setLearnerName(learnerName);
        setPracticeHours(practiceHours);
        setTrackName(trackName);
    }

    private void setLearnerName(String learnerName) {
        if (learnerName != null && !learnerName.isBlank()) {
            this.learnerName = learnerName;
        }
    }

    private void setPracticeHours(int practiceHours) {
        if (practiceHours >= 0) {
            this.practiceHours = practiceHours;
        }
    }

    private void setTrackName(String trackName) {
        if (trackName != null && !trackName.isBlank()) {
            this.trackName = trackName;
        }
    }

    public void addPracticeHours(int extraHours) {
        if (extraHours > 0) {
            practiceHours += extraHours;
        }
    }

    public void changeTrack(String trackName) {
        setTrackName(trackName);
    }

    public String profileSummary() {
        return "learnerName=" + learnerName + ", practiceHours=" + practiceHours + ", trackName=" + trackName;
    }
}
