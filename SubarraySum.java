public class SubarraySum {
    public static void findSubarray(int arr[],int targetSum)
    {
        int start =0,currentSum=0;
        for(int end = 0;end < arr.length;end++)
        {
            currentSum+=arr[end];
        while(currentSum > targetSum && start <= end)
        {
            currentSum -= arr[start];
            start++;
        }
        if(currentSum == targetSum)
        {
            System.out.println("SUBARRAY FOUND FROM INDEX " + start + " TO " +end);
            return;
        }
        }
        System.out.println("NO SUBARRAY WITH GIVEN SUM FOUND ....");
    }
   public static void main(String[] args) {
    int arr[] = { 1,2,3,7,5};
    int targetSum = 12;
    findSubarray(arr, targetSum);
   } 
}
