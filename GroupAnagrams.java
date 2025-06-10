public class GroupAnagrams {
    public static boolean isAnagram(String s1,String s2)
    {
        if(s1.length() != s2.length())
        {
            return  false;
        }
        int count[] = new int[26];
        for(int i=0;i<s1.length();i++)
        {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for(int c : count)
        {
            if(c != 0)
            return false;
        }
        return true;
    }
    public static void groupAnagrams(String words[])
    {
        boolean used[] = new boolean[words.length];
        for(int i=0;i<words.length;i++)
        {
            if(used[i] ) 
            continue;
            System.out.print("Group :" + words[i]);
            used[i] = true;
            for(int j=i+1;j<words.length;j++)
            {
              if(!used[j] && isAnagram(words[i],words[j]))
              {
                System.out.println(", " + words[j]);
                used[j] = true;
              }
            }
            System.out.println();
        }
    }
   public static void main(String[] args) {
    String input []= {"eat", "tea" , "tan" , "ate" , "nat" , "bat"};
    groupAnagrams(input);
   } 
}
