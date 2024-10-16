import java.util.Scanner;

public class Array {
    Scanner sc = new Scanner(System.in);

    public int[] createArray() {
        int size = 0;

        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();

        int[] array = new int[size];

        insertElement(array);

        return array;
    }

    public void insertElement(int[] array) {
        System.out.println("Size of the array you created is: " + array.length);

        System.out.print("Enter the element of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public void printArray(int[] array) {
        System.out.print("Elements of the array is: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public void updateElement(int[] array, int pos, int newData) {
        array[pos - 1] = newData;
        return;
    }

    public void searchElement(int[] array) {

        System.out.print("\nEnter the element you want to search: ");
        int key = sc.nextInt();

        String q = "Is your array sorted?";
        System.out.println(q);
        String ans = sc.next();

        switch (ans) {
            case "yes":
                binarySearch(array, key);
                break;

            default:
                linearSearch(array, key);
                break;
        }
    }

    public void linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("Element is present at position: " + (i + 1));
                return;
            }
        }
        System.out.println("Element is not present in the array :)");
    }

    public void binarySearch(int[] array, int key) {
        int start = 0, end = array.length, mid;

        while (start < end) {
            mid = start + (end - start) / 2;

            if (array[mid] == key) {
                System.out.println("Element is present at position: " + (mid + 1));
                return;
            } else if (array[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Element is not present in the array");
    }

    public static void main(String[] args) {
        Array ar = new Array();

        int[] arr = ar.createArray();
        ar.printArray(arr);

        System.out.println("\nArray after updating the element ata a certain position...");

        ar.updateElement(arr, 1, 10);
        ar.printArray(arr);
        ar.searchElement(arr);
    }
}