package chapter7TwoPointer;

import java.util.Arrays;

//  http://www.lintcode.com/en/problem/remove-duplicate-numbers-in-array/
//  Given an array of integers, remove the duplicate numbers in it.
//  
//  You should:
//  1. Do it in place in the array.
//  2. Move the unique numbers to the front of the array.
//  3. Return the total number of the unique numbers.
//  
//   Notice
//  
//  You don't need to keep the original order of the integers.
//  Example
//  Given nums = [1,3,1,4,4,2], you should:
//  
//  Move duplicate integers to the tail of nums => nums = [1,3,4,2,?,?].
//  Return the number of unique integers in nums => 4.
//  Actually we don't care about what you place in ?, we only care about the part which has no duplicate integers.

public class RemoveDuplicateNumbersInArray2 {
	public int removeDuplicate(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		Arrays.sort(nums);

		// slow point to pos to update
		// fast point to pos to check
		int slow = 1;
		int fast = 1;
		while (fast < nums.length) {
			if (nums[fast] == nums[fast - 1])
				fast++;
			else
				nums[slow++] = nums[fast++];
		}
		return slow;
	}
}
