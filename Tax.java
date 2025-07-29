import java.util.Scanner;
public class Tax {
     public static void main (String[]args){
      Scanner scanner = new Scanner(System.in); //Scanner ใช้เมื่อต้องการพิมพ์//
      System.out.print("Enter money\n");
      int money = scanner.nextInt(); //scanner.nextInt() รับข้อมูลแปลงเป็นตัวแปร//
      double sum = money*(10.0/100);
      System.out.println("pay tax = "+sum+" baht");
    }
}