package lintCode;

import java.util.ArrayList;
import java.util.List;

public class WindowSum {

	public static void main(String[] args) {
		int[] nums = new int []{1,2,3};
		int k = 3;
		List<Integer> result = windowsum(nums,k);
		System.out.println(result);

	}
	public static List<Integer> windowsum(int[] nums, int k){
		List<Integer> result = new ArrayList<Integer>();
		if(nums == null || nums.length < k)
			return result;
		int count = 0;
		int tmpSum = 0;
		for(int i = 0; i < nums.length; i++){
			count ++;
			tmpSum += nums[i];
			if(count < k){
				continue;
			}else if(count == k){
				result.add(tmpSum);
			}else{
				tmpSum -= nums[i-k];
				result.add(tmpSum);
			}
		}
		return result;
	}
	

}
