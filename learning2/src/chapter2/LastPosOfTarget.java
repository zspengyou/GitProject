package chapter2;

public class LastPosOfTarget {
    // http://www.lintcode.com/en/problem/last-position-of-target/
    // Find the last position of a target number in a sorted array. Return -1 if
    // target does not exist.
    public static void main(String[] args) {

    }

    public int lastPosition(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int start = 0;
        int end = nums.length;
        while (start < end - 1) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (nums[end] == target) {
            return end;
        } else if (nums[start] == target) {
            return start;
        }
        return -1;

    }

    public latPosOfTarget(int[] nums, int target){
        if(nums == null || nums.length == 0)
            return -1;
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            int val = nums[mid];
            if(val < target)
                start = mid + 1;
            else if (val > target)
                end = mid - 1;
            else{
                start = mid;
                if(start == end -1)
                    break;                
            }
        }
        if(end > 0 && nums[end] == target)
            return end;
        if(nums[start] == target
            return start;        
        return -1;
        

        // if found start and end will be valid
        //check start and end
        // if not found
        // return -1
        
        
    }

    public firstPos(int[] nums, int target){
        if(nums == null || nums.length == 0)
            return -1;
        int start = 0;
        int end = nums.length -1;
        while(start < end){
            int mid = start + (end - start)/2;
            int val = nums[mid];
            if(val < target){
                start = mid + 1;
            }else if(val > target){
                end = mid -1;
            }else{
                end = mid;
            }
        }
        if(nums[start] == target)
            return start;
        if(end > 0 && nums[end] == target)
            return end;
        return -1;
    }

    public int test(){
        if(nums == null || nums.length == 0)
            return -1;
        int start = 0;
        int end = nums.length - 1;
        while(start < end -1){
            int mid = start + (start + end)/2;
            int val = nums[mid];
            if(val < target)
                start = mid;
            else if(val > target)
                end = mid;
            else
                start = mid;
        }
        if(nums[end] == target)
            return end;
        if(nums[start] == target)
            return start;
        return -1;
    }

}
