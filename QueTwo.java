import java.util.*;

public class QueTwo {
    static int count = 0;

    public static int uniunOfElement(int arr1[], int arr2[]) {
        HashSet<Integer> map = new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            map.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            map.add(arr2[i]);
        }
        return map.size();
    }

    public static int intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i]))
                count++;
                set.remove(arr2[i]);//logic onece number is counted than we are taking it out other wise it will count again

        }
        return count;
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        System.out.println((uniunOfElement(arr1, arr2)));
        System.out.println(intersection(arr1, arr2));
    }
}
