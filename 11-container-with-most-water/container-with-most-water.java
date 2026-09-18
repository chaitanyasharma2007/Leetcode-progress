class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;

        int max =0;
        int ans= 0;
        
        while(left<right){
            max = Math.min( height[left] , height[right]);
            int area= (right-left)*max;
            if(area>ans){
                ans= area;
            }
           if(height[left]<height[right]){
            left++;
           }
           else{
            right--;
           }
           

        }
        return ans;
    }
}