import java.util.Scanner;

public class CalCost {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the product: ");
        double price = scanner.nextDouble();

        System.out.print("Enter the quantity of the product: ");
        int quantity = scanner.nextInt();
        double total = price * quantity;
        System.out.println("Total price "+total+" Baht");
        
        if (quantity > 10) {
            total *= 0.9;
            System.out.println("You get a 10% discount ");
            System.out.println("Total price "+total+" Baht");
        } 
    }
}