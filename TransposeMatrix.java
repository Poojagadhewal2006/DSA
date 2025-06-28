public class TransposeMatrix
 {
    public static int[][] transpose(int matrix[][])
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int result[][] = new int[cols][rows];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
             {
                result[j][i] = matrix[i][j];
             }
         }
        return result;
     }
     public static void printMatrix(int matrix[][])
     {
        for(int row[] : matrix)
        {
            for(int val : row)
            {
                System.out.println(val + " ");
            }
            System.out.println();
         }
     }
    public static void main(String[] args)
     {
        int original[][] = {{1,2,3},{4,5,6}};
        System.out.println("Original Matrix : ");
        printMatrix(original);
        int[][] transposed = transpose(original);
        System.out.println("Transposed Matrix : ");
        printMatrix(transposed);
     }
}
