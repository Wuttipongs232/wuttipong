import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float Pi = 3.14f;

        System.out.println("Enter radius");
        int radius = scanner.nextInt();

        float sum = (radius * radius) * Pi;

        System.err.println("area = " + sum);
    }
}
