
import java.util.Arrays;
public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if(areAnagrams(str1,str2))
        {
            System.out.println(str1 + " and " + str2 + " are anagrams. ");
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not anagrams. ");
        }
    }
    public static boolean areAnagrams(String s1, String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }
        char a1[] = s1.toCharArray();
        char a2[] = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
}

