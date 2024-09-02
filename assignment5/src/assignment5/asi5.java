
package assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class asi5 {

    public static ArrayList<Integer> EnterData(ArrayList<Integer> Numbers) {
        System.out.println("Enter Size Of Arrays: ");
        int a = new Scanner(System.in).nextInt();
        for(int i = 0;i<a;i++)
        {
            System.out.print("Number of Array "+(i+1)+" : ");
            int n = new Scanner(System.in).nextInt();
            Numbers.add(n);
        }
        return Numbers;
    }
    public static void DisplayData(ArrayList<Integer> Numbers) {
        System.out.println(" Input all Vlue of Arrays: ");
        System.out.println("Vlue Of Arrays: ");
        System.out.println( Arrays.toString(Numbers.toArray())+ " ");
    }
    public static int findMax2(ArrayList<Integer> Numbers) {
        System.out.print("Find second largest value: ");
        int max = 0;
        for(int i = 0;i<Numbers.size();i++)
        {
            if(Numbers.get(i) > max )
            {
                max = Numbers.get(i);
            }
        }
        int max1=0;
        for(int i = 0;i<Numbers.size();i++)
        {
            if(Numbers.get(i) > max1 && Numbers.get(i) != max )
            {
                max1 = Numbers.get(i);
            }
        }
        System.out.println(max1);
        return max1;
    }
    public static void DeleteOddNumber(ArrayList<Integer> Numbers) {
        System.out.println("Delete Numbers odd of arrays: ");
        for(int i = 0;i<Numbers.size();i++)
        {
            if(Numbers.get(i) % 2 != 0)
            {
                Numbers.remove(i);
            }
        }
        System.out.println(Arrays.toString(Numbers.toArray()));
    }
    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<>();
        String result = null;
        do
        {
            System.out.println("if you select number 1: EnterData ");
            System.out.println("if you select number 2: DisplayData ");
            System.out.println("if you select number 3: findMax2 ");
            System.out.println("if you select number 4: DeleteOddNumber ");
            System.out.print(" So which number do you choose?: ");
            int select = new Scanner(System.in).nextInt();
            switch(select)
            {
                case 1:
                    EnterData(Numbers);
                    break;
                case 2:
                    DisplayData(Numbers);
                    break;
                case 3:
                    findMax2(Numbers);
                    break;
                case 4:
                    DeleteOddNumber(Numbers);
                    break;
                default:
                    System.out.println(" Error! " );
                    break;
            }
            System.out.print("are you continue programme (Y/N): ");
            result = new Scanner(System.in).nextLine();
        }while(result.equals("y") );
    }
}
