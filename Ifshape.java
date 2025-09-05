import java.util.Scanner;

public class Ifshape {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number");
        int num = scanner.nextInt();
        if (num == 1 ) {
            System.out.print("Enter the base of the triagle");
            int base1 = scanner.nextInt();

            System.out.print("Enter the height of the triagle");
            int height1 = scanner.nextInt();
            int area = (base1*height1)/2 ;
            System.out.print("Area of the triagle : "+area+" square units");
        }else  {
            System.out.print("Enter your weight in kg : ");
            double weight2 = scanner.nextDouble();
            System.out.print("Enter your height in meters : ");
            double height2 = scanner.nextDouble();

            double bmi = weight2 / (height2 * height2);
            System.out.print("Your bmi for weight = "+weight2+" kg and height = "+height2+ " meters is "+bmi+" bmi");
        }

    }
}
