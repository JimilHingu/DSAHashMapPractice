import java.util.HashMap;

public class Quaone {
    public static int midater = 0;

    public static void majorElement(int num[]) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < num.length; i++) {
            if (map.containsKey(num[i])) {
                map.put(num[i], map.get(num[i]) + 1);
            } else {
                midater++;
                map.put(num[i], 1);
            }
        }

        for (int i = 0; i < midater; i++) {
            if (map.get(num[i]) > num.length / 3) {
                System.out.println(num[i]);
            }
        }
    }

    public static void main(String[] args) {
        int num[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        majorElement(num);
    }
}