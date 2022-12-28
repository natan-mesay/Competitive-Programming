package Week1;

import java.util.*;
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> uset = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(uset.contains(nums[i])){
                return true;
            }
            else{
                uset.add(nums[i]);
            }
        }
        return false;
    }
}
