package chapter2;

public class LastPosOfTarget {
    // http://www.lintcode.com/en/problem/last-position-of-target/
    // Find the last position of a target number in a sorted array. Return -1 if
    // target does not exist.
    public static void main(String[] args) {

    }

    public int lastPosition(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int start = 0;
        int end = nums.length;
        while (start < end - 1) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (nums[end] == target) {
            return end;
        } else if (nums[start] == target) {
            return start;
        }
        return -1;

    }

}
