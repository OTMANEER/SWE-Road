package leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class TestSolution{
    @Test
    void testSearch() {
        Solution solution = new Solution();

        // Test case 1: Target exists (from example)
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        assertEquals(4, solution.search(nums1, 9), "Test case 1 failed: target exists");

        // Test case 2: Target doesn't exist (from example)
        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        assertEquals(-1, solution.search(nums2, 2), "Test case 2 failed: target doesn't exist");

        // Test case 3: Empty array
        int[] nums3 = {};
        assertEquals(-1, solution.search(nums3, 5), "Test case 3 failed: empty array");

        // Test case 4: Single element array
        int[] nums4 = {5};
        assertEquals(0, solution.search(nums4, 5), "Test case 4 failed: single element array - target exists");
        assertEquals(-1, solution.search(nums4, 1), "Test case 4 failed: single element array - target doesn't exist");

        // Test case 5: First and last elements
        int[] nums5 = {1, 2, 3, 4, 5};
        assertEquals(0, solution.search(nums5, 1), "Test case 5 failed: first element");
        assertEquals(4, solution.search(nums5, 5), "Test case 5 failed: last element");
    }
    }