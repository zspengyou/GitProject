package chapter7TwoPointer;

import java.util.Arrays;

public class RemoveDuplicateNumbersInArray {
	public int deduplication(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		Arrays.sort(nums);
		int slow = 1;
		int fast = 1;
		while (fast < nums.length) {
			if (nums[fast] != nums[fast - 1]) {
				if (slow != fast)
					nums[slow] = nums[fast];
				slow++;
			}
			fast++;
		}
		return slow;

	}

	public int deduplication2(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			for (int i = 0; i < start; i++) {
				if (nums[i] == nums[start]) {
					nums[start] = nums[end];
					end--;
					start--;
					break;
				}
			}
			start++;
		}
		return end + 1;

	}

}
