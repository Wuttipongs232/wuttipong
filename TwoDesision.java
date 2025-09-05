import java.util.Scanner;

public class TwoDesision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int num1 = scanner.nextInt();

        if (num1 > 0) {
            System.out.println("จำนวนเต็มบวก");
        } else {
            System.out.println("ไม่ใช่จำนวนเต็มบวก");
        }
        System.err.println("จบโปรแกรม");
    }
}
