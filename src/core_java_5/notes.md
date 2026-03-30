# Core Java Package 5 Notes

- Goal: understand data hiding, encapsulation, and abstraction in detail with practical and interview-focused examples.

## Data Hiding In Java

- Data hiding means restricting direct access to internal object data.
- It protects object state from invalid or uncontrolled changes.
- In Java, data hiding is mostly achieved using `private` fields.
- Outside classes cannot directly touch those private members.
- Instead, access is provided through carefully designed methods.

## How Data Hiding Is Used In Java

- A class hides its sensitive data.
- The class exposes only the operations that are safe.
- Example from `src/core_java_5/BankAccount.java`:

```java
public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

- `balance` cannot be modified directly from outside.
- `deposit()` controls how balance changes.
- `withdraw()` can also enforce rules like "do not go below zero".

## What Java Provides For Data Hiding

- Java provides several tools for data hiding:
  - `private` members for strongest field hiding
  - access modifiers such as `private`, default, `protected`, and `public`
  - getters and setters
  - validation logic in methods
  - immutable patterns using `final` fields where needed
- Important point:
  - access modifiers control visibility
  - good API methods control validity

## Encapsulation

- Encapsulation means binding data and related behavior into one class.
- It often uses data hiding, but it is broader than just making fields private.
- Encapsulation answers:
  - where should this data live?
  - which methods should control this data?
  - what rules keep this object valid?

## Encapsulation Example

- Example from `src/core_java_5/StudentProfile.java`:
  - private fields store learner details
  - public methods like `addPracticeHours()` and `changeTrack()` control updates
  - invalid values are ignored
- This is stronger than exposing fields directly.

## Encapsulation Edge Scenarios

- A class is not well encapsulated if it has public fields.
- A class is not strongly encapsulated if setters accept every invalid value.
- Getters and setters alone do not guarantee good encapsulation.
- If a class provides public getters and setters for every field without restrictions, the fields are private but the state is still weakly protected.
- So private fields give direct data hiding, but meaningful encapsulation happens only when methods control how data changes.
- Good encapsulation should:
  - protect invariants
  - validate data
  - expose meaningful operations
- Example:
  - `addPracticeHours(3)` is better than `setPracticeHours(anyValue)` when business rules matter.

## If Getters And Setters Exist For All Fields, Is Data Still Hidden?

- Yes, data is still hidden in one sense because outside code cannot directly access the fields.
- No, data is not strongly protected if setters allow any value without validation.
- This is the key distinction:
  - data hiding prevents direct access
  - encapsulation controls indirect access through methods
- Weak design example:

```java
class Student {
    private int marks;

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}
```

- Here `marks` is private, so direct field access is hidden.
- But any caller can still set invalid values like `-100`.
- So syntax-level hiding exists, but business-level protection is weak.

- Better design example:

```java
class Student {
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    public int getMarks() {
        return marks;
    }
}
```

- Now the class controls how data is modified.
- This is stronger encapsulation because valid object state is protected.

- Best practice:
  - do not generate getters and setters for everything blindly
  - expose only meaningful operations like `deposit()`, `withdraw()`, or `addPracticeHours()`

## Interview View Of Encapsulation

- Best interview definition:
  - encapsulation is wrapping data and behavior together in one unit and controlling access to maintain valid object state.
- Keywords to mention:
  - security
  - maintainability
  - validation
  - low coupling
  - object consistency

## Abstraction

- Abstraction means exposing essential behavior while hiding implementation details.
- It focuses on what the object does, not how it internally does it.
- In Java, abstraction is achieved using:
  - abstract classes
  - interfaces

## Abstraction Examples

- `src/core_java_5/PaymentService.java` is an abstract class.
- `src/core_java_5/UpiPaymentService.java` and `src/core_java_5/CardPaymentService.java` provide different implementations.
- `src/core_java_5/NotificationChannel.java` is an interface.
- `src/core_java_5/EmailNotificationService.java` implements that contract.
- `src/core_java_5/LearningModule.java` shows that an abstract class can also have a constructor.

## Why Can Abstraction Have Constructors?

- Abstract classes can have constructors.
- Reason:
  - abstract classes cannot create objects directly
  - but when a child class object is created, parent abstract-class state may still need initialization
- Constructor in an abstract class is useful for:
  - common field initialization
  - shared setup logic
  - constructor chaining for child classes
- Example idea from `src/core_java_5/LearningModule.java`:

```java
public abstract class LearningModule {
    protected final String moduleName;

    public LearningModule(String moduleName) {
        this.moduleName = moduleName;
    }
}
```

- `LearningModule` is abstract, but its constructor still runs when `AbstractionRulesGuide` object is created.
- This is why abstraction can have constructors when abstraction is implemented using abstract classes.
- Interfaces are different because interfaces do not have constructors.

## Abstraction Edge Scenarios

- Caller code should depend on abstraction, not concrete implementation.
- This allows easy replacement of one implementation with another.
- Abstract classes are useful when:
  - common base behavior exists
  - shared state or partially implemented methods are needed
- Interfaces are useful when:
  - only behavior contract is needed
  - unrelated classes can share the same capability

## Rules Of Abstraction In Java

- An abstract class cannot be instantiated directly.
- An abstract class can contain:
  - abstract methods
  - concrete methods
  - constructors
  - fields
  - static methods
  - final methods
- If a class contains at least one abstract method, the class itself must be declared `abstract`.
- A concrete child class must implement all inherited abstract methods.
- If a child class does not implement all inherited abstract methods, that child must also be declared `abstract`.
- Abstract methods cannot be `private`, `final`, or `static` because they must be overridden by subclasses.
- Interfaces provide full abstraction in contract style, while abstract classes provide partial abstraction plus shared implementation.

## Interview View Of Abstraction

- Best interview definition:
  - abstraction hides internal complexity and exposes only the required contract to the caller.
- Keywords to mention:
  - contract
  - loose coupling
  - flexibility
  - extensibility
  - implementation hiding

## Encapsulation Vs Abstraction

- Encapsulation:
  - protects internal state
  - groups data and methods in one class
  - focuses on how data is safely managed
- Abstraction:
  - hides implementation complexity
  - exposes only necessary behavior
  - focuses on what operations are available

## Quick Comparison

- Encapsulation example:
  - `StudentProfile` prevents invalid updates
- Abstraction example:
  - `PaymentService` lets callers process payments without knowing gateway internals
- Data hiding is one tool used inside encapsulation.
- Encapsulation and abstraction often work together in real applications.

## Key Interview Points

- Data hiding is mainly achieved through `private` members.
- Encapsulation is not just getters and setters; it should protect valid state.
- Abstraction reduces complexity by exposing contracts.
- Abstract class and interface both support abstraction, but they are used in different design situations.
- Abstract classes can have constructors because child objects may need common parent initialization.
- Rules of abstraction are a common interview topic, especially abstract-method implementation requirements.
- Real systems usually combine data hiding, encapsulation, and abstraction together.
