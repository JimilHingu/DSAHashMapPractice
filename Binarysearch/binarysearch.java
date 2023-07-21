package Binarysearch;

import java.util.Scanner;

public class binarysearch {
    static int callingNinarySearch(int[] arr, int min, int max, int snumber) {
        
        int mid = (min + max )/ 2;
        if (arr[mid] == snumber) {
            return mid;
        } else if (arr[mid] > snumber) {
            return callingNinarySearch(arr, min, mid - 1, snumber);
        } else if (arr[mid] < snumber) {
            return callingNinarySearch(arr, mid + 1, max, snumber);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number you want to search");
        int snumber = sc.nextInt();
        int result = callingNinarySearch(arr, 0, arr.length - 1, snumber);
        if(result== -1){System.out.println("number is not founded");}
        else {System.out.println("index is" + result);}
    }

}
