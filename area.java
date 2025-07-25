import java.util.Scanner;
public class area {
    public static void main(String[] args) {
      Scanner scanner = new  Scanner (System.in);

      System.out.println("Enter radius");
      int radius = scanner.nextInt();

      int sum = (radius*radius)*3_14;

        System.err.println("area = "+sum);
    }
}
