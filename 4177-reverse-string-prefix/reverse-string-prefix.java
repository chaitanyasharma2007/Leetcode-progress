class Solution {
    public String reversePrefix(String s, int k) {
        String newe = "";
        String now = "";
        for(int i = k-1;i>=0;i--){
            newe+=s.charAt(i);
        }
        for(int i=k;i<s.length();i++){
            now+=s.charAt(i);
        }
        return newe+now;
    }
}