/**
 * The BinarySearch class contains a method to perform binary search on a sorted
 * array and a main
 * method to demonstrate its usage.
 */
public class BinarySearch {
    /**
     * The binarySearch function searches for a target integer in a sorted array
     * using the binary
     * search algorithm and prints the index if found, otherwise prints a message
     * indicating the
     * element is not present.
     *
     * @param arr    The `arr` parameter is an integer array in which you want to
     *               search for the `target`
     *               element using binary search algorithm.
     * @param target The `target` parameter in the `binarySearch` method represents
     *               the element that
     *               you are searching for within the given array `arr`. The method
     *               uses binary search algorithm to
     *               find the index of the `target` element in the sorted array
     *               `arr`. If the `target` element is
     *               found, it
     */
    public static void binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("Element is present in the array at index: " + mid);
                return;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Element is not present in the array :)");
    }

    public static void main(String[] args) {
        int[] num = { 12, 23, 34, 45, 56, 67, 78, 89, 90 };

        binarySearch(num, 90);
    }
}
