package core_java_7;

public class LearningMember {
    protected String name;
    protected String memberType;
    protected static String academyName = "HT Java Academy";

    public LearningMember(String name, String memberType) {
        this.name = name;
        this.memberType = memberType;
    }

    public String describeRole() {
        return name + " is a " + memberType + " in " + academyName + ".";
    }

    public String guide(Object topic) {
        return "LearningMember guides a generic topic -> " + topic;
    }

    protected String accessWindow() {
        return "Parent method is protected.";
    }

    public CourseMaterial provideMaterial() {
        return new CourseMaterial("Generic course material");
    }

    public final String attendancePolicy() {
        return "Final parent method: attendance policy is inherited as-is.";
    }

    public static String category() {
        return "Static method from LearningMember";
    }

    public String revisionPlan(String... topics) {
        return "Parent var-arg revision plan count = " + topics.length;
    }
}
