class Solution {
    public int numberOfSubstrings(String s) {
        HashMap <Character , Integer> map = new HashMap<>();
        //total no. of distinct elements 
        int count =0;
        for(int i =0 ; i<s.length();i++){
            char a = s.charAt(i);
           if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }
        int totaldistincts = map.size();
        if(map.size()<3){
            return 0;
        }
        int left = 0;
        HashMap <Character , Integer> win = new HashMap<>();
        for(int right = 0 ; right<s.length();right++){
            win.put(s.charAt(right),
                win.getOrDefault(s.charAt(right), 0) + 1);

            
            while(win.size()==totaldistincts){
                 count+=s.length()- right;
                    char value = s.charAt(left);
                    win.put(value, win.get(value)-1);

                if(win.get(value)==0){
                    win.remove(value);
                }
                left++;
            }
        }
        return count;
    }
}