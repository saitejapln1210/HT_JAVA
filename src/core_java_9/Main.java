package core_java_9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {
    public String explainObjectClass() {
        return "Object is the root class in Java. It provides common behavior such as equals, hashCode, toString, and getClass for every non-primitive object.";
    }

    public String explainImplicitInheritance() {
        return "Yes, every class implicitly extends Object if no explicit parent is specified. This is why all objects can call methods like toString() and getClass().";
    }

    public String explainObjectClassMethods() {
        return "Common Object methods: getClass(), equals(Object), hashCode(), toString(), clone(), notify(), notifyAll(), wait(), wait(long), wait(long, int), and deprecated finalize().";
    }

    public String explainEqualsAndHashCodeInternals() {
        return "Default equals() in Object checks reference identity (==). Default hashCode() usually represents object identity. When logical equality is needed, override both equals() and hashCode() together.";
    }

    public String explainEqualsContract() {
        return "equals contract: reflexive, symmetric, transitive, consistent, and x.equals(null) must be false.";
    }

    public String explainHashCodeContract() {
        return "hashCode contract: if two objects are equal by equals(), they must return the same hash code. Unequal objects may still share a hash code (collision is allowed).";
    }

    public String demonstrateReferenceVsLogicalEquality() {
        Learner first = new Learner(101, "Harshu");
        Learner second = new Learner(101, "Harshu");
        Learner sameReference = first;

        return "first == second -> " + (first == second) // false diff address
                + ", first.equals(second) -> " + first.equals(second) // true
                + ", first == sameReference -> " + (first == sameReference);// true
    }

    public String demonstrateHashSetWithProperContract() {
        Set<Learner> learners = new HashSet<>();
        learners.add(new Learner(101, "Harshu"));
        learners.add(new Learner(101, "Harshu"));

        return "HashSet size with proper equals/hashCode override -> " + learners.size()
                + " (duplicate logical object removed).";
    }

    public String demonstrateHashSetWithBrokenContract() {
        Set<BrokenLearner> learners = new HashSet<>();
        BrokenLearner b1 = new BrokenLearner(101,"Harshu");
        BrokenLearner b2 = new BrokenLearner(101,"Harshu");
        learners.add(b1);
        learners.add(b2);
        System.out.println(b1.hashCode());// 1587487668
        System.out.println(b2.hashCode());// 1199823423
        System.out.println(b1.equals(b2));// true


        return "HashSet size when equals() is overridden but hashCode() is not -> " + learners.size()
                + " (contract broken, duplicates may appear).";
    }

    public String demonstrateDatatypeEqualityScenarios() {
        String textA = new String("java");
        String textB = new String("java");

        Integer x = 200;
        Integer y = 200;

        int[] numbersA = {1, 2, 3};
        int[] numbersB = {1, 2, 3};

        Double negativeZero = -0.0;
        Double positiveZero = 0.0;

        StringBuilder result = new StringBuilder();
        result.append("String: == ").append(textA == textB)
                .append(", equals ").append(textA.equals(textB));
        result.append(" | Integer: == ").append(x == y)
                .append(", equals ").append(x.equals(y));
        result.append(" | Array: == ").append(numbersA == numbersB)
                .append(", Arrays.equals ").append(Arrays.equals(numbersA, numbersB));
        result.append(" | Double -0.0 equals 0.0 -> ").append(negativeZero.equals(positiveZero));

        return result.toString();
    }

    public String explainInterviewScenarios() {
        return "Interview focus: override both equals and hashCode, prefer == for primitives and enum constants, use Objects.equals for null safety, and remember arrays need Arrays.equals for content comparison.";
    }

    static class Learner {
        private final int learnerId;
        private final String learnerName;

        Learner(int learnerId, String learnerName) {
            this.learnerId = learnerId;
            this.learnerName = learnerName;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object == null || getClass() != object.getClass()) {
                return false;
            }
            Learner learner = (Learner) object;
            return learnerId == learner.learnerId && Objects.equals(learnerName, learner.learnerName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(learnerId, learnerName);
        }

        @Override
        public String toString() {
            return "Learner{id=" + learnerId + ", name='" + learnerName + "'}";
        }
    }

    static class BrokenLearner {
        private final int learnerId;
        private final String learnerName;

        BrokenLearner(int learnerId, String learnerName) {
            this.learnerId = learnerId;
            this.learnerName = learnerName;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object == null || getClass() != object.getClass()) {
                return false;
            }
            BrokenLearner learner = (BrokenLearner) object;
            return learnerId == learner.learnerId && Objects.equals(learnerName, learner.learnerName);
        }
    }
}
