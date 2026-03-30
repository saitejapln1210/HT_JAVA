# Core Java Package 6 Notes

- Goal: understand interfaces, default methods, interface rules, multiple inheritance through interfaces, marker interfaces, and functional interfaces.

## Interfaces In Java

- An interface defines a contract.
- It tells what behavior a class must provide.
- It does not focus on object state like a normal class.
- Example:

```java
public interface LearningContract {
    String learnTopic();
}
```

- Any class implementing `LearningContract` must provide `learnTopic()`.

## Default Methods In Interface

- Default methods were introduced so interfaces can add behavior without breaking old implementing classes.
- They are written using the `default` keyword.
- Here `default` is not a default/package-private access modifier.
- In interfaces, `default` means a method has implementation inside the interface.
- A default method in an interface is still `public`.
- Example from `src/core_java_6/ProgressReport.java`:

```java
default String progressStatus() {
    return "Default progress status: learner is making steady progress.";
}
```

- Why useful:
  - backward compatibility
  - shared reusable behavior
  - less duplicate code in implementing classes
- Default methods belong to implementing objects, so they can be overridden by implementing classes if custom behavior is needed.

## Private Methods In Interface

- Private methods in interfaces are supported from Java 9.
- They are useful for internal helper logic shared by multiple `default` or `static` methods inside the same interface.
- They are not visible to implementing classes.
- Example from `src/core_java_6/ProgressReport.java`:

```java
private String buildMessage(String status) {
    return "Default progress status: " + status;
}
```

- Here the private method avoids duplication inside the interface itself.
- Implementing classes cannot call or override private interface methods.

## Why Do We Need Both Default And Static Methods In Interfaces?

- Both solve different problems.
- Default methods are useful when interface wants to provide inherited behavior to implementing classes.
- Static methods are useful when some helper or utility logic belongs to the interface concept itself, not to a specific implementing object.
- Simple idea:
  - default method -> object-level reusable behavior
  - static method -> interface-level utility behavior
- Example in this package:
  - `progressStatus()` in `src/core_java_6/ProgressReport.java` is a default method
  - `reportType()` in `src/core_java_6/ProgressReport.java` is a static method

## Can We Override Default And Static Methods In Implementing Classes?

- Default methods:
  - yes, implementing classes can override them
  - example: `src/core_java_6/JavaStudent.java` overrides `progressStatus()`
- Static interface methods:
  - no, they are not overridden by implementing classes
  - they belong to the interface itself
  - they are called using interface name like `ProgressReport.reportType()`
- Important distinction:
  - default methods participate in inheritance
  - static methods do not participate in overriding

## Access Modifiers In Interface

- Interface type itself can be:
  - `public`
  - default/package-private
- Interface fields are always:
  - `public static final`
- Abstract interface methods are always:
  - `public abstract`
- Interface can also contain:
  - `default` methods
  - `static` methods
- `private` methods in newer Java versions for internal reuse
- private interface methods are available from Java 9 onward

## Can We Have Static Methods And Final Methods In Interface?

- Yes, interfaces can have `static` methods.
- Example from `src/core_java_6/ProgressReport.java`:

```java
static String reportType() {
    return "Static interface method";
}
```

- Interface variables are implicitly `public static final`.
- Interface methods are not declared `final` for implementation contracts.
- A `default` method can behave like inherited reusable logic, but the implementing class can override it.
- A static interface method cannot be overridden by the implementing class because it belongs to the interface, not to the object.

## Can We Have Constructor In Interface?

- No, interfaces cannot have constructors.
- Reason:
  - constructors initialize object state
  - interfaces do not create objects
  - interfaces only define behavior contracts

## Rules Of Interfaces In Java

- An interface cannot be instantiated directly.
- A class uses `implements` to implement an interface.
- A class can implement multiple interfaces.
- If a class does not implement all interface abstract methods, it must be declared `abstract`.
- Interface variables are constants.
- Interfaces support abstraction through behavior contracts.

## Can We Implement Multiple Interfaces?

- Yes, one class can implement multiple interfaces.
- Example from `src/core_java_6/MultiSkillLearner.java`:
  - implements `LearningContract`
  - implements `PracticeContract`
- This gives multiple behavior contracts to the same class.

## Difference Between Abstraction And Interface

- Abstract class:
  - used when shared state or base implementation is needed
  - can have constructors and instance fields
- Interface:
  - used when only behavior contract is needed
  - supports multiple inheritance of type
- Decision rule:
  - choose abstract class when classes share base data/logic
  - choose interface when unrelated classes should follow the same contract

## Marker Interface

- A marker interface has no methods.
- It only marks a class with metadata or capability.
- Example from `src/core_java_6/RapidRevisionMarker.java`.
- `RapidRevisionNotes` implements it to indicate quick-review capability.

## Functional Interface

- A functional interface has exactly one abstract method.
- Example from `src/core_java_6/ScoreCalculator.java`.
- It is called functional because one operation/contract is exposed.
- In this package, it is used with an anonymous class example instead of going deep into later Java features.

## Edge Case Scenarios In Interfaces

- Interface variables are constants; they cannot be changed by implementing classes.
- If two interfaces provide the same default method, the implementing class must resolve the conflict.
- A class can extend one class but still implement multiple interfaces.
- Interfaces do not support constructors.
- Private interface methods are used only for internal reuse and are available from Java 9.
- Interfaces are best for capabilities/contracts, not shared mutable state.

## Diamond Problem In Interfaces

- Diamond problem in interfaces happens when one class implements two interfaces that provide the same default method.
- Java does not guess automatically which default method to use.
- The implementing class must override the method and resolve the conflict explicitly.
- Example from `src/core_java_6/DiamondProblemResolver.java`:

```java
public class DiamondProblemResolver implements TheorySession, LabSession {
    @Override
    public String sessionPlan() {
        return TheorySession.super.sessionPlan() + " + " + LabSession.super.sessionPlan();
    }
}
```

- This is how Java resolves the diamond problem for interface default methods.
- The class chooses the final behavior by overriding the conflicting method.

## Key Interview Points

- Interface means contract.
- Default methods help extend interfaces safely.
- Default methods can be overridden, static interface methods cannot.
- Interface fields are always `public static final`.
- Interfaces can have static methods.
- Private interface methods are available from Java 9.
- Interfaces cannot have constructors.
- One class can implement multiple interfaces.
- Diamond problem with default methods is resolved by overriding the method in the implementing class.
- Marker interface has no methods.
- Functional interface has exactly one abstract method.
