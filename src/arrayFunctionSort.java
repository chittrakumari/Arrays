/*
Taking 5 integers from the user as input and demonstrating the sort function
 */
import java.util.Arrays;
import java.util.Scanner;
public class arrayFunctionSort {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        //intializing and declaring  an array
        int[] arr = new int[5];

        /*using loop
        taking  input in an array from the user
         */
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++)
            arr[i] = obj.nextInt();
        int[] drr = Arrays.copyOfRange(arr, 0, 5);
        Arrays.sort(drr);

        //Output
        System.out.println(Arrays.toString(drr));

    }
}