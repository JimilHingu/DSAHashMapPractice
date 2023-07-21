import java.util.Scanner;

public class insertion {
    static void callinginsurtion(int[] arr, int addingnum, int index, int key) {
        for (int i = key; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = addingnum;
        for (int i = 0; i < key + 2; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many number you want to enter");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the array you made");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("enter a number you want to enter new in arr");
        int addingnum = sc.nextInt();
        System.out.println("at which index you want to enter");
        int index = sc.nextInt();
        callinginsurtion(arr, addingnum, index, num - 1);
    }
}
