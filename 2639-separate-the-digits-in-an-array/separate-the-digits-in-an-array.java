class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Character> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            String str = Integer.toString(nums[i]);
            int l = str.length();
            for (int j = 0; j < l; j++) {
                char ch = str.charAt(j);
                ans.add(ch);
            }
        }

        return ans.stream().mapToInt(ch -> ch - '0').toArray();
    }
}