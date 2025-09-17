import java.util.Scanner;
public class Swapnum {
    public static void main (String [] args ){
     Scanner scanner = new Scanner(System.in);

System.out.print("Enter Number 1 ");
        int num1 =scanner.nextInt();
        System.out.print("Enter Number 2 ");

        int num2 =scanner.nextInt();

        int nums1 = num2;
        int nums2 = num1;

        System.out.println("Current Number 1 is "+num1);
        System.out.println("Current Number 2 is "+num2);
        System.out.println("Swap Number1 is "+nums1);
        System.out.println("Swap Number2 is "+nums2);
    }
    }