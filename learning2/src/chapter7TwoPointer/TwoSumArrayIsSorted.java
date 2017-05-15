\\ http://www.lintcode.com/en/problem/two-sum-input-array-is-sorted/
\\ 
\\ Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
\\ 
\\ The function twoSum should return indices of the two numbers such that they add up to the target, 
\\ where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
\\ 
\\  Notice
\\ 
\\ You may assume that each input would have exactly one solution.
\\ Example
\\ Given nums = [2, 7, 11, 15], target = 9
\\ return [1, 2]


public class TwoSumInputArrayIsSorted{
	
	public int[] twoSum(int[] nums, int target){
		if(nums == null || nums.length == 0)
			return null;
		int start = 0;
		int end = nums.length - 1;
		
		while(start < end){
			int startVal = nums[start];
			int endVal = nums[end];
			if(startVal + endVal < target)
				start ++;
			else if(startVal + endVal > target)
				end --;
			else{
				int result = new int[2];
				result[0] = start;
				result[1] = end;
				return result;
			}		
		}
		return null;
	}
}