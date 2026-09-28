import java.util.Scanner;

class MarksAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int marks[] = new int[n];

        System.out.println("Enter marks of " + n + " students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int highest = 0;
        int lowest = marks[0];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (marks[i] > highest)
                 highest = marks[i];
            if (marks[i] < lowest) 
                lowest = marks[i];
            sum += marks[i];
        }

        double avg = (double) sum / n;

        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);
        System.out.println("Average Mark: " + avg);
        sc.close();
    }
}
