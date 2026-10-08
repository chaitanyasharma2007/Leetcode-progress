class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        
        
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = nums[n - k + i];
        }
        
        
        for (int i = n - 1 - k; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        
        
        for (int i = 0; i < k; i++) {
            nums[i] = arr[i];
        }
    }
}