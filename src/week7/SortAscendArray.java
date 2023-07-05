package week7;

import java.util.Arrays;

public class SortAscendArray {

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        sortAscend(arr);
    }
    public static void sortAscend(int[] arr) {
        int temp;
        System.out.println("array --> " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] > arr[k]) {
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
                //System.out.println(Arrays.toString(arr));       // shows array changes during loop iterations
            }
        }
        System.out.println("Sorted Ascending array --> " + Arrays.toString(arr));
    }
}

/*
2.	Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */
