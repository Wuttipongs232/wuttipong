import java.util.Scanner;
public class Surfacearea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Wide; ");
        int Wide = scanner.nextInt();
        System.out.println("Enter Long; ");
        int Long = scanner.nextInt();
        int Surfacearea = (Wide*Long/360);
        System.out.println("body surface area is "+ Surfacearea);

    }

    
}
