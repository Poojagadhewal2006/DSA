public class StringPermutations {
    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("All permutations of " + input + " : ");
        printPermutations(input,"");
    }
    public static void printPermutations(String str , String result)
    {
        if(str.length() == 0)
        {
            System.out.println(result);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i+1);
            printPermutations(remaining,result+ch);
        }
    }
}
