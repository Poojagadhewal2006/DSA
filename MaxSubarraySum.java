public class MaxSubarraySum {
    public static void main(String args[])
    {
         int arr[] = {1,-3,2,1,-1};
    int currentSum = arr[0];
    int maxSum = arr[0];
    for(int i=1;i<arr.length;i++)
    {
        if(currentSum + arr[i] > arr[i])
        {
            currentSum = currentSum + arr[i];
        }
        else
        {
            currentSum = arr[i];
        }
        if(currentSum > maxSum)
        {
            maxSum = currentSum;
        }
    }
    System.out.println("Maximum Subarray Sum is : " + maxSum);
   }  
    
}
