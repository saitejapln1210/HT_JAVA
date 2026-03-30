package core_java_6;

public class MultiSkillLearner implements LearningContract, PracticeContract {
    private final String learnerName;

    public MultiSkillLearner(String learnerName) {
        this.learnerName = learnerName;
    }

    @Override
    public String learnTopic() {
        return learnerName + " learns theory using LearningContract";
    }

    @Override
    public String attendPractice() {
        return learnerName + " attends practice using PracticeContract";
    }
}
