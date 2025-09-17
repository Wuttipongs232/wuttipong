import java.util.Scanner;

public class Notechange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter money to pay ");
        int money = scanner.nextInt();
        System.out.print("Enter amount to pay ");
        int paychange = scanner.nextInt();

        int change = money-paychange;
        System.out.println("Change is "+change);

        int fivehun = change/500;
         change = change%500;
        int OneHun = change/100;
         change = change%100;
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
