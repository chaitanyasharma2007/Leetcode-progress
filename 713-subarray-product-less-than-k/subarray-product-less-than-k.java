class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
          if(k<=1){
            return 0;
        }
        int low = 0;
        int high = 0;
        int n = nums.length;
        int res = 0 ;
        int prod = 1;
        while(high<n){
            prod*=nums[high];
            while(prod>=k){
                prod=prod/nums[low];
                low++;
            }
            res += high - low +1;
            high++;
        }
      
        return res;
    }
}