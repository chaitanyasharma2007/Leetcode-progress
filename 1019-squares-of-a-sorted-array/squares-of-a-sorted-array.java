class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int arr[]=new int[n];
        int left =0;
        int right= n-1;

        for(int i = n-1;i>=0; i--){

            int leftsq = nums[left]*nums[left];
            int rightsq = nums[right]*nums[right];

        if(leftsq > rightsq){
            arr[i]=leftsq;
            left++;
        }else{
            arr[i]=rightsq;
            right--;
        }
        }
        return arr;

    }
}