package week7;

import java.util.Arrays;

public class SortDescendArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};
        sortDescend(arr);
    }
    public static void sortDescend(int[] arr) {
        int temp;
        System.out.println("array --> " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] < arr[k]) {
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
                //System.out.println(Arrays.toString(arr));       // shows array changes during loop iterations
            }
        }
        System.out.println("Sorted Descending array --> " + Arrays.toString(arr));
    }
}

/*
3.	Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */

