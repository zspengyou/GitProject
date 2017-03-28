package chapter1;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSets {

    public static void main(String[] args) {
        System.err.println(
                "back tracking means start at pos, find all subset that start with list, and put result in result");

    }

    public ArrayList<ArrayList<Integer>> subsets(int nums[]) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        backTracking(result, list, nums, 0);
        return result;

    }

    public void backTracking(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int[] nums, int pos) {
        result.add(new ArrayList<>(list));
        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            backTracking(result, list, nums, pos + i);
            list.remove(list.size() - 1);
        }
    }

}
