package chapter6LInkedListArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SubsrraySum {
	public ArrayList<Integer> subarraySum(int[] nums) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (nums == null || nums.length == 0)
			return result;
		HashMap<Integer, Integer> sum2Index = new HashMap<Integer, Integer>();
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sum == 0) {
				result.add(0);
				result.add(i);
				return result;
			}
			if (sum2Index.containsKey(sum)) {
				result.add(sum2Index.get(sum) + 1);
				result.add(i);
				return result;
			}
			sum2Index.put(sum, i);
		}
		return result;
	}

	public ArrayList<Integer> subarraySum2(int[] nums) {
		ArrayList<Integer> result = new ArrayList<>();
		if (nums == null || nums.length == 0) {
			return result;
		}
		HashMap<Integer, ArrayList<Integer>> sum2Index = new HashMap<Integer, ArrayList<Integer>>();
		ArrayList<Integer> zeroIndexs = new ArrayList<Integer>();
		zeroIndexs.add(-1);
		sum2Index.put(0, zeroIndexs);
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (!sum2Index.containsKey(sum)) {
				ArrayList<Integer> indexs = new ArrayList<>();
				sum2Index.put(sum, indexs);
			}
			ArrayList<Integer> indexs = sum2Index.get(sum);
			indexs.add(i);
		}

		Set<Entry<Integer, ArrayList<Integer>>> entrySet = sum2Index.entrySet();
		for (Entry<Integer, ArrayList<Integer>> entry : entrySet) {
			ArrayList<Integer> value = entry.getValue();
			if (value.size() >= 2) {
				int startIndex = value.get(0) + 1;
				int endIndex = value.get(1);
				result.add(startIndex);
				result.add(endIndex);
				return result;
			}
		}
		return result;
	}
}
