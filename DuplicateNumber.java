public class DuplicateNumber {
    public static int findDuplicate(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }
   public static void main(String[] args) {
    int arr[] = { 1,3,4,2,2};
    int duplicate = findDuplicate(arr);
    System.out.println("DUPLICATE NUMBER IS : "  + duplicate);
   } 
}
