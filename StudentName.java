public class StudentName {
    String name;
    int rollno;
    String branch;

    public static void main(String[] args) {
        StudentName student = new StudentName("Name", 1, "Branch");
        student.display();
    }

    StudentName(String name, int rollno, String branch) {
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Branch: " + branch);
    }
}
