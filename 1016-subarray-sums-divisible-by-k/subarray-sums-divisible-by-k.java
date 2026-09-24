class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap <Integer,Integer> ans = new HashMap<>();
        ans.put(0,1);
        int sum =0;
        int count=0;
        for(int i =0 ;i<nums.length;i++){
            sum+=nums[i];
            int ques = ((sum % k) + k) % k;
            int frq = ans.getOrDefault(ques, 0);
            count+=frq;
            ans.put(ques, ans.getOrDefault(ques, 0) + 1);
        }
        return count;
    }
}