class Solution {
    public int lengthOfLongestSubstring(String s) {
        // sliding window apporach
        int maxLen=0;

        HashSet<Character> seen=new HashSet<>();

        int left=0;
        for(int right=0;right<s.length();right++){

            // checking if charater is present

            while(seen.contains(s.charAt(right))){
                // if charater is already exits then remove it from left and update left
                seen.remove(s.charAt(left));
                left++;
            }
            // if character is not present then insert into hashset

            seen.add(s.charAt(right));
            // now compare max length
            maxLen=Math.max(maxLen,right-left+1);



        }

return maxLen;






    }
}