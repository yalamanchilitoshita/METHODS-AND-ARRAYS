import java.util.Scanner;

class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();
        System.out.print("Enter Allowance: ");
        double allowance = sc.nextDouble();

        double gross = basic + hra + allowance;
        System.out.println("Gross Salary: " + gross);
    }
}

