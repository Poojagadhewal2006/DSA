public class SubsequenceCheck {
   public static boolean isSubsequence(String small , String large)
   {
    int i=0,j=0;
    while(i < small.length() && j < large.length())
    {
        if(small.charAt(i) == large.charAt(j))
        {
            i++;
        }
        j++;
    }
    return i == small.length();
   } 
   public static void main(String[] args) {
    String small = "abc";
    String large = "a1b2c3";
    System.out.println(isSubsequence(small, large));
    String small2 = "abc";
    String large2 = "acb";
    System.out.println(isSubsequence(small2, large2));
   }
}
