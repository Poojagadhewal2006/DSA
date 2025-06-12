public class LongestUniqueSubstring {
    public static int lengthOfLongestSubstring(String s)
    {
        int freq[] = new int[256];
        int maxLen = 0;
        int start = 0;
        for(int end=0;end<s.length();end++)
        {
            char ch = s.charAt(end);
            freq[ch]++;
            while(freq[ch] > 1)
            {
                freq[s.charAt(start)]--;
                start++;
            }
            int currentLen = end - start + 1;
            if(currentLen > maxLen)
            {
                maxLen =currentLen;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String input ="abcabcbb";
        System.out.println(lengthOfLongestSubstring(input));
    }
}
