package core_java_5;

public class AbstractionRulesGuide extends LearningModule {
    public AbstractionRulesGuide(String moduleName) {
        super(moduleName);
    }

    @Override
    public String deliverTopic() {
        return "Abstract class gives common setup and child class provides concrete behavior for " + moduleName;
    }
}
