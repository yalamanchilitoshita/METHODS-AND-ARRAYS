import java.util.Scanner;

class GreaterAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int T = sc.nextInt();
        while (T-- > 0) {
            System.out.print("Enter A: ");
            int A = sc.nextInt();
            System.out.print("Enter B: ");
            int B = sc.nextInt();
            System.out.print("Enter C: ");
            int C = sc.nextInt();
            if (A + B > 2 * C) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
