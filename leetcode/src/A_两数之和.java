import java.util.HashMap;
import java.util.Map;

public class 两数之和 {


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 2, 45, 56, 687, 32, 4, 121, 5, 6, 87, 43, 32, 314, 21, 412312};
        int target = 412333;
        System.out.println(twoSumHash(nums, target));
        System.out.println(twoSumFor(nums, target));
    }

    public static int[] twoSumFor(int[] nums, int target) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    long endTime = System.currentTimeMillis();
                    System.out.println((endTime - startTime) + "ms" + "   for");
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static int[] twoSumHash(int[] nums, int target) {
        long startTime = System.currentTimeMillis();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                long endTime = System.currentTimeMillis();
                System.out.println((endTime - startTime) + "ms" + "   hash");
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}
