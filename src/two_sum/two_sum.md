# Two Sum

## Description
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

**Example 1**:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

## Approach
- Brute force approach: 
  - iterate through each element and compare it with all subsequent elements. 
  - if a pair is found that sums to the target, return their indices.
  - 
- `Map` approach:
  - create a `HashMap` to store the values and their indices.
  - iterate through the `nums` array, for each element you should check if the complement (target - nums[i]) is already in the map.
  - if the complement is in the map, return the indices of the current element and the complement.
  - otherwise, add the current element and its index to the map.

## Complexity
- **Time Complexity:**
  - Brute force approach: \(O(n^2)\)
  - `Map` approach: \(O(n)\)
- **Space Complexity:**
  - Brute force approach: \(O(1)\)
  - `Map` approach: \(O(n)\)

## Código
```java
public class Solution {
    
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
    
    /* ---------------------------------------------------------------------------------------- */
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) return new int[]{i, map.get(target - nums[i])};
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
```