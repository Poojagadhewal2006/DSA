public class StrStrImplementation {
    public static int strstr(String hayStack,String needle)
    {
        int hLen = hayStack.length();
        int nLen = needle.length();
        if(nLen == 0)
        {
            return 0;
        }
        for(int i=0;i<= hLen-nLen;i++)
        {
            if(hayStack.substring(i,i+nLen).equals(needle))
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String hayStack = "hello";
        String needle = "ll";
        System.out.println(strstr(hayStack,needle));
        System.out.println("hello world");
    }
}
