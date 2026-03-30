package core_java_6;

public abstract class ContentModule {
    protected final String moduleName;

    public ContentModule(String moduleName) {
        this.moduleName = moduleName;
    }

    public String moduleSummary() {
        return moduleName + " uses an abstract class because base state and reusable method are shared.";
    }
}
