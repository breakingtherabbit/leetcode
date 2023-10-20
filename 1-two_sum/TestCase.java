class TestCase {

    public static void main(String[] args) {
        final Solution s = new Solution();

        final int[] nums = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;

        final int target = 9;

        int[] indices_solution = s.twoSum(nums, target);

        // ASSERT
        assert indices_solution[0] == 0;
        assert indices_solution[1] == 1;

        // -------------------------------------------------------

        final int[] nums2 = new int[3];
        nums2[0] = 3;
        nums2[1] = 2;
        nums2[2] = 4;

        int target2 = 6;

        int[] is2 = s.twoSum(nums2, target2);

        // ASSERT
        assert is2[0] == 1;
        assert is2[1] == 2;

        // -------------------------------------------------------

        final int[] nums3 = new int[2];
        nums3[0] = 3;
        nums3[1] = 3;

        int target3 = 6;

        int[] is3 = s.twoSum(nums3, target3);

        // ASSERT
        assert is3[0] == 0;
        assert is3[1] == 1;
    }

}