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
    //35. Search Insert Position
    public int searchInsert(int[] nums, int target) {
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
        return left;
    }

    public char nextGreatestLetter(char[] letters, char target) {
        // If target is >= last element, return first element
        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }

        int left = 0;
        int right = letters.length - 1;

        // Binary search to find smallest letter greater than target
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return letters[left];
    }
}