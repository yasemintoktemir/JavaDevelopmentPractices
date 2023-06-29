package week6;

import java.util.Arrays;

// Java code to find maximum in arr[] of size n using Arrays.sort() method.
public class Array_Maximum2 {

    public static void main(String[] args)
    {
        int[] arr = { 99, 12, 23, 32, 44, 57, 6 };  // given array
        int n = arr.length;                         // array length

        // calling FindMaximum method
        System.out.println(FindMaximum(arr, n));
    }

        // method to return maximum number in arr[] of size n
        public static int FindMaximum(int[] arr, int n)
        {
            Arrays.sort(arr);                        // to sort the elements of the array
            return arr[n - 1];                       // return the last element of the array
        }
}

/*
3.	Array_FindMaximum
    Write a method that can find the maximum number from an int Array

    Ex:
    int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */
