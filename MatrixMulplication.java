public class MatrixMulplication {
    public static int [][] multiply(int[][] A,int [][] B)
    {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];
        for(int i=0;i<rowsA;i++)
        {
            for(int j=0;j<colsB;j++)
            {
                for(int k=0;k<colsA;k++)
                {
                    result[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        return result;
    }
    public static void printMatrix(int [][] matrix)
    {
        for(int[] row : matrix)
        {
            for(int val : row)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] A = {
            {1,2},
            {3,4}
        };
        int[][] B = {
            {5,6},
            {7,8}
        };
        System.out.println("Matrix A : ");
        printMatrix(A);
        System.out.println("Matrix B : ");
        printMatrix(B);
        if(A[0].length != B.length)
        {
            System.out.println("Matrix multiplication not possible. : ");
        }
        else 
        {
            int[][] result = multiply(A, B);
            System.out.println("Result of A X B : ");
            printMatrix(result);
        }
    }
}
