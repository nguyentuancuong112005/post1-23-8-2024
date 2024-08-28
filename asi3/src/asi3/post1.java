
package asi3;

import java.util.Random;
import java.util.Scanner;


public class post1 {

   
    public static void main(String[] args) {
       
       String check;
       do
       {
           int rand = new Random().nextInt(100) + 1;
           System.out.println("Enter yes or no so start/end");
           check = new Scanner(System.in).next();
           if(rand % 2 == 0)
           {
               System.out.println( rand + " is even ");
           }else{
               System.out.println( rand + " is odd ");
           }
       }while(check.equals("yes"));
    }
    
}
