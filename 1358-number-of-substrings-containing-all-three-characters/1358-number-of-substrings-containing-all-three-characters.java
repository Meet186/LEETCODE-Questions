class Solution {
    public int numberOfSubstrings(String str) {
        int n = str.length();

        int[] freq = new int[3];   // frequency of a, b, c

        int i = 0;
        int count = 0;

        for (int j = 0; j < n; j++) {
            freq[str.charAt(j) - 'a']++;

            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                count += (n - j);

                freq[str.charAt(i) - 'a']--;
                i++;
            }
        }

        return count;
    }
}