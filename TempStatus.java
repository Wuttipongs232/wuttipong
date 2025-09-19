import java.util.Scanner;

public class TempStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius : ");
        
        int temp = scanner.nextInt();
        if (temp >= 35) {
          System.out.print("Hot");
        } else if (temp >=20){
            System.out.print("Normal");
        } else if (temp<=20){
          System.out.print("Cold");
        }
    }
}
