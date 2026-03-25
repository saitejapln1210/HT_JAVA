# Core Java Package 1 Notes

- Goal: build a strong base around Java runtime, classes, data types, access modifiers, and `static`/instance/`final` members.

## JVM, JRE, JDK

- `JDK` (Java Development Kit) is used to develop Java applications.
- `JRE` (Java Runtime Environment) is used to run Java applications.
- `JVM` (Java Virtual Machine) is the engine that executes bytecode.
- Flow: Developer writes `.java` code, JDK compiles it into `.class` bytecode, JRE provides runtime support, and JVM executes the bytecode.

- Simple understanding:
  - `javac` comes from JDK.
  - runtime libraries come from JRE.
  - execution happens inside JVM.

## What Is A Class?

- A class is a blueprint used to create objects.
- A class contains:
  - fields for state
  - methods for behavior
  - constructors for initialization
- Example:

```java
public class Student {
    String name;

    void study() {
        System.out.println(name + " is studying");
    }
}
```

- `Student` is the class.
- `name` is state.
- `study()` is behavior.

## Top-Level Class Keywords

- Valid access modifiers for a top-level class:
  - `public`
  - default/package-private (no modifier)
- Other keywords allowed with top-level classes:
  - `abstract`
  - `final`
  - `strictfp`
- Not allowed for top-level classes:
  - `private`
  - `protected`
  - `static`

## Data Types In Java

- Primitive data types:
  - `byte` - 8 bit integer
  - `short` - 16 bit integer
  - `int` - 32 bit integer
  - `long` - 64 bit integer
  - `float` - single precision decimal
  - `double` - double precision decimal
  - `char` - single Unicode character
  - `boolean` - `true` or `false`
- Reference type example:
- `String name = "Harshu";`

## Operator Precedence And Associativity

- Precedence decides which operator runs first.
- Associativity decides direction when operators have the same precedence.
- Examples:

```java
int a = 10 + 4 * 2;      // 18
int b = (10 + 4) * 2;    // 28
int c = 20 - 5 - 3;      // 12
```

- `*` has higher precedence than `+`.
- Parentheses override default precedence.
- `-` is left associative.

## Access Modifiers

- Top-level classes:
  - `public`
  - default/package-private
- Fields and methods:
  - `private`
  - default/package-private
  - `protected`
  - `public`

## static, Non-Static, final

- `static` member belongs to the class.
- non-static member belongs to the object.
- `final` field cannot be reassigned after initialization.
- `final` method cannot be overridden.
- Example from `src/core_java_1/Main.java`:
  - `COURSE_NAME` is `static final`.
  - `batchStrength` is `static`.
  - `learnerName` and `practiceHours` are instance fields.
  - `learnerSummary()` is a `final` method.

## End-To-End Example Flow

- Create a `Main` object.
- Use instance methods like `addPracticeHours()` and `markRevisionComplete()` to change object state.
- Use the `final` method `learnerSummary()` for a stable behavior contract.
- Use the static method `updateBatchStrength()` to change class-level data shared by all objects.
