import java.util.Scanner;

public class Day5_task5 {
    
    static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NO :");
        int n = sc.nextInt();
        
        
        System.out.println("THE REQUIRED SERIES IS :" );
        fibonacci(n);
    }
    
}

