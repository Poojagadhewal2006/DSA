

public class RemoveDuplicate {
    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("Original : " + input);
        System.out.println("without Duplicates : " + result);

    }
    public static String removeDuplicates(String str)
    {
        String result = "";
        boolean seen[] = new boolean[256];
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(!seen[ch])
            {
                seen[ch] = true;
                result +=ch;
            }
        }
        return result; 
    }
}
