import java.util.Scanner;

public class Triagleandsquare {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter base");
    int base = scanner.nextInt();
    System.out.println("Enter height");
    int height = scanner.nextInt();
    double triangle = 0.5 * (base * height);
    System.out.println("Base = " + base);
    System.out.println("Height = " + height);
    System.out.println("area of triangle is " + triangle + " unit");

    System.out.println("Enter length");
    int length = scanner.nextInt();
    System.out.println("Enter width");
    int width = scanner.nextInt();
    int square = length * width;
    System.out.println("length = " + length);
    System.out.println("width = " + width);
    System.out.println("Area square is " + square + " unit");
  }
}
