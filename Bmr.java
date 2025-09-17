import java.util.Scanner;

public class Bmr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your sex (male/female): ");
         String sex=scanner.nextLine(); 

        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (cm): ");
        double height = scanner.nextDouble();

        System.out.print("Enter your age (years): ");
        int age = scanner.nextInt();

        double bmr=0;

        if (sex.equals("male")) {
            bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        } else if (sex.equals("female")) {
            bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        }

        System.out.printf("BMR = "+bmr+" kcal/day");
    }
}