/*
Create an application to print sum of all elements in an array
 */

import java.util.Scanner;
public class SumOfAllElements {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int n=obj.nextInt();

        int[] arr=new int[n];

        //taking user input and adding the array elements
        int s=0;
        System.out.println("Enter "+n+" elements in the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
            s=s+arr[i];
        }
        
        System.out.println("Sum of elements in the array: " + s);
        obj.close();
    }
}
