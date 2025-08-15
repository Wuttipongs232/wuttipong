import java.util.Scanner;

public class BMIcal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Weight");
        Double weight = scanner.nextDouble();
        System.out.println("Enter Hight");
        Double height = scanner.nextDouble();
        Double BMI = weight / (height * height);
        System.out.println("Your BMI for Weight = " + weight + "kg" + " and height = " + height + "meters is :" + BMI + " bmi.");

    }

}