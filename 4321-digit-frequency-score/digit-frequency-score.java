class Solution {
    public int digitFrequencyScore(int n) {
        // x
        int count =0;
      while(n>0){
        int last = n%10;
        count=count+last;
        n=n/10;
      }
      return count;
    }

}