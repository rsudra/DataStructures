package btree;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Recursive");
        System.out.println(binarySearchRecursive(array, 8));
        System.out.println(binarySearchRecursive(array, 10));

        System.out.println("Iterative");
        System.out.println(binarySearchIterative(array, 8));
        System.out.println(binarySearchIterative(array, 10));
    }

    public static boolean binarySearchRecursive(int[] array, int x) {
        return binarySearchRecursive(array, x, 0, array.length - 1);
    }

    public static boolean binarySearchRecursive(int[] array, int x, int left, int right) {
        if (left > right) {
            return false;
        }
        int mid = left + (right - left) / 2;
        if (array[mid] == x) {
            return true;
        } else if (x < array[mid]) {
            return binarySearchRecursive(array, x, left, mid - 1);
        } else {
            return binarySearchRecursive(array, x, mid + 1, right);
        }
    }


    public static boolean binarySearchIterative(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == x) {
                return true;
            } else if (x < array[mid]) {
                right = mid -1;
            } else {
                left = mid+1;
            }
        }
        return false;
    }
}
