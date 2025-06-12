public class LongestCommonPrefix {
    public static void main(String[] args) {
        String words[] = {"flower", "flow", "flight"};
        String prefix = findLongestCommonPrefix(words);
        System.out.println("Longest common prefix : " + prefix);
    }
    public static String findLongestCommonPrefix(String strs[])
    {
        if(strs.length == 0)
        return "";
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(prefix) != 0)
            {
               prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty())
                {
                    return "";
                }
            }
        }
        return prefix;
    }
}
