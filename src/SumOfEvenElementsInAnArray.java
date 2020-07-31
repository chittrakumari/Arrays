

/*
Create an application to print sum of all the even elements
present in the given array.

int[] arr = {13,15,17,14,19,181,2,15,22,24,23,12,56,86,89,87,87,89,84,84,81,5,4}
 */

import java.util.Scanner;
public class SumOfEvenElementsInAnArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = {13,15,17,14,19,181,2,15,22,24,23,12,56,86,89,87,87,89,84,84,81,5,4};

        //checking the array elements is even or not
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                s = s + arr[i];
            }
        }
        //Output
        System.out.println("Sum of elements in the array: " + s);
        obj.close();
    }
}
