class Solution {
    public int maxProduct(int[] nums) {
        int minending = nums[0];
        int best =  nums[0];
        int ans  = nums[0];
        for(int i =1 ; i<nums.length ; i++ ){
            int v1 = best * nums[i];
            int v2 = nums[i];
            int v3 = minending * nums[i]; 

            best = Math.max(v1,Math.max(v2 , v3));
            minending = Math.min(v1 , Math.min(v2,v3));
            ans = Math.max(ans , Math.max(best,minending));
        }
        return ans;
    }
}