class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new  HashMap<>();

        for(int num :nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        for(int ans1 :map.keySet()){
            if(map.get(ans1)>1){
                ans.add(ans1);
            }
        }
        return ans;
    }
}