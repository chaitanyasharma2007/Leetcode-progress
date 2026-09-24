class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer, Integer> ans = new HashMap <>();
        int sum =0;
        ans.put(0,1);
        int count =0 ;
        for(int i =0 ;i<nums.length;i++){
            sum+=nums[i];
            int ques = sum-k;
            int frq = ans.getOrDefault(ques, 0);
            count+=frq;
            ans.put(sum, ans.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}