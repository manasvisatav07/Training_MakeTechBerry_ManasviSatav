import java.util.Scanner;

public class Day3_task4 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER UNITS CONSUMED:");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 2;
        }
        else if (units <= 200) {
            bill = (100 * 2) + (units - 100) * 3;
        }
        else {
            bill = (100 * 2) + (100 * 3) + (units - 200) * 5;
        }

        System.out.println("TOTAL ELECTRICITY BILL = " + bill);
    }
    
}
