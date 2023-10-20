class TestCase {

    public static void main(String[] args) {
        final Solution solution = new Solution();

        final int[] nums1 = new int[]{ 1, 3, 5, 5, 7, 7, 8, 9};
        final int[] nums2 = new int[]{ 0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        final int[] nums3 = new int[]{ 1 };

        assert solution.removeDuplicates(nums1) == 6;
        assert solution.removeDuplicates(nums2) == 5;
        assert solution.removeDuplicates(nums3) == 1;
    }
}