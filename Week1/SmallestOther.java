package Week1;

import java.util.Arrays;

public class SmallestOther {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] copy = nums.clone();
        Arrays.sort(copy);
        int [] output = new int[101];

        for(int i=copy.length - 1; i>=0; i--)
        {
            output[copy[i]] = i;
        }

        for(int i=0; i<nums.length; i++)
        {
            nums[i] = output[nums[i]];
        }

        return nums;
    }
}
