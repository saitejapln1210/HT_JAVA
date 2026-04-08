package core_java_8;

public class CourseResource implements AutoCloseable {
    private final String resourceName;

    public CourseResource(String resourceName) {
        this.resourceName = resourceName;
    }

    public String read() {
        return "reading from " + resourceName;
    }

    @Override
    public void close() {
        System.out.println("Resource closed: " + resourceName);
    }
}
