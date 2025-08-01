import java.util.Scanner;
public class Tax {
     public static void main (String[]args){
      Scanner scanner = new Scanner(System.in); 
      System.out.println("Enter money");
      int money = scanner.nextInt(); //scanner.nextInt() รับข้อมูลแปลงเป็นตัวแปร//
      double sum = money*(10.0/100);
      System.out.println("pay tax = "+sum+" baht");
    }
}