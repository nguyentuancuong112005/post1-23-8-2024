/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author pro5
 */
public class assignment {
    public static int[] importData(int a) {
        System.out.println("Enter limit of Array: " );
        
        int[] n = new int[a];
        for(int i = 0; i<n.length;i++)
        {
            System.out.print((i+1) + " have vlue: ");
            n[i]= new Scanner(System.in).nextInt();
        }
        return n;
    }
    public static int printData(int[] n) {
        System.out.print("print Arrays: ");
        
        for(int i = 0; i<n.length;i++)
        {
            System.out.print( n[i] + " ");
        }
        return 0;
    }
    public static void DeleteDataEven(int[] n) {
        System.out.print("befor delete  even vlues of Arrays: ");
        for (int i = 0; i<n.length;i++) {
            if(n[i]%2 != 0 )
            {
                n[i] = 0;
            }
        }
        for(int i = 0; i<n.length;i++)
        {
            if(n[i] != 0)
            {
                System.out.print(n[i] + " ");
            }
        }
    }
    public static void findNumberMax(int[] n) {
        System.out.print("second largest number: ");
        int max = 0;
        for(int i = 0; i<n.length;i++)
        {
            if(n[i] > max)
            {
                max = n[i];
            }
        }
        int max1 = 0;
        for(int i = 0; i<n.length;i++)
        {
            if(n[i] != max && n[i] > max1)
            {
                max1 = n[i];
            }
        }
        System.out.println(max1);
    }
    public static void main(String[] args) {
        System.out.println("Enter vlue a: ");
        int a = new Scanner(System.in).nextInt();
        int[] n = importData(a);
        printData(n);
        System.out.println();
        findNumberMax(n);
        DeleteDataEven(n);
    }
    
}

