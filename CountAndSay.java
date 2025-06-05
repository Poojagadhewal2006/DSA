public class CountAndSay {
    public static void main(String[] args) {
        int n =5;
        String result = countAndSay(n);
        System.out.println(" the " + n + " th term is : " + result);
    }
    public static String countAndSay(int n)
    {
        if(n == 1)
        {
            return "1";
        }
        String str = "1";
        for(int i=2;i<=n;i++)
        {
            String temp = "";
            int count =1;
            for(int j=1;j<str.length();j++)
            {
                if(str.charAt(j) == str.charAt(j-1))
                {
                    count++;
                }
                else 
                {
                    temp += count + "" + str.charAt(j-1);
                    count = 1;
                }
            }
            temp += count + "" + str.charAt(str.length()-1);
            str = temp;
        }
        return   str;
    }
}
