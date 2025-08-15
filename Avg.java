import java.util.Scanner;

public class Avg {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter num1");
    int num1 = scanner.nextInt();
    System.out.println("Enter num2");
    int num2 = scanner.nextInt();
    System.out.println("Enter num3");
    int num3 = scanner.nextInt();
    System.out.println("Enter num4");
    int num4 = scanner.nextInt();
    System.out.println("Enter num5");
    int num5 = scanner.nextInt();
    int sum = (num1 + num2 + num3 + num4 + num5) / 5;
    System.out.println("Average is " + sum);

  }
}