class Solution {
    public void reverseString(char[] s) {
       Stack<Character> a = new Stack<>();

       for(int i =0; i<s.length ; i++){
        a.push(s[i]);
       }
       for(int i =0 ; i<s.length; i++){
        s[i]=a.pop();
       }
       
    }
}