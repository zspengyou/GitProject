package chapter1;

import java.util.ArrayList;

public class SubSetsII {

    public static void main(String[] args) {
        System.err.println("when should add subset to the result");

    }

    public ArrayList<ArrayList<Integer>> subSetsWithDup(int nums[]) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> subset = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return result;
        backTrack(result, subset, nums, 0);
        return result;

    }

    public void backTrack(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> subset, int[] nums, int pos) {
        result.add(subset);
        for (int i = pos; i < nums.length; i++) {
            if (i != pos && nums[i] == nums[i - 1]) {
                continue;
            }
            subset.add(nums[i]);
            backTrack(result, subset, nums, i + 1);
            subset.remove(subset.size() - 1);
        }

        
    }

}
