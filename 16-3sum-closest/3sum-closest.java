class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int l= nums.length;
        int resultSum = 0;
        int maxDiff = 10000000;
        
        for(int i=0;i<l-2;i++)
        {
            int left = i+1;
            int right = l-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                int diff = Math.abs(sum-target);

                if(diff<maxDiff)
                {
                    maxDiff = diff;
                    resultSum = sum;

                }

                if(sum==target)
                {
                   return sum;
                }
                else if(sum<target)
                {
                    left++;
                }
                else{
                    right--;
                }
            }
            
        }
        return resultSum;

        
    }
}