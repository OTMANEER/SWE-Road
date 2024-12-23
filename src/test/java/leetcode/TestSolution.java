package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestSolution {
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

    @Test
    void testSearchInsert() {
        Solution solution = new Solution();

        // Test case 1: Target exists in array
        int[] nums1 = {1, 3, 5, 6};
        assertEquals(2, solution.searchInsert(nums1, 5),
                "Test case 1 failed: target exists in array");

        // Test case 2: Target should be inserted in middle
        int[] nums2 = {1, 3, 5, 6};
        assertEquals(1, solution.searchInsert(nums2, 2),
                "Test case 2 failed: target should be inserted in middle");

        // Test case 3: Target should be inserted at end
        int[] nums3 = {1, 3, 5, 6};
        assertEquals(4, solution.searchInsert(nums3, 7),
                "Test case 3 failed: target should be inserted at end");

        // Test case 4: Target should be inserted at start
        int[] nums4 = {1, 3, 5, 6};
        assertEquals(0, solution.searchInsert(nums4, 0),
                "Test case 4 failed: target should be inserted at start");

        // Test case 5: Empty array
        int[] nums5 = {};
        assertEquals(0, solution.searchInsert(nums5, 5),
                "Test case 5 failed: empty array");

        // Test case 6: Single element array - target smaller
        int[] nums6 = {3};
        assertEquals(0, solution.searchInsert(nums6, 1),
                "Test case 6 failed: single element array - target smaller");

        // Test case 7: Single element array - target larger
        int[] nums7 = {3};
        assertEquals(1, solution.searchInsert(nums7, 5),
                "Test case 7 failed: single element array - target larger");
    }

    @Test
    public void testNextGreatestLetter() {
        Solution solution = new Solution();
        // Test case 1: target = 'a'
        char[] letters1 = {'c', 'f', 'j'};
        assertEquals('c', solution.nextGreatestLetter(letters1, 'a'));

        // Test case 2: target = 'c'
        char[] letters2 = {'c', 'f', 'j'};
        assertEquals('f', solution.nextGreatestLetter(letters2, 'c'));

        // Test case 3: target = 'z'
        char[] letters3 = {'x', 'x', 'y', 'y'};
        assertEquals('x', solution.nextGreatestLetter(letters3, 'z'));
    }

}