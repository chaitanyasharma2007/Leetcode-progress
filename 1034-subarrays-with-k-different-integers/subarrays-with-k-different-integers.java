class Solution {
    

    public int atmost(int[] nums, int k) {
        int l = 0;
         int r =0;
         int count =0;
         int ans =0;
         int n = nums.length;
         HashMap<Integer , Integer> map = new HashMap<>();
         while(r<n){
            if(!map.containsKey(nums[r])){
                map.put(nums[r],0);
            }
            map.put(nums[r],map.get(nums[r])+1);
            count = map.size();
            while(count>k){
                
                 map.put(nums[l],map.get(nums[l])-1);
                  if(map.get(nums[l])==0){
                    map.remove(nums[l]);

                }
               count=map.size();
                
                l++;
              
            }
            ans+=(r-l+1);
              r++;
         }
         return ans;
    }
    public int subarraysWithKDistinct(int []nums, int k){
        return atmost(nums,k)-atmost(nums,k-1);
    }
}