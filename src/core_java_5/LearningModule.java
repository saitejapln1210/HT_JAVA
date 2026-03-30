package core_java_5;

public abstract class LearningModule {
    protected final String moduleName;

    public LearningModule(String moduleName) {
        this.moduleName = moduleName;
    }

    public String moduleHeader() {
        return "Learning module initialized for " + moduleName;
    }

    public abstract String deliverTopic();
}
