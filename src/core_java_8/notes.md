# Core Java Package 8 Notes

- Goal: understand Java exception handling from hierarchy to `try-with-resources`, checked/unchecked rules, and interview-focused scenarios.

## Exception Handling In Java

- Exception handling is used to manage abnormal situations during program execution.
- It helps the program handle recoverable problems gracefully.
- Main keywords:
  - `try`
  - `catch`
  - `finally`
  - `throw`
  - `throws`

## Throwable, Exception, And Error

- `Throwable` is the root class for problems that can be thrown.
- Two main branches:
  - `Exception`
  - `Error`
- `Exception` represents application-level issues that code can often handle.
- `Error` represents serious JVM/system problems that are usually not handled in normal business code.

## Error Vs Exception

- Error examples:
  - `StackOverflowError`
  - `OutOfMemoryError`
  - `VirtualMachineError`
- Exception examples:
  - `IOException`
  - `ClassNotFoundException`
  - `ArithmeticException`
  - `NullPointerException`

## Checked And Unchecked Exceptions

- Checked exceptions are verified at compile time.
- If a checked exception can occur, code must either:
  - handle it with `try-catch`
  - or declare it using `throws`
- Unchecked exceptions are subclasses of `RuntimeException`.
- Compiler does not force explicit handling for unchecked exceptions.

## Checked Hierarchy Examples

- Checked examples:
  - `IOException`
  - `SQLException`
  - `ClassNotFoundException`
- Unchecked examples:
  - `ArithmeticException`
  - `NullPointerException`
  - `IllegalArgumentException`
  - `ArrayIndexOutOfBoundsException`

## try, catch, finally

- `try` contains risky code.
- `catch` handles matching exceptions.
- `finally` runs whether exception occurs or not, mainly for cleanup.
- Valid forms:
  - `try-catch`
  - `try-finally`
  - `try-catch-finally`
- Invalid form:
  - `catch` without `try`

## throw And throws

- `throw` is used inside a method to create/raise an exception explicitly.
- `throws` is used in a method signature to pass checked-exception responsibility to the caller.
- Example from `src/core_java_8/Main.java`:

```java
public void validateMarks(int marks) {
    if (marks < 0) {
        throw new InvalidMarksException("Marks cannot be negative");
    }
}

public void readCourseFile(String fileName) throws InvalidCourseFileException {
    if ("missing-file".equals(fileName)) {
        throw new InvalidCourseFileException("Course file is missing");
    }
}
```

## Can `throws` Be Used With Constructor And Class?

- `throws` can be used with constructors.
- `throws` can be used with methods.
- `throws` cannot be used at class level.
- Reason:
  - constructors and methods contain executable logic
  - class declaration is only a blueprint, not an executable block
- Example from `src/core_java_8/CourseFileReader.java`:

```java
public class CourseFileReader {
    public CourseFileReader(String fileName) throws InvalidCourseFileException {
        if (fileName == null || fileName.isBlank()) {
            throw new InvalidCourseFileException("Constructor cannot create CourseFileReader without a valid file name");
        }
    }
}
```

- This works because constructor may fail while creating the object.
- Invalid class-level idea:

```java
class CourseFileReader throws InvalidCourseFileException {
}
```

- This is invalid because class declaration itself does not execute like a method or constructor.

## Custom Exceptions

- Custom exceptions are exceptions created by the developer for application-specific problems.
- They make business-rule failures easier to understand than using generic exceptions everywhere.
- Two common styles:
  - custom checked exception extends `Exception`
  - custom unchecked exception extends `RuntimeException`
- In this package:
  - `src/core_java_8/CourseEnrollmentException.java` is a custom checked exception
  - `src/core_java_8/InvalidLearnerAgeException.java` is a custom unchecked exception

## Better Custom Exception Example

- Consider course enrollment logic.
- If learner age is invalid, that is a validation rule violation.
- If documents are missing, enrollment should fail with a domain-specific checked exception.
- Example from `src/core_java_8/Main.java`:

```java
public void enrollLearner(String learnerName, int age, boolean documentsSubmitted)
        throws CourseEnrollmentException {
    if (age < 18) {
        throw new InvalidLearnerAgeException("Learner must be at least 18 years old");
    }

    if (!documentsSubmitted) {
        throw new CourseEnrollmentException("Learner cannot enroll without required documents");
    }
}
```

- Why this is a better example:
  - exception names match the business problem
  - checked vs unchecked usage becomes clear
  - caller code can react differently based on exception type
- Interview point:
  - create custom exceptions when built-in exceptions do not clearly express the domain problem

## Partially Checked And Fully Checked Exceptions

- Partially checked type example:
  - `Exception`
  - reason: it is checked, but it has unchecked child `RuntimeException`
- Fully checked type example:
  - `IOException`
  - reason: its normal subclass hierarchy is still checked
- Interview idea:
  - not every type under `Throwable` behaves the same way for compiler checking

## Rules While Writing try-catch-finally

- More specific catch blocks must come before more general catch blocks.
- `catch (Exception e)` should not appear before `catch (IOException e)`.
- `finally` is commonly used for cleanup code.
- Avoid swallowing exceptions silently.
- Do not write unreachable catch blocks.

## Try With Resources

- `try-with-resources` automatically closes resources after use.
- Resource must implement `AutoCloseable`.
- Example from `src/core_java_8/CourseResource.java`:

```java
public class CourseResource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Resource closed");
    }
}
```

- Benefits:
  - cleaner syntax
  - automatic cleanup
  - safer resource management
- Multiple resources are closed in reverse order of creation.

## File Stream Example

- File streams are used to read from or write to files.
- Common classes:
  - `FileInputStream`
  - `FileOutputStream`
- They are commonly used with `try-with-resources` so streams close automatically.
- Example idea from `src/core_java_8/Main.java`:

```java
try (FileOutputStream outputStream = new FileOutputStream(file)) {
    outputStream.write("Harshu learns file streams".getBytes(StandardCharsets.UTF_8));
}

try (FileInputStream inputStream = new FileInputStream(file)) {
    byte[] data = inputStream.readAllBytes();
}
```

- `FileOutputStream` writes bytes into a file.
- `FileInputStream` reads bytes from a file.
- Because streams work with system resources, automatic closing is important.

## Multiple Catch And Multi-Catch

- Multiple catch means separate catch blocks for different exceptions.
- Multi-catch means handling multiple unrelated/sibling exceptions in one catch block.
- Example:

```java
catch (ArithmeticException | IllegalArgumentException e) {
    System.out.println("Handled by multi-catch");
}
```

- In multi-catch, exception types cannot have parent-child relationship.
- Example invalid idea:
  - `catch (Exception | IOException e)` is invalid because `IOException` is already a child of `Exception`

## final, finally, finalize

- `final`
  - keyword used with variable, method, or class
  - stops reassignment/override/inheritance depending on usage
- `finally`
  - block used with exception handling
  - used for cleanup logic
- `finalize`
  - old cleanup method from `Object`
  - deprecated and not reliable for resource management

## Key Interview Points

- `Throwable` is root, then `Exception` and `Error` branch from it.
- Checked exceptions are compiler enforced; unchecked exceptions are not.
- `throw` creates an exception; `throws` declares responsibility.
- `try-with-resources` needs `AutoCloseable`.
- Multi-catch cannot use parent-child exception types together.
- `final`, `finally`, and `finalize` are completely different concepts.
