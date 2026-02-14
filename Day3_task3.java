import java.util.Scanner;

public class Day3_task3 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER USERNAME:");
        String username = sc.nextLine();

        System.out.println("ENTER PASSWORD:");
        String password = sc.nextLine();

        if (username == "admin" && password == "1234") {
            System.out.println("LOGIN SUCCESSFUL");
        }
        else {
            System.out.println("INVALID USERNAME OR PASSWORD");
        }
    }
}
