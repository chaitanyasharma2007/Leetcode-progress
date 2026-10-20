class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int left = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        HashMap<Character , Integer> map = new HashMap<>();
        for(char i : p.toCharArray()){
            if(!map.containsKey(i)){
                map.put(i,0);
            }
            map.put(i,map.get(i)+1);
        }
         int freq = 0;
        HashMap<Character, Integer> win = new HashMap<>();
        for(int right =0; right<s.length();right++){
            char c = s.charAt(right);
            if(!win.containsKey(c)){
                win.put(c,0);
            }
            win.put(c,win.get(c)+1);
            
             int count = right - left +1;
            if(count == p.length()){
                if(map.equals(win)){
                    ans.add(left);
                }
            

            
                win.put(s.charAt(left),win.get(s.charAt(left))-1);

                if(win.get(s.charAt(left))==0){
                    win.remove(s.charAt(left));
                }
                left++;
            }
        }
        return ans;
    }
}