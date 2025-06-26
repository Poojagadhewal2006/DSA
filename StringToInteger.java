public class StringToInteger {
    public static void main(String[] args) {
        String str = "1234";
        int number = stringToInteger(str);
        System.out.println("Converted number : " + number);
    }
    public static int stringToInteger(String str)
    {
      int result = 0;
      for(int i=0;i<str.length();i++)
      {
        char ch = str.charAt(i);
        int digit = ch - '0';
        result = result * 10 + digit;
      }
      return result;
    }
}
