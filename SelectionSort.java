/**
 * The SelectionSort class contains a static method to perform selection sort on an array of integers
 * and a main method to demonstrate its usage.
 */
public class SelectionSort {

    /**
     * The selectionSort function sorts an array in ascending order using the selection sort algorithm.
     *
     * @param arr An array of integers that will be sorted using the selection sort algorithm.
     */
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] num = {90, 34, 45, 436, 124 , 32436, 634, 135 ,13, 64, 23};

        selectionSort(num);
        printArray(num);

    }
}
