import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below
        Student D12345 = new Student("Doyle", 12345, 1, 3.0);

        Student J23456 = new Student("Jessica", 23456, 1, 4.0);

        Student K34567 = new Student("Kevin", 34567, 1, 3.8);

        Teacher teacher = new Teacher("Katie", "Brown", "History", 12);

        ArrayList<Student> hist101Students = new ArrayList<>();

        Course HIST101 = new Course("American History", "HIST101", teacher, hist101Students);

        HIST101.addStudent(D12345);
        HIST101.addStudent(J23456);
        HIST101.addStudent(K34567);

        HIST101.courseStatus();
    }
}
