class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int best = nums[0];
        int ans = nums[0];

        int  minans= nums[0];
        for(int i = 1; i<nums.length;i++){
            int v1 = best + nums[i];
            int v2 = nums[i];

            best = Math.max(v1,v2);
            ans = Math.max(ans,best);
        }

        best = nums[0];

           for(int i = 1; i<nums.length;i++){
            int v1 = best + nums[i];
            int v2 = nums[i];

            best = Math.min(v1,v2);
             minans = Math.min(minans,best);
        }
        return Math.max(Math.abs(ans), Math.abs(minans));
    }
}