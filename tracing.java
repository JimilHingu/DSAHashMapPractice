import java.util.Arrays;

public class tracing {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            System.out.printf("left=%d, mid=%d, right=%d, target=%d%n", left, mid, right, target);

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15,17,19};
        int target = 9;

        System.out.printf("Performing binary search for target %d in %s%n", target, Arrays.toString(arr));
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.printf("%d not found in %s%n", target, Arrays.toString(arr));
        } else {
            System.out.printf("%d found at index %d in %s%n", target, result, Arrays.toString(arr));
        }
    }
}
