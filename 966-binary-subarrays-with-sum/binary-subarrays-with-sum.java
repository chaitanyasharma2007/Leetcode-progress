class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int left = 0;
        int sum = 0;
        int countGoal = 0;

        // count subarrays with sum <= goal
        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum > goal) {
                sum -= nums[left];
                left++;
            }

            countGoal += right - left + 1;
        }

        // count subarrays with sum <= goal - 1
        left = 0;
        sum = 0;
        int countLess = 0;

        if (goal > 0) {
            for (int right = 0; right < nums.length; right++) {

                sum += nums[right];

                while (sum > goal - 1) {
                    sum -= nums[left];
                    left++;
                }

                countLess += right - left + 1;
            }
        }

        return countGoal - countLess;
    }
}