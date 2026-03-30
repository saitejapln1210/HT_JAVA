package core_java_6;

public class DiamondProblemResolver implements TheorySession, LabSession {
    @Override
    public String sessionPlan() {
        return "Diamond problem resolved by overriding the conflicting default method -> "
                + TheorySession.super.sessionPlan() + " + " + LabSession.super.sessionPlan();
    }


}
