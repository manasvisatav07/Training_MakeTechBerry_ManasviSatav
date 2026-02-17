import java.util.Scanner;

public class Day5_task4 {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER FIRST NUMBER:");
        int x = sc.nextInt();

        System.out.println("ENTER SECOND NUMBER:");
        int y = sc.nextInt();

        System.out.println("CHOOSE OPERATION:");
        System.out.println("1. ADD");
        System.out.println("2. SUBTRACT");
        System.out.println("3. MULTIPLY");
        System.out.println("4. DIVIDE");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("RESULT = " + add(x, y));
                break;
            case 2:
                System.out.println("RESULT = " + subtract(x, y));
                break;
            case 3:
                System.out.println("RESULT = " + multiply(x, y));
                break;
            case 4:
                System.out.println("RESULT = " + divide(x, y));
                break;
            default:
                System.out.println("INVALID CHOICE");
        }
    }
    
    
}
