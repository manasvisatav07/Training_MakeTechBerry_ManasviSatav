import java.util.Scanner;

public class Day5_task3 {

    static int countvowels(String s){
        int count=0;

        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                count++;
        }
    }
    return count;

    
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER A STRING: ");
    String st = sc.nextLine();
    int result = countvowels(st);
    System.out.println("THE NO OF VOWELS: "+ result);
}
}
