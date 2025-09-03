import java.util.Scanner; 
public class BuyproductFix { 
    public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);

     System.out.print("Product #1 name: ");
     String name1 = scanner.nextLine();
     System.out.print("Product #1 price: ");
     double price1 = scanner.nextDouble();
     System.out.print("Product #1 quantity: ");
     int qty1 = scanner.nextInt();
     scanner.nextLine();

     System.out.print("Product #2 name: ");
     String name2 = scanner.nextLine();
     System.out.print("Product #2 price: ");
     double price2 = scanner.nextDouble();
     System.out.print("Product #2 quantity: ");
     int qty2 = scanner.nextInt();
     scanner.nextLine();

     System.out.print("Product #3 name: ");
     String name3 = scanner.nextLine();
     System.out.print("Product #3 price: ");
     double price3 = scanner.nextDouble();
     System.out.print("Product #3 quantity: ");
     int qty3 = scanner.nextInt();

     System.out.print("Customer paid money: ");
     double paid = scanner.nextDouble();

     double total1 = price1 * qty1;
     double total2 = price2 * qty2;
     double total3 = price3 * qty3;

     double subtotal = total1 + total2 + total3;
     double vat = subtotal * 0.07;
     double netTotal = subtotal + vat;
     double change = paid - netTotal;

     System.out.println("      Receipt      ");
      System.out.println(name1 + ": " +price1+" x "+qty1+" = "+total1+ " Baht");
      System.out.println(name2 + ": " +price2+" x "+qty2+" = "+total2+ " Baht");
      System.out.println(name3 + ": " +price3+" x "+qty3+" = "+total3+ " Baht");
      System.out.println("Subtotal: " +subtotal+ " Baht");
      System.out.println("VAT 7%: " +vat+ " Baht");
      System.out.println("Total including VAT: " +netTotal+ " Baht");
      System.out.println("Amount paid: " +paid+ " Baht");
      System.out.println("change: " + change +" Baht");
}
}