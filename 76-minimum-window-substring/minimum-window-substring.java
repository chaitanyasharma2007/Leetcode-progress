class Solution {
    public boolean right(int have[], int needed[]){
        for(int i =0 ; i<256 ; i ++){ //checks if the elements of have and needed are same or higher 
            if(have[i]<needed[i]){
                return false; // if not returns false
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
       
        int low =0; // one end
        int have []  = new int[256]; // have s 
        int needed[]= new int[256]; // needed t
        int start = 0; // smallest window ka starting point yaad rakhega
        int res = Integer.MAX_VALUE; // smalles window ka length yaad rakhega

        for(int i = 0 ; i<t.length();i++){ //t ke elements ki frequency count karega
           needed[t.charAt(i)]++;
        }
        for(int high = 0 ;  high<s.length();high++){ //window loop
            have[s.charAt(high)]++;
            while(right(have,needed)){ // jab tak function true hai
                int len = high - low +1; // current window ki length find karega
                if(res>len){ // agar smallest window ki length  current len se zyada hai
                    res=len; // toh res = len
                    start=low; // starting poiny ko low ke equal rakhdo
                }
                have[s.charAt(low)]--; // previous low ka count kam kardega taaki new window me uska comparison nah ho
                low++; // new low shift
            }
        }
        if(res==Integer.MAX_VALUE){ //agar res ki value kabhi change nahi hogi matlab smallest window exist hi nahi karta
            return "";
        }
        return s.substring(start,start+res); // just returns that substring in the given s !!
    }
}