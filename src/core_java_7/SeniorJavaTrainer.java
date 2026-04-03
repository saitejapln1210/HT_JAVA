package core_java_7;

public class SeniorJavaTrainer extends JavaTrainer {
    public SeniorJavaTrainer(String name) {
        super(name);
    }

    @Override
    public String describeRole() {
        return super.describeRole() + " This is a multilevel inheritance example.";
    }
}
