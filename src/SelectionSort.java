//To sort array by finding largest or smallest element and placing it in its position
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            int last = arr.length-1-i;
            int start = 0;
            int max = getmax(arr,start,last);
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
    }
//    Method to find max element from the array
    static  int getmax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++){
            if (arr[max] < arr[i]) {
               max = i ;
            }
        }
        return max;
    }
}
