class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int low = 2;

        for (int high = 2; high < nums.length; high++) {
            if (nums[high] != nums[low - 2]) {
                nums[low] = nums[high];
                low++;
            }
        }

        return low;
    }
}