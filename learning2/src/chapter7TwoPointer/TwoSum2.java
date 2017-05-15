package chapter7TwoPointer;

import java.util.HashMap;
import java.util.Set;

// http://www.lintcode.com/en/problem/two-sum-data-structure-design/

// Design and implement a TwoSum class. It should support the following operations: add and find.
// add - Add the number to an internal data structure.
// find - Find if there exists any pair of numbers which sum is equal to the value.
// add(1); add(3); add(5);
// find(4) // return true
// find(7) // return false


public class TwoSum2{
	private HashMap<Integer, Integer> num2count;
	public TwoSum2(){
		num2count = new HashMap<Integer, Integer>();
	}
	public void add(int val){
		if(num2count.containsKey(val)){
			int count = num2count.get(val) + 1;
			num2count.put(val, count);
		}else{
			num2count.put(val, 1);
		}
	}
	public boolean find(int target){
		Set<Integer> keys = num2count.keySet();
		for(int key: keys){
			int diff = target - key;
			if(diff == key){
				int count = num2count.get(key);
				if(count >= 2)
					return true;
			}else{
				if(num2count.containsKey(diff))
					return true;
			}
		}
		return false;
	}
}