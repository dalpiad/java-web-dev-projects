import java.util.ArrayList;

public class Course {
    private String topic;

    private String courseId;
    private Teacher instructor;
    private final ArrayList<Student> enrolledStudents; // = new ArrayList<>();

    public Course(String topic, String courseId, Teacher instructor, ArrayList<Student> enrolledStudents) {
        this.topic = topic;
        this.courseId = courseId;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    public String getTopic() {
        return topic;
    }
    public void setTopic(String aTopic) {
        this.topic = aTopic;
    }

    public String getCourseId() {
        return courseId;
    }
    public void setCourseId(String aCourseId) {
        this.courseId = aCourseId;
    }

    public Teacher getInstructor() {
        return instructor;
    }
    public void setInstructor(Teacher aInstructor) {
        this.instructor = aInstructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void addStudent(Student student) {
        getEnrolledStudents().add(student);
    }

    public void courseStatus() {
        System.out.println("Status of the " + this.getCourseId() + " course:");
        System.out.println("Topic: " + this.getTopic() + ".");
        System.out.println("Instructor: " + this.getInstructor().getFirstName() + " " + this.getInstructor().getLastName() + ".");
        if (this.getEnrolledStudents().isEmpty()) {
            System.out.println("There are currently no students enrolled in this course");
        } else {
            System.out.println("This current enrolled students are: ");
            for (Student student : this.getEnrolledStudents()) {
                System.out.println("    Name: " + student.getName() + ", Student ID: " + student.getStudentId() + ".");
            }
        }

    }

}
