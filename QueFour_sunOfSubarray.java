import java.util.HashMap;

public class QueFour_sunOfSubarray {

    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10}; // ans = 3
        int k = -10;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum - k)) {//to keep recored that how many time sum(j)-k =i and if this queation setishfied than answer + 1 
                ans += map.get(sum - k);
            }
            if (map.containsKey(sum)) {  //to increase the value if key contain else just add key and value would be 1
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}
