package chapter7TwoPointer;

import java.util.HashMap;

public class TwoSum {
	HashMap<Integer, Integer> num2count = new HashMap<Integer, Integer>();

	public void add(int number) {
		if (num2count.containsKey(number)) {
			int count = num2count.get(number) + 1;
			num2count.put(number, count);
		} else {
			num2count.put(number, 1);
		}
	}

	public boolean find(int value) {
		for (Integer key : num2count.keySet()) {
			int anotherPart = value - key;
			if (anotherPart == key) {
				if (num2count.get(key) > 1)
					return true;
			} else {
				if (num2count.containsKey(anotherPart)) {
					return true;
				}
			}
		}

		return false;
	}

}
