package core_java_8;

public class CourseFileReader {
    private final String fileName;

    public CourseFileReader(String fileName) throws InvalidCourseFileException {
        if (fileName == null || fileName.isBlank()) {
            throw new InvalidCourseFileException("Constructor cannot create CourseFileReader without a valid file name");
        }

        this.fileName = fileName;
    }

    public String readerSummary() {
        return "CourseFileReader created for file -> " + fileName;
    }
}
