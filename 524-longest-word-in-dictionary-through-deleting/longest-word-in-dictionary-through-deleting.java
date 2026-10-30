class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String ans = "";

        for (String word : dictionary) {
            //if this is true
            if (issubSequence(s, word)) {
                // we check for the word length , it should be more than equal to ans.length , and the comparision should be equal to 0 
                if (word.length() > ans.length() ||
                        (word.length() == ans.length() && word.compareTo(ans) < 0)) {
                    ans = word;
                }

            }

        }
        return ans;

    }

    public boolean issubSequence(String s, String word) {
        //function to check if s matches the word 
        int i = 0;
        int j = 0;
        while (i < s.length() && j < word.length()) {
            if (s.charAt(i) == word.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == word.length();
    }
}