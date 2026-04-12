package core_java_10;

import java.util.Arrays;

public class Main {
    public String explainWrapperClassBasics() {
        return "Wrapper classes are object representations of primitives (byte, short, int, long, float, double, char, boolean). They are needed when objects are required, such as collections and generics.";
    }

    public String explainBoxingAndUnboxing() {
        int primitive = 25;
        Integer boxed = primitive;      // autoboxing
        int unboxed = boxed;            // unboxing

        return "primitive=" + primitive
                + ", boxed(Integer)=" + boxed
                + ", unboxed back to int=" + unboxed;
    }

    public String explainWrapperUtilities() {
        Integer parsed = Integer.parseInt("120");
        Integer valueOfResult = Integer.valueOf("120");
        int comparison = Integer.compare(40, 25);
        boolean boolValue = Boolean.parseBoolean("true");

        return "parseInt -> " + parsed
                + ", valueOf -> " + valueOfResult
                + ", Integer.compare(40,25) -> " + comparison
                + ", Boolean.parseBoolean('true') -> " + boolValue;
    }

    public String explainStringCreation() {
        String literal = "java";
        String literalSame = "java";
        String fromNew = new String("java");

        return "literal == literalSame -> " + (literal == literalSame)
                + ", literal == new String('java') -> " + (literal == fromNew)
                + ", literal.equals(new String('java')) -> " + literal.equals(fromNew);
    }

    public String explainStringMethods() {
        String course = "  core java wrappers and strings  ";

        String trimmed = course.trim();
        String upper = trimmed.toUpperCase();
        boolean contains = trimmed.contains("wrappers");
        int index = trimmed.indexOf("java");
        String replaced = trimmed.replace("wrappers", "wrapper classes");
        String[] words = trimmed.split(" ");

        return "trim -> '" + trimmed
                + "', upper -> '" + upper
                + "', contains('wrappers') -> " + contains
                + ", indexOf('java') -> " + index
                + ", replace -> '" + replaced
                + "', split length -> " + words.length
                + ", words -> " + Arrays.toString(words);
    }

    public String explainStringImmutability() {
        String text = "Core";
        String updated = text.concat(" Java");

        return "original='" + text
                + "', after concat result='" + updated
                + "'. Original remains unchanged because String is immutable.";
    }

    public String explainMutableAlternative() {
        StringBuilder builder = new StringBuilder("Core");
        builder.append(" Java");

        return "StringBuilder after append -> '" + builder
                + "' (same object is mutated, unlike String).";
    }

    public String explainStringPoolScenario() {
        String a = "interview";
        String b = "interview";
        String c = new String("interview");
        String d = c.intern();

        return "a==b -> " + (a == b)
                + ", a==c -> " + (a == c)
                + ", a==c.intern() -> " + (a == d)
                + " (intern() returns pooled reference).";
    }

    public String explainCompileTimeConcatenationPooling() {
        String first = "core" + "java";
        String second = "corejava";

        String part = "core";
        String runtime = part + "java";

        return "'core'+'java' == 'corejava' -> " + (first == second)
                + " (compile-time constant folded into pool), runtime concat == pooled literal -> "
                + (runtime == second)
                + " (false, runtime creates new object unless interned).";
    }

    public String explainStringBuilderVsStringBuffer() {
        StringBuilder builder = new StringBuilder("Java");
        builder.append(" Builder");

        StringBuffer buffer = new StringBuffer("Java");
        buffer.append(" Buffer");

        return "StringBuilder result='" + builder
                + "', StringBuffer result='" + buffer
                + "'. Both are mutable; StringBuffer methods are synchronized (thread-safe, slower), "
                + "StringBuilder is not synchronized (faster in single-threaded usage).";
    }

    public String explainWrapperEdgeCases() {
        Integer i1 = 127;
        Integer i2 = 127;
        Integer i3 = 128;
        Integer i4 = 128;

        return "Integer cache demo: 127==127 -> " + (i1 == i2)
                + ", 128==128 -> " + (i3 == i4)
                + ". Use equals() for value comparison on wrappers.";
    }
}
