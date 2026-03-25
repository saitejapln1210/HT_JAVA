package core_java_2;

public class Main {
    public String methodSignatureExample(int left, int right) {
        return "Two parameter sum = " + (left + right);
    }

    public String methodSignatureExample(int left, int middle, int right) {
        return "Three parameter sum = " + (left + middle + right);
    }

    public String rule1Promotion(long value) {
        return "Promoted to long: " + value;
    }

    public String rule2ExactMatch(Object value) {
        return "Object overload selected";
    }

    public String rule2ExactMatch(String value) {
        return "String overload selected";
    }

    public String rule2ChildPriority(Object value1, String value2) {
        return "Second parameter chooses String because it is more specific than Object";
    }

    public String rule2ChildPriority(Object value1, Object value2) {
        return "Object overload selected";
    }

    public String rule3VarArgs(int value) {
        return "Exact single int overload selected";
    }

    public String rule3VarArgs(int... values) {
        return "Var-args overload selected";
    }

    public String rule4Reference(Animal animal) {
        return "Compiler selected Animal reference overload";
    }

    public String rule4Reference(Dog dog) {
        return "Compiler selected Dog reference overload";
    }

    public String changePrimitiveValue(int value) {
        value = value + 10;
        return "Inside method primitive value = " + value;
    }

    public String changeObjectState(ScoreCard scoreCard) {
        scoreCard.marks = scoreCard.marks + 10;
        return "Inside method object marks = " + scoreCard.marks;
    }

    public String reassignObjectReference(ScoreCard scoreCard) {
        scoreCard = new ScoreCard(99);
        return "Inside method reassigned object marks = " + scoreCard.marks;
    }

    static class Animal {
        public String identity() {
            return "Animal";
        }
    }

    static class Dog extends Animal {
        @Override
        public String identity() {
            return "Dog";
        }
    }

    static class ScoreCard {
        int marks;

        ScoreCard(int marks) {
            this.marks = marks;
        }
    }
}
