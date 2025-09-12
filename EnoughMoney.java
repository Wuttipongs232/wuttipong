import java.util.Scanner;

public class EnoughMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter money to pay ");
        int money = scanner.nextInt();
        System.out.print("Product #1 name: ");
        String name1 = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Product #1 price: ");
        int price1 = scanner.nextInt();
        System.out.print("Product #1 quantity: ");
        int qty1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Product #2 name: ");
        String name2 = scanner.nextLine();
        System.out.print("Product #2 price: ");
        int price2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product #2 quantity: ");
        int qty2 = scanner.nextInt();
        scanner.nextLine();

        int total1 = price1 * qty1;
        int total2 = price2 * qty2;

        System.out.println(name1 + " : " + price1 + " x " + qty1 + " = " + total1 + " Baht");
        System.out.println(name2 + " : " + price2 + " x " + qty2 + " = " + total2 + " Baht");

        int total = total1 + total2;
        int change = money - total;

        System.out.println("Total pay is  " + total);
        System.out.println("Change is " + change);

        if (money<total) {
            System.out.print("Not enough money");

        } else {
        int fivehun = change / 500;
        change = change % 500;
        int OneHun = change / 100;
        change = change % 100;
        int fifty = change / 50;
        change = change % 50;
        int twenty = change / 20;
        change = change % 20;
        int ten = change / 10;
        change = change % 10;
        int five = change / 5;
        change = change % 5;
        int two = change / 2;
        change = change % 2;
        int one = change;
        System.out.println("Fivehundred note = "+ fivehun);
        System.out.println("OneHundred note = " + OneHun );
        System.out.println("Fifty note = " + fifty);
        System.out.println("Twenty note = " + twenty);
        System.out.println("Ten coin = " + ten);
        System.out.println("Five coin = " + five);
        System.out.println("Two coin = " + two);
        System.out.println("one coin = " + one);
        }
    }
}
