class Student {
    String name;
    int rollNo;
    String branch;
    Student(String name, int rollNo, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
    }
    void display() {
        System.out.println("Student name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Branch: " + branch);
    }
    public static void main(String[] args) {
        Student s1 = new Student("John Doe", 101, "Computer Science");
        Student s2 = new Student("Jane Smith", 102, "Electrical Engineering");
        s1.display();
        System.out.println();
        s2.display();
    
    }
}    