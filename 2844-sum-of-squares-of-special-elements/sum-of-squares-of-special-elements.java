class Solution {
    public int sumOfSquares(int[] nums) {
        int ans =0 ; 
        int n = nums.length;
        
        for(int i =1 ; i<=n ; i++){
            int square = 0;
            if(n%i==0){
                square = nums[i-1]*nums[i-1];
            }
            ans+=square;
        }
        return ans;
    }
}