package chapter6LInkedListArray;

public class MaxSubarray {
	public int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int max = nums[0];
		int currentSum = 0;
		for (int num : nums) {
			currentSum += num;
			if (currentSum > max)
				max = currentSum;
			if (currentSum < 0)
				currentSum = 0;
		}
		return max;
	}

}
