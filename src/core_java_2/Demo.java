package core_java_2;

public class Demo {
    public static void main(String[] args) {
        Main guide = new Main();

        explainMethodSignature(guide);
        explainRule1(guide);
        explainRule2(guide);
        explainRule3(guide);
        explainRule4(guide);
        explainParameterPassing(guide);
    }

    private static void explainMethodSignature(Main guide) {
        System.out.println("=== Method Signature And Overloading ===");
        System.out.println("Method signature = method name + parameter list.");
        System.out.println("Return type is not part of the method signature.");
        System.out.println(guide.methodSignatureExample(2, 3));
        System.out.println(guide.methodSignatureExample(2, 3, 4));
        System.out.println();
    }

    private static void explainRule1(Main guide) {
        System.out.println("=== Rule 1: Operator Promotion ===");
        byte byteValue = 7;
        System.out.println("byte value passed to long overload -> " + guide.rule1Promotion(byteValue));
        System.out.println();
    }

    private static void explainRule2(Main guide) {
        System.out.println("=== Rule 2: Exact Match And Child Priority ===");
        String text = "Java";
        Object objectText = text;

        System.out.println("Exact match with String reference -> " + guide.rule2ExactMatch(text));
        System.out.println("Object reference chooses Object overload -> " + guide.rule2ExactMatch(objectText));
        System.out.println("null with Object,String overload set -> " + guide.rule2ChildPriority(null, null));
        System.out.println();
    }

    private static void explainRule3(Main guide) {
        System.out.println("=== Rule 3: Var-Args Has Lowest Priority ===");
        System.out.println(guide.rule3VarArgs(10));
        System.out.println(guide.rule3VarArgs(10, 20, 30));
        System.out.println();
    }

    private static void explainRule4(Main guide) {
        System.out.println("=== Rule 4: Parent Reference Controls Overloading ===");
        Main.Animal pet = new Main.Dog();
        Main.Dog dog = new Main.Dog();

        System.out.println("Runtime object identity -> " + pet.identity());
        System.out.println("Animal reference result -> " + guide.rule4Reference(pet));
        System.out.println("Dog reference result -> " + guide.rule4Reference(dog));
        System.out.println();
    }

    private static void explainParameterPassing(Main guide) {
        System.out.println("=== Java Pass By Value And Reference Behavior ===");
        int marks = 50;
        Main.ScoreCard scoreCard = new Main.ScoreCard(50);

        System.out.println("Before primitive method call -> " + marks);
        System.out.println(guide.changePrimitiveValue(marks));
        System.out.println("After primitive method call -> " + marks);

        System.out.println("Before object state change -> " + scoreCard.marks);
        System.out.println(guide.changeObjectState(scoreCard));
        System.out.println("After object state change -> " + scoreCard.marks);

        System.out.println("Before object reference reassignment -> " + scoreCard.marks);
        System.out.println(guide.reassignObjectReference(scoreCard));
        System.out.println("After object reference reassignment -> " + scoreCard.marks);
    }
}
