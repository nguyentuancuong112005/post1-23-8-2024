
package asi3;

import java.util.Scanner;


public class post234 {
    
    public static void main(String[] args) { 
        
        System.out.println("Enter limit of array ");
        Scanner enter = new Scanner(System.in);
        int a = enter.nextInt();
        int[] numbers = new int[a];
        for(int i = 0;i<a;i++)
        {
            System.out.print(i+" have vlue: ");
            numbers[i] = enter.nextInt();
        }
        int max = 0;
        int min = 0;
        for(int i = 0;i<a;i++)
        {
            if(numbers[i] > numbers[0])
            {
                max = numbers[i];
            }  
        }
        System.out.println(" number max : "+max);
        for(int i = 0;i<a;i++)
        {
            if(numbers [i] < numbers[0])
            {
                min = numbers[i];
            }
        }
        System.out.println(" number min : "+min);
        int sum = 0;
        int n=0;
        for(int i = 0;i<a;i++)
        {
            sum = sum + numbers[i];
        }
        double ave = (float) sum/a;
        System.out.println("Sum of Array: " +sum);
        System.out.println("Average of Array: "+ ave);
        for(int i = 0;i<a;i++)
        {
            for(int j = (a-1); j > i;j-- )
            {
                if(numbers[i]>numbers[j])
                {
                    int temp = numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
                
            }
        }
        for(int i = 0;i<a;i++)
        {
            System.out.print(numbers[i] + " ");
        }
    }
}
