class Solution {
    public int removeDuplicates(int[] nums) {
    int low = 0;
    int  high= 1;
    int count=nums.length;
    while(high<nums.length){
        if(nums[low]==nums[high]){
            count--;
        }else{
            low++;
            nums[low]=nums[high];
            
        }
        high++;
    }
    return count;
    }
}