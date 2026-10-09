class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int count = 0;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        int totaldistinct = map.size();
        HashMap<Integer, Integer> ans = new HashMap<>();
        int left =0;
            for(int right =0 ; right<nums.length ; right++){
               ans.put(nums[right],
                ans.getOrDefault(nums[right], 0) + 1);
            
            while(ans.size()==totaldistinct){

                count += nums.length - right;


                int value  = nums[left];
                ans.put(value, ans.get(value) - 1);

                if (ans.get(value) == 0) {
                    ans.remove(value);
                }

                left++;
                
            }
        }
            return count ;
    }
}