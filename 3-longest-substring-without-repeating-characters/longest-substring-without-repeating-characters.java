class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int arr[]= new  int[256];
        int maxlen = 0;
        for(int high=0; high<s.length();high++){
            arr[s.charAt(high)]++;
            while(arr[s.charAt(high)]>1){
                arr[s.charAt(low)]--;
                low++;
            }
            int len = high-low+1;
            
            maxlen=Math.max(len,maxlen);
        }
        
        return maxlen;
    }
}