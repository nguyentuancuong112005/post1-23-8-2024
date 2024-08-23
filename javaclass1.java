
import java.util.Scanner;


public class javaclass1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Interger number x and number y:");
        int x = (int)Input.nextInt();
        int y = (int)Input.nextInt();
        System.out.println("result of operation + : "+ (x + y));
        System.out.println("result of operation - : "+ (x - y));
        System.out.println("result of operation / : "+ (x / y));
        System.out.println("result of operation % : "+ (x % y));
    }

 
}
