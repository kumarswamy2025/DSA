class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(count)) {
                count++;
                
                // Check if the full needle was matched
                if (count == needle.length()) {
                    return i - count + 1;  // correct starting index
                }
            } else {
                // Reset `i` to the position just after the start of the last match attempt
                i = i - count;
                count = 0;
            }
        }

        return -1;
    }
}
