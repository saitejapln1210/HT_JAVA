# Core Java Package 5 Notes

- Goal: understand data hiding, encapsulation, and abstraction with interview-focused examples.

## Data Hiding In Java

- Data hiding means restricting direct access to internal data of a class.
- It protects object state from uncontrolled modification.
- In Java, data hiding is mainly achieved using `private` fields.
- Outside code cannot directly access private data.
- Access is usually provided through controlled methods.

## What Java Provides For Data Hiding

- Java provides data hiding using:
  - access modifiers
  - private instance variables
  - public or protected methods for controlled access
  - validation logic inside methods
- Most common approach:

```java
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

- `balance` is hidden.
- `deposit()` controls how the value changes.

## Encapsulation

- Encapsulation means wrapping data and methods together into one unit.
- In Java, that unit is usually a class.
- Encapsulation often uses data hiding, but both are not exactly the same.
- Data hiding focuses on restricted access.
- Encapsulation focuses on bundling state and behavior together.

## Encapsulation Example

```java
class StudentProfile {
    private String learnerName;
    private int practiceHours;

    public void setPracticeHours(int practiceHours) {
        if (practiceHours >= 0) {
            this.practiceHours = practiceHours;
        }
    }
}
```

- Data is private.
- Methods control updates.
- Validation protects object consistency.

## Interview View Of Encapsulation

- Interview-friendly definition:
  - encapsulation is the process of combining data and methods into one class and controlling access to that data.
- Why it matters:
  - improves security
  - improves maintainability
  - allows validation
  - reduces accidental misuse
- Important point:
  - getters and setters alone do not automatically mean good encapsulation
  - the methods should protect valid object state

## Abstraction

- Abstraction means exposing only essential behavior and hiding implementation details.
- It answers: what should be done, not how exactly it is done.
- In Java, abstraction is achieved using:
  - abstract classes
  - interfaces

## Abstraction Example

```java
abstract class PaymentService {
    public abstract String processPayment(double amount);
}
```

- Caller knows that payment can be processed.
- Caller does not need to know internal gateway steps.

## Interview View Of Abstraction

- Interview-friendly definition:
  - abstraction hides implementation complexity and shows only relevant operations to the user.
- Why it matters:
  - reduces complexity
  - supports loose coupling
  - makes code easier to extend
  - helps switch implementations without changing the caller logic
- Example idea:
  - `PaymentService` reference can point to `UpiPaymentService` or `CardPaymentService`
  - caller code remains the same

## Encapsulation Vs Abstraction

- Encapsulation:
  - bundles data and methods together
  - focuses on internal state protection
- Abstraction:
  - hides implementation details
  - focuses on essential behavior
- Simple memory trick:
  - encapsulation = how data is protected
  - abstraction = how complexity is hidden

## Key Interview Points

- Data hiding is mainly achieved through `private` members.
- Encapsulation uses classes to combine data and behavior.
- Abstraction hides implementation and shows only contract-level behavior.
- Encapsulation and abstraction often work together in real projects.
- Good encapsulation includes validation, not just getters and setters.
