import java.util.Scanner;

public class Day5_task1 {

    static int findlargest(int a, int b, int c){
        if(a>b&&a>c){
            return a;
        }else if( b>a &&b >c){
            return b;
        }else{
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE FIRST NO:");
        int x = sc.nextInt();
          System.out.println("ENTER THE SECOND NO:");
        int y = sc.nextInt();
          System.out.println("ENTER THE THIRD NO:");
        int z = sc.nextInt();

        int largest = findlargest(x, y, z);
        System.out.println("THE LARGEST NO IS:"+ largest);
        
    }
    
}
