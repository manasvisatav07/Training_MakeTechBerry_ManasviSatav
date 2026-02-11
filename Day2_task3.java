
import java.util.Scanner;
public class Day2_task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE TEMPERATURE IN CELSIUS:");
        double c = sc.nextDouble();

        double f= (c * 9 / 5) + 32;

        System.out.println("THE TEMPERATURE IN FAHRENHEIT: "+f);
    }
    
}
