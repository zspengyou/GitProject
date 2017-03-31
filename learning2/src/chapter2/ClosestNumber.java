package chapter2;

public class ClosestNumber {

    public static void main(String[] args) {
        ClosestNumber test = new ClosestNumber();
        int[] nums = new int[]{1,4,6,10,20};
        int target = 21;
        int result = test.closestNumber(nums, target);
//        System.out.println(result);
        System.err.println("the condition for while loop is: high - low should be greater than 1");
       

    }

    public int closestNumber(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (low < high-1) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid ;
            } else {
                high = mid;
            }
        }
        if (Math.abs(nums[high] - target)<Math.abs( target- nums[low]))
            return high;
        else
            return low;
    }

}
