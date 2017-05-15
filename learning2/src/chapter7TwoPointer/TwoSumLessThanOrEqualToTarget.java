\\ http://www.lintcode.com/en/problem/two-sum-less-than-or-equal-to-target/
\\ 
\\ Given an array of integers, find how many pairs in the array such that their sum is less than or equal to a specific target number. Please return the number of pairs.
\\ 
\\ Have you met this question in a real interview? Yes
\\ Example
\\ Given nums = [2, 7, 11, 15], target = 24. 
\\ Return 5. 
\\ 2 + 7 < 24
\\ 2 + 11 < 24
\\ 2 + 15 < 24
\\ 7 + 11 < 24
\\ 7 + 15 < 25


public class TwoSumLessThanOrEqualToTarget{
	public int twoSumLessOrEqualtoTarget(int[] nums, int target){
		if(nums == null || nums.length < 2)
			return 0;
		Arrays.sort(nums);
		int count = 0;
		for(int i = 0; i< nums.length; i++){
//			if(i > 0 && nums[i] == nums[i-1])
//				continue;
			int tmpTarget = target - nums[i];
			for(int j = i+1; j< nums.length; j++){
				if(nums[j] <= tmpTarget)
					count ++;
				else
					break;
			}
		}
		return count;

	}
	

}