public class Leaders {
   public static void printLeaders(int arr[])
   {
      int n = arr.length;
      int maxFromRight = arr[n-1];
      System.out.println("Leaders : " + maxFromRight + " ");
      for(int i=n-2;i>=0;i--)
      {
         if(arr[i] > maxFromRight)
         {
            maxFromRight = arr[i];
            System.out.println(maxFromRight + " ");
         }
      }
   }
   public static void main(String[] args) {
    int arr[] = { 17,5,2,16,4,3};
    printLeaders(arr);
   } 
}
