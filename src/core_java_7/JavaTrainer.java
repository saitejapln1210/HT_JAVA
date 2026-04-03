package core_java_7;

public class JavaTrainer extends LearningMember {
    protected String memberType;

    public JavaTrainer(String name) {
        super(name, "Mentor");
        this.memberType = "Java Trainer";
    }

    @Override
    public String describeRole() {
        return super.describeRole() + " Child field says role is " + this.memberType + ".";
    }

    public String showSuperFieldUsage() {
        return "child field=" + this.memberType + ", parent field via super=" + super.memberType;
    }

    public String showSuperMethodUsage() {
        return "Calling parent behavior with super -> " + super.describeRole();
    }

    public String showSuperConstructorUsage() {
        return "super(name, \"Mentor\") runs first to initialize the parent part of the object.";
    }

    @Override
    public String guide(Object topic) {
        return "Overridden guide(Object) in child -> " + topic;
    }

    public String guide(String topic) {
        return "Overloaded guide(String) in child -> " + topic;
    }

    public String guide(String topic, int minutes) {
        return "Overloaded guide(String, int) in child -> " + topic + " for " + minutes + " minutes";
    }

    @Override
    public String accessWindow() {
        return "Child overrides and widens visibility from protected to public.";
    }

    @Override
    public PrintedMaterial provideMaterial() {
        return new PrintedMaterial("Printed Java inheritance handbook");
    }

    public final String trainingMode() {
        return "Child can override a method and mark that overriding method as final.";
    }

    public static String category() {
        return "Static method hidden in JavaTrainer";
    }

    @Override
    public String revisionPlan(String... topics) {
        return "Child overrides var-arg method, first topic = " + (topics.length == 0 ? "none" : topics[0]);
    }
}
