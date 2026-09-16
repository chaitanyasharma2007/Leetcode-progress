class Solution {
    public int maxSubArray(int[] nums) {
        int bestans = nums[0];
        int n = nums.length;
        int ans = nums[0];
        for(int i = 1 ;i<n;i++){
            int v1 = nums[i];
            int v2  = nums[i]+bestans;
            bestans = Math.max(v1,v2);
            ans = Math.max(ans,bestans);

        }
        return ans;
    }
}