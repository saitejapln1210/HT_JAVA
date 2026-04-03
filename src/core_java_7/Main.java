package core_java_7;

public class Main {
    public String explainInheritance() {
        JavaTrainer trainer = new JavaTrainer("Harshu");
        return "Inheritance allows a child class to reuse and extend parent properties and methods -> "
                + trainer.describeRole();
    }

    public String explainSuperKeyword() {
        JavaTrainer trainer = new JavaTrainer("Harshu");
        return trainer.showSuperFieldUsage() + " | " + trainer.showSuperMethodUsage() + " | "
                + trainer.showSuperConstructorUsage();
    }

    public String explainTypesOfInheritance() {
        LearningMember base = new LearningMember("Base Member", "Base Type");
        JavaTrainer single = new JavaTrainer("Single Level");
        SeniorJavaTrainer multilevel = new SeniorJavaTrainer("Multilevel");
        JavaStudent hierarchical = new JavaStudent("Hierarchy");

        return "Single inheritance -> " + single.describeRole()
                + " | Multilevel inheritance -> " + multilevel.describeRole()
                + " | Hierarchical inheritance -> parent " + base.getClass().getSimpleName()
                + " has children " + single.getClass().getSimpleName() + " and "
                + hierarchical.getClass().getSimpleName()
                + " | Multiple inheritance with classes is not supported in Java.";
    }

    public String explainInheritanceRules() {
        return "Rules: Java class can extend only one class, constructors are not inherited, private members are not directly accessible in child, child gets accessible members of parent, and every class ultimately extends Object.";
    }

    public String explainOverloadingInInheritance() {
        JavaTrainer trainer = new JavaTrainer("Harshu"); // creating child object with child reference
        LearningMember parentReference = new JavaTrainer("Harshu");// creating child object with parent refernce

        return trainer.guide("Inheritance") + " | " + trainer.guide("Overloading", 30)
                + " | Parent reference sees only parent overload set, so compiler picks guide(Object) -> "
                + parentReference.guide("Reference based resolution");
    }

    public String explainOverridingInInheritance() {
        LearningMember reference = new JavaTrainer("Harshu");
        return "Overriding gives runtime polymorphism. Parent reference calling overridden method executes child version -> "
                + reference.describeRole();
    }

    public String explainOverridingRules() {
        JavaTrainer trainer = new JavaTrainer("Harshu");
        LearningMember parentReference = trainer;

        return "Same signature needed for overriding, covariant return works -> "
                + trainer.provideMaterial().getMaterialType()
                + " | parent final method cannot be overridden -> " + trainer.attendancePolicy()
                + " | child overriding method can be final -> " + trainer.trainingMode()
                + " | visibility can widen -> " + trainer.accessWindow()
                + " | static methods are hidden, not overridden -> parent ref calls " + parentReference.category()
                + ", child ref calls " + JavaTrainer.category()
                + " | var-arg overriding works -> " + trainer.revisionPlan("super", "this")
                + " | variables are hidden, not overridden -> " + trainer.showSuperFieldUsage();
    }

    public String explainCyclicInheritance() {
        return "Cyclic inheritance is not possible in Java because a class cannot directly or indirectly extend itself; the compiler rejects it.";
    }

    public String explainEdgeCases() {
        return "Edge cases: constructors chain but are not inherited, a static method with same signature causes method hiding, field names in parent and child cause field hiding, and overloading is decided at compile time while overriding is decided at runtime.";
    }

    public String explainTightCouplingAndUsage() {
        return "Inheritance can create tight coupling because child depends strongly on parent structure and behavior. Use inheritance only for a true is-a relationship with stable shared behavior; prefer composition when reuse is needed without strong dependency.";
    }
}
