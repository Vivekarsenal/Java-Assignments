class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26]; // assuming lowercase letters

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return c; // this is the extra character
            }
        }

        return ' '; // fallback, should never happen
    }
}
