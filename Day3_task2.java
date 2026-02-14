import java.util.Scanner;

public class Day3_task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR MARKS:");
        int marks = sc.nextInt();

        if (marks >= 75) {
            System.out.println("GRADE: A");
        }
        else if (marks >= 60) {
            System.out.println("GRADE: B");
        }
        else if (marks >= 50) {
            System.out.println("GRADE: C");
        }
        else if (marks >= 35) {
            System.out.println("GRADE: D");
        }
        else {
            System.out.println("GRADE: F (FAIL)");
        }
    }
}
