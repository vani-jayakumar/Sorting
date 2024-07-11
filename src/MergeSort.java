//To sort array by splitting it to half and sort them and merge the sorted array
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 3, 12, 6, 5};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
//        To recursively sort left and right part of array
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        int[] ansArray = merge(left, right);
        return ansArray;
    }

//    Method to merge the sorted Array by checking the smaller element
    private static int[] merge(int[] left, int[] right) {
        int[] mergeArray = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mergeArray[k++] = left[i];
                i++;
            } else {
                mergeArray[k++] = right[j];
                j++;
            }
        }
//        to add remaining element in any of the array (if present) in new array
        while (i < left.length) {
            mergeArray[k++] = left[i];
            i++;
        }
        while (j < right.length) {
            mergeArray[k++] = right[j];
            j++;
        }
        return mergeArray;
    }
}

