package core_java_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public String explainThrowableHierarchy() {
        return "Throwable is the root type. Error represents serious system-level problems, and Exception represents conditions applications can handle.";
    }

    public String explainErrorVsException() {
        return "Errors like StackOverflowError or OutOfMemoryError are usually not handled in normal application flow, while exceptions like IOException or ArithmeticException can be handled by application code.";
    }

    public String explainCheckedUnchecked() {
        return "Checked exceptions are verified at compile time, while unchecked exceptions are subclasses of RuntimeException and are not forced by the compiler.";
    }

    public String explainHierarchyExamples() {
        return "Checked examples: IOException, ClassNotFoundException. Unchecked examples: ArithmeticException, NullPointerException, IllegalArgumentException.";
    }

    public String explainTryCatchFinally() {
        StringBuilder flow = new StringBuilder();

        try {
            flow.append("try executed");
            int value = 10 / 0;
            flow.append(value);
        } catch (ArithmeticException exception) {
            flow.append(" -> catch handled ArithmeticException");
        } finally {
            flow.append(" -> finally always executed");
        }

        return flow.toString();
    }

    public String explainThrowAndThrows() {
        try {
            validateMarks(-10);
            readCourseFile("missing-file");
            return "No exception triggered";
        } catch (InvalidMarksException exception) {
            return "throw creates an exception explicitly -> " + exception.getMessage();
        } catch (InvalidCourseFileException exception) {
            return "throws passes checked exception responsibility -> " + exception.getMessage();
        }
    }

    public String explainThrowsWithConstructor() {
        try {
            CourseFileReader invalidReader = new CourseFileReader("");
            return invalidReader.readerSummary();
        } catch (InvalidCourseFileException exception) {
            return "throws can be used with constructors because constructors execute object-initialization logic -> "
                    + exception.getMessage();
        }
    }

    public String explainWhyNoThrowsAtClassLevel() {
        return "throws is not allowed at class level because a class is only a blueprint. Exception declaration belongs to executable members like methods and constructors, not to the class declaration itself.";
    }

    public String explainCustomExceptions() {
        StringBuilder result = new StringBuilder();

        try {
            enrollLearner("Harshu", 15, false);
            result.append("enrollment succeeded");
        } catch (InvalidLearnerAgeException exception) {
            result.append("Custom unchecked exception -> ").append(exception.getMessage());
        } catch (CourseEnrollmentException exception) {
            result.append("Custom checked exception -> ").append(exception.getMessage());
        }

        try {
            enrollLearner("Harshu", 21, false);
        } catch (InvalidLearnerAgeException exception) {
            result.append(" | age validation failed unexpectedly");
        } catch (CourseEnrollmentException exception) {
            result.append(" | Custom checked exception -> ").append(exception.getMessage());
        }

        try {
            enrollLearner("Harshu", 21, true);
            result.append(" | enrollment succeeds when all business rules pass");
        } catch (CourseEnrollmentException | InvalidLearnerAgeException exception) {
            result.append(" | unexpected enrollment failure");
        }

        return result.toString();
    }

    public String explainCheckedScenarios() {
        return "Partially checked type example: Exception, because RuntimeException is unchecked under it. Fully checked example: IOException, because its normal child types remain checked.";
    }

    public String explainTryWithResources() {
        try (CourseResource file = new CourseResource("notes-resource")) {
            return "try-with-resources uses AutoCloseable and closes resources automatically -> " + file.read();
        } catch (Exception exception) {
            return exception.getMessage();
        }
    }

    public String explainMultipleResources() {
        try (CourseResource file = new CourseResource("notes-resource");
             CourseResource network = new CourseResource("network-resource")) {
            return "Multiple resources are closed in reverse order -> " + file.read() + " | " + network.read();
        } catch (Exception exception) {
            return exception.getMessage();
        }
    }

    public String explainFileStreamExample() {
        Path tempFile = null;

        try {
            tempFile = Files.createTempFile("core-java-8-", ".txt");

            try (FileOutputStream outputStream = new FileOutputStream(tempFile.toFile())) {
                outputStream.write("Harshu learns file streams".getBytes(StandardCharsets.UTF_8));
            }

            byte[] data;
            try (FileInputStream inputStream = new FileInputStream(tempFile.toFile())) {
                data = inputStream.readAllBytes();
            }

            return "File stream example using FileOutputStream and FileInputStream -> "
                    + new String(data, StandardCharsets.UTF_8);
        } catch (IOException exception) {
            return "File stream example failed -> " + exception.getMessage();
        } finally {
            if (tempFile != null) {
                try {
                    Files.deleteIfExists(tempFile);
                } catch (IOException ignored) {
                }
            }
        }
    }

    public String explainMultipleCatchAndMultiCatch() {
        StringBuilder result = new StringBuilder();

        try {
            triggerArithmetic();
        } catch (ArithmeticException exception) {
            result.append("Multiple catch: ArithmeticException handled specifically");
        }

        try {
            triggerIllegalArgument();
        } catch (ArithmeticException | IllegalArgumentException exception) {
            result.append(" | Multi-catch handled related unchecked exception types together");
        }

        return result.toString();
    }

    public String explainFinalFinallyFinalize() {
        return "final is a keyword for restricting reassignment/override/inheritance, finally is a block used with exception handling, and finalize was an old cleanup method that should not be relied on in modern Java.";
    }

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

    public void enrollLearner(String learnerName, int age, boolean documentsSubmitted)
            throws CourseEnrollmentException {
        if (age < 18) {
            throw new InvalidLearnerAgeException("Learner " + learnerName + " must be at least 18 years old");
        }

        if (!documentsSubmitted) {
            throw new CourseEnrollmentException("Learner " + learnerName + " cannot enroll without required documents");
        }
    }

    private void triggerArithmetic() {
        int value = 10 / 0;
        System.out.println(value);
    }

    private void triggerIllegalArgument() {
        throw new IllegalArgumentException("Invalid learner input");
    }
}
