class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1 ; i<=numRows;i++){

            int num = 1 ;

          ans.add(new ArrayList<>());
            for(int j = 0 ; j<i;j++){
                ans.get(i-1).add(num);
                num= num*(i-j-1)/(j+1);
                
            }
        } 
        return ans;
    }
}