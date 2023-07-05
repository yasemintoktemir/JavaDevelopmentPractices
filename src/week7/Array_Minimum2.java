package week7;

public class Array_Minimum2 {

    public static void main(String[] args)
    {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};    // given array
        int n = arr.length;                         // array length

        // calling FindMinimum method
        System.out.println(FindMinimum(arr, n));
    }

    // method to return minimum number in arr[] of size n
    public static int FindMinimum ( int[] arr, int n)
    {
        int min = arr[0];                        // assume that first element is the minimum number

        for (int i = 1; i < n; i++){             // staring from i = 1 (second element) to compare with first element (assumed min)

            if (arr[i] < min) {                  // compare the element of the array with current minimum number
                min = arr[i];                    // replace the current minimum number
            }
        }

        return min;
    }
}

/*
1.	Array - Find Minimum
Write a method that can find the minimum number from an int Array
 */