# Core Java Package 4 Notes

- Goal: understand constructors, constructor overloading, `this` keyword usage, static blocks, instance initialization blocks, and execution flow.

## Constructors In Java

- A constructor is a special member used to initialize an object.
- Constructor name must be the same as the class name.
- A constructor does not have a return type, not even `void`.
- A constructor runs automatically when an object is created with `new`.
- Example:

```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
```

- `Student("Harshu")` calls the constructor and initializes the object.

## Constructor Overloading

- Constructor overloading means one class has multiple constructors with different parameter lists.
- It helps create objects in different ways.
- Example from `src/core_java_4/Main.java`:
  - `Main()`
  - `Main(String learnerName)`
  - `Main(String learnerName, int practiceHours)`
- This allows:
  - default object creation
  - partially initialized object creation
  - fully customized object creation

## `this` Keyword In Java

- `this` refers to the current object.
- Common usages:
  - `this()` calls another constructor in the same class
  - `this.variable` refers to the current object's field
  - `this.method()` calls another method of the current object
- Example:

```java
public Main() {
    this("Default Learner", 0);
}

public void updateLearner(String learnerName, int practiceHours) {
    this.learnerName = learnerName;
    this.practiceHours = practiceHours;
}
```

- `this()` must be the first statement inside a constructor.

## Static Block

- A static block runs only once when the class is loaded.
- It is used to initialize static data.
- Example:

```java
static {
    courseName = "Core Java Package 4";
    objectCounter = 0;
}
```

- This executes before object creation begins.

## Instance Initialization Block

- An instance initialization block runs every time an object is created.
- It runs before the constructor body.
- It is useful when some common setup should happen for every constructor.
- Example:

```java
{
    objectCounter++;
}
```

## Execution Flow Order

- The order is:
  - static block
  - instance initialization block
  - constructor
- Important detail:
  - static block runs once when the class loads
  - instance block runs for every object creation
  - constructor runs after the instance block for that object

## Flow Example

- When `new Main("Harshu", 5)` runs:
  - class loads if not already loaded
  - static block runs once
  - instance initialization block runs
  - selected constructor runs
- When another object is created:
  - static block does not run again
  - instance initialization block runs again
  - constructor runs again

## Key Interview Points

- Constructors initialize objects, methods perform actions.
- Constructors can be overloaded.
- Constructors cannot have a return type.
- `this()` is used for constructor chaining inside the same class.
- `this.variable` avoids confusion between local and instance variables.
- Static block is class-level initialization.
- Instance block is object-level pre-constructor initialization.
- Static block executes before instance block and constructor.
