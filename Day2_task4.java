import java.util.Scanner;

public class Day2_task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE FIRST NO:");
        int a = sc.nextInt();

        System.out.println("ENTER THE SECOND NO:");
        int b = sc.nextInt();

        System.out.println("CHOOSE OPERATION TO PERFORM:");
        System.out.println("1. ADDITION");
        System.out.println("2. SUB");
        System.out.println("3. MULTI");
        System.out.println("4. DIVISION");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("RESULT = " + (a + b));
                break;

            case 2:
                System.out.println("RESULT = " + (a - b));
                break;

            case 3:
                System.out.println("RESULT = " + (a * b));
                break;

            case 4:
                System.out.println("RESULT = " + (a / b));
                break;

            default:
                System.out.println("CHECK YOU CHOICE DEAR!");
        }
        
    }
    
}
