import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fahrenhei");
        Double fahrenheit = scanner.nextDouble();
        Double celsius = (5.0/9)*(fahrenheit-32);
        System.out.println("Temp is "+celsius+"celsius");
        
    }

    
}
