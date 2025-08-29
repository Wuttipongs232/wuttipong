import java.util.Scanner;

public class PayDress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter price per dress ");
        double PricePerDress = input.nextDouble();
        System.out.print("Enter number of dresses to buy ");
        double NumberOfDresses = input.nextDouble();
        System.out.print("Enter discount rate ");
        double DiscountRate = input.nextDouble();
 
        double TotalCost = PricePerDress*NumberOfDresses;
        double DiscountAmount = TotalCost*DiscountRate / 100;
        double Pay = TotalCost-DiscountAmount;
        
        System.out.println("Total Cost = "+TotalCost+"Baht");
        System.out.println("DiscountAmount = "+DiscountAmount+"Baht");
        System.out.println("Pay = "+ Pay +" Baht");
    }
}
