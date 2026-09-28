import java.util.Scanner;

class MarksAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1, m2, m3;
        System.out.print("Enter marks in 3 subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}

