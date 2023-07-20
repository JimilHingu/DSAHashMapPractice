import java.util.Scanner;

import trucs.TRUArrayStack;

public class Drive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number ");
        int number1 = sc.nextInt();
        System.out.println("enter second number");
        int number2 = sc.nextInt();

        int result = add(number1, number2);
        System.out.println("total outcome of number 1 and numner2 is : " + result);
    }

    public static int add(int numb1, int numb2) {
        TRUArrayStack<Integer> stack1 = new TRUArrayStack<>();
        TRUArrayStack<Integer> stack2 = new TRUArrayStack<>();
        TRUArrayStack<Integer> resulStack = new TRUArrayStack<>();

        int keep = 0;
        int result = 0;

        String str1 = String.valueOf(numb1);
        String str2 = String.valueOf(numb2);

        for (int i = 0; i < str1.length(); i++) {
            String chr = "" + str1.charAt(i);
            stack1.push(Integer.parseInt(chr));
        }
        for (int i = 0; i < str2.length(); i++) {
            String chr = "" + str2.charAt(i);
            stack2.push(Integer.parseInt(chr));
        }
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int sum = keep;
            if (!stack1.isEmpty()) {
                sum += stack1.pop();
            }
            if (!stack2.isEmpty()) {

                sum += stack2.pop();
            }
            resulStack.push(sum % 10);
            keep = sum / 10;
        }
        if (keep != 0) {
            resulStack.push(keep);
        }
        while (!resulStack.isEmpty()) {
            result *= 10;
            result += resulStack.pop();
        }
        return result;

    }
}
