class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> ans = new HashMap<>();
        ans.put(0,-1);
        int prefixsum = 0;
        for(int i =  0 ; i<nums.length ; i++){
            prefixsum=prefixsum+nums[i];
            int rem = prefixsum%k;

            if(ans.containsKey(rem)){
                int prev = ans.get(rem);
                if(i-prev >=2){
                    return true;
                }
               
            } 
            else{
                    ans.put(rem,i);
                }
            }
            return false;
    }
}