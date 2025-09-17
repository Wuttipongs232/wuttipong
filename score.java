import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mid term = ");
        double mid = scanner.nextDouble();

        System.out.print("Final term = ");
        double finall = scanner.nextDouble();

        double total = mid + finall;

        if (total < 50) {
            System.out.println("ไม่ผ่าน");
        } else {
            System.out.println("ผ่าน");
        }
    }
}