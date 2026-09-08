class Solution {
    public int countCommas(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {

            int digits = 0;
            int x = i;
            while (x > 0) {
                x = x / 10;
                digits++;
            }
            count += (digits - 1) / 3;
        }

        return count;
    }
}