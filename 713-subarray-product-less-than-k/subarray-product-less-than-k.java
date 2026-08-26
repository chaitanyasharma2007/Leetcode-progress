class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int right = nums.length - 1;
        int left = 0;
        int count = 0;
        if (k <= 1) {
            return 0;
        }
        for (int i = left; i <= right; i++) {
        long product = 1;
           for(int j = i;j<=right;j++){
            product *= nums[j];
            if(product<k){
                count++;
            }else{
                break;
            }
           }

        }
        return count;
    }
}