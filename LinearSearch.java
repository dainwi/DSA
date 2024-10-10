public class LinearSearch {

    static void search(int[] arr, int target){
        // The line `for (int i : arr)` is a for-each loop in Java. It iterates over each element in
        // the `arr` array and assigns the value of each element to the variable `i` in each iteration.
        // This loop is used to iterate through the elements of the array `arr` for searching the
        // target element.
        for (int i : arr) {
            if(i == target){
                System.out.println("Element is present in the array.");
                return;
            }
        }
        System.out.println("Element is not present in the array.");
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 78, 90};

        search(arr, 78);
    }
}
