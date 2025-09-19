import java.util.Scanner;

public class StdScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student Name ");
        String stdName = scanner.nextLine();

        System.out.print("Enter your score (0-100) ");
        int score = scanner.nextInt();
        System.out.println("Name = " + stdName);
        System.out.println("score = " + score);


        if (score < 0 || score > 100) {
            System.out.println("Wrong!!!!");

        } else if (score >= 80) {
             System.out.println("grade = ‘A’ ");
        } else if (score >= 70) {
            System.out.println("grade = ‘B’ ");
        } else if (score >= 60) {
            System.out.println("grade = ‘C’ ");
        }else if (score >= 50) {
            System.out.println("grade = ‘D’ ");
        }else if (score <= 50) {
            System.out.println("grade = ‘E’ ");
   }
}
}