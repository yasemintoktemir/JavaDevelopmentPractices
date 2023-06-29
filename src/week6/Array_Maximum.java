package week6;

// Java code to find maximum in arr[] of size n using loops.
public class Array_Maximum {

    public static void main(String[] args)
    {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};    // given array
        int n = arr.length;                         // array length

        // calling FindMaximum method
        System.out.println(FindMaximum(arr, n));
    }

        // method to return maximum number in arr[] of size n
        public static int FindMaximum ( int[] arr, int n)
        {
            int max = arr[0];                        // assume that first element is the maximum number

            for (int i = 1; i < n; i++){             // staring from i = 1 (second element) to compare with first element (assumed max)

                if (arr[i] > max) {                  // compare the element of the array with current maximum number
                    max = arr[i];                    // replace the current maximum number
                }
            }

            return max;
        }
}


/*
3.	Array_FindMaximum
    Write a method that can find the maximum number from an int Array

    Ex:
    int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */
