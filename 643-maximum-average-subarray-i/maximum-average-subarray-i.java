class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double max =0;
       double sum = 0 ;
       int low = 0 ; 
       int high = k-1;

       for(int i =0 ; i<k;i++){
        sum+=nums[i];
       }
       max = sum/k;
        while(high<nums.length-1){
            sum += nums[high+1]-nums[low];
            double average = sum/k;
            low++;
            high++;
            if(average>max) {
                max = average;
            }
        }
         return max;
      
    }
}