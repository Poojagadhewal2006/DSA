public class MaxProductSubArray {
    public static int maxProduct(int arr[])
    {
        int maxProduct = arr[0];
        int currentProduct = 1;
        for(int i = 0; i < arr.length; i++)
        {
            currentProduct *= arr[i];
            if(currentProduct > maxProduct)
            {
                maxProduct = currentProduct;
            }
            if(currentProduct == 0)
            {
                currentProduct = 1;
            }
        }
        currentProduct = 1;
        for(int i = arr.length-1; i >= 0; i--)
        {
            currentProduct *= arr[i];
            if(currentProduct > maxProduct)
            {
                 maxProduct = currentProduct;
            }
            if(currentProduct == 0)
            {
                 currentProduct =1;
            }
        }
        return maxProduct;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,-2,4};
        System.out.println("Maximum product subarray : " + maxProduct(arr));
    }
}
