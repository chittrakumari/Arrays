/*
taking 5 integers as input from the user and showing the implementation of copyOfRange function.
 */

import java.util.Arrays;
import java.util.Scanner;

public class arrayFunctionCopyOfRange {
        public static void main(String[] args)
        {
            Scanner obj=new Scanner(System.in);

            //intializing and declaring  an array
            int[] arr=new int[5];

            /*using loop
            taking  input in an array from the user
            */
            System.out.println("Enter 5 numbers");
            for(int i=0;i<5;i++)
                arr[i]=obj.nextInt();
            int[] crr=Arrays.copyOfRange(arr,0,3);

            //Output
            System.out.println(Arrays.toString(crr));

        }
    }

