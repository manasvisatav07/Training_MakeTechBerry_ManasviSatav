import java.util.Scanner;
public class Day2_task1 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE FIRST NO:");
        int a = sc.nextInt();
        System.out.println("ENTER THE SECOND NO:");
        int b = sc.nextInt();
        System.out.println("ENTER THE THIRD NO:");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+ " IS LARGEST ");
        }else if(b>a && b>c){
            System.out.println(b+ " IS LARGEST ");
        }else{
            System.out.println(c+ " IS LARGEST");
        }
    }
    
}
