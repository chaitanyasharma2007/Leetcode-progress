class Solution {
    public int kthFactor(int n, int k) {
        
      int count=0;
     
      List<Integer> ans = new ArrayList<>();
      for(int i =1 ; i<=n ; i++){
        if(n%i==0){
            count++;
            ans.add(i);
        }
      }
      if(count<k){
        return -1;
      }
      return ans.get(k-1);
    }
}