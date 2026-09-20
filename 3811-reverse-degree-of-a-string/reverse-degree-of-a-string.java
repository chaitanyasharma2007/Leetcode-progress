class Solution {
    public int reverseDegree(String s) {
        int degree=0;
        for(int i =0 ; i<s.length(); i++){
            int val = s.charAt(i);
            degree = degree+ ((122-val+1)*(i+1));
        }
        return degree;
    }
}