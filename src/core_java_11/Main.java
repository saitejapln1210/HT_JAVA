package core_java_11;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class Main {
    public String explainGenericsFundamentals() {
        return "Generics provide compile-time type safety, reduce explicit casting, improve reusable API design through type parameters, and use type erasure at runtime. Diamond operator (<>) enables cleaner type inference during object creation.";
    }

    public String demonstrateRawTypeVsGeneric() {
        List rawList = new ArrayList();
        rawList.add("Java");
        rawList.add(99);

        String unsafeResult;
        try {
            String level = (String) rawList.get(1);
            unsafeResult = "raw type read=" + level;
        } catch (ClassCastException exception) {
            unsafeResult = "raw type has no compile-time check and can fail at runtime with ClassCastException";
        }

        List<String> safeList = new ArrayList<>();
        safeList.add("Java");

        return unsafeResult + ", while List<String> prevents mixed-type insertion at compile time.";
    }

    public String demonstrateGenericClassAndConstructor() {
        Box<String> stringBox = new Box<>("Generics", 1);
        Pair<String, Integer> pair = new Pair<>("Attempts", 3);

        return "Generic class: Box<T> stores type-safe value -> " + stringBox.getValue()
                + "; Multiple parameters: Pair<K,V> -> (" + pair.key + ", " + pair.value + ")"
                + "; Generic constructor inferred metadata type from integer argument.";
    }

    public String demonstrateGenericMethodsAndTypeParameters() {
        Integer maxScore = maxOf(87, 91);
        String chosen = pickFirst("core", "java");
        Double total = sumAsDouble(10, 25.5);

        return "Generic method maxOf<T extends Comparable<T>> -> " + maxScore
                + ", static pickFirst<T> -> " + chosen
                + ", method-level type parameter independent of class generics -> total=" + total;
    }

    public String demonstrateBoundedGenericsAndMultipleBounds() {
        List<Integer> marks = Arrays.asList(90, 75, 99);
        double average = averageOfNumbers(marks);

        LabAssessment first = new LabAssessment("A-1", 8);
        LabAssessment second = new LabAssessment("B-2", 6);
        LabAssessment better = maxLab(first, second);

        return "Upper bound (<T extends Number>) average=" + average
                + "; Multiple bounds (<T extends Assessable & Reportable & Comparable<T>>) best code="
                + better.code + " with level=" + better.level;
    }

    public String demonstrateWildcardsAndPecs() {
        List<Integer> integerScores = Arrays.asList(72, 86, 91);
        List<? extends Number> producer = integerScores;
        Number top = producer.get(2);

        List<Number> numberBucket = new ArrayList<>();
        fillWithIntegers(numberBucket);

        List<? super Integer> consumer = new ArrayList<Number>();
        consumer.add(100);
        Object consumed = consumer.get(0);

        return "Unbounded wildcard List<?> is read-only for adds (except null); "
                + "Upper bounded <? extends Number> safely reads -> " + top
                + "; Lower bounded <? super Integer> safely writes -> first element type at read time is Object="
                + consumed
                + ". PECS: Producer Extends, Consumer Super.";
    }

    public String demonstrateTypeErasureAndBridgeMethods() {
        StringBuilder bridgeInfo = new StringBuilder();
        Method[] methods = StringRepository.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isBridge()) {
                bridgeInfo.append(method.getName()).append(":bridge ");
            }
        }

        return "Type erasure removes concrete generic parameters at runtime (e.g., List<String> and List<Integer> both become List). "
                + "Compiler adds bridge methods to preserve polymorphism after erasure. Reflection in StringRepository found -> "
                + (bridgeInfo.length() == 0 ? "none visible" : bridgeInfo.toString().trim()) + ".";
    }

    public String explainGenericRestrictions() {
        return "Restrictions: primitives are not allowed as type arguments (use wrappers), cannot do new T(), cannot use class-level type parameter in static context, cannot create generic exception classes/catch by type parameter, generic arrays are disallowed directly, and instanceof with parameterized type is not allowed (use raw/ wildcard form).";
    }

    public String demonstrateArrayCovarianceGenericInvarianceAndHeapPollution() {
        String arrayResult;
        try {
            Object[] values = new String[2];
            values[0] = "java";
            values[1] = 10;
            arrayResult = "unexpected array success";
        } catch (ArrayStoreException exception) {
            arrayResult = "array covariance allows Object[] ref to String[] and may fail at runtime";
        }

        String heapPollution = demonstrateHeapPollution();

        List<Integer> ints = Arrays.asList(1, 2, 3);
        List<? extends Number> numbers = ints;

        return arrayResult
                + "; Generics are invariant so List<Integer> is not List<Number> (use wildcard like List<? extends Number>)"
                + "; reading from wildcard first element=" + numbers.get(0)
                + "; heap pollution demo -> " + heapPollution;
    }

    public String demonstrateGenericInterfaceUsage() {
        Repository<String> fixedTypeRepo = new StringRepository();
        fixedTypeRepo.save("core-java");

        Repository<Integer> integerRepo = new MemoryRepository<>();
        integerRepo.save(11);

        return "Generic interface Repository<T> can be implemented with fixed type (StringRepository) or remain generic (MemoryRepository<T>). latest string="
                + fixedTypeRepo.findLatest() + ", latest integer=" + integerRepo.findLatest();
    }

    public String demonstrateTypeInference() {
        List<String> topics = new ArrayList<>();
        topics.add("wildcards");
        topics.add("erasure");

        String merged = join(topics, " | ");
        Box<Integer> inferredBox = new Box<>(99, "inference");

        return "Diamond operator inferred Box<Integer>; generic method inference resolved join(List<String>, String) -> " + merged
                + ". Java 8 improved inference especially around lambdas/method references.";
    }

    public String demonstrateGenericPatterns() {
        CourseSummary summary = GenericFactory.create(() -> new CourseSummary("Generics", 4));

        SingletonRegistry registry = new SingletonRegistry();
        CourseSummary one = registry.getOrCreate(CourseSummary.class, () -> new CourseSummary("Generics", 4));
        CourseSummary two = registry.getOrCreate(CourseSummary.class, () -> new CourseSummary("Other", 6));

        List<String> words = new ArrayList<>(Arrays.asList("core", "java", "generics"));
        GenericHelpers.swap(words, 0, 2);

        return "Patterns: generic factory created topic=" + summary.name
                + "; singleton registry reused same instance=" + (one == two)
                + "; helper utility swap result=" + words;
    }

    public String demonstrateCollectionsWithComparableAndComparator() {
        List<Learner> learners = new ArrayList<>();
        learners.add(new Learner("Ravi", 87));
        learners.add(new Learner("Anu", 91));
        learners.add(new Learner("Kiran", 83));

        Collections.sort(learners);
        Learner naturalTop = learners.get(0);

        learners.sort(Comparator.comparingInt(Learner::getScore).thenComparing(Learner::getName));
        Learner customTop = learners.get(learners.size() - 1);

        Map<String, Integer> progress = new HashMap<>();
        progress.put("module-1", 100);
        progress.put("module-2", 90);

        return "Collections generics: List<Learner>, Map<String,Integer>; Comparable gives natural order top="
                + naturalTop.getName()
                + "; Comparator custom score order top=" + customTop.getName()
                + "; map keys=" + progress.keySet();
    }

    private static <T extends Comparable<T>> T maxOf(T first, T second) {
        return first.compareTo(second) >= 0 ? first : second;
    }

    public static <T> T pickFirst(T first, T second) {
        return first != null ? first : second;
    }

    private static <A extends Number, B extends Number> double sumAsDouble(A first, B second) {
        return first.doubleValue() + second.doubleValue();
    }

    private static <T extends Number> double averageOfNumbers(List<T> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum / numbers.size();
    }

    private static <T extends Assessable & Reportable & Comparable<T>> T maxLab(T first, T second) {
        return first.compareTo(second) >= 0 ? first : second;
    }

    private static void fillWithIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    private static <T> String join(List<T> values, String delimiter) {
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < values.size(); index++) {
            if (index > 0) {
                builder.append(delimiter);
            }
            builder.append(values.get(index));
        }
        return builder.toString();
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private static String demonstrateHeapPollution() {
        List<String>[] textLists = (List<String>[]) new List<?>[1];
        Object[] objectArray = textLists;
        objectArray[0] = Arrays.asList(1, 2, 3);
        try {
            String value = textLists[0].get(0);
            return "unexpected value=" + value;
        } catch (ClassCastException exception) {
            return "mixing arrays and generics can cause heap pollution and ClassCastException";
        }
    }

    static final class Box<T> {
        private final T value;
        private final String source;

        <U> Box(T value, U sourceMeta) {
            this.value = value;
            this.source = String.valueOf(sourceMeta);
        }

        T getValue() {
            return value;
        }

        String getSource() {
            return source;
        }
    }

    static final class Pair<K, V> {
        private final K key;
        private final V value;

        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    abstract static class Assessable {
        protected final String code;

        protected Assessable(String code) {
            this.code = code;
        }
    }

    interface Reportable {
        String report();
    }

    static final class LabAssessment extends Assessable implements Reportable, Comparable<LabAssessment> {
        private final int level;

        LabAssessment(String code, int level) {
            super(code);
            this.level = level;
        }

        @Override
        public String report() {
            return code + " -> " + level;
        }

        @Override
        public int compareTo(LabAssessment other) {
            return Integer.compare(this.level, other.level);
        }
    }

    interface Repository<T> {
        void save(T value);

        T findLatest();
    }

    static class MemoryRepository<T> implements Repository<T> {
        private T latest;

        @Override
        public void save(T value) {
            latest = value;
        }

        @Override
        public T findLatest() {
            return latest;
        }
    }

    static class StringRepository extends MemoryRepository<String> {
        @Override
        public String findLatest() {
            String value = super.findLatest();
            return value == null ? "empty" : value;
        }
    }

    static final class GenericFactory {
        private GenericFactory() {
        }

        static <T> T create(Supplier<T> supplier) {
            return supplier.get();
        }
    }

    static final class SingletonRegistry {
        private final Map<Class<?>, Object> instances = new HashMap<>();

        <T> T getOrCreate(Class<T> type, Supplier<T> supplier) {
            Object value = instances.computeIfAbsent(type, key -> supplier.get());
            return type.cast(value);
        }
    }

    static final class GenericHelpers {
        private GenericHelpers() {
        }

        static <T> void swap(List<T> list, int left, int right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
        }
    }

    static final class CourseSummary {
        private final String name;
        private final int modules;

        CourseSummary(String name, int modules) {
            this.name = name;
            this.modules = modules;
        }

        @Override
        public String toString() {
            return name + "(" + modules + ")";
        }
    }

    static final class Learner implements Comparable<Learner> {
        private final String name;
        private final int score;

        Learner(String name, int score) {
            this.name = name;
            this.score = score;
        }

        String getName() {
            return name;
        }

        int getScore() {
            return score;
        }

        @Override
        public int compareTo(Learner other) {
            int scoreCompare = Integer.compare(other.score, this.score);
            if (scoreCompare != 0) {
                return scoreCompare;
            }
            return this.name.compareTo(other.name);
        }
    }
}
