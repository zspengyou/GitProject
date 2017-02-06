package learning2;

/**
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray
 * [4,-1,2,1] has the largest sum = 6.
 */

public class MaximumSubarray {

	public static void main(String[] args) {

	}

	public int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int max = nums[0];
		for (int num : nums) {
			if (num > max)
				max = num;
		}
		if (max <= 0) {
			return max;
		}

		int maxSum = 0;
		int currentSum = 0;

		for (int num : nums) {
			currentSum += num;
			if (currentSum < 0) {
				currentSum = 0;
			}
			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
		}

		return maxSum;

	}

}
