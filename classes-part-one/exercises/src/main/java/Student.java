public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String studentName, int i, int i1, double v) {
                this.name = studentName;
                this.studentId = i;
                this.numberOfCredits = i1;
                this.gpa = v;
        }

        // Drop your getters and setters below for the Student class.

        public String getName() {
                return name;
        }
        public void setName(String aName) {
                this.name = aName;
        }
        public int getStudentId() {
                return studentId;
        }
        public void setStudentId(int aStudentId) {
                this.studentId = aStudentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }
        public void setNumberOfCredits(int aNumberOfCredits) {
                this.numberOfCredits = aNumberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }
        public void setGpa(int aGpa) {
                this.gpa = aGpa;
        }
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
