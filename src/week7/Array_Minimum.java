package week7;

import java.util.Arrays;

// Java code to find minimum in arr[] of size n using Arrays.sort() method.
public class Array_Minimum {

    public static void main(String[] args)
    {
        int[] arr = { 99, 12, 23, 32, 44, 57, 6 };  // given array
        int n = arr.length;                         // array length

        // calling FindMinimum method
        System.out.println(FindMinimum(arr, n));
        }

    // method to return minimum number in arr[] of size n
    public static int FindMinimum(int[] arr, int n)
    {
        Arrays.sort(arr);                        // to sort the elements of the array
        return arr[0];                           // return the first element of the array
    }
}

/*
1.	Array - Find Minimum
Write a method that can find the minimum number from an int Array
 */
