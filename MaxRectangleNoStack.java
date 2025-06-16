public class MaxRectangleNoStack {
   public static int maxRectangle(int [][] matrix)
   {
    if(matrix.length == 0 || matrix[0].length == 0)
    {
        return 0;
    }
    int rows = matrix.length,cols = matrix[0].length;
    int height[] = new int[cols];
    int left [] = new int[cols];
    int right[] = new int[cols];
    int maxArea = 0;
    for(int i=0;i<cols;i++)
    {
        right[i] = cols;
    }
    for(int i=0;i<rows;i++)
    {
        int currLeft = 0 ,currRight = cols;
        for(int j=0;j<cols;j++)
        {
            height[j] = (matrix[i][j] == 1) ? height[j] + 1 : 0;
        }
        for(int j=0;j<cols;j++)
        {
            if(matrix[i][j] == 1)
            {
                left[j] = Math.max(left[j],currLeft);
            }
            else 
            {
                left[j] = 0;
                currLeft = j +1;
            }
        }
        for(int j =cols-1;j>=0;j--)
        {
            if(matrix[i][j] == 1)
            {
                right[j] = Math.min(right[j],currRight);
            }
            else 
            {
                right[j] = cols;
                currRight = j;
            }
        }
        for(int j=0;j<cols;j++)
        {
            int area = (right[j] - left[j]) * height[j];
            maxArea = Math.max(maxArea,area);
        }
    }
    return maxArea;
   } 
   public static void main(String[] args) {
    int matrix[][] = {
        {1,0,1,0,0},
        {1,0,1,1,1},
        {1,1,1,1,1},
        {1,0,0,1,0}
    };
    System.out.println("Max rectangle area of 1s (no stack) : " + maxRectangle(matrix));
   }
}
