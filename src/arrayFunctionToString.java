/*
Taking 5 integers from the user as input and demonstrating the toString function
 */
import java.util.Arrays;
import java.util.Scanner;
public class arrayFunctionToString {
        public static void main(String[] args)
        {
            Scanner obj=new Scanner(System.in);

            //intializing and declaring  an array
            int[] arr=new int[5];

            /* Using loop taking  input in an array from the user
             */
            System.out.println("Enter 5 numbers");
            for(int i=0;i<5;i++)
                arr[i]=obj.nextInt();

            //valid for all primitive data types like short, int, byte
           String str=Arrays.toString(arr);  /*this method returns a string and string
                                               representation of the array*/

            //Output
            System.out.println(str);

            // one more process to implement toString method.
            System.out.println(Arrays.toString(arr));
        }
    }


