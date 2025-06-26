public class StringRotation {
   public static boolean isRotation(String s1,String s2)
   {
    if(s1.length() != s2.length())
    {
        return false;
    }
    String combined = s1+s1;
    return combined.contains(s2);
   } 
   public static void main(String[] args) {
    String s1 = "abcd";
    String s2 = "cdab";
    System.out.println(isRotation(s1, s2));
    String s3 = "abcd";
    String s4 = "acbd";
    System.out.println(isRotation(s3, s4));   
}
}
