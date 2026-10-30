class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i =0 ; i<nums.length ; i++){
            int count =0;
            int target = nums[i];
            for(int j =0; j<nums.length ; j++){
                if(nums[j]==target){
                    count++;
                }
            }
            if(count==1){
                ans.add(nums[i]);
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}