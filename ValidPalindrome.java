

public class ValidPalindrome {
    public static boolean validPalindrome(String s)
    {
        return isPalindromeWithRemovel(s,0,s.length()-1,false);
    }
    public static boolean isPalindromeWithRemovel(String s, int left ,int right,boolean removed)
    {
        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                 if(removed) 
                 {
                    return false;
                 }
                 return isPalindromeWithRemovel(s, left +1, right, true || isPalindromeWithRemovel(s, left, right -1, true));
            }
            left++;
            right--;
        }
        return true;
    }
 public static void main(String[] args) {
    String input1 = "abca";
    System.out.println(validPalindrome(input1));
    String input2 = "racecar";
    System.out.println(validPalindrome(input2));
    String input3 = "abcdef";
    System.out.println(validPalindrome(input3));
    
 }   
}
