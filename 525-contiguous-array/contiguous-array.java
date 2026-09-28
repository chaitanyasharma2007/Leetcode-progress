class Solution {
    public int findMaxLength(int[] nums) {
        int one = 0;
         int zero =0;
        int n = nums.length-1;
        
        HashMap<Integer,Integer> umap = new HashMap<>();
        int res = 0;
        for(int i =0 ;i<=n;i++){
            if(nums[i]==0){
                zero++;
            }
            if(nums[i]==1){
                one++;
            }
            int diff = one - zero;

            if(diff== 0){
                res = Math.max(res , i+1);
                continue;
            }

            if(!umap.containsKey(diff)){
                umap.put(diff,i);
            }
            else{
                int index  = umap.get(diff);
                int len = i - index;
                res = Math.max(res , len);
            }
        }
        return res;
    }
}