package chapter1;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSets {

    public static void main(String[] args) {
        System.err.println(
                "back tracking means start at pos, find all subset that start with list, and put result in result");
        SubSets test = new SubSets();
        test.subsets(new int[]{0,1,2});
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
        System.out.println(list);
        for (int i = pos; i < nums.length; i++) {
            System.out.println(list);
            list.add(nums[i]);
            backTracking(result, list, nums, i + 1);
            list.remove(list.size() - 1);
            System.out.println(list);
        }
    }

}
