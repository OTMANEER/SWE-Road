package com.com.leetcode.problems;

import com.leetcode.problems.Problem1TwoSum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Problem1TwoSumTest {
    @Test
    void testTwoSum() {
        Problem1TwoSum solution = new Problem1TwoSum();

        // Test case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        assertArrayEquals(expected1, solution.twoSum(nums1, target1));
        // Test case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expected2 = {1, 2};
        assertArrayEquals(expected2, solution.twoSum(nums2, target2));

        // Test case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] expected3 = {0, 1};
        assertArrayEquals(expected3, solution.twoSum(nums3, target3));
    }
    @Test
    void testTwoSumNoSolution() {
        Problem1TwoSum solution = new Problem1TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 30;

        assertThrows(IllegalArgumentException.class, () -> {
            solution.twoSum(nums, target);
        });
    }
}