package chapter2;

public class ClosestNumberII {
//http://www.lintcode.com/en/problem/closest-number-in-sorted-array/
//Given a target number and an integer array A sorted in ascending order, 
//find the index i in A such that A[i] is closest to the given target.


    public static void main(String[] args) {
        
    }
    public int cloestNumber(int[] nums, int target){
        if(nums == null || nums.length == 0)
            return -1;
        int start = 0; 
        int end = nums.length - 1;
        while(start < end -1){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;                
            }else if(nums[mid] > target){
                end = mid;
            }else{
                start = mid;
            }            
        }
        int startDist = Math.abs(nums[start] - target);
        int endDist = Math.abs(nums[end] - target);
        if(startDist < endDist)
            return start;
        else
            return end;
    }

}
