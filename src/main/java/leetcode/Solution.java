package leetcode;

public class Solution {
    public int search(int[] nums, int target){

        int left = 0, right = nums.length-1;

        while (left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid+1; // Look on the right side
            }else if (nums[mid] > target){
                right = mid-1; // Look on the left side
            }
        }
        return -1;
    }
}