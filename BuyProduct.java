import java.util.Scanner;

public class BuyProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product #1 name: ");
        String name1 = scanner.nextLine();
        System.out.print("Product #1 price: ");
        double product1price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Product #2 name: ");
        String name2 = scanner.nextLine();
        System.out.print("Product #2 price: ");
        double product2price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Product #3 name: ");
        String name3 = scanner.nextLine();
        System.out.print("Product #3 price: ");
        double product3price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Customer paid money : ");
        double paidmoney = scanner.nextDouble();

        System.out.println(name1 +" "+ product1price + "baht");
        System.out.println(name2 +" "+ product2price + "baht");
        System.out.println(name3 +" "+ product3price + "baht");

        double total =product1price+product2price+product3price;
        double vat = total*0.07;
        double Netprice = total+vat;
        double change =  paidmoney-Netprice;


        System.out.println("total price before tax: "+total+" baht");
        System.out.println("Vat = "+vat+" baht");
        System.out.println("Net price "+Netprice+" baht");
        System.out.println("Total paid "+paidmoney+" baht");
        System.out.println("Change = "+change+" baht");
    }
}
