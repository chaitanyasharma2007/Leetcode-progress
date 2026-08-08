class Solution {
    public String reversePrefix(String s, int k) {
       String  news="";
        String nres="";
        for(int i=k-1;i>=0;i--){
            news += s.charAt(i);
        }
        for(int i=k;i<s.length();i++){
            nres += s.charAt(i);
        }
        return news+nres;
    }
}