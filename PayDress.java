import java.util.Scanner;

public class PayDress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter price per dress ");
        double PricePerDress = input.nextDouble();

        System.out.print("Enter number of dresses to buy ");
        int NumberOfDresses = input.nextInt();

        System.out.print("Enter discount rate ");
        double DiscountRate = input.nextDouble();

        double totalCost = PricePerDress*NumberOfDresses;
        double DiscountAmount = totalCost*DiscountRate / 100;
        double Pay = totalCost-DiscountAmount;

        System.out.println("Total cost = "+totalCost+"Baht");
        System.out.println("DiscountAmount = "+DiscountAmount+"Baht");
        System.out.println("Pay = "+ Pay +" Baht");
    }
}
