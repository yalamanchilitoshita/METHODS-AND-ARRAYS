import java.util.Scanner;

class ProductCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        double total = price * qty;

        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Amount: " + total);
    }
}

