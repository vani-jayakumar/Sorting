<<<<<<< HEAD
//To sort array by taking a pivot element
//and sort the left side of pivot will smaller elements than pivot
//right side of pivot will larger elements than pivot
//doing it recursively and obtain sorted array
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,3};
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr,low, high);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low , int high) {
        if (low > high){
            return;
        }

        int i = low;
        int j = high;
        int pivot = arr[high];
        while ( i <= j){
            while(arr[i] < pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if (i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(arr,low, j);
        quickSort(arr, i, high);
    }
}


=======
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,3};
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr,low, high);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low , int high) {
        if (low > high){
            return;
        }

        int i = low;
        int j = high;
        int pivot = arr[high];
        while ( i <= j){
            while(arr[i] < pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if (i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(arr,low, j);
        quickSort(arr, i, high);
    }
}


>>>>>>> ba543ab2da8dd59b5b78593098416c5ca5fc3c3b
