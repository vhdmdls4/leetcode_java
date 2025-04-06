package remove_element;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] nums = {5, 0, 2, 3, 2, 1, 0, 4, 2};
        int val = 2;
        re.removeElement(nums, val);
        for ( int num : nums ) {
            System.out.println(num + " ");
        }
    }


}
