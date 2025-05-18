import java.util.Arrays;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        if (index < 0) return new int[]{-1, -1};

        int left = index;
        int right = index;
        while (left > 0 && nums[left - 1] == target) {
            left--;
        }
        while (right < nums.length - 1 && nums[right + 1] == target) {
            right++;
        }
        return new int[]{left, right};
    }
}
