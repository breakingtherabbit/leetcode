class Solution {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i + 1;
        int lastIndex = nums.length - 1;

        while (nums[i] <= nums[j] && i < lastIndex - 1) {
            if (nums[i] == nums[j]) {
                int aux = nums[j];

                for (int k = j; k < lastIndex - 1; k++) {
                    nums[k] = nums[k + 1];
                }

                nums[lastIndex] = aux;
            } else {
                i = i + 1;
                j = j + 1;
            }
        }

        return i + 1;
    }
}