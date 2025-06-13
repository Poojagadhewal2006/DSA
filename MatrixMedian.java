public class MatrixMedian {
    public static int countLessEqual(int [][] matrix,int target)
    {
        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i=0,j=cols-1;
        while(i < rows && j>=0)
        {
            if(matrix[i][j] <= target)
            {
                count += (j+1);
                i++;
            }
            else 
            {
                j--;
            }
        }
        return count;
    }
    public static int findMedian(int [][] matrix)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int totalElements = rows*cols;
        int medianPos = (totalElements + 1)/2;
        int low = matrix[0][0];
        int high = matrix[rows-1][cols-1];
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            int count = countLessEqual(matrix, mid);
            if(count < medianPos)
            {
                low = mid+1;
            }
            else 
            {
                high = mid -1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int [][] matrix = { 
            {1,3,5},
            {2,6,9},
            {3,6,9}
        };
        int median = findMedian(matrix);
        System.out.println("Median : " + median);
    }
}
