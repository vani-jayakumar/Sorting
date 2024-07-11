//To sort array based on comparison with adjacent element
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {25,76,12,43,34,56};
        System.out.println(Arrays.toString(arr));
    }
    private static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length - i; j++){
                if (arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
