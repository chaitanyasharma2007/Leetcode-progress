class Solution {
    public int[] transformArray(int[] nums) {
        int arr[] = new int[ nums.length];
        int j = 0 ;
        for(int i =0  ; i < nums.length; i++){
            if(nums[i]%2==0){
                arr[j]=0;
            }else{
                arr[j]=1;
            }
            j++;
        }
         Arrays.sort(arr);
         return arr;
    }
   
}