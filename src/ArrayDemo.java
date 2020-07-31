/*
To show the different ways to take input in an array
 */

import java.util.Scanner;
public class ArrayDemo{
    public static void main(String[] args) {
        //declare an array
        int[] arr;

        //intialize an array
        arr = new int[5];

        //One way for input values in an array
        arr[0] = 200;

        //second way user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        arr[1] = sc.nextInt();

        //intialize using loop
        //taking user input in an array
        System.out.println("Enter 5 numbers");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();

        //printing array after user input
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        sc.close();
    }
}
