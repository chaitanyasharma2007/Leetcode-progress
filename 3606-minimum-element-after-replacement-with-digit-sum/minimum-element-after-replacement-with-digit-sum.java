class Solution {
    public int minElement(int[] nums) {
        int mi = nums[0];
        for(int i =0 ; i< nums.length; i++){
            int sum = 0;
            while(nums[i]!=0){
                int last = nums[i]%10;
                sum=sum+last;
                nums[i]=nums[i]/10;
            }
            if(mi>sum){
                mi=sum;
            }
        }
        return mi;
    }
}