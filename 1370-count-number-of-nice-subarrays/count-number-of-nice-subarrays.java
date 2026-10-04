class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
         return atmost(nums , k)-atmost(nums,k-1);
    }

    public int atmost(int[] nums, int k) {
    for(int i =0 ; i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }else{
                nums[i]=1;
            }
        }

        int l =0;
        int r = 0;
        int count = 0;
        int ans =0;
        while(r<nums.length){
            if(nums[r]==1){
                count++;
            }
            while(count>k){
                count-=nums[l];
               l++;
               
            }
            ans += r-l+1;
            r++;
            
        }
        return ans;
    }

    
}