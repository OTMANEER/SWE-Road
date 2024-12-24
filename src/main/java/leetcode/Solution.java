package leetcode;

import java.util.Arrays;

public class Solution {
    public int search(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1; // Look on the right side
            } else if (nums[mid] > target) {
                right = mid - 1; // Look on the left side
            }
        }
        return -1;
    }

    //35. Search Insert Position
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1; // Look on the right side
            } else if (nums[mid] > target) {
                right = mid - 1; // Look on the left side
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

    public int search(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) {
                right = mid - 1;
            } else {
                left = mid + 1; // Look on the right side
            }
        }
        return nums.length - left;
    }

    public int countNegatives(int[][] grid) {
        int counter = 0;
        for (int[] row : grid) {
            counter += search(row);
        }
        return counter;
    }


    public int search(int[] nums, int target, boolean rightSearchdirection) {
        int ans = -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target && rightSearchdirection) {
                ans = mid;
                left = mid + 1;
            } else if (nums[mid] == target && !rightSearchdirection) {
                ans = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1; // Look on the right side
            } else if (nums[mid] > target) {
                right = mid - 1; // Look on the right side
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {

        int right = search(nums, target, true);
        int left = search(nums, target, false);
        return new int[]{left, right};
    }

    public int[] findRightInterval(int[][] intervals) {
        if (intervals.length == 1) {
            return new int[]{-1};
        }
        // Sort intervals like => [start, original_index].
        int n = intervals.length;
        int[][] sorted = new int[n][2];

        for (int i = 0; i < n; i++) {
            sorted[i] = new int[]{intervals[i][0], i};
        }
        Arrays.sort(sorted, (a, b) -> a[0] - b[0]);

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = search(sorted, intervals[i][1]);
        }
        return result;
    }

    public int search(int[][] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid][0] >= target) {
                ans = nums[mid][1]; // the original index
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

}