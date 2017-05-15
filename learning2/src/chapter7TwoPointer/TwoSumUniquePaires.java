\\ http://www.lintcode.com/en/problem/two-sum-unique-pairs/
\\ 
\\ Given an array of integers, find how many unique pairs in the array such that their sum is equal to a specific target number. Please return the number of pairs.
\\ 
\\ Have you met this question in a real interview? Yes
\\ Example
\\ Given nums = [1,1,2,45,46,46], target = 47
\\ return 2
\\ 
\\ 1 + 46 = 47
\\ 2 + 45 = 47

public class TwoSumUniquePaires{
	
	public int twoSumUniquePaires(int[] nums, int target){
		if(nums == null || nums.length < 2)
			return 0;
		int count = 0;
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++){
			if(i > 0 && nums[i] == nums[i-1])
				continue;
			for(int j = i+1; j< nums.length; j++){
				if(j > i+ 1 && nums[j] == nums[j-1])
					continue;
				if(nums[i] + nums[j] == target){				
					count ++;
					break;
				}
			}
		}
		return count;
	}
}