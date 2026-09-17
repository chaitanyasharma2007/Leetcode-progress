class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
       int ans=0;
       for(int i =0 ; i<candies.length;i++){
         ans = Math.max(ans,candies[i]);
       }

        for(int i =0 ; i<candies.length; i++){
            
            if( candies[i]+extraCandies>=ans){
                
                answer.add(true);
             }else{
                answer.add(false);
             }
        }
        return answer;
    }
}