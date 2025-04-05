package two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) return new int[]{i, map.get(target - nums[i])};
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public int[] twoSumBruteForce(int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            for (int j = 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{j, i};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);

        int[] resultBruteForce = twoSum.twoSumBruteForce(nums, target);
        System.out.println("Resultado brute force: " + resultBruteForce[0] + ", " + resultBruteForce[1]);
    }
}
