package Week1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ls = new LinkedList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target)
                ls.add(i);
        }
        return ls;
    }

}
